
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

                if(numeroCifrado > 26) {
                    numeroCifrado = numeroCifrado - 26;
                }

                textoCifrado += ""+ alfabeto.procurarLetraPeloNumero(numeroCifrado);
            }

        }
        
        return textoCifrado;
    }
    
    public String decifrarTexto(String textoCifrado, int chave) {
        
        String textoNormal = "";
        
        for(int i=0; i<textoCifrado.length(); i++) {
            if(String.valueOf(textoCifrado.charAt(i)).equals(" ")) {
//                textoNormal += " ";
                System.out.println("TEVE ESPAÇO");
            }else{ 
                System.out.println("NÃO TEVE ESPAÇO");
                
                System.out.println("CHAVE: "+chave);
                System.out.println("NUMERO DA LETRA: "+alfabeto.procurarNumeroPelaLetra(textoCifrado.charAt(i)));
                System.out.println("NUMERO CIFRADO: "+(alfabeto.procurarNumeroPelaLetra(textoCifrado.charAt(i)) - chave));
                int numeroCifrado = alfabeto.procurarNumeroPelaLetra(textoCifrado.charAt(i)) - chave;
                
                if(numeroCifrado <= 0) {
                    System.out.println("NUMERO CIFRADO É MENOR OU IGUAL A 0");
                    numeroCifrado += 26;
                    System.out.println("NOVO NUMERO CIFRADO: "+numeroCifrado);
                }
//                
                textoNormal += "" + alfabeto.procurarLetraPeloNumero(numeroCifrado);
            }

        }
        
        return textoNormal;
        
    }
    
}
