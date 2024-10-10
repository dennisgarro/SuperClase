import java.util.LinkedList;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        int opt = 0;
        boolean bandera = true;
        Metodos m = new Metodos();
        LinkedList<Vehiculo> lista = new LinkedList<>();
        String mensaje = "Ingrese la opcion que desea ejecutar \n" +
                "1: llenar lista \n" +
                "2: Mostrar Lista \n" +
                "3: Importar archivo \n" +
                "4: Exportar archivo \n";
        while (bandera) {
            opt = (Integer.parseInt(JOptionPane.showInputDialog(mensaje)));
            switch (opt) {
                case 1:
                    lista = m.LlenarLista(lista);
                    break;
                case 2:
                    m.MostrarLista(lista);
                    break;
                case 3:
                    ImportarArchivoTxt i = new ImportarArchivoTxt();
                    lista = i.leerArchivo("Vehiculos", lista);
                    break;
                case 4:
                    ExportarArchivo e = new ExportarArchivo();
                    e.exportarArchivo(lista);
                    break;

                default:
                    bandera = false;
                    break;
            }
        }
    }
}