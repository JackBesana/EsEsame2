/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es2verifica2;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author besan
 */
public class Es2Verifica2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            Scanner input = new Scanner(System.in);

            DatiCondivisi datiC = new DatiCondivisi();

            System.out.println("Digitate quanti numeri inserire");
            int n = input.nextInt();

            ThGenera th1 = new ThGenera(n, datiC);
            ThContaPari th2 = new ThContaPari(n,datiC);
            ThContaDispari th3 = new ThContaDispari(n,datiC);
            ThVisualizza th4 = new ThVisualizza(n,datiC);

            th1.start();
            th2.start();
            th3.start();
            th4.start();

            th1.join();
            th2.join();
            th3.join();
            th4.join();

            datiC.visualizzaZeri();
        } catch (InterruptedException ex) {
            Logger.getLogger(Es2Verifica2.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
