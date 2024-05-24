package vetores.exercicios;

import jdk.management.jfr.FlightRecorderMXBean;
import vetores.Contato;
import vetores.Lista;

import java.util.Scanner;

public class Exer07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Lista<Contato> lista = new Lista<>(20);
        criarContatoDinamicamente(5, lista);

        int opcao = 1;

        while (opcao != 0){
            opcao = obterOpcaoMenu(scanner);
            switch (opcao){
                case 1:
                    adicionarContatoFinal(scanner, lista);
                    break;
                case 2:
                    adicionarContatoPosicao(scanner, lista);
                    break;
                case 3:
                    obteContatoPosicao(scanner, lista);
                    break;
                case 4:
                    obtemContato(scanner, lista);
                    break;
                case 5:
                    pesquisarUltimoIndice(scanner, lista);
                    break;
                case 6:
                    pesquisarContatoExiste(scanner, lista);
                    break;
                case 7:
                    excluirPorPosicao(scanner, lista);
                    break;
                case 8:
                    excluirContato(scanner, lista);
                    break;
                case 9:
                    imprimeTamanhoVetor(lista);
                    break;
                case 10:
                    limparVetor(lista);
                    break;
                case 11:
                    imprimeVetor(lista);
                    break;
                default:
                    break;
            }
        }
        System.out.println("Usuário digitou 0, programa terminado");
    }

    private static void imprimeVetor(Lista<Contato> lista){
        System.out.println(lista);
    }

    private static void limparVetor(Lista<Contato> lista){
        lista.limpar();

        System.out.println("Todos os contatos do vetor foram excluídos");
    }

    private static void imprimeTamanhoVetor(Lista<Contato> lista){
        System.out.println("Tamanho do vetor é de: " + lista.tamanho());
    }

    private static void excluirPorPosicao(Scanner scanner, Lista<Contato> lista){
        int pos = leInformacaoInt("Entre com a posição a ser removida", scanner);

        try {
            lista.remove(pos);

            System.out.println("Contato excluído");
        } catch (Exception e){
            System.out.println("Posição inválida!");
        }
    }

    private static void excluirContato(Scanner scanner, Lista<Contato> lista){
        int pos = leInformacaoInt("Entre com a posição a ser removida", scanner);

        try {
            Contato contato = lista.busca(pos);

            lista.remove(contato);
            System.out.println("Contato excluído");
        } catch (Exception e){
            System.out.println("Posição inválida");
        }
    }

    private static void pesquisarContatoExiste(Scanner scanner, Lista<Contato> lista){
        int pos = leInformacaoInt("Entre com a posição a ser pesquisada", scanner);

        try {
            Contato contato = lista.busca(pos);

            boolean existe = lista.contem(contato);

            if (existe){
                System.out.println("Contato existe, seguem dados: ");
                System.out.println(contato);
            } else {
                System.out.println("Contato não existe");
            }
        } catch (Exception e){
            System.out.println("Posição inválida");
        }
    }

    private static void pesquisarUltimoIndice(Scanner scanner, Lista<Contato> lista){
        int pos = leInformacaoInt("Entre com a posição a ser pesquisada", scanner);
    }
}
