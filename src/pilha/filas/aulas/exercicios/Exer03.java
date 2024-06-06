package pilha.filas.aulas.exercicios;

import pilha.filas.FilaComPrioridade;

public class Exer03 {

    public static final int VERDE = 2;
    public static final int AMARELO = 1;
    public static final int VERMELHO = 0;

    public static void main(String[] args) {

        FilaComPrioridade<Pessoa> filaComPrioridade = new FilaComPrioridade<>();
        filaComPrioridade.enfileira(new Pessoa("1", VERDE));
        filaComPrioridade.enfileira(new Pessoa("2", AMARELO));
        filaComPrioridade.enfileira(new Pessoa("3", VERMELHO));
        filaComPrioridade.enfileira(new Pessoa("4", VERDE));
        filaComPrioridade.enfileira(new Pessoa("5", VERDE));
        filaComPrioridade.enfileira(new Pessoa("6", VERMELHO));

        PSAtendimento atendimento = new PSAtendimento(filaComPrioridade);
        PSNovosPacientes pacientes = new PSNovosPacientes(filaComPrioridade);

        Thread t1 = new Thread(atendimento);
        Thread t2 = new Thread(pacientes);

        t1.start();
        t2.start();

    }
}
