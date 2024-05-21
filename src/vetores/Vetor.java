package vetores;

import java.util.Arrays;

public class Vetor {
    private String[] elementos;
    private int tamanho;
    private int i;

    public Vetor(int capacidade){
        this.elementos = new String[capacidade];
    }

    public boolean adiciona(String elemento){
        this.aumentaCapacidade();
        if (this.tamanho < this.elementos.length){
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    public boolean adiciona(int posicao, String elemento){
        if (!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posição inválida");
        }
        this.aumentaCapacidade();

        for (int i=this.tamanho-1; i>=posicao; i--){
            this.elementos[i+1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;

        return true;
    }

    public void aumentaCapacidade(){
        if(this.tamanho == this.elementos.length){
            String[] elementosNovos = new String[this.elementos.length * 2];
            for (int i=0; i<this.elementos.length; i++){
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }
    public String busca(int posciao){
        if(!(posciao >= 0 && posciao < tamanho)){
            throw new IllegalArgumentException("Posição inválida");
        }
        return this.elementos[posciao];
    }

    public int busca(String elemento){
        for (int i=0; i<this.tamanho; i++){
            if (this.elementos[i].equals(elemento)){
                return i;
            }
        }
        return -1;
    }

    public void remove(int posicao){
        if (!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posição inválida");
        }
        for (int i=posicao; i<this.tamanho-1; i++){
            this.elementos[i] = this.elementos[i+1];
        }
        this.tamanho--;
    }
    public int tamanho(){
        return this.tamanho;
    }

    @Override
    public String toString() {
        return "Vetor{" +
                "elementos=" + Arrays.toString(elementos) +
                ", tamanho=" + tamanho +
                '}';
    }

    //    public void adiciona(String elemento) throws Exception{
//        if (this.tamanho < this.elementos.length){
//            this.elementos[this.tamanho] = elemento;
//            this.tamanho++;
//        } else {
//            throw new Exception("Vetor já está cheio, não é possível adicionar mais elementos");
//        }
//        this.elementos[this.tamanho] = elemento;
//        this.tamanho++;
//    }

//    public void adiciona(String elemento){
//        for (int i=0; i<this.elementos.length; i++){
//            if (this.elementos[i] == null){
//                this.elementos[i] = elemento;
//                break;
//            }
//        }
//    }


}
