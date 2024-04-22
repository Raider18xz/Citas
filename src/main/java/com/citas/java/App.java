package com.citas.java;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import com.citas.java.Entidades.Citas_Enfermero;
import com.citas.java.Entidades.Citas_Medico;
import com.citas.java.Entidades.Enfermero;
import com.citas.java.Entidades.Medico;
import com.citas.java.Entidades.Paciente;
import com.citas.java.enumeraciones.Especialidad;
import com.citas.java.enumeraciones.Procedimiento;
import com.citas.java.enumeraciones.TipoDocumento;
import com.citas.java.enumeraciones.Tipodesangre;

/**
 * Hello world!
 *
 */
public class App 
{
    private static Month month;

    public static void main( String[] args )
    {
           //Crear un medico 
            Medico m = new Medico(1, "Ramirez", "Roman", TipoDocumento.CC, 1016733434L, 52434L, Especialidad.ODONTOLOGIA) ;
            System.out.println(m.toString());
            Medico m2 = new Medico(2, "Pablo", "Gomez", TipoDocumento.CC, 10256733L, 5463233L, Especialidad.OBSTETRICIA) ;
            System.out.println(m2.toString());
            //Crear un paciente
            Paciente p = new Paciente(3, "Javier", "Mogollon", TipoDocumento.ppt, 28475775L, "JAVIER28@gmail.com", 366421464L,LocalDate.of(2004, 12, 12), 1.60, 50.0, Tipodesangre.A, '+');
            System.out.println(p.toString());
            Paciente p2 = new Paciente(4, "Jaime", "Garzon", TipoDocumento.CC, 23134215L, "ebeaty0@gmail.com", 36656564L,LocalDate.of(2000, 03, 01), 1.69, 50.0, Tipodesangre.B, '-');
            System.out.println(p2.toString());
            Paciente p3 = new Paciente(5, "Kevin", "Rodriguez", TipoDocumento.ppt, 284123475L, "opiwell1@gmail.com", 366421564L,LocalDate.of(1999, 01, 12), 1.70, 50.0, Tipodesangre.AB, '-');
            System.out.println(p3.toString());
            Paciente p4 = new Paciente(6, "Alferez", "Arias", TipoDocumento.ppt, 28944775L, "nlaugheran2@gmail.com", 35156564L,LocalDate.of(2002, 12, 21), 1.50, 50.0, Tipodesangre.O, '+');
            System.out.println(p4.toString());
            Paciente p5 = new Paciente(7, "Julian", "Guerrero", TipoDocumento.ppt, 284123775L, "nketton3@gmail.com", 3665154L,LocalDate.of(2001,9, 01), 1.75, 50.0, Tipodesangre.O, '-');
            System.out.println(p5.toString());
            //Crear Enfermero
            Enfermero e = new Enfermero(8, "David","Mora" , TipoDocumento.CC, 192344L);
            System.out.println(e.toString());
            Enfermero e2 = new Enfermero(9, "Juan","Caiman" , TipoDocumento.CC, 1923241L);
            System.out.println(e2.toString());
            Enfermero e3 = new Enfermero(10, "Carlos","Vaquero" , TipoDocumento.CC, 19231454L);
            System.out.println(e3.toString());
            System.out.println("Nombre: " + m.getNombre());

            System.out.println("Nombre: " + p.getNombre());
 
            
            Citas_Medico ct = new Citas_Medico(LocalDateTime.of(2024,Month.DECEMBER,3,11,30,00), p, "Gripa", m);
            System.out.println("Estado de la cita " + ct.getEstado());
            Citas_Medico ct2 = new Citas_Medico(LocalDateTime.of(2024,Month.DECEMBER,3,11,30,00), p, "Escopolamina", m);
            System.out.println("Estado de la cita " + ct2.getEstado());

            System.out.println(ct.toString());

            Citas_Enfermero cte = new Citas_Enfermero(LocalDateTime.of(2024,Month.DECEMBER,31,5,35,05), p5, Procedimiento.Vacunacion, e3, "Consultorio 1");
            Citas_Enfermero cte2 = new Citas_Enfermero(LocalDateTime.of(2024,Month.DECEMBER,10,2,12,7), p4, Procedimiento.Vacunacion, e2, "Consultorio 2");
            
            System.out.println(cte.toString());
            System.out.println(cte2.toString());


        }
}