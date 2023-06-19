/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinfloo.ejemplo01.proceso_evaluacion;

import com.sinfloo.ejemplo01.DTO.Respuestas_Indicadores;
import com.sinfloo.ejemplo01.DTO.Respuestas_Indicadores_Preguntas;
import com.sinfloo.ejemplo01.entidades.Dimension;
import java.util.List;
import com.sinfloo.ejemplo01.entidades.Encuestado;
import com.sinfloo.ejemplo01.entidades.Indicador;
import com.sinfloo.ejemplo01.entidades.Tema;
import com.sinfloo.ejemplo01.entidades.Usuario;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Jonnathan
 */
@Repository
@Transactional
public class Info_Encuestados_Dao_Imp implements Info_Encuestados_Dao {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Encuestado> getEncuestados() {
        String query = " FROM Encuestado";
        List<Encuestado> encuetados = entityManager.createQuery(query).getResultList();
        return encuetados;
    }

    @Override
    public List<Usuario> getUsuarioId(int id_usuario) {
//        select * from usuario where usuario_id = 79;
        String query = "FROM Usuario where usuario_id = " + id_usuario;
        List<Usuario> encuetados = entityManager.createQuery(query).getResultList();
        return encuetados;
    }

    @Override
    public List<Respuestas_Indicadores> getRespuestasIndicadoresEncuestado(int id_encuestado) {
//        select * from respuestas_indicadores where encuestado_id = 78;
        String query = "FROM Respuestas_Indicadores where encuestado_id = " + id_encuestado;
        List<Respuestas_Indicadores> respuestas_indicadores_encuestado = entityManager.createQuery(query).getResultList();
        return respuestas_indicadores_encuestado;
    }

