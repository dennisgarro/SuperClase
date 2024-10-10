public class Moto extends Vehiculo {
    String TipoMotor;

    public Moto(String marca, int modelo, Double precio, String color, String tipoMotor) {
        super(marca, modelo, precio, color);
        TipoMotor = tipoMotor;
    }

    public String getTipoMotor() {
        return TipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        TipoMotor = tipoMotor;
    }

    public void MostrarDatos() {
        super.MostrarMaestro();
        System.out.println("tipo de motor: " + TipoMotor);
    }
}
