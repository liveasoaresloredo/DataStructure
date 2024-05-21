package vetores.aulas;

import vetores.Contato;
import vetores.Lista;

public class Aula11 {
    public static void main(String[] args) {

        Lista<Contato> vetor = new Lista<>(1);

        Contato contato1 = new Contato("Contato 1", "1234-4567", "contato1@email.com");
        Contato contato2 = new Contato("Contato 2", "2345-6789", "contato2@email.com");
        Contato contato3 = new Contato("Contato 3", "3456-7890", "contato3@email.com");

        vetor.adiciona(contato1);
    }
}
