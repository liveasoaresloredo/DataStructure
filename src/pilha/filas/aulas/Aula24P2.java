package pilha.filas.aulas;

import pilha.filas.FilaComPrioridade;

public class Aula24P2 {
    public static void main(String[] args) {
        FilaComPrioridade<Paciente> filaComPrioridade = new FilaComPrioridade<>();

        filaComPrioridade.enfileira(new Paciente("A", 1));
        filaComPrioridade.enfileira(new Paciente("C", 2));
        filaComPrioridade.enfileira(new Paciente("B", 3));

        System.out.println(filaComPrioridade);
        System.out.println(filaComPrioridade.desenfileira());
        System.out.println(filaComPrioridade);
    }
}
