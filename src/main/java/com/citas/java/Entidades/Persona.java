package com.citas.java.Entidades;
import com.citas.java.enumeraciones.TipoDocumento;

public abstract class Persona {
    private Integer id;
    private String nombre;
    private String apellidos;
    private TipoDocumento TipoDocumento;
    private Long NumeroDocumen;

    public Persona(Integer id, 
            String nombre, 
            String apellidos, 
            com.citas.java.enumeraciones.TipoDocumento tipoDocumento,
            Long numeroDocumen) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        TipoDocumento = tipoDocumento;
        NumeroDocumen = numeroDocumen;
    }

    public Integer getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public TipoDocumento getTipoDocumento() {
        return TipoDocumento;
    }

    public Long getNumeroDocumen() {
        return NumeroDocumen;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setTipoDocumento(TipoDocumento TipoDocumento) {
        this.TipoDocumento = TipoDocumento;
    }

    public void setNumeroDocumen(Long NumeroDocumen) {
        this.NumeroDocumen = NumeroDocumen;
    }


    
}
