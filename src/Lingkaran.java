
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gin
 */
public class Lingkaran extends BangunDatar {
    private int jariJari;
    private static final int pi = 22/7;

    public Lingkaran(int jariJari) {
        this.jariJari = jariJari;
    }

    public Lingkaran() {
        Scanner nilai = new Scanner(System.in);
        System.out.print ("Masukan Nilai Jari-Jari  Lingkaran  : ");
        jariJari = nilai.nextInt();
        System.out.println("Luas Lingkaran Adalah              : " + luas());
    }

    public int getJariJari() {
        return jariJari;
    }

    public void setJariJari(int jariJari) {
        this.jariJari = jariJari;
    }
    
    
    @Override
    int luas() {
        return pi * jariJari * jariJari;
    }
    
}
