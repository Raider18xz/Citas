package com.citas.java.Entidades;

import java.time.LocalDateTime;

import com.citas.java.enumeraciones.Estado;

public class Citas_Medico extends Citas implements IAgendamiento{

    private String MotivoConsulta;
    private Medico Medico;
    private Estado Estado;


    public Citas_Medico(LocalDateTime fecha, com.citas.java.Entidades.Paciente paciente, String motivoConsulta,
            com.citas.java.Entidades.Medico medico) {
        super(fecha, paciente);
        MotivoConsulta = motivoConsulta;
        Medico = medico;
        Estado = Estado.AGENDADO;
    }


    public String getMotivoConsulta() {
        return MotivoConsulta;
    }


    public void setMotivoConsulta(String motivoConsulta) {
        MotivoConsulta = motivoConsulta;
    }


    public Medico getMedico() {
        return Medico;
    }


    public void setMedico(Medico medico) {
        Medico = medico;
    }


    public Estado getEstado() {
        return Estado;
    }


    public void setEstado(Estado estado) {
        Estado = estado;
    }

    @Override
    public void agendaCita(LocalDateTime fechaCita) {
        this.setFecha(Fecha); 
        this.setEstado(Estado.AGENDADO);
    }

    @Override
    public void CitaCancel() {
        this.Estado = Estado.CANCELADO;
        System.out.println("Cita con medico"+ Medico.getNombre() +" cancelado");

    }

    @Override
    public void reagendarCita(LocalDateTime fechaCita) {
           this.setFecha(Fecha); 
    }


    @Override
    public String toString() {
        return "Citas_Medico [Fecha=" + Fecha + ", Paciente=" + Paciente + ", Medico=" + Medico + "]";
    }





    
    
}
