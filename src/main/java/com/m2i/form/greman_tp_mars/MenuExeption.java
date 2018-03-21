/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.m2i.form.greman_tp_mars;



/**
 *
 * @author Formation
 */
public class MenuExeption extends Exception{

    int value; 
    
    public MenuExeption() {
        this(0);
    }
    public MenuExeption(int val) {
        super();
        value = val;
    }

    public int getValue() {
        return value;
    }
    
}
