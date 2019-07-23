/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es2verifica2;

/**
 *
 * @author besan
 */
public class ThConfronta extends Thread {

    DatiCondivisi datiC = new DatiCondivisi();
    int buffer;
    int numero;

    public ThConfronta(int n, DatiCondivisi ptrDati) {
        datiC = ptrDati;
        buffer = 0;
        numero = n;
    }

    @Override
    public void run() {
        for (int i = 0; i < datiC.v.size(); i++) {
            buffer=datiC.v.get(i);
            if (buffer != 0) {
                if ((buffer % 2) == 0) {
                    datiC.trovaPari();
                } else {
                    datiC.trovaDispari();
                }
            }
        }

        System.out.println("Sono stati trovati " + datiC.trovatoPari + " numeri pari");
        System.out.println("Sono stati trovati " + datiC.trovatoDispari + " numeri dispari");
    }
}
