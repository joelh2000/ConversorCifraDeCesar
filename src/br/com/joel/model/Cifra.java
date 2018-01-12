
package br.com.joel.model;

public class Cifra {
    
    Alfabeto alfabeto = new Alfabeto();
   
//    public String cifrarTexto(String textoNormal, int chave) {
//        
////        String textoCifrado = "";
////        
////        for(int i=0; i<textoNormal.length(); i++) {
////            int numeroCifrado = alfabeto.procurarNumeroPelaLetra(textoNormal.charAt(i)) + chave;
////            textoCifrado = ""+ alfabeto.procurarLetraPeloNumero(numeroCifrado);
////        }
//        
//        return "pato";
//    }
    
    public String cifrarTexto(String textoNormal, int chave) {
        
        String textoCifrado = "";
        
        for(int i=0; i<textoNormal.length(); i++) {
            int numeroCifrado = alfabeto.procurarNumeroPelaLetra(textoNormal.charAt(i)) + chave;
            textoCifrado += ""+ alfabeto.procurarLetraPeloNumero(numeroCifrado);
        }
        
        return textoCifrado;
    }
    
    public String decifrarTexto(String textoCifrado, int chave) {
        
        String textoNormal = "";
        
        for(int i=0; i<textoNormal.length(); i++) {
            int numeroCifrado = alfabeto.procurarNumeroPelaLetra(textoNormal.charAt(i)) - chave;
            textoCifrado = ""+ alfabeto.procurarLetraPeloNumero(numeroCifrado);
        }
        
        return textoNormal;
        
    }
    
}
