
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
public class Segitiga extends BangunDatar {
    private int alas,tinggi;

    public Segitiga() {
        Scanner nilai = new Scanner(System.in);
        System.out.print ("Masukan Nilai Alas Segitiga         : ");
        alas = nilai.nextInt();
        System.out.print ("Masukan Nilai Tinggi Segitiga       : ");
        tinggi = nilai.nextInt(); 
        System.out.println("Luas Segitiga Adalah               : " + luas());
    }

    public Segitiga(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public int getAlas() {
        return alas;
    }

    public void setAlas(int alas) {
        this.alas = alas;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
    
    @Override
    int luas() {
        return  alas / 2 * tinggi;
    }
    
}
