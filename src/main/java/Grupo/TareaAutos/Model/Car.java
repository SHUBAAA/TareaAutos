package Grupo.TareaAutos.Model;

public class Car {


    private Long ID;
    private String Marca;
    private int Año;
    private String Color;
    private int Precio;
    private boolean Turbo;
    private String Tipo;
    private String Motor;
    private int Cabinas;
    private boolean Sunroof;
    private int Popularidad;

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public int getAño() {
        return Año;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public void setAño(int año) {
        Año = año;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int precio) {
        Precio = precio;
    }

    public boolean isTurbo() {
        return Turbo;
    }

    public void setTurbo(boolean turbo) {
        Turbo = turbo;
    }

    public String getMotor() {
        return Motor;
    }

    public void setMotor(String motor) {
        Motor = motor;
    }

    public int getCabinas() {
        return Cabinas;
    }

    public void setCabinas(int cabinas) {
        Cabinas = cabinas;
    }

    public boolean isSunroof() {
        return Sunroof;
    }

    public void setSunroof(boolean sunroof) {
        Sunroof = sunroof;
    }

    public int getPopularidad() {
        return Popularidad;
    }

    public void setPopularidad(int popularidad) {
        Popularidad = popularidad;
    }

    public Car() {
    }

    public Car(Long ID, String marca, int año, String color, int precio, boolean turbo, String motor, int cabinas, boolean sunroof, int popularidad) {
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
