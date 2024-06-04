package pilha.filas.aulas.exercicios;

import pilha.filas.Fila;

public class Exer01 {
    public static void main(String[] args) {

        Fila<Documento> filaImpressora = new Fila<>();

        filaImpressora.enfileira(new Documento("A",1));
        filaImpressora.enfileira(new Documento("B",2));
        filaImpressora.enfileira(new Documento("C",3));
        filaImpressora.enfileira(new Documento("D",7));
        filaImpressora.enfileira(new Documento("E",9));

        while (!filaImpressora.estaVazia()){
            Documento documento = filaImpressora.desenfileira();
            System.out.println("Imprimindo documento " + documento.getNome());
            try {
                Thread.sleep(200 * documento.getNumFolhas());
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("Todos os documentos foram impressos.");
    }

}
