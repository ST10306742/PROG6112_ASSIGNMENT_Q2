/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog_questiontwo;

import javax.swing.JOptionPane;

/**
 *
 * @author shail
 */
public class PROG_QuestionTwo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //PROG Question 2 
        Aquarium aq = new Aquarium();
        DangerousCreatures dc = new DangerousCreatures();
        WaterPark wp = new WaterPark();
        eSharka es = new eSharka();
        
       JOptionPane.showMessageDialog(null,es.compileReceipt());
    }
}
