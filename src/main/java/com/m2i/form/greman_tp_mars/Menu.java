/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.m2i.form.greman_tp_mars;

import com.m2i.form.greman_tp_mars.Exercice02.Moyenne;
import com.m2i.form.greman_tp_mars.Exercice03.Sapins;
import com.m2i.form.greman_tp_mars.Exercice04.DevinerNombre;
import com.m2i.form.greman_tp_mars.Exercice05.*;
import com.m2i.form.greman_tp_mars.Exercice01.UnKMaP;
import java.util.Scanner;

/**
 *
 * @author Formation
 */
public class Menu {
    
    public static void main() {
        
        boolean isDoContinu = true;
        
        
        Scanner sc = new Scanner(System.in);
        
        String scRead = "";
        
        do {
            Menu.bannierre("Main menu");
            
            
            System.out.println(" Choisissez l'option");
            System.out.println(" ---------------------------------");
            System.out.println(" 1. Les kilométres à pied");
            System.out.println(" 2. Program Moyenne");
            System.out.println(" 3. Generation de Sapins");
            System.out.println(" 4. Deviner un nombre");
            System.out.println(" 5. Mais des Si");
            System.out.println(" q. Quitter ");
            System.out.print("\n Menu:");
            scRead = sc.next();
            System.out.println();

//            int test = scRead.compareTo("q");
            try {
                if(scRead.equalsIgnoreCase("q"))
                //if(scRead.compareTo("q") == 0 || scRead.compareTo("Q") == 0 )
                {
                    System.out.println("Exit Programme");
                    isDoContinu = false;
                    continue;
                }
                
                int select = Integer.parseInt(scRead);

                switch(select)
                {
                    case 1:
                        // Les kilométres à pied
                        UnKMaP.run(15);
                        break;
                    case 2:
                        // Moyenne
                        Moyenne.run();
                        break;
                    case 3:
                        // Menu Sapins
                        Sapins.menu();
                        break;
                    case 4:
                        // Deviner un nombre
                        DevinerNombre.run();
                        break;
                    case 5:
                        // Mais des Si
                        MaisDeSi.run();
                        break;
                    default:
                        throw new MenuExeption(1);
                        //break;
                        //

                }

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
            
        } while (isDoContinu);
    }
    
    private static void bannierre(String msg)
    {
        String caract ="";
        for(int i=0;i<msg.length();i++)
        {
            caract += "═";
        }
        System.out.printf("\t╔═%s═╗\n",caract);
        
        
            System.out.printf("\t║ %s ║\n",msg);
            System.out.printf("\t╚═%s═╝\n",caract);
    }
}
