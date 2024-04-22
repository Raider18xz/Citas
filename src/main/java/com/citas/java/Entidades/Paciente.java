package com.citas.java.Entidades;

import java.time.LocalDate;

import com.citas.java.enumeraciones.Tipodesangre;

public class Paciente extends Persona{

    public String CorreoElectronico;
    public Long Celular;
    public LocalDate FechadeNacimiento;
    public Double Altura;
    public Double Peso;
    public Tipodesangre tipodesangre;
    public char factorRH;
    public Paciente(Integer id, String nombre, String apellidos,
            com.citas.java.enumeraciones.TipoDocumento tipoDocumento, Long numeroDocumen, String correoElectronico,
            Long celular, LocalDate fechadeNacimiento, Double altura, Double peso, Tipodesangre tipodesangre,
            char factorRH) {
        super(id, nombre, apellidos, tipoDocumento, numeroDocumen);
        CorreoElectronico = correoElectronico;
        Celular = celular;
        FechadeNacimiento = fechadeNacimiento;
        Altura = altura;
        Peso = peso;
        this.tipodesangre = tipodesangre;
        this.factorRH = factorRH;
    }
    @Override
    public String toString() {
        return "Paciente [CorreoElectronico=" + CorreoElectronico + ", Altura=" + Altura + ", Peso=" + Peso
                + ", tipodesangre=" + tipodesangre + ", factorRH=" + factorRH + "]";
    }

    

  
    
}


