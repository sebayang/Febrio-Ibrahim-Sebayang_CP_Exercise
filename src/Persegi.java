
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
public class Persegi extends BangunDatar {
    private int sisi;

    public Persegi() {
        Scanner nilai = new Scanner(System.in);
        System.out.print ("Masukan Nilai Sisi Persegi          : ");
        sisi = nilai.nextInt();
        System.out.println("Luas Persegi Adalah                : " + luas());
    }

    public Persegi(int sisi) {
        this.sisi = sisi;
    }

    public int getSisi() {
        return sisi;
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }
    
    
    @Override
    int luas() {
        return sisi * sisi;
    }
    
}
