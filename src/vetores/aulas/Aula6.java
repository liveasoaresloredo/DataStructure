package vetores.aulas;

import vetores.Vetor;

public class Aula6 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(10);

        vetor.adiciona("elemento 1");
        vetor.adiciona("elemento 2");
        vetor.adiciona("elemento 3");

        System.out.println(vetor.busca("elemento 1"));
        System.out.println(vetor.busca("elemento 2"));
        System.out.println(vetor.busca("elemento 3"));
    }
}
