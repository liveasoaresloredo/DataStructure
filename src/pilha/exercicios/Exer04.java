package pilha.exercicios;

import java.util.Stack;

public class Exer04 {
    public static void main(String[] args) {
        Stack<Livro> pilha = new Stack<>();

        Livro livro1 = new Livro();
        livro1.setNome("Teste");
        livro1.setAutor("Testes");
        livro1.setAnoLancamento(12312);
        livro1.setIsbn("wwer23w2");

        Livro livro2 = new Livro();
        livro2.setNome("Teste");
        livro2.setAutor("Testes");
        livro2.setAnoLancamento(2341);
        livro2.setIsbn("29nls2");

        Livro livro3 = new Livro();
        livro3.setNome("Teste");
        livro3.setAutor("Testes");
        livro3.setAnoLancamento(1231);
        livro3.setIsbn("q231fe");

        Livro livro4 = new Livro();
        livro4.setNome("Teste");
        livro4.setAutor("Testes");
        livro4.setAnoLancamento(11231);
        livro4.setIsbn("23fe32");

        System.out.println("Pilha de livros criada, pilha está vazia? " + pilha.isEmpty());
        System.out.println("Empilhando livros na pilha:");

        pilha.push(livro1);
        pilha.push(livro2);
        pilha.push(livro3);
        pilha.push(livro4);

        System.out.println(pilha.size() + " livros foram empilhados:");
        System.out.println(pilha);

        System.out.println("Pilha de livros criada, pilha está vazia? " + pilha.isEmpty());

        System.out.println("Espiando o topo da pilha: " + pilha.peek());

        System.out.println("Desempilhando livros da pilha");

        while (!pilha.isEmpty()){
            System.out.println("Desempilhando livro: " + pilha.pop());
        }

        System.out.println("Todos os livros foram desempilhados, pilha vazia: " + pilha.isEmpty());
    }
}
