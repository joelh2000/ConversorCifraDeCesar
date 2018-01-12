/**Classe responsável pelos metodos de cifra, tal qual são eles o cifrarTexto e decifrarTexto
 *
 * @author Joel Henrique Silva Santos
 * 
 * @version 1.0
 * 
 */

package br.com.joel.model;

public class Cifra {

    // Sendo que para cada letra do alfabeto tem um número correspondente de 1 à 26.
    Alfabeto alfabeto = new Alfabeto();

    public String cifrarTexto(String textoNormal, int chave) {

        String textoCifrado = "";

        for (int i = 0; i < textoNormal.length(); i++) {

            // Caso entre as palavras tenha espaço, o mesmo não será cifrado, porém vai ser adicionando no texto cifrado como espaço.
            if (String.valueOf(textoNormal.charAt(i)).equals(" ")) {
                textoCifrado += " ";
            } else {

                // O numero correspondendo da letra a ser cifrada vai ser somada com a chave e depois vai ser add no inteiro numeroCifrado
                int numeroCifrado = alfabeto.procurarNumeroPelaLetra(textoNormal.charAt(i)) + chave;

                // Caso o numero cifrado seja maior que 26 vai ser subtraido dele 26, para garantir a rotação.
                if (numeroCifrado > 26) {
                    numeroCifrado = numeroCifrado - 26;
                }

                // A letra cifrada vai ser adicionada ao texto cifrado
                textoCifrado += "" + alfabeto.procurarLetraPeloNumero(numeroCifrado);
            }

        }

        return textoCifrado;
    }

    public String decifrarTexto(String textoCifrado, int chave) {

        String textoNormal = "";

        for (int i = 0; i < textoCifrado.length(); i++) {

            // Caso entre as palavras tenha espaço, o mesmo não será cifrado, porém vai ser adicionando no texto cifrado como espaço.
            if (String.valueOf(textoCifrado.charAt(i)).equals(" ")) {
                textoNormal += " ";
            } else {
                
                // O numero correspondendo da letra a ser decifrada vai ser subtraida com a chave e depois vai ser add no inteiro numeroCifrado
                int numeroCifrado = alfabeto.procurarNumeroPelaLetra(textoCifrado.charAt(i)) - chave;

                // Caso o numero cifrado seja menor ou igual a 0 vai ser somado 26, para garantir a rotação.
                if (numeroCifrado <= 0) {
                    numeroCifrado += 26;
                }

                // A letra decifrada vai ser adicionada ao texto normal
                textoNormal += "" + alfabeto.procurarLetraPeloNumero(numeroCifrado);
                
            }

        }

        return textoNormal;

    }

}
