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
public class eSharka {
    private String customerCode;
    private String name;
    private String catergory;
    private int age;
    private double price;
    private String date;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCatergory() {
        return catergory;
    }

    public void setCatergory(String catergory) {
        this.catergory = catergory;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price=price;
    }
    
    public void calcPrice(){
        
    }
    
    public void compileCode(){
        
    }
    public void showInfo(){
        JOptionPane.showMessageDialog(null, "WELCOME TO ESHARKA'S OFFICAL BOOKING APP...\neSharka is currently one of the"+
                                          " biggest tourist attractions across Africa. We have many grand activities such as\n"+
                                          "our famous ocean life in our Aquariums, the fearful reptile creatures and\n "+
                                          "one of the greatest water parks ever made in Africa, Slide n Ride!\n"+
                                          "\nBook tickets now to join the unlimited joy and fun vibes!!!"+
                                          "\n\neSharka...the fun is within the water.");
    }
    
    public String compileReceipt(){
      String totReciept="";
      double totCost=0;
       Aquarium aq = new Aquarium();
       DangerousCreatures dc = new DangerousCreatures();
       WaterPark wp = new WaterPark();
       showInfo();
       aq.showInfo();
       dc.showInfo();
       wp.showInfo();
       
       int customerAmt=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the amount of people you are booking for."));
        setDate(JOptionPane.showInputDialog(null,"Enter date of booking: "));
       String[] cusID= new String[customerAmt];
       String[] names= new String[customerAmt];
       int[] age= new int[customerAmt];
       String [] catergory=new String[customerAmt];
       double [] price= new double[customerAmt];
       
        for (int i = 0; i < customerAmt; i++) {
            
            boolean menuPrompt=false;
            while(menuPrompt==false){
                int choice = Integer.parseInt(JOptionPane.showInputDialog(null,"Which event are you looking for ???"+
                                                                      "\n1 - Aquarium (AQ)"+
                                                                      "\n2 - Dangerous Creatures (DC)"+
                                                                      "\n3 - Water Park (WP)"));
               
                switch(choice){
                    case 1: 
                        aq.calcPrice();
                        
                        price[i]=aq.getPrice();
                        names[i]=aq.saveName();
                        age[i]=aq.saveAge();
                        setCatergory("Aquarium");
                        catergory[i]=getCatergory();                       
                        aq.compileCode();
                        cusID[i]=aq.getCustomerCode();
                        menuPrompt=true;
                    break;
                    case 2: 
                        dc.calcPrice();
                        names[i]=dc.saveName();
                        age[i]=dc.saveAge();
                        price[i]=dc.getPrice();
                        setCatergory("Dangerous Creatures");
                        catergory[i]=getCatergory();
                        cusID[i]=dc.getCustomerCode();
                        menuPrompt=true;
                    break;
                    case 3: 
                        wp.calcPrice();
                        names[i]=wp.saveName();
                        age[i]=wp.saveAge(); 
                        price[i]=wp.getPrice();
                        setCatergory("Water Park");
                        catergory[i]=getCatergory();
                        wp.compileCode();
                        cusID[i]=wp.getCustomerCode();
                        menuPrompt=true;
                    break;
                    default:
                        System.out.println("Invalid selection, Please pick an appropriate option.");
                    break;
                }
            }
            JOptionPane.showMessageDialog(null, "RECIEPT:\n\n"+"Transaction Code: "+cusID[i]+"\nName: "+names[i]+
                                          "\nAge: "+age[i]+"\nCatergory : "+catergory[i]+
                                          "\nDate of booking: "+getDate()+"\nPrice: R"+price[i]);
            totCost=totCost+price[i];
            
        }
        totReciept="FINAL RECIEPT: \n"+
                   "-------------------------------------------------------"+
                   "\nTotal People: "+customerAmt+
                   "\nDate of booking: "+getDate()+
                   "\nTotal Cost: R"+totCost+
                   "\n-------------------------------------------------------";
        return totReciept;
    }
}
