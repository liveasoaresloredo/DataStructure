package pilha.filas.aulas.exercicios;

import pilha.filas.FilaComPrioridade;

public class PSAtendimento implements Runnable{
    private FilaComPrioridade<Pessoa> filaComPrioridade;

    public PSAtendimento(FilaComPrioridade<Pessoa> filaComPrioridade){
        super();
        this.filaComPrioridade = filaComPrioridade;
    }

    @Override
    public void run(){
        while (!filaComPrioridade.estaVazia()){
            try {
                System.out.println(filaComPrioridade.desenfileira() + " atendida.");
                Thread.sleep(5000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("Atendimento concluído.");
    }
}
