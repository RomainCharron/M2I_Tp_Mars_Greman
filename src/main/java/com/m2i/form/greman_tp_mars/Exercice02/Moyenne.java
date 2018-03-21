/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.m2i.form.greman_tp_mars.Exercice02;

import com.m2i.form.greman_tp_mars.ExitException;
import com.m2i.form.greman_tp_mars.KeyScan;
import java.awt.RenderingHints;
import java.util.ArrayList;

/**
 *
 * @author Formation
 */
public class Moyenne {

    public static void run() {
        
        
        //ArrayList<Float> listFloat = new ArrayList<Float>();
        int nbNB;
        float sommeNb = 0,fkey;
        
        try {
            nbNB = KeyScan.intRead("Nombre de valeur");
            
            for (int i = 0; i < nbNB; i++) {
                fkey = KeyScan.floatRead("Veiller saisir le nombre real(" + (i + 1) + ") ");
                //listFloat.add(fkey);
                sommeNb += fkey;
            }
            
            System.out.println();
            System.out.println("La somme est de " + sommeNb );
            System.out.println("La moyene est de " + (sommeNb / nbNB));
            System.out.println();
            
            
        } catch (ExitException e) {
            System.out.println("Interuption du programe des Moyenne par l'utilisateur");
        } catch (Exception e) {
            System.out.println();
            System.out.println();
            System.err.println("Erreur inconue");
            System.err.println(e.getMessage());
            e.printStackTrace();
            
        }
        
        
        
        
    }
    
    
}