    @Override
    public Resultados_Evaluacion getEvaluationFull(int id_usuario) {

        // obtenemos el encuestado ID
        String query = "FROM Usuario where usuario_id = " + id_usuario; // consulta para obtener al usuario
        List<Usuario> encuetados = entityManager.createQuery(query).getResultList();
        int encuestado_id = encuetados.get(0).getEncuestado().getEncuestado_ID();

        // Obtenemos los indicadores reposniddos por el usuario 
        String query_inidcadores_encuestado = "FROM Respuestas_Indicadores where encuestado_id = " + encuestado_id;
        List<Respuestas_Indicadores> respuetas_indicadores = entityManager.createQuery(query_inidcadores_encuestado).getResultList();

        Map<Integer, Integer> lista_IDs_indicador = new HashMap<Integer, Integer>();
        for (int i = 0; i < respuetas_indicadores.size(); i++) {
            int respuesta_indicador_id = respuetas_indicadores.get(i).getRespuestas_Indicadores_ID();
            // id_indicadore - ID a bucar
            lista_IDs_indicador.put(respuetas_indicadores.get(i).getIndicador().getIndicador_ID(), respuesta_indicador_id);

        }

        Resultados_Evaluacion resultados_evaluacion_full = new Resultados_Evaluacion();
        // obtenemos las Dimensiones
        String query_dimensiones = "From Dimension";
        List<Dimension> dimensiones = entityManager.createQuery(query_dimensiones).getResultList();
        // obtenemos los Temas
        String query_temas = "From Tema";
        List<Tema> temas = entityManager.createQuery(query_temas).getResultList();

        // obtenemso los indicaadores
        String query_indicadores = "From Indicador";
        List<Indicador> indicadores = entityManager.createQuery(query_indicadores).getResultList();

        // REcorremos 
        for (Dimension dimension : dimensiones) { // recorremos las DIMENSIONES
            System.err.println(dimension.getNombre());
            Dimensiones_Resultados dimension_resultados = new Dimensiones_Resultados(); // creamos un objeto para guardar la dimension
            dimension_resultados.setNom_dimension_evaluada(dimension.getNombre()); // guardasmo el nombre de la dimension
            resultados_evaluacion_full.getDimensiones_resultados().add(dimension_resultados);// agragamos el objeto
            // guardamos los TEMAS
            int index_dim = resultados_evaluacion_full.getIndex(resultados_evaluacion_full.getDimensiones_resultados(), dimension.getNombre()); // obtenemos el INDICE de la DIMENSION
            for (Tema tema : temas) { // recorremos los TEMAS
                String dimensione_comparar = tema.getDimension().getNombre();
                if (resultados_evaluacion_full.getDimensiones_resultados().get(index_dim).getNom_dimension_evaluada() == dimensione_comparar && !resultados_evaluacion_full.getDimensiones_resultados().get(index_dim).buscar_tema(dimensione_comparar)) { // compramos el nombre de la dimension 
                    System.err.println("\t" + tema.getNombre());
                    Temas_Resultados tema_resultados = new Temas_Resultados();
                    tema_resultados.setNom_tema_evaluado(tema.getNombre()); // gurrdamos el NOMBRE del tema
                    tema_resultados.setImg_tema_enlace(tema.getImg_enlace()); // guardamos la IMAGEN del tema
                    resultados_evaluacion_full.getDimensiones_resultados().get(index_dim).getTemas_resultados().add(tema_resultados);
                    // guardamos los INDICADORES
                    int index_tema = resultados_evaluacion_full.getDimensiones_resultados().get(index_dim).getIndexTema(resultados_evaluacion_full.getDimensiones_resultados().get(index_dim).getTemas_resultados(), tema.getNombre());

                    for (Indicador indicador : indicadores) {
                        String tema_comparar = indicador.getTema().getNombre();
                        if (resultados_evaluacion_full.getDimensiones_resultados().get(index_dim).getTemas_resultados().get(index_tema).getNom_tema_evaluado() == tema_comparar && !resultados_evaluacion_full.getDimensiones_resultados().get(index_dim).getTemas_resultados().get(index_tema).buscar_indicador(tema_comparar)) {
                            System.err.println("\t\t" + indicador.getNombre());
                            Indicadores_Resultados indicadores_resultados = new Indicadores_Resultados();
                            indicadores_resultados.setNom_indicador_evaluado(indicador.getNombre());

                            List<Integer> resultados_vector = new ArrayList<>();
                            int i = 0;
                            while (i < indicador.getPreguntas_cualitativas().size()) {
                                resultados_vector.add(0);
                                i++;
                            }
                            System.err.println("\t\t\tNUmero de preguntas -> " + indicador.getPreguntas_cualitativas().size());
                            if (lista_IDs_indicador.containsKey(indicador.getIndicador_ID())) {
                                int indicador_ID = indicador.getIndicador_ID();
                                int valor_map = lista_IDs_indicador.get(indicador_ID);
                                List<Integer> lista_respuestas = ontenerRespuestasInidcador(valor_map);
                                System.err.println("\t\t\t" + resultados_vector);
                                int indice_superior = resultados_vector.size() - lista_respuestas.size();
                                System.err.println("\t\t\t" + lista_respuestas);

                                List<Integer> sub_lista_ceros = resultados_vector.subList(0, indice_superior);
                                List<Integer> concatenated_list = new ArrayList<Integer>();
                                concatenated_list.addAll(sub_lista_ceros);
                                concatenated_list.addAll(lista_respuestas);

                                indicadores_resultados.setRespuestas_preguntas(concatenated_list); // ingresamos el totla e pregunatss en ceros 
                                System.err.println("\t\t\t" + indicadores_resultados.getRespuestas_preguntas());
                                resultados_evaluacion_full.getDimensiones_resultados().get(index_dim).getTemas_resultados().get(index_tema).getIndicadores_resultados().add(indicadores_resultados);
                            } else {
                                indicadores_resultados.setRespuestas_preguntas(resultados_vector); // ingresamos el totla e pregunatss en ceros 
                                System.err.println("\t\t\t Preguntas -> " + indicadores_resultados.getRespuestas_preguntas());
                                resultados_evaluacion_full.getDimensiones_resultados().get(index_dim).getTemas_resultados().get(index_tema).getIndicadores_resultados().add(indicadores_resultados);
                            }

                        }

                    }
                }

            }
        }

//        System.err.println("\t\t-------- RESULTADOS __________________");
//        for (int i = 0; i < resultados_evaluacion_full.getDimensiones_resultados().size(); i++) {
//            System.err.println(resultados_evaluacion_full.getDimensiones_resultados().get(i).getNom_dimension_evaluada());
//            for (int k = 0; k < resultados_evaluacion_full.getDimensiones_resultados().get(i).getTemas_resultados().size(); k++) {// con esto obtenemos los TEMAS
//                System.err.println("\t" + resultados_evaluacion_full.getDimensiones_resultados().get(i).getTemas_resultados().get(k).getNom_tema_evaluado());
////                for (int m = 0; m < resultados_evaluacion.getDimensiones_resultados().get(i).getTemas_resultados().get(k).getIndicadores_resultados().size(); m++) {
////                    System.err.println("\t\t" + resultados_evaluacion.getDimensiones_resultados().get(i).getTemas_resultados().get(k).getIndicadores_resultados().get(m).getNom_indicador_evaluado());
////                    System.err.println("\t\t\t" + resultados_evaluacion.getDimensiones_resultados().get(i).getTemas_resultados().get(k).getIndicadores_resultados().get(m).getRespuestas_preguntas());
////
////                }
//            }
//        }
        algoritmo(resultados_evaluacion_full);
        return resultados_evaluacion_full;
    }

