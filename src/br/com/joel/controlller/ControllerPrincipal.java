
package br.com.joel.controlller;

import br.com.joel.model.Alfabeto;
import br.com.joel.model.Cifra;

public class ControllerPrincipal {
    
    public String funcaoCifra(String textoNormal, int chave) {
        return new Cifra().cifrarTexto(textoNormal, chave);
    }
    
    public String funcaoDecifra(String textoCifrado, int chave) {
         return new Cifra().decifrarTexto(textoCifrado, chave);
    }
    
}
