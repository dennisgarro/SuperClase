public class Vehiculo {
    String marca;
    int modelo;
    Double precio;
    String color;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

  

    public Vehiculo(String marca, int modelo, Double precio, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.color = color;
    }

    public String MostrarMaestro() {
        String mensaje = "Marca: " + marca + "\n" +
                "Modelo: " + modelo + "\n" +
                "Precio: " + precio + "\n" +
                "Color: " + color + "\n";
        return mensaje;

    }

}