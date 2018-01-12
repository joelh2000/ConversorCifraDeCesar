/**Classe que vai ter uma letra e essa letra vai ter um numero unico de 1 à 26
 *
 * @author Joel Henrique Silva Santos
 * 
 * @version 1.0
 * 
 */

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
