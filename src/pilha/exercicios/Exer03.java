package pilha.exercicios;

import pilha.Pilha;

public class Exer03 {
    public static void main(String[] args) {
        Pilha<Livro> pilha = new Pilha<>(20);

        Livro livro1 = new Livro();
        livro1.setNome("Teste");
        livro1.setAutor("Testes");
        livro1.setAnoLancamento(2000);
        livro1.setIsbn("T7h2");

        Livro livro2 = new Livro();
        livro2.setNome("Teste teste");
        livro2.setAutor("Testes2");
        livro2.setAnoLancamento(2342);
        livro2.setIsbn("KJ23K");

        Livro livro3 = new Livro();
        livro3.setNome("Teste teste teste");
        livro3.setAutor("Testes3");
        livro3.setAnoLancamento(1230);
        livro3.setIsbn("Hjse12");

        Livro livro4 = new Livro();
        livro4.setNome("Teste teste teste teste");
        livro4.setAutor("Testes4");
        livro4.setAnoLancamento(1230);
        livro4.setIsbn("Hjse12qq1");

        System.out.println("Pilha de livros criada, pilha está vazia? " + pilha.estaVazia());

        System.out.println("Empilhando livros na pilha: ");

        pilha.empilha(livro1);
        pilha.empilha(livro2);
        pilha.empilha(livro3);
        pilha.empilha(livro4);

        System.out.println(pilha.tamanho() + " livros foram empilhados: ");
        System.out.println(pilha);

        System.out.println("Pilha de livros criada, pilha está vazia? " + pilha.estaVazia());

        System.out.println("Espiando o topo da pilha: " + pilha.topo());

        System.out.println("Desempilhando livros da pilha: ");

        while (!pilha.estaVazia()){
            System.out.println("Desempilhando livro: " + pilha.desempilha());
        }

        System.out.println("Todos os livros foram desempilhados, pilha vazia: " + pilha.estaVazia());
    }
}
