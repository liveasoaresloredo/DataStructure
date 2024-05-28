package pilha.exercicios;

import pilha.Pilha;

import java.util.Scanner;

public class Exer01 {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<>();

        Scanner scanner = new Scanner(System.in);

        for (int i=1; i<=10; i++){
            System.out.println("Entre com um número: ");

            int num = scanner.nextInt();

            if (num % 2 == 0){
                System.out.println("Empilhando o número " + num);
                pilha.empilha(num);
            } else {
                Integer despilhado = pilha.desempilha();

                if (despilhado == null){
                    System.out.println("Pilha eztá vazia");
                } else {
                    System.out.println("Número ímpar, desempilhando um elemento da pilha: " + despilhado);
                }
            }
        }

        System.out.println("Todos os números foram lidos, desempilhando números da pilha");

        while (pilha.estaVazia()){

                System.out.println("Pilha está vazia");
                System.out.println("Número ímpar, desempilhando um elemento da pilha: " + pilha.desempilha());
        }

        System.out.println("Todo os elementos foram desempilhados");
    }
}
