
package br.com.joel.model;

public class Cifra {
    
    Alfabeto alfabeto = new Alfabeto();

    public String cifrarTexto(String textoNormal, int chave) {
        
        String textoCifrado = "";
        
        for(int i=0; i<textoNormal.length(); i++) {
            if(String.valueOf(textoNormal.charAt(i)).equals(" ")) {
                textoCifrado += " ";
            }else{
                int numeroCifrado = alfabeto.procurarNumeroPelaLetra(textoNormal.charAt(i)) + chave;
                textoCifrado += ""+ alfabeto.procurarLetraPeloNumero(numeroCifrado);
            }

        }
        
        return textoCifrado;
    }
    
    public String decifrarTexto(String textoCifrado, int chave) {
        
        String textoNormal = "";
        
        for(int i=0; i<textoCifrado.length(); i++) {
            if(String.valueOf(textoCifrado.charAt(i)).equals(" ")) {
                textoNormal += " ";
            }else{
                int numeroCifrado = alfabeto.procurarNumeroPelaLetra(textoCifrado.charAt(i)) - chave;
                textoNormal += ""+ alfabeto.procurarLetraPeloNumero(numeroCifrado);
            }

        }
        
        return textoNormal;
        
    }
    
}
