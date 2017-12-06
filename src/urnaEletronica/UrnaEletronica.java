/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package urnaEletronica;

import model.Urna;
import view.TelaInicial;

/**
 *
 * @author Cleiton
 */
public class UrnaEletronica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Urna novaUrna = new Urna(1);
        
        TelaInicial tela = new TelaInicial(novaUrna);
        tela.setVisible(true);
        
    }
}
