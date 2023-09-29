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
public class DangerousCreatures extends eSharka{
    public String code="";
    @Override
    public void calcPrice(){
        super.setName(JOptionPane.showInputDialog(null,"Enter your name: "));
        super.setAge(Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your age: ")));
        int choice=Integer.parseInt(JOptionPane.showInputDialog(null, "Select one of the choices: "+
                                                                     "\n1 - Walk in -> "+"\n2 - Reptile interaction -> "+
                                                                     "\n3 - Combination Special. -> "));
        boolean menuPopUp=false;
        
        while(menuPopUp==false){
        switch(choice)
        {
            case 1:
                if (super.getAge()<12) {
                    super.setPrice(62);
                    code=code+"W";
                    menuPopUp=true;
                }else{
                    super.setPrice(104);
                    code=code+"W";
                    menuPopUp=true;
                }
            break;
            case 2:
                if (super.getAge()<12) {
                    super.setPrice(80);
                    code=code+"I";
                    menuPopUp=true;
                }else{
                    super.setPrice(120);
                    code=code+"I";
                    menuPopUp=true;
                }
            break;
            case 3:
                if (super.getAge()<12) {
                    super.setPrice((62+80)-((62+80)/10));
                    code=code+"WI";
                    menuPopUp=true;
                }else{
                    super.setPrice((104+120)-((104+120)/10));
                    code=code+"WI";
                    menuPopUp=true;
                }
            break;
            default:
                JOptionPane.showMessageDialog(null,"Invalid selection, Please pick an appropriate option.");
            break;
        }
        }
    }
    @Override
     public void compileCode(){
       super.setCustomerCode("DC"+code); 
    }
    @Override
     public void showInfo(){
        JOptionPane.showMessageDialog(null, "What eSharka's Reptile sancuary offers you:\n"+
                                            "-->Animal lover hey...look no futher! These cutie pies \n"+
                                            "are just as happy to see you as you are to see them!Learn \n"+
                                            "about cold blooded predators and how dangerous yet facinating \n"+
                                            "they actually are.\n"+
                                            "PRICES : KIDS-R62   ADULTS-R104\n\n"+
                                            "-->Watching isn't enought? WE GOT YOU! Have an interactive session \n"+
                                            "one of our well behaved ball pythons whose just eager to see you! \n"+
                                            "Experience a meeting with a snake to enchance your knowledge about \n"+
                                            "them. Who knows, it could save your life one day...\n"+
                                            "PRICES : KIDS-R80   ADULTS-120\n\n"+
                                            "Can't decide? Why not do both!? Get a combined ticket for a special \n"+
                                            "10% discount!/n"+
                                            "PRICES : KIDS-R127.80   ADULTS-R201.60");
    }
         public int saveAge(){
        int saved =getAge();
        return saved;
    }
    public String saveName(){
        String saved =getName();
        return saved;
    }
}
