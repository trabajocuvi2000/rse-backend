
package com.sinfloo.ejemplo01.entidades;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "empresa")
public class Empresa {
    
    @Id
    @Column(name = "Empresa_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Empresa_ID;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "sitio_web")
    private String sitio_web;

    @Column(name = "ciudad_operacion")
    private String ciudad_operacion;
    
    @Column(name = "direccion_operacion")
    private String direccion_operacion;

    @Column(name = "sector_tipo")
    private String sector_tipo;
    
    @Column(name = "numero_sedes")
    private int numero_sedes;
    
    @Column(name = "numero_empleados")
    private int numero_empleados;
    
    @Column(name = "RUC_empresa")
    private String RUC_empresa;

    @Column(name = "fecha_inicio_operciones")
    private String fecha_inicio_operciones;
    
    @Column(name = "estimado_ingresos")
    private int estimado_ingresos;

    @Column(name = "terminos_aceptacion")
    private String terminos_aceptacion;

    @JsonIgnore
    @OneToOne(mappedBy = "empresa")
    private Encuestado encuestado;

    public int getEmpresa_ID() {
        return Empresa_ID;
    }

    public void setEmpresa_ID(int Empresa_ID) {
        this.Empresa_ID = Empresa_ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSector_tipo() {
        return sector_tipo;
    }

    public void setSector_tipo(String sector_tipo) {
        this.sector_tipo = sector_tipo;
    }

    public int getNumero_empleados() {
        return numero_empleados;
    }

    public void setNumero_empleados(int numero_empleados) {
        this.numero_empleados = numero_empleados;
    }

    public String getRUC_empresa() {
        return RUC_empresa;
    }

    public void setRUC_empresa(String RUC_empresa) {
        this.RUC_empresa = RUC_empresa;
    }

    public Encuestado getEncuestado() {
        return encuestado;
    }

    public void setEncuestado(Encuestado encuestado) {
        this.encuestado = encuestado;
    }

    public String getSitio_web() {
        return sitio_web;
    }

    public void setSitio_web(String sitio_web) {
        this.sitio_web = sitio_web;
    }

    public String getCiudad_operacion() {
        return ciudad_operacion;
    }

    public void setCiudad_operacion(String ciudad_operacion) {
        this.ciudad_operacion = ciudad_operacion;
    }

    public String getDireccion_operacion() {
        return direccion_operacion;
    }

    public void setDireccion_operacion(String direccion_operacion) {
        this.direccion_operacion = direccion_operacion;
    }

    public int getNumero_sedes() {
        return numero_sedes;
    }

    public void setNumero_sedes(int numero_sedes) {
        this.numero_sedes = numero_sedes;
    }

    public String getFecha_inicio_operciones() {
        return fecha_inicio_operciones;
    }

    public void setFecha_inicio_operciones(String fecha_inicio_operciones) {
        this.fecha_inicio_operciones = fecha_inicio_operciones;
    }
    
    public int getEstimado_ingresos() {
        return estimado_ingresos;
    }

    public void setEstimado_ingresos(int estimado_ingresos) {
        this.estimado_ingresos = estimado_ingresos;
    }

    public String getTerminos_aceptacion() {
        return terminos_aceptacion;
    }

    public void setTerminos_aceptacion(String terminos_aceptacion) {
        this.terminos_aceptacion = terminos_aceptacion;
    }
    
    
    
}
