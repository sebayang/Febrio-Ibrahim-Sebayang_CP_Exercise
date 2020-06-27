
import java.util.InputMismatchException;
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
public class Tampil {
     public static void main(String args[]){ 
          Scanner input = new Scanner(System.in);
          try{
              boolean exit = false;
              while(exit == false){
                    System.out.println("========== MENU ==========");
                    System.out.println("1. Luas Trapesium");
                    System.out.println("2. Luas Persegi");
                    System.out.println("3. Luas Persegi Panjang");
                    System.out.println("4. Luas Segitiga");
                    System.out.println("5. Luas Lingkaran");
                    System.out.println("6. Keluar");
                    System.out.println("==========================");
                    System.out.print("Pilih     : ");
                    int menu = input.nextInt();
                    if(menu == 1){
                        Trapesium trapesium = new Trapesium();
                    }else if (menu == 2){
                        Persegi persegi = new Persegi();
                    }else if (menu == 3){
                        PersegiPanjang persegiPanjang = new PersegiPanjang();
                    }else if (menu == 4){
                        Segitiga segitiga = new Segitiga();
                    }else if (menu == 5){
                        Lingkaran lingaran = new Lingkaran();
                    }else if (menu == 6){
                        exit = true;
                    }else{
                        System.out.println("==========================");
                        System.out.println("Masukan Angka Sesuai Menu");
                    }
              }
              
          }catch(InputMismatchException e){
              System.out.println("==========================");
              System.out.println("Harap Masukan Angga" );
              System.out.println("code error : "+e);
          }finally{
              System.out.println("==========================");
              System.out.println("Program Ditutup");
          }
          
     }
}
