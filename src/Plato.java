public class Plato {
    private String nombre;
    private double precio;
    private int calorias;
    private int minutos;

    public Plato(String nombre, double precio, int calorias, int minutos) {
        this.nombre = nombre;
        this.precio = precio;
        this.calorias = calorias;
        this.minutos = minutos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    @Override
    public String toString() {
        return "PLATO\n" + "Nombre: " + nombre + "\nPrecio: " + precio +
                "\nCalorias: " + calorias + "\nMinutos: " + minutos + "\n\n";
    }
}
