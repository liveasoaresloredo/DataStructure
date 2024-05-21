package vetores.aulas;

import vetores.Contato;
import vetores.VetorObjetos;

public class Aula10 {
    public static void main(String[] args) {
        VetorObjetos vetor = new VetorObjetos(3);
//        vetor.adiciona(3);
//        vetor.adiciona(4);
//        vetor.adiciona(5);

        Contato contato1 = new Contato("Contato 1", "1234-4567", "contato1@email.com");
        Contato contato2 = new Contato("Contato 2", "2345-6789", "contato2@email.com");
        Contato contato3 = new Contato("Contato 3", "3456-7890", "contato3@email.com");

        Contato contato4 = new Contato("Contato 1", "1234-4567", "contato1@email.com");

        vetor.adiciona(contato1);
        vetor.adiciona(contato2);
        vetor.adiciona(contato3);

        System.out.println("Tamanho = " + vetor.tamanho());

        int pos = vetor.busca(contato4);
        if (pos > -1){
            System.out.println("Elemento existe no vetor");
        } else {
            System.out.println("Elemento não existe no vetor");
        }
        System.out.println(vetor);
    }
}
