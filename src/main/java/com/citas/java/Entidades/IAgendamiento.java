package com.citas.java.Entidades;

import java.time.LocalDateTime;

public interface IAgendamiento {
//Definiciones de metodos 
//Solo se pone las firmas de los metodos
public void agendaCita(LocalDateTime fechaCita);
public void CitaCancel();
public void reagendarCita(LocalDateTime fechaCita);



}
