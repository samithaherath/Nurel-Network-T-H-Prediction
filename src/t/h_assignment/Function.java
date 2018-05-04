/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t.h_assignment;

/**
 *
 * @author samit
 */

import javax.swing.JButton;
import java.awt.Color;

public class Function {

    static int [][] ott = new int [3][3];
   
    // do with extreme caution
    public static void changeColor(JButton btn) {

        Color i = btn.getBackground();
        if (i.equals(Color.WHITE)) {
            btn.setBackground(Color.BLUE);
        } else {
            btn.setBackground(Color.white);
        }
    }

    public static void predict(int [][] a) {
     
        for (int i = 0; i < 3; i++) {
            int count1=0;
            int count2=0;
            for (int j = 0; j < 3; j++) {
              if(  a[i][j] ==Neuron.inputsH[i][j]) {
              count1++;  
              } if(a[i][j]== Neuron.inputT[i][j]  ) {
              count2++;  
              } 
            }
            if(count1== count2){
            ott [i][0] =0;
            }
            else if(count1< count2){
            ott [i][0] =Neuron.outputH[i][0];
            }
            else{
            ott [i][0] =Neuron.outputT[i][0];
            }

        }
   /*  for(int x=0;x<ott.length;x++){
         System.out.println(ott[x][0]);
       
    }*/
    
    }
public static String output(){
    String result=null;
    int count3=0;
     for(int x=0;x<ott.length;x++){
        if(ott[x][0] == 1){
        count3++;}
    }
    // System.out.println(count3);
     if(count3 >=2){
     result = "T";
     }
     else{
     result = "H";
     }
     count3=0;
    return result;
}
}
