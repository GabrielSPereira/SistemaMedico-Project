/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema_hospital;

import java.util.ArrayList;
import template.Index;

/**
 *
 * @author GABRIEL
 */
public class Sistema_Hospital {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Medico> medicosTela = new ArrayList<>();
        Index frame = new Index(medicosTela); 
        frame.setVisible(true);
    }
    
}
