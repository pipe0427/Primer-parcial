package com.parcial.parcial.model;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class Empleado {
    
    @NotEmpty
    private String id;
    @NotEmpty
    @Size(max = 8)
    private String nombre;
    @NotEmpty
    private String apellido;
    @NotEmpty
    private String correo;
    @NotEmpty
    private String direccion;
    @NotEmpty
    @Size(max = 10, min = 10)
    private String telefono;


    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    
}
