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

    public ThContaPari(DatiCondivisi ptrDati) {
        datiC = ptrDati;
    }

    @Override
    public void run() {
        for (int i = 0; i < datiC.array.size(); i++) {
            if ((datiC.array.get(i) % 2) == 0) {
                if ((datiC.array.get(i) / 2) == 0) {
                    datiC.contaZero();
                }
                datiC.lettoPari();
            }
        }
    }
}
