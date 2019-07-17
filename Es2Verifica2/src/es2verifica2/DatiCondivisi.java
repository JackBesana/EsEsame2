/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es2verifica2;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author besan
 */
public class DatiCondivisi {

    boolean inseritoPari = false;
    boolean inseritoDispari = false;
    int contaPari = 0;
    int contaDispari = 0;
    int contaZeri = 0;
    private Semaphore sem1; //contapari
    private Semaphore sem2;//contadispari
    private Semaphore sem3;//visualizza
    private Semaphore sem4;//genera
    private int buffer;

    public DatiCondivisi() {
        sem1 = new Semaphore(0);
        sem2 = new Semaphore(0);
        sem3 = new Semaphore(0);
        sem4 = new Semaphore(1);
    }

    public int getBuffer() {
        return buffer;
    }

    public void setBuffer(int buffer) {
        this.buffer = buffer;
    }

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
        System.out.println("Il numero estratto è: "+buffer);
        System.out.println("Ci sono " + contaPari + " numeri pari");
        System.out.println("Ci sono " + contaDispari + " numeri dispari");

        if (inseritoPari == true) {
            System.out.println("L'ultimo numero inserito è pari");
        } else {
            System.out.println("L'ultimo numero inserito è dispari");
        }
    }

    public void contaZero() {
        contaZeri++;
    }

    public void visualizzaZeri() {
        System.out.println("Sono stati estratti " + contaZeri + " zeri");
    }

    public void daiPermesso1() {
        sem1.release();
    }

    public void chiediPermesso1() {
        try {
            sem1.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(DatiCondivisi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void daiPermesso2() {
        sem2.release();
    }

    public void chiediPermesso2() {
        try {
            sem2.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(DatiCondivisi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void daiPermesso3() {
        sem3.release();
    }

    public void chiediPermesso3() {
        try {
            sem3.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(DatiCondivisi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void daiPermesso4() {
        sem4.release();
    }

    public void chiediPermesso4() {
        try {
            sem4.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(DatiCondivisi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
