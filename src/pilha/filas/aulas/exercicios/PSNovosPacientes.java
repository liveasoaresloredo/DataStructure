package pilha.filas.aulas.exercicios;

import pilha.filas.Fila;
import pilha.filas.FilaComPrioridade;

import java.util.Random;

public class PSNovosPacientes implements Runnable{

    private FilaComPrioridade<Pessoa> filaComPrioridade;
    private int cont = 7;
    private Random prioridade = new Random();

    public PSNovosPacientes(FilaComPrioridade<Pessoa> filaComPrioridade){
        super();
        this.filaComPrioridade = filaComPrioridade;
    }

    @Override
    public void run(){

        for (int i=0; i<8; i++){
            try {
                Thread.sleep(8000);
                Pessoa pessoa = new Pessoa("" + cont, prioridade.nextInt(3));
                filaComPrioridade.enfileira(pessoa);
                cont++;
                System.out.println(pessoa + " enfileirada.");
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
