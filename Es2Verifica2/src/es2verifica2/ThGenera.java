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
public class ThGenera {

    
    DatiCondivisi datiC = new DatiCondivisi();
    
    public ThGenera(int n, DatiCondivisi ptrDati) {
        datiC = ptrDati;
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            datiC.array.add(rand.nextInt(37));
            if ((datiC.array.get(i) % 2) == 0) {
                datiC.InseritoPari();
            } else{
                datiC.InseritoDispari();
            }
        }
    }
}