    @Override
    public Resultados_Evaluacion getData(int id_usuario) {

        Resultados_Evaluacion resultados_evaluacion = new Resultados_Evaluacion();

        // obtenemos el encuestado ID
        String query = "FROM Usuario where usuario_id = " + id_usuario; // consulta para obtener al usuario
        List<Usuario> encuetados = entityManager.createQuery(query).getResultList();

        int encuestado_id = encuetados.get(0).getEncuestado().getEncuestado_ID();
        // Obtenemos los indicadores reposniddos por el usuario 
//        select * from respuestas_indicadores where encuestado_id=78;
        String query_inidcadores_encuestado = "FROM Respuestas_Indicadores where encuestado_id = " + encuestado_id;
        List<Respuestas_Indicadores> respuetas_indicadores = entityManager.createQuery(query_inidcadores_encuestado).getResultList();

        for (int i = 0; i < respuetas_indicadores.size(); i++) {
            int respuesta_indicador_id = respuetas_indicadores.get(i).getRespuestas_Indicadores_ID();

//            System.err.println("ID del didncadro respondido " + respuetas_indicadores.get(i).getRespuestas_Indicadores_ID());
//            System.err.println("Dimension -> " + respuetas_indicadores.get(i).getIndicador().getTema().getDimension().getNombre());
//            System.err.println("Tema -> " + respuetas_indicadores.get(i).getIndicador().getTema().getNombre());
//            System.err.println("Indicador -> " + respuetas_indicadores.get(i).getIndicador().getNombre());
//          
//
            String nom_dim = respuetas_indicadores.get(i).getIndicador().getTema().getDimension().getNombre();
            String nom_tema = respuetas_indicadores.get(i).getIndicador().getTema().getNombre();
            String nom_indicador = respuetas_indicadores.get(i).getIndicador().getNombre();

            //ontenemos el enelace de la imagen
            String img_tema_enlace = respuetas_indicadores.get(i).getIndicador().getTema().getImg_enlace();

            if (!resultados_evaluacion.buscar_dimension(nom_dim)) {// si la dimesnion no esta ingresada INGRESA
                Dimensiones_Resultados dimension_resultados = new Dimensiones_Resultados();
                dimension_resultados.setNom_dimension_evaluada(nom_dim);
                resultados_evaluacion.getDimensiones_resultados().add(dimension_resultados);
            }
            int index_dim = resultados_evaluacion.getIndex(resultados_evaluacion.getDimensiones_resultados(), nom_dim);
            // verificamos si el tema existe si no existe INGRESAMOS el tema
            if (!resultados_evaluacion.getDimensiones_resultados().get(index_dim).buscar_tema(nom_tema)) {
//                System.err.println("DIMENISON -> " + nom_dim);
//                System.err.println("- Ingresando TEMA  -> " + nom_tema);
                Temas_Resultados tema_resultados = new Temas_Resultados();
                tema_resultados.setNom_tema_evaluado(nom_tema); // guardamos el NOMBRE
                tema_resultados.setImg_tema_enlace(img_tema_enlace);// guardamos el enlace de la IMAGEN
                resultados_evaluacion.getDimensiones_resultados().get(index_dim).getTemas_resultados().add(tema_resultados);
            }
            // buscamos el tema
            int index_tema = resultados_evaluacion.getDimensiones_resultados().get(index_dim).getIndexTema(resultados_evaluacion.getDimensiones_resultados().get(index_dim).getTemas_resultados(), nom_tema);
//            System.out.println(nom_tema + "  inde tema  " + index_tema);
            // verificamos si el indicador existe si no INGRESAMOS
            if (!resultados_evaluacion.getDimensiones_resultados().get(index_dim).getTemas_resultados().get(index_tema).buscar_indicador(nom_indicador)) {
                Indicadores_Resultados indicadores_resultados = new Indicadores_Resultados();
                indicadores_resultados.setNom_indicador_evaluado(nom_indicador);

                List<Integer> resultados_vector = new ArrayList<>();
                resultados_vector = ontenerRespuestasInidcador(respuesta_indicador_id);
                indicadores_resultados.setRespuestas_preguntas(resultados_vector); // ingresamos los resultados de cada vector 
                resultados_evaluacion.getDimensiones_resultados().get(index_dim).getTemas_resultados().get(index_tema).getIndicadores_resultados().add(indicadores_resultados);
            }
//            System.err.println("---- "+respuesta_indicador_id);
//            System.err.println( ontenerRespuestasInidcador(respuesta_indicador_id));
//            System.err.println("\n_______________FIN____________________________");
        }

        System.err.println("\t\t-------- RESULTADOS __________________");
        for (int i = 0; i < resultados_evaluacion.getDimensiones_resultados().size(); i++) {
            System.err.println(resultados_evaluacion.getDimensiones_resultados().get(i).getNom_dimension_evaluada());
            for (int k = 0; k < resultados_evaluacion.getDimensiones_resultados().get(i).getTemas_resultados().size(); k++) {// con esto obtenemos los TEMAS
                System.err.println("\t" + resultados_evaluacion.getDimensiones_resultados().get(i).getTemas_resultados().get(k).getNom_tema_evaluado());
                for (int m = 0; m < resultados_evaluacion.getDimensiones_resultados().get(i).getTemas_resultados().get(k).getIndicadores_resultados().size(); m++) {
                    System.err.println("\t\t" + resultados_evaluacion.getDimensiones_resultados().get(i).getTemas_resultados().get(k).getIndicadores_resultados().get(m).getNom_indicador_evaluado());
                    System.err.println("\t\t\t" + resultados_evaluacion.getDimensiones_resultados().get(i).getTemas_resultados().get(k).getIndicadores_resultados().get(m).getRespuestas_preguntas());

                }
            }
        }
        algoritmo(resultados_evaluacion);
        getAllData(resultados_evaluacion);// completamos con todos las dimesniones, temas e indicadore
        return resultados_evaluacion;
    }

