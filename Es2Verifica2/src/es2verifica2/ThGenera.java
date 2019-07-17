/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es2verifica2;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author besan
 */
public class ThGenera extends Thread {

    DatiCondivisi datiC = new DatiCondivisi();
    int buffer;
    int numero;

    public ThGenera(int n, DatiCondivisi ptrDati) {

        buffer = datiC.getBuffer();
        datiC = ptrDati;
        numero = n;
    }

    @Override
    public void run() {
        Random rand = new Random();
        for (int i = 0; i < numero; i++) {
            datiC.chiediPermesso4();
            buffer = (rand.nextInt(37));
            if ((buffer % 2) == 0) {
                datiC.InseritoPari();
            } else {
                datiC.InseritoDispari();
            }
            datiC.setBuffer(buffer);
            datiC.daiPermesso1();
        }
    }
}
