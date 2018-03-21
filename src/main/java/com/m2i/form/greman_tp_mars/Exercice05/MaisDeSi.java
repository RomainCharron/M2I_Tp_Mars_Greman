/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.m2i.form.greman_tp_mars.Exercice05;

import com.m2i.form.greman_tp_mars.KeyScan;

/**
 *
 * @author Formation
 */
public class MaisDeSi {

    public static void run() {
        int age = 0, taille;
        
        try {
            do {         
                age = KeyScan.intRead("Saisier Age");

                taille = KeyScan.intRead("Saisier Taille en cm");

                if(age > 20 && taille < 100 )
                    System.out.println("Vous êtes peut être un\n" 
                            + "nain adulte?");
                if(age > 20 && taille > 200 )
                    System.out.println("Vous êtes un géant adulte ");
                if(age < 3 && taille < 50 )
                    System.out.println("Vous êtes peut être un bébé ");
                if ((age >= 15 || 18 <= age) && (taille >= 150 || 180 <= taille) )
                    System.out.println("Vous êtes un ado !");
            } while (age != 0);
            
        } catch (Exception e) {
            System.out.println("");
            System.err.println("Erraur inconue");
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
          
    }
    
}
