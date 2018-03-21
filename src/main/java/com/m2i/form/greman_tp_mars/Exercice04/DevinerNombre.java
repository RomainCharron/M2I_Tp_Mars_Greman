/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.m2i.form.greman_tp_mars.Exercice04;

import com.m2i.form.greman_tp_mars.ExitException;
import com.m2i.form.greman_tp_mars.KeyScan;
import com.m2i.form.greman_tp_mars.Menu;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Formation
 */
public class DevinerNombre {

    static int  minScore = 0;
    
    public static void menu(int chois)
    {
        
        boolean isDoContinu = true;
        int tmpScore = 0;
        
        //if(chois != 0) isDoContinu = false;
        
        Scanner sc = new Scanner(System.in);
        
        String scRead = "";
        
        minScore = run();
        
        while (isDoContinu) {
            
            
            System.out.println(" ---------------------------------");
            System.out.println("  Meilleur score " + minScore);
            System.out.println(" ---------------------------------");
            System.out.print(" Vouler vous fair une autre partie (y/n)?");
            
            scRead = sc.next();
            System.out.println();
            try {
                if(scRead.equalsIgnoreCase("n"))
                //if(scRead.compareTo("q") == 0 || scRead.compareTo("Q") == 0 )
                {
                    System.out.println("Exit Programme");
                    isDoContinu = false;
                    continue;
                }
            }
            catch (Exception e)
            {
                System.out.println("");
                System.err.println(e.getMessage());
                e.printStackTrace();
                
            }
            
        tmpScore = run();
        minScore = (tmpScore < minScore ? tmpScore  : minScore);
        }
    }
    
    public static int run() {
        
        Random unRandom = new Random();
        
        
        int nbRandom = unRandom.nextInt(100), intKey = 0, score = 0;
        System.out.println("Debug nbRandom: " + nbRandom);
        
         
        System.out.println("Hahaha !!! \n Trouve le nombre !");
        System.out.println("Entre 1 et 100");
        System.out.println();
        try 
        {
            do 
            {
                intKey = KeyScan.intRead("?");
                score++;
                if (intKey != nbRandom) {
                    System.out.println("C'est " + (intKey < nbRandom ? "superieur" : "Inferieur"));
                }
            } while (intKey != nbRandom);
            System.out.println("Bravo tu à trouver");
            System.out.println("Score : " + score);
            
            
            
        } catch (ExitException e) {
        }
        catch(Exception e){
            System.out.println("");
            System.err.println("Erraur inconue");
            System.err.println(e.getMessage());
            e.printStackTrace();
                    
        }
        return score;
    }
    
}
