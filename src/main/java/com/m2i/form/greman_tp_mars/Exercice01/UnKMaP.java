/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.m2i.form.greman_tp_mars.Exercice01;

/**
 *
 * @author Formation
 */
public class UnKMaP {
    
    public static void run(int nbKM)
    {
        int indKM = 0;
        
        for (int i = 0; i < nbKM; i++) {
            System.out.println("kilomètre" + (i != 0 ? "s " : " ") + "à pied, ça use , ça use,"
            + "kilomètre" + (i != 0 ? "s " : " ") + "à pied, ça use les souliers");
        }
    }
    
}
