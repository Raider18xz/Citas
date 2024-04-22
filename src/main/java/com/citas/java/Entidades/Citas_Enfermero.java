package com.citas.java.Entidades;

import java.time.LocalDateTime;

import com.citas.java.enumeraciones.Procedimiento;

public class Citas_Enfermero extends Citas implements IAgendamiento{

    private Procedimiento Procedimiento;
    private Enfermero enfermero;
    private String Consultorio;

    
    public Citas_Enfermero(LocalDateTime fecha, com.citas.java.Entidades.Paciente paciente,
            com.citas.java.enumeraciones.Procedimiento procedimiento, Enfermero enfermero, String consultorio) {
        super(fecha, paciente);
        Procedimiento = procedimiento;
        this.enfermero = enfermero;
        Consultorio = consultorio;
    }
    
    public Procedimiento getProcedimiento() {
        return Procedimiento;
    }
    public void setProcedimiento(Procedimiento procedimiento) {
        Procedimiento = procedimiento;
    }
    public Enfermero getEnfermero() {
        return enfermero;
    }
    public void setEnfermero(Enfermero enfermero) {
        this.enfermero = enfermero;
    }
  
    @Override
    public void agendaCita(LocalDateTime fechaCita) {
        
    }

    @Override
    public void CitaCancel() {
       System.out.println("Cita para procedimiento"+ this.Procedimiento +" cancelar");
    }

    @Override
    public void reagendarCita(LocalDateTime fechaCita) {
           this.setFecha(Fecha); 
    }

    public String getConsultorio() {
        return Consultorio;
    }

    public void setConsultorio(String consultorio) {
        Consultorio = consultorio;
    }

    @Override
    public String toString() {
        return "Citas_Enfermero [Fecha=" + Fecha + ", Paciente=" + Paciente + ", enfermero=" + enfermero
                + ", Consultorio=" + Consultorio + "]";
    }


    

}
