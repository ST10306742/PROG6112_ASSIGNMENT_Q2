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
public class Aquarium extends eSharka{
    public String code="";
      @Override
    public void calcPrice(){
        super.setName(JOptionPane.showInputDialog(null,"Enter your name: "));
        super.setAge(Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your age: ")));
        int choice=Integer.parseInt(JOptionPane.showInputDialog(null, "Select one of the choices: "+
                                                                     "\n1 - Walk in -> PRICE : KIDS-R163   ADULTS-R214"+
                                                                     "\n2 - Shark cage diving -> PRICE : KIDS-R177   ADULTS-R227"+
                                                                     "\n3 - Scuba diving -> PRICES : KIDS-R165   ADULTS-R204"));
        boolean menuPopUp=false;
        while(menuPopUp==false){
        switch(choice)
        {
            case 1:
                
                if (super.getAge()<=12) {
                    super.setPrice(163);
                    code+="W";
                    menuPopUp=true;
                }else{
                    super.setPrice(214);
                    code+="I";
                    menuPopUp=true;
                }
                menuPopUp=true;
            break;
            case 2:
                
                if (super.getAge()<=12) {
                    super.setPrice(177);
                    code+="C";
                    menuPopUp=true;
                }else{
                    super.setPrice(227);
                    code+="C";
                    menuPopUp=true;
                }
                menuPopUp=true;
            break;
            case 3:
              
                if (super.getAge()<=12) {
                    super.setPrice(165);
                    code+="S";
                    menuPopUp=true;
                }else{
                    super.setPrice(204);
                    code+="S";
                    menuPopUp=true;
                }
                menuPopUp=true;
            break;
            default:
                JOptionPane.showMessageDialog(null,"Invalid selection, Please pick an appropriate option.");
            break;
          }
        }
    }
    

    @Override
     public void compileCode(){
        super.setCustomerCode("AQ"+code);
    }
    @Override
     public void showInfo(){
      JOptionPane.showMessageDialog(null, "What eSharka's Aquarium offers you:\n"+
                                          "-->View these magestic animals in their element and enchance \n"+
                                          "your knowledge on marine life and why the ocean is in danger with \n"+
                                          "ways we could save it, with the marine life that inhabits it.\n"+
                                          "PRICE : KIDS-R163   ADULTS-R214\n\n"+
                                          "-->Want to have the thrill of your life? Why not jump in with us into \n"+
                                          "our shark tank in our Shark cage diving! Watch these fearce predators \n"+
                                          "in the best seat in the house!\n"+
                                          "PRICE : KIDS-R177   ADULTS-R227\n\n"+
                                          "-->Why see the tank these animals from the outside...why not swim with them???\n"+
                                          "Dive into the tank to join us in Scuba Diving with these wonderful creatures \n"+
                                          "and see why marine life is just as beautiful as you think.\n"+
                                          "PRICES : KIDS-R165   ADULTS-R204");
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
