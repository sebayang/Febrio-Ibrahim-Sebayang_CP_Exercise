
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
public class PersegiPanjang extends BangunDatar {
    private int panjang,lebar;

    public PersegiPanjang() {
        Scanner nilai = new Scanner(System.in);
        System.out.print ("Masukan Nilai Panjang Persegi       : ");
        panjang = nilai.nextInt();
        System.out.print ("Masukan Nilai Alas Persegi          : ");
        lebar = nilai.nextInt();
        System.out.println("Luas Persegi Panjang Adalah        : " + luas());
    }

    public PersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public int getPanjang() {
        return panjang;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }
    
    
    @Override
    int luas() {
        return panjang * lebar;
    }
    
}