    public List<Integer> ontenerRespuestasInidcador(int respuesta_indicador_id) {
// consulta para sacamos las respuestas 
        String query_repuestas_indicador_preguntas = "FROM Respuestas_Indicadores_Preguntas where respuestasaIndicadores.Respuestas_Indicadores_ID = " + respuesta_indicador_id;
        List<Respuestas_Indicadores_Preguntas> respuestas_indicadores_preguntas = entityManager.createQuery(query_repuestas_indicador_preguntas).getResultList();
//        System.out.print("Respuestas -> ");
        // guadamos las respuestas  de en un array
        List<Integer> respuestas_preguntas = new ArrayList<>();
        for (int j = 0; j < respuestas_indicadores_preguntas.size(); j++) {
//                System.err.print(respuestas_indicadores_preguntas.get(j).getRespuestas_Indicadores_Preguntas_ID() + " - ");
//                System.err.print(respuestas_indicadores_preguntas.get(j).getRespuestasaIndicadores().getRespuestas_Indicadores_ID() + "* - ");
//                System.err.print(respuestas_indicadores_preguntas.get(j).getPreguntasCualitativas().getPregunta_Cualitativa_ID() + " - ");
//                System.err.println(respuestas_indicadores_preguntas.get(j).getRespuesta());
//            System.err.print(" - " + respuestas_indicadores_preguntas.get(j).getRespuesta());

            if (respuesta_indicador_id == respuestas_indicadores_preguntas.get(j).getRespuestasaIndicadores().getRespuestas_Indicadores_ID() && respuestas_indicadores_preguntas.get(j).getRespuesta() != -1) {
                respuestas_preguntas.add(respuestas_indicadores_preguntas.get(j).getRespuesta());
            }

        }

        return respuestas_preguntas;
    }

