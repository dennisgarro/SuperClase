public class Carro extends Vehiculo {
    int numeroPuertas;

    public Carro(String marca, int modelo, Double precio, String color, int numeroPuertas) {
        super(marca, modelo, precio, color);
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public void MostrarDatos() {
        super.MostrarMaestro();
        System.out.println("Numero de puertas es: " + numeroPuertas);
    }
}
