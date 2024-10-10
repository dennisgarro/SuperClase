import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class ImportarArchivoTxt {

    public LinkedList<Vehiculo> leerArchivo(String nombreArchivo, LinkedList<Vehiculo> vs) {
        String rutaArchivo = nombreArchivo + ".txt";

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String line;
            String marca = "";
            int modelo = 0;
            double precio = 0.0;
            String color = "";
            boolean esCarro = false;
            int numeroPuertas = 0;
            String tipoMotor = "";

            while ((line = br.readLine()) != null) {
                // Procesar cada campo
                if (line.startsWith("Marca: ")) {
                    marca = line.substring(7).trim(); // Captura el nombre de la marca
                } else if (line.startsWith("Modelo: ")) {
                    modelo = Integer.parseInt(line.substring(8).trim()); // Captura el modelo
                } else if (line.startsWith("Precio: ")) {
                    precio = Double.parseDouble(line.substring(8).trim()); // Captura el precio
                } else if (line.startsWith("Color: ")) {
                    color = line.substring(7).trim(); // Captura el color
                } else if (line.startsWith("Cantidad Puertas: ")) {
                    numeroPuertas = Integer.parseInt(line.substring(18).trim()); // Captura el número de puertas
                    esCarro = true; // Se establece como carro
                } else if (line.startsWith("Tipo Motor: ")) {
                    tipoMotor = line.substring(12).trim(); // Captura el tipo de motor
                    esCarro = false; // Se establece como moto
                }

                // Detectar el final de un vehículo (línea vacía o línea de separación)
                if (line.isEmpty() || line.startsWith("---------------------------------------")) {
                    // Solo agregar si hemos leído los datos
                    if (!marca.isEmpty()) {
                        if (esCarro) {
                            Carro c = new Carro(marca, modelo, precio, color, numeroPuertas);
                            vs.add(c);
                        } else {
                            Moto m = new Moto(marca, modelo, precio, color, tipoMotor);
                            vs.add(m);
                        }
                    }

                    // Reiniciar variables para el siguiente vehículo
                    marca = "";
                    modelo = 0;
                    precio = 0.0;
                    color = "";
                    numeroPuertas = 0;
                    tipoMotor = "";
                }
            }

            // Asegurarse de agregar el último vehículo si el archivo no termina con una
            // línea vacía
            if (!marca.isEmpty()) {
                if (esCarro) {
                    Carro c = new Carro(marca, modelo, precio, color, numeroPuertas);
                    vs.add(c);
                } else {
                    Moto m = new Moto(marca, modelo, precio, color, tipoMotor);
                    vs.add(m);
                }
            }

            System.out.println("¡Archivo importado exitosamente!");

        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("Error de formato numérico: " + e.getMessage());
        }

        return vs;
    }

}
