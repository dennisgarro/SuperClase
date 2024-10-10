import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

public class ExportarArchivo {

    public void exportarArchivo(LinkedList<Vehiculo> lista) {
        if (lista.isEmpty()) {
            Metodos ll = new Metodos();
            lista = ll.LlenarLista(lista);
        } else {
            try (FileWriter escriba = new FileWriter("Vehiculos.txt")) {
                for (Vehiculo o : lista) {
                    escriba.write("Marca: " + o.getMarca() + "\n");
                    escriba.write("Modelo: " + o.getModelo() + "\n");
                    escriba.write("Precio: " + o.getPrecio() + "\n");
                    escriba.write("Color: " + o.getColor() + "\n");
                    if (o instanceof Carro) {
                        Carro c = (Carro) o;
                        escriba.write("Cantidad Puertas: " + c.getNumeroPuertas() + "\n");
                    } else {
                        Moto m = (Moto) o;
                        escriba.write("Tipo Motor: " + m.getTipoMotor() + "n");
                    }
                    escriba.write("---------------------------------------\n");
                }

                System.out.println("Archivo exportado correctamente");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
