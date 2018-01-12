/**Classe onde vai ter todas as letras que o alfabeto tem e cada um tem um número.
 *
 * @author Joel Henrique Silva Santos
 * 
 * @version 1.0
 * 
 */

package br.com.joel.model;

import java.util.ArrayList;

public class Alfabeto {

    private final ArrayList<Letra> alfabeto = new ArrayList<>();

    // Adicionando a cada letra um numero (1~26)
    public Alfabeto() {
        char letrasAlfabeto[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        
        for(int i=0; i<letrasAlfabeto.length;i++) {
           alfabeto.add(new Letra(letrasAlfabeto[i],i+1));
        }
    }

    public ArrayList<Letra> getAlfabeto() {
        return alfabeto;
    }
    
    public char procurarLetraPeloNumero(int numero) {
        for(Letra i : alfabeto){
            if(i.getNumeroLetra() == numero) {
                return i.getNomeLetra();
            }
        }
        return 0;
    }
    
    public int procurarNumeroPelaLetra(char letra) {
        for(Letra i : alfabeto){
            if(String.valueOf(i.getNomeLetra()).equalsIgnoreCase(String.valueOf(letra))) {
                return i.getNumeroLetra();
            }
        }
        return 0;
    }
}
