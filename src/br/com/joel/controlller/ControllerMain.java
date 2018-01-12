
package br.com.joel.controlller;

import br.com.joel.view.TelaConversor;


public class ControllerMain {
    
    TelaConversor telaInicial;
    
    public void mostrarTelaInicial() {
        telaInicial = new TelaConversor();
        telaInicial.setVisible(true);
    }
    
}
