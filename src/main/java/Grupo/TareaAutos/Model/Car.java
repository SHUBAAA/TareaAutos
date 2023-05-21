package Grupo.TareaAutos.Model;

public class Car {

    private Long ID;
    private String Marca;
    private String Año;
    private String Color;
    private int Precio;
    private boolean Turbo;
    private String Motor;
    private boolean Cabinas;
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

    public String getAño() {
        return Año;
    }

    public void setAño(String año) {
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

    public boolean isCabinas() {
        return Cabinas;
    }

    public void setCabinas(boolean cabinas) {
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
