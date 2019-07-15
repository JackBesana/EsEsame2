/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es2verifica2;

import java.util.ArrayList;

/**
 *
 * @author besan
 */
public class DatiCondivisi {

    ArrayList<Integer> array = new ArrayList<>();
    boolean inseritoPari = false;
    boolean inseritoDispari = false;
    int contaPari = 0;
    int contaDispari = 0;

    public void InseritoPari() {
        inseritoPari = true;
        inseritoDispari = false;
    }

    public void InseritoDispari() {
        inseritoDispari = true;
        inseritoPari = false;
    }

    public void lettoPari() {
        contaPari++;
    }

    public void lettoDispari() {
        contaDispari++;
    }

    public void visualizza() {
        System.out.println("Ci sono " + contaPari + " numeri pari");
        System.out.println("Ci sono " + contaDispari + " numeri dispari");
        
        if(inseritoPari==true){
            System.out.println("L'ultimo numero inserito è pari");
        } else{
            System.out.println("L'ultimo numero inserito è dispari");
        }
        
        System.out.println("I numeri contenuti sono: ");
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }
    }
}
