/**Classe main que vai chamar o controller main
 *
 * @author Joel Henrique Silva Santos
 * 
 * @version 1.0
 * 
 */

package br.com.joel.main;

import br.com.joel.controlller.ControllerMain;
import br.com.joel.model.Alfabeto;

public class Main {
    
   Alfabeto alfabeto = new Alfabeto();
   
    public static void main(String[] args) {
    
        new ControllerMain().mostrarTelaInicial();
    
    }
    
}