package filas.aulas.exercicios;

import filas.FilaComPrioridade;

public class PSAtendimento implements Runnable{
    private FilaComPrioridade<Pessoa> fila;

    public PSAtendimento(FilaComPrioridade<Pessoa> filaComPrioridade){
        super();
        this.fila = filaComPrioridade;
    }

    @Override
    public void run(){
        while (!fila.estaVazia()){
            try {
                System.out.println(fila.desenfileira() + " atendida.");
                Thread.sleep(5000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("Atendimento concluído.");
    }
}
