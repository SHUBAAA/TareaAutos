package Grupo.TareaAutos.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Car {


    @Id
    private Long ID;
    @Column(nullable = false)
    private String Marca;
    @Column(nullable = false)
    private String Año;
    @Column(nullable = false)
    private String Color;
    @Column(nullable = false)
    private int Precio;
    @Column(nullable = false)
    private boolean Turbo;
    @Column(nullable = false)
    private String Motor;
    @Column(nullable = false)
    private boolean Cabinas;
    @Column(nullable = false)
    private boolean Sunroof;
    @Column(nullable = false)

    private int Popularidad;

    public Car(Long ID, String marca, String año, String color, int precio, boolean turbo, String motor, boolean cabinas, boolean sunroof, int popularidad) {
        this.ID = ID;
        Marca = marca;
        Año = año;
        Color = color;
        Precio = precio;
        Turbo = turbo;
        Motor = motor;
        Cabinas = cabinas;
        Sunroof = sunroof;
        Popularidad = popularidad;
    }
}
