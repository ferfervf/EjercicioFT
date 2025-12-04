package model;

import jakarta.persistence.Id;

public class PuntosDeVenta {
    @Id
    private int id;
    private String nombre;

    public PuntosDeVenta(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
