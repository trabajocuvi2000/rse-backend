
package com.sinfloo.ejemplo01.services;

import com.sinfloo.ejemplo01.entidades.Indicador;
import java.util.List;
import java.util.Optional;

public interface IndicadorService {
    List<Indicador> listarIndicador();
    Indicador ingresarIndicador(Indicador p);
    Optional<Indicador> listarID(int id);
    Indicador editar(Indicador p);
    Optional<Indicador> eliminar(int id);
}
