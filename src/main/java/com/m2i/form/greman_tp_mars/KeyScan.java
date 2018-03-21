/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.m2i.form.greman_tp_mars;

import java.util.Scanner;

/**
 *
 * @author Formation
 */
public class KeyScan {
    
    /***
     * Demande de faire une saisie aux clavier pour l'obtenier en valeur de retour
     * @return Retourne une chaine de caractére saisie aux clavier
     * @throws ExitException Exeption ou l'utilisateur saisie exit pour quitter la saisie
     */
    public static String String() throws ExitException
    {
        Scanner sc = new Scanner(System.in);
        
        String scRead = sc.next();
        
        if("exit".equals(scRead))
        {
            throw new ExitException();
        }
        
        return scRead;
    }
    /***
     * Apelle la fonction String() et retourne un entier
     * @return Retourne un entier primitif
     * @throws ExitException Exeption ou l'utilisateur saisie exit pour quitter la saisie
     * @throws NumberFormatException Erreur si la saisie n'est pas un nombre 
     */
    public static int Int() throws ExitException
    {
        return Integer.parseInt(String());
        
    }
    
     public static float Float() throws ExitException
    {
        return Float.parseFloat(String());
        
    }
    
    public static int IntRead(String msg) throws ExitException
    {
        boolean ifError;
        int champI = -5;
        
        do {
                ifError = false;
                try {
                    System.out.print(msg + " :");
                    champI = Int();
//                    if(champI < AGEMIN )
//                    {
//                        throw  new Exception("l'age ne dois pas étre inférieur à 12 ans");
//                    }
                }
                catch (NumberFormatException e) {
                    System.out.println("Veiller saisir un nombre !");
                    ifError = true;
                }
                finally
                {
                    
                }
            } while (ifError);
        return champI;
    }
}
