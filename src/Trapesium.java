/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gin
 */
import java.util.Scanner;
public class Trapesium extends BangunDatar {
    private int alasBawah,alasAtas,tinggi;

    public Trapesium() {
        Scanner nilai = new Scanner(System.in);
        System.out.print ("Masukan Nilai Alas Bawah Trapesium  : ");
        alasBawah = nilai.nextInt();
        System.out.print ("Masukan Nilai Alas Atas Trapesium   : ");
        alasAtas = nilai.nextInt();
        System.out.print ("Masukan Nilai Tinggi Trapesium      : ");
        tinggi = nilai.nextInt(); 
        System.out.println("Luas Trapesium Adalah              : " + luas());
    }

    public Trapesium(int alasBawah, int alasAtas, int tinggi) {
        this.alasBawah = alasBawah;
        this.alasAtas = alasAtas;
        this.tinggi = tinggi;
    }

    public int getAlasBawah() {
        return alasBawah;
    }

    public void setAlasBawah(int alasBawah) {
        this.alasBawah = alasBawah;
    }

    public int getAlasAtas() {
        return alasAtas;
    }

    public void setAlasAtas(int alasAtas) {
        this.alasAtas = alasAtas;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
    
    
    @Override
    int luas() {
        
        return    (alasBawah + alasAtas) / 2  * tinggi ;
    }
    
}
