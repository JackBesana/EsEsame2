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
public class ThContaDispari extends Thread {

    DatiCondivisi datiC = new DatiCondivisi();
    int buffer;
    int numero;

    public ThContaDispari(int n, DatiCondivisi ptrDati) {
        datiC = ptrDati;
        buffer = 0;
        numero = n;
    }

    @Override
    public void run() {
        for (int i = 0; i < numero; i++) {
            datiC.chiediPermesso2();
            buffer=datiC.v.get(datiC.v.size()-1);
            if ((buffer % 2) != 0) {
                datiC.InseritoDispari();
            }
            datiC.daiPermesso3();
        }
    }
}
