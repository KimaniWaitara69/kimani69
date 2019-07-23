/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplicationtable2;

/**
 *
 * @author apple
 */
public class MultiplicationTable2 {
    
    private int multiplicationNumber;
    private int range1;
    private int range2;


    public MultiplicationTable2 (int multiplicationNumber){
        
        this.multiplicationNumber = multiplicationNumber;
      

    }

    public void print(int Range1,int Range2){
       

  this.range1 =range1;
   this.range2=range2;


        
        int multiplicant=multiplicationNumber;
        System.out.println("This is the multiplication table of "+multiplicant+" ranging from "
                +range1+" to "+range2+".");
        for(int i=range1;i<=range2;i++){
            int answer = multiplicant*i;

            System.out.println(multiplicant+" multiplied by  "+i+" is equals to "+answer+" .");
        }
    }
    
}
