import java.util.Stack;

public class medotospila {
    public Stack<Integer> LLenarPila(int[][] m1, int[][] m2) {
        Stack<Integer> pila = new Stack<>();
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m2.length; j++) {
                pila.push(m1[i][j] * m2[i][j]);
            }
        }
        return pila;
    }

    public int[][] LLenarMatrxi(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                m[i][j] = (int) (Math.random() * 50 + 1);
            }
        }
        return m;
    }

    public void mostrarPila(Stack<Integer> pila) {
        System.out.println(pila);
    }
}
