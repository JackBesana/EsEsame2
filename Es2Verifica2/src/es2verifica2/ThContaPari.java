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
public class ThContaPari extends Thread {

    DatiCondivisi datiC = new DatiCondivisi();
    int buffer;
    int numero;

    public ThContaPari(int n, DatiCondivisi ptrDati) {
        datiC = ptrDati;
        numero = n;
        buffer=0;
    }

    @Override
    public void run() {
        for (int i = 0; i < numero; i++) {
            datiC.chiediPermesso1();
            buffer=datiC.v.get(datiC.v.size()-1);
            if ((buffer % 2) == 0) {
                if ((buffer / 2) == 0) {
                    datiC.contaZero();
                } else {
                    datiC.InseritoPari();
                }
            }
            datiC.daiPermesso2();
        }
    }
}
