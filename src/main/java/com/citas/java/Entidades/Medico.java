package com.citas.java.Entidades;

import com.citas.java.enumeraciones.Especialidad;

public class Medico extends Persona{
    
 private Long RegistroMedico;
 private Especialidad especialidad;
public Medico(Integer id, String nombre, String apellidos, com.citas.java.enumeraciones.TipoDocumento tipoDocumento,
        Long numeroDocumen, Long registroMedico, Especialidad especialidad) {
    super(id, nombre, apellidos, tipoDocumento, numeroDocumen);
    RegistroMedico = registroMedico;
    this.especialidad = especialidad;
}
@Override
public String toString() {
    return "Medico [especialidad=" + especialidad + ", getNombre()=" + getNombre() + ", getApellidos()="
            + getApellidos() + "]";
}



}
