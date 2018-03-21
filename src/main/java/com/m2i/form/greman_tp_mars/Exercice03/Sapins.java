/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.m2i.form.greman_tp_mars.Exercice03;

import com.m2i.form.greman_tp_mars.KeyScan;
import com.m2i.form.greman_tp_mars.Menu;
import com.m2i.form.greman_tp_mars.MenuExeption;
import java.util.Scanner;

/**
 *
 * @author Formation
 */
public class Sapins {
    public static void menu() {
        
        
        Scanner sc = new Scanner(System.in);
        
        String scRead = "";
        
        //Menu.bannierre("Main menu");
            
            
            System.out.println(" Choisissez le Sapins à afficher");
            System.out.println(" ---------------------------------");
            System.out.println(" 1. Un sapin plein");
            System.out.println(" 2. Un sapin vide");
            System.out.println(" 3. Un sapin couché");
            
            System.out.println(" q. Anuller ");
            System.out.print("\n Menu:");
            scRead = sc.next();
            System.out.println();

//            int test = scRead.compareTo("q");
            try {
                if(scRead.equalsIgnoreCase("q"))
                //if(scRead.compareTo("q") == 0 || scRead.compareTo("Q") == 0 )
                {
                    System.out.println("Fin du program des Sapins");
                }
                else
                {
                    
                }
                
                int select = Integer.parseInt(scRead);
                
                int selectSize = KeyScan.intRead("Veiller saisier la taille du sapins");
                        

                switch(select)
                {
                    case 1:
                        // Un sapin plein
                        genSapinPlein(selectSize);
                        break;
                    case 2:
                        // Un sapin vide
                        genSapinVide(selectSize);
                        break;
                    case 3:
                        // Un sapin couché
                        genSapinCouche(selectSize);
                        break;
                    default:
                        throw new MenuExeption(1);
                        //break;
                        //

                }
                System.out.println();

            } catch (UnsupportedOperationException e) {
                System.out.println("Erreur Fonction incompléte");
            } catch (MenuExeption e) {
                System.err.println("Chois invalide \n" + scRead);
                System.out.println();
            } catch (NumberFormatException e) {
                System.err.println("Erreur de saisie \n" + scRead);
                System.out.println();
            } catch (Exception e) {
                System.err.println("Erreur inconue");
                e.printStackTrace();
                System.out.println(e.getMessage());
                System.out.println();
                System.out.println();
            }
    }
    private static void genSapinPlein(int size)
    {
        boolean siImpaire = size%2 == 1;
        int margeSapin = siImpaire ? (size-1)/2 : size/2; 
        
        System.out.println(margeSapin + " pour " + size);
        
        for (int i = 0; i <= size; i++) {
            
            for (int r = 0; r < size - i &&  i != 0; r++) {
                System.out.print(" ");
            }
            for (int r = 0; r < i - 1; r++) {
                System.out.print("*");
            }
            if(i != 0) System.out.print("#");
            for (int r = 0; r < i - 1; r++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    private static void genSapinVide(int size)
    {
        boolean siImpaire = size%2 == 1;
        int margeSapin = siImpaire ? (size-1)/2 : size/2; 
        
        System.out.println(margeSapin + " pour " + size);
        
        for (int i = 0; i <= size; i++) {
            
            for (int r = 0; r < size - i &&  i != 0; r++) {
                System.out.print(" ");
            }
            for (int r = 0; r < i - 1; r++) {
                System.out.print((r == 0 || i == size ? "*" : " "));
                
            }
            if(i != 0) System.out.print((i == 1 || i == size ? "#" : " "));
            for (int r = 0; r < i - 1; r++) {
                System.out.print((r == (i - 2) || i == size ? "*" : " "));
            }
            System.out.println();
        }
    }
    private static void genSapinCouche(int size)
    {
        boolean siImpaire = size%2 == 1;
        int margeSapin = siImpaire ? (size-1)/2 : size/2; 
        
        System.out.println(margeSapin + " pour " + size);
        
//        for (int i = 0; i <= size; i++) {
//            
//            for (int r = 0; r < size - i &&  i != 0; r++) {
//                System.out.print(" ");
//            }
//            for (int r = 0; r < i - 1; r++) {
//                System.out.print("*");
//            }
//            if(i != 0) System.out.print("#");
//            for (int r = 0; r < i - 1; r++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        for (int i = 0; i < size; i++) {
            for (int r = 0; r < i; r++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
        for (int i = size - 1; i >= 0; i--) {
            for (int r = 0; r <= i; r++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
