/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es2verifica2;

import java.util.ArrayList;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author besan
 */
public class DatiCondivisi {
    ArrayList <Integer>v=new ArrayList <Integer>();
    int trovatoPari=0;
    int trovatoDispari=0;
    int lettoPari = 0;
    int lettoDispari = 0;
    int contaPari = 0;
    int contaDispari = 0;
    int contaZeri = 0;
    private Semaphore sem1; //contapari
    private Semaphore sem2;//contadispari
    private Semaphore sem3;//visualizza
    private Semaphore sem4;//genera

    public DatiCondivisi() {
        sem1 = new Semaphore(0);
        sem2 = new Semaphore(0);
        sem3 = new Semaphore(0);
        sem4 = new Semaphore(1);
    }

    public synchronized void InseritoPari() {
        contaPari++;
    }

    public synchronized void InseritoDispari() {
        contaDispari++;
    }

    public synchronized void visualizza() {
        System.out.println("Il numero estratto è: " + v.get(v.size()-1));
        System.out.println("Ci sono " + contaPari + " numeri pari");
        System.out.println("Ci sono " + contaDispari + " numeri dispari");
    }

    public synchronized void trovaPari() {
        trovatoPari++;
    }

    public synchronized void trovaDispari() {
        trovatoDispari++;
    }

    public synchronized void contaZero() {
        contaZeri++;
    }

    public synchronized void visualizzaZeri() {
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