    public void algoritmo(Resultados_Evaluacion resultados_evaluacion) {
//        System.err.println("\n\n----------- ALGORITMO -----------");
        // NORMALIZCION
        for (Dimensiones_Resultados dimensiones_resultados : resultados_evaluacion.getDimensiones_resultados()) {// recorremos las DIMENSIONES
//            System.err.println(dimensiones_resultados.getNom_dimension_evaluada());
            for (Temas_Resultados temas_resultados : dimensiones_resultados.getTemas_resultados()) { // recorremos los TEMAS
//                System.err.println("\t" + temas_resultados.getNom_tema_evaluado());
                for (Indicadores_Resultados indicadores_resultados : temas_resultados.getIndicadores_resultados()) {
//                    System.err.println("\t\t" + indicadores_resultados.getNom_indicador_evaluado());
//                    System.err.println("\t\t" + indicadores_resultados.getRespuestas_preguntas());
                    double sum = 0;
                    double cont = 0;
                    for (int respuesta : indicadores_resultados.getRespuestas_preguntas()) {
                        sum = sum + respuesta;
                        cont++;
                    }
                    indicadores_resultados.setValor_real(sum);
                    indicadores_resultados.setValor_maximo(cont * 2);

                    double valor_normalizado = (indicadores_resultados.getValor_real() - indicadores_resultados.getValor_minimo()) / (indicadores_resultados.getValor_maximo() - indicadores_resultados.getValor_minimo());
                    indicadores_resultados.setValor_real_normalizado(valor_normalizado);
                }
                double cantidad_indicadores = temas_resultados.getIndicadores_resultados().size(); // convertimos a doblre
                double cant_ind_norma = 1 / cantidad_indicadores;
                temas_resultados.setNumero_indicadores_normalizados(cant_ind_norma);
            }
        }

        double peso = 2; // definimos un peso
        // FROMULA NIVEL 1
        for (Dimensiones_Resultados dimensiones_resultados : resultados_evaluacion.getDimensiones_resultados()) {// recorremos las DIMENSIONES
            for (Temas_Resultados temas_resultados : dimensiones_resultados.getTemas_resultados()) { // recorremos los TEMAS

                double cant_indicadores_normlizado = temas_resultados.getNumero_indicadores_normalizados(); // obtenemos el numeoro de indicadores entre 1
                double suma_nivel = 0;
                for (Indicadores_Resultados indicadores_resultados : temas_resultados.getIndicadores_resultados()) { // recorremos cada INIDICADOR

                    double total = Math.pow(indicadores_resultados.getValor_real_normalizado(), peso) * cant_indicadores_normlizado;
//                    System.out.println("(" + indicadores_resultados.getValor_real_normalizado() + "^" + peso + ")*" + cant_indicadores_normlizado + " = " + total + "\n\n");

                    indicadores_resultados.setResultado_indicador_formula(total);// guardamos los RESULTADOS en el INDICADOR
                    suma_nivel = suma_nivel + total;
                }
                double exponente = 1 / peso;
                temas_resultados.setResultado_tema_formula(Math.pow(suma_nivel, exponente));// guardammos los RESULTADOS de TEMAS
            }
            double cantidad_temas = dimensiones_resultados.getTemas_resultados().size(); // convertimos a doble
            double cant_tema_norma = 1 / cantidad_temas;
            dimensiones_resultados.setNumero_temas_normalizados(cant_tema_norma);
        }
        // FROMULA NIVEL 2
        for (Dimensiones_Resultados dimensiones_resultados : resultados_evaluacion.getDimensiones_resultados()) {// recorremos las DIMENSIONES
            double cant_temas_normlizado = dimensiones_resultados.getNumero_temas_normalizados(); // obtenemos el numero de TEMA entre 1
            double suma_nivel = 0;
            for (Temas_Resultados temas_resultados : dimensiones_resultados.getTemas_resultados()) { // recorremos los TEMAS
                double total = Math.pow(temas_resultados.getResultado_tema_formula(), peso) * cant_temas_normlizado;
//                System.out.println("(" + temas_resultados.getResultado_tema_formula() + "^" + peso + ")*" + cant_temas_normlizado + " = " + total + "\n");
                suma_nivel = suma_nivel + total;
            }
            double exponente = 1 / peso;
            dimensiones_resultados.setResultado_dimension(Math.pow(suma_nivel, exponente));// guardammos los RESULTADOS de TEMAS 
        }
        double cantidad_dimensiones = resultados_evaluacion.getDimensiones_resultados().size(); // convertimos a doble
        double cant_dim_norma = 1 / cantidad_dimensiones;
        resultados_evaluacion.setNumero_dimensiones_normalizadas(cant_dim_norma);

        // FROMULA NIVEL 3
        double cant_dimensiones_normlizado = resultados_evaluacion.getNumero_dimensiones_normalizadas(); // obtenemos el numero de DIMENSIONES entre 1
        double suma_nivel_final = 0;
        for (Dimensiones_Resultados dimensiones_resultados : resultados_evaluacion.getDimensiones_resultados()) {// recorremos las DIMENSIONES
            double total = Math.pow(dimensiones_resultados.getResultado_dimension(), peso) * cant_dimensiones_normlizado;
//            System.out.println("(" + dimensiones_resultados.getResultado_dimension() + "^" + peso + ")*" + cant_dimensiones_normlizado + " = " + total + "\n");
            suma_nivel_final = suma_nivel_final + total;
        }
        double exponente = 1 / peso;
        resultados_evaluacion.setResultado_final(Math.pow(suma_nivel_final, exponente));// guardammos los RESULTADOS de TEMAS 
    }

