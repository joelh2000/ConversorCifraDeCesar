
package br.com.joel.model;

public class Letra {
    
    private char nomeLetra;
    private int numeroLetra;

    public Letra(char nomeLetra, int numeroeLetra) {
        this.nomeLetra = nomeLetra;
        this.numeroLetra = numeroeLetra;
    }
    
    public char getNomeLetra() {
        return nomeLetra;
    }

    public void setNomeLetra(char nomeLetra) {
        this.nomeLetra = nomeLetra;
    }

    public int getNumeroLetra() {
        return numeroLetra;
    }

    public void setNumeroLetra(int numeroLetra) {
        this.numeroLetra = numeroLetra;
    }
    
}
