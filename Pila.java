import java.util.Scanner;
import java.util.Stack;

public class Pila {
    public static void main(String[] args) {
        medotospila m = new medotospila();
        Scanner sc = new Scanner(System.in);
        int n = 0;
        System.out.println("ingrese la dimension de la matriz");
        n = sc.nextInt();
        int[][] m1 = new int[n][n];
        int[][] m2 = new int[n][n];
        m1 = m.LLenarMatrxi(m1);
        m2 = m.LLenarMatrxi(m2);
        Stack<Integer> pila = new Stack<>();
        pila = m.LLenarPila(m1, m2);
        m.mostrarPila(pila);
    }
}