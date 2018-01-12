
package br.com.joel.model;

import java.util.ArrayList;

public class Alfabeto {

    private final ArrayList<Letra> alfabeto = new ArrayList<>();

    public Alfabeto() {
        char letrasAlfabeto[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        
        for(int i=1; i<=letrasAlfabeto.length;i++) {
           alfabeto.add(new Letra(letrasAlfabeto[i],i));
        }
    }

    public ArrayList<Letra> getAlfabeto() {
        return alfabeto;
    }
}
