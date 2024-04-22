package com.citas.java.Entidades;



import java.time.LocalDateTime;

public abstract class Citas {
    protected  LocalDateTime Fecha;
    protected  Paciente Paciente;
    
    public Citas(LocalDateTime fecha, com.citas.java.Entidades.Paciente paciente) {
        Fecha = fecha;
        Paciente = paciente;
    }

    public LocalDateTime getFecha() {
        return Fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        Fecha = fecha;
    }

    public Paciente getPaciente() {
        return Paciente;
    }

    public void setPaciente(Paciente paciente) {
        Paciente = paciente;
    }



    
}
