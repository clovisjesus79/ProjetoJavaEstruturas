import java.util.*;

public class ProjetoEstruturas {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>(5);
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        System.out.println("Passo 1 - Lista inicial: " + lista);

        Stack<Integer> pilha = new Stack<>();
        while (!lista.isEmpty()) {
            pilha.push(lista.remove(0));
        }
        System.out.println("Passo 2 - Pilha após inserção: " + pilha);

        Queue<Integer> fila = new LinkedList<>();
        while (!pilha.isEmpty()) {
            fila.add(pilha.pop());
        }
        System.out.println("Passo 3 - Fila após inserção: " + fila);

        lista.add(6);
        lista.add(7);
        lista.add(8);
        lista.add(9);
        lista.add(10);
        System.out.println("Passo 4 - Lista após inserção de 6 a 10: " + lista);

        while (!lista.isEmpty()) {
            pilha.push(lista.remove(0));
        }
        System.out.println("Passo 5 - Pilha após inserção: " + pilha);

        while (!pilha.isEmpty()) {
            fila.add(pilha.pop());
        }
        System.out.println("Passo 5 - Fila após inserção: " + fila);

        System.out.println("Passo 6 - Números na fila final: " + fila);
    }
}
