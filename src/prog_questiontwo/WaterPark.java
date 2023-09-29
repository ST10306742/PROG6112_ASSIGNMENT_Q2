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
public class WaterPark extends eSharka{
    public String code="";
    @Override
    public void calcPrice(){
        
        boolean menuPopUp=false;
        super.setName(JOptionPane.showInputDialog(null,"Enter your name: "));
        super.setAge(Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your age: ")));
        while(menuPopUp==false){
            int choice=Integer.parseInt(JOptionPane.showInputDialog(null, "Select one of the choices: "+
                                                                     "\n1 - Slides n' Rides -> PRICES : KIDS-R169   ADULTS-R210"+
                                                                     "\n2 - Zip-Line -> PRICES : R180 pp"+
                                                                     "\n3 - Combination Special.. -> PRICES : ADULTS-R260.10"));
        switch(choice)
        {
            case 1:
                if (super.getAge()<12) {
                    super.setPrice(169);
                    code=code+"S";
                    menuPopUp=true;
                }else{
                    super.setPrice(210);
                     code=code+"S";
                    menuPopUp=true;
                } 
            break;
            case 2:
                if (super.getAge()<15) {
                    JOptionPane.showMessageDialog(null, "Unfortunaley, no kids under 15 can go zip linning "+
                                                        "due to safe concerns.\nPlease pick another activity.");
                    
                } else {
                  super.setPrice(180);
                 code=code+"Z";
                menuPopUp=true;
                }
               
            break;
            case 3:
                 if (super.getAge()<15) {
                    JOptionPane.showMessageDialog(null, "Unfortunaley, no kids under 15 can go zip linning "+
                                                        "due to safe concerns.\nPlease pick another activity.");
                }else{
                    super.setPrice((169+120)-(169+120)/10);
                     code=code+"SZ";
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
        super.setCustomerCode("WP"+code);
    }
    @Override
     public void showInfo(){
        JOptionPane.showMessageDialog(null, "What eSharka's Water Park offers you:\n"+
                                            "-->SUMMER IS HERE! Let's all have fun in Africa's \n"+
                                            "favoruite water park, SLIDE N RIDE!!! Enjoy various \n"+
                                            "rides and slides in our fantastic water park with thrill\n"+
                                            " like no other. Enjoy the delight of all types of foods \n"+
                                            "or drinks if you exhaust yourself.\n"+
                                            "PRICES : KIDS-R169   ADULTS-R210\n\n"+
                                            "-->Dont't wanna get wet? NO PROBLEMO!!! Have an experience\n"+
                                            " of a lifetime by zip lining across eSharka, over viewing \n"+
                                            "every activity eSharka has to offer!\n"+
                                            "PRICES : R180 pp\n\n"+
                                            "Can't decide? Why not do both!? Get a combined ticket for a special \n"+
                                            "10% discount!/n"+
                                            "PRICES : ADULTS-R260.10");
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
