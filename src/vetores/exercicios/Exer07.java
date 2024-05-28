package vetores.exercicios;

import vetores.Contato;

import java.util.ArrayList;
import java.util.Scanner;

public class Exer07 extends Exer06{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        ArrayList<Contato> lista = new ArrayList<>(20);

        criarContatoDinamicamente(5, lista);

        int opcao = 1;

        while (opcao != 0){
            opcao = obterOpcaoMenu(scanner);

            switch (opcao){
                case 1:
                    adicionaContatoFinal(scanner, lista);
                    break;
                case 2:
                    adicionaContatoPosicao(scanner, lista);
                    break;
                case 3:
                    obtemContatoPosicao(scanner, lista);
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

    private static void imprimeVetor(ArrayList<Contato> lista){
        System.out.println(lista);
    }

    private static void limparVetor(ArrayList<Contato> lista){
        lista.clear();
        System.out.println("Todos os contatos do vetor foram exluídos");
    }

    private static void imprimeTamanhoVetor(ArrayList<Contato> lista){
        System.out.println("Tamanho do vetor é de: " + lista.size());
    }

    private static void excluirPorPosicao(Scanner scanner, ArrayList<Contato> lista){
        int pos = leInformacaoInt("Entre com a posição a ser removida", scanner);

        try {
            lista.remove(pos);
            System.out.println("Contato excluído");
        } catch (Exception e){
            System.out.println("Posição inválida");
        }
    }

    private static void excluirContato(Scanner scanner, ArrayList<Contato> lista){
        int pos = leInformacaoInt("Entre com a posição a ser removida", scanner);

        try {
            Contato contato = lista.get(pos);
            lista.remove(contato);
            System.out.println("Contato excluído");
        } catch (Exception e){
            System.out.println("Posição inválida!");
        }
    }

    private static void pesquisarContatoExiste(Scanner scanner,ArrayList<Contato> lista){
        int pos = leInformacaoInt("Entre com a posição a ser pesquisada ", scanner);

        try {
            Contato contato = lista.get(pos);
            boolean existe = lista.contains(contato);

            if (existe){
                System.out.println("Contato existe, seguem dados: ");
                System.out.println(contato);
            } else {
                System.out.println("Contato não existe");
            }
        } catch (Exception e){
            System.out.println("Posição inválida!");
        }
    }

    private static void pesquisarUltimoIndice(Scanner scanner, ArrayList<Contato> lista){

        int pos = leInformacaoInt("Entre com a posição a ser pesquisada ", scanner);

        try {
            Contato contato = lista.get(pos);

            System.out.println("Contato existe, seguem dados: ");
            System.out.println(contato);

            System.out.println("Fazendo pesquisa do último índice do contato encontrado: ");
            pos = lista.lastIndexOf(contato);

            System.out.println("Contato encontrado na posição " + pos);
        } catch (Exception e){
            System.out.println("Posição inválida");
        }
    }

    private static void obtemContato(Scanner scanner, ArrayList<Contato> lista){
        int pos = leInformacaoInt("Entre com a posição a ser pesquisada ", scanner);

        try {
            Contato contato = lista.get(pos);

            System.out.println("Contato existe, seguem dados:");
            System.out.println(contato);

            System.out.println("Fazendo pesquisa do contato encontrado:");
            pos = lista.indexOf(contato);

            System.out.println("Contato encontrado na posição " + pos);
        } catch (Exception e){
            System.out.println("Posição inválida!");
        }
    }

    private static void obtemContatoPosicao(Scanner scanner, ArrayList<Contato> lista){
        int pos = leInformacaoInt("Entre com a posição a ser pesquisada", scanner);
        try {
            Contato contato = lista.get(pos);

            System.out.println("Contato existe, seguem dados: ");
            System.out.println(contato);
        } catch (Exception e){
            System.out.println("Posição inválida!");
        }
    }

    private static void adicionaContatoFinal(Scanner scanner, ArrayList<Contato> lista){
        System.out.println("Criando um contato, entre com as informações:");
        String nome = leInformacao("Entre com o nome ", scanner);
        String telefone = leInformacao("Entre com o telefone ", scanner);
        String email = leInformacao("Entre com o emaill ", scanner);

        Contato contato = new Contato(nome, telefone, email);

        lista.add(contato);

        System.out.println("Contato adicionado com sucesso!");
        System.out.println(contato);
    }
    private static void adicionaContatoPosicao(Scanner scanner, ArrayList<Contato> lista ){
        System.out.println("Criando um contato, entre com as informações: ");
        String nome = leInformacao("Entre com o nome ", scanner);
        String telefone = leInformacao("Entre com o telefone ", scanner);
        String email = leInformacao("Entre com o email ", scanner);

        Contato contato = new Contato(nome, telefone, email);

        int pos = leInformacaoInt("Entre com a posição a adicionar o contato", scanner);

        try {
            lista.add(pos, contato);
            System.out.println("Contato adicionado com sucesso!");
            System.out.println(contato);
        } catch (Exception e){
            System.out.println("Posição inválida, contato não adicionado");
        }
    }

    private static void criarContatoDinamicamente(int quantidade, ArrayList<Contato> lista){
        Contato contato;

        for (int i=1; i<=quantidade; i++){

            contato = new Contato();
            contato.setNome("Contato " + i);
            contato.setTelefone("1111111" + i);
            contato.setEmail("contato"+i+"@email.com");

            lista.add(contato);
        }
    }
}

