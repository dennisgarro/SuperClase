import java.util.LinkedList;

import javax.swing.JOptionPane;

public class Metodos {
    public LinkedList<Vehiculo> LlenarLista(LinkedList<Vehiculo> lista) {
        boolean bandera = true;
        int opt = 0;
        while (bandera) {
            opt = (Integer.parseInt(JOptionPane.showInputDialog("Desea agregar  1: carro 2: moto")));
            while (opt < 1 && opt > 3) {
                JOptionPane.showMessageDialog(null, "Ha ingresado una opcion no valida.", "Dato Incorrecto",
                        JOptionPane.ERROR_MESSAGE);
                opt = (Integer.parseInt(JOptionPane.showInputDialog("Desea agregar  1: carro 2: moto")));
            }
            if (opt == 3) {
                bandera = false;
                break;

            }

            String marca = JOptionPane.showInputDialog("Ingrese la Marca");
            int modelo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Modelo"));
            Double precio = Double.parseDouble(JOptionPane.showInputDialog("ingrese el precio del vehiculo"));
            String color = JOptionPane.showInputDialog("Ingrese el Color ");
            if (opt == 1) {
                int numeroPuertas = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero de puertas"));
                Carro c = new Carro(marca, modelo, precio, color, numeroPuertas);
                lista.add(c);

            } else {
                String TipoMotor = JOptionPane.showInputDialog("ingrese el tipo de motor");
                Moto m = new Moto(marca, modelo, precio, color, TipoMotor);
                lista.add(m);
            }
        }
        return lista;
    }

    public void MostrarLista(LinkedList<Vehiculo> lista) {
        String mensaje = "";
        for (Vehiculo v : lista) {
            mensaje = mensaje + v.MostrarMaestro();
            if (v instanceof Carro) {
                Carro c = (Carro) v;
                mensaje = mensaje + "Numero de puertas: " + c.getNumeroPuertas() + "\n";

            } else {
                Moto m = (Moto) v;
                mensaje = mensaje + "tipo motor: " + m.getTipoMotor() + "\n";

            }
            mensaje = mensaje + "\n";
        }
        JOptionPane.showMessageDialog(null, mensaje, "resultados", 1);
    }
}