 public void getAllData(Resultados_Evaluacion resultados_evaluacion) {
        String query_indicadores = "From Indicador";
        List<Indicador> indicadores = entityManager.createQuery(query_indicadores).getResultList();
        for (Indicador indicador : indicadores) {
            String nom_dim = indicador.getTema().getDimension().getNombre(); // nombre de la DIMENISION 
            String nom_tema = indicador.getTema().getNombre(); // nombre del TEMA
            String img_tema_enlace = indicador.getTema().getImg_enlace(); // enlace IMAGEN TEMA
            String nom_indicador = indicador.getNombre();// nombre del INDICADOR
            if (!resultados_evaluacion.buscar_dimension(nom_dim)) { // si la dimesnion no esta ingresa (en este caoso no va a pasar)
                Dimensiones_Resultados dimension_resultados = new Dimensiones_Resultados();
                dimension_resultados.setNom_dimension_evaluada(nom_dim);
                resultados_evaluacion.getDimensiones_resultados().add(dimension_resultados);
            }
            // buscamos la dimension
            int index_dim = resultados_evaluacion.getIndex(resultados_evaluacion.getDimensiones_resultados(), nom_dim);
            // verificamos si el tema existe si no existe INGRESAMOS el tema
            if (!resultados_evaluacion.getDimensiones_resultados().get(index_dim).buscar_tema(nom_tema)) {
                Temas_Resultados tema_resultados = new Temas_Resultados();
                tema_resultados.setNom_tema_evaluado(nom_tema); // guardamos el NOMBRE del TEMA
                tema_resultados.setImg_tema_enlace(img_tema_enlace);// guardamos el enlace de la IMAGEN del TEMA
                tema_resultados.setResultado_tema_formula(-1); // ingresamos el valor NULL en el resulatdo de la evaluaacion del TEMA
                resultados_evaluacion.getDimensiones_resultados().get(index_dim).getTemas_resultados().add(tema_resultados);
            }
            // buscamos el tema
            int index_tema = resultados_evaluacion.getDimensiones_resultados().get(index_dim).getIndexTema(resultados_evaluacion.getDimensiones_resultados().get(index_dim).getTemas_resultados(), nom_tema);
            // verificamos si el indicador existe si no INGRESAMOS
            if (!resultados_evaluacion.getDimensiones_resultados().get(index_dim).getTemas_resultados().get(index_tema).buscar_indicador(nom_indicador)) {
                Indicadores_Resultados indicadores_resultados = new Indicadores_Resultados();
                indicadores_resultados.setNom_indicador_evaluado(nom_indicador); // guardamos el NOMBRE del INDICADOR
                indicadores_resultados.setResultado_indicador_formula( -1);// ingresamos el valor NULL en el resultado de la evaluacion del INDICADOR
                indicadores_resultados.setValor_real_normalizado(-1);// ingresamos el valor NULL en el valor NORMALIZADO de la evaluacion del INDICADOR
                indicadores_resultados.setRespuestas_preguntas(null);// ingresamos la LISTA de RESPUESTAS igual a NULL
                resultados_evaluacion.getDimensiones_resultados().get(index_dim).getTemas_resultados().get(index_tema).getIndicadores_resultados().add(indicadores_resultados);
            }

        }

    }
}
