/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.tatangsulaeman.nilaiterbesardanterkecil.tugas;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : TATANG SULAEMAN
 * KELAS    : PBOIF2
 * NIM      : 10119068
 * Deskripsi program    : Menampilkan perhitungan Nilai Terbesar dan terkecil
 */
public class Nilai {
    Scanner keyboard = new Scanner(System.in);
    int[]nilai = new int [10];
    int n;
    int nilaiTerbesar = 0;
    int nilaiTerkecil = 0;
    String namaPetugas;
    
    public void inputNamaPetugas(){
        System.out.print("Masukan Nama petugas : ");
        namaPetugas = keyboard.nextLine();
    }
    
    public int inputBanyakNilai(){
        System.out.print("masukan Banyaknya Nilai Mahasiswa : ");
        return n = keyboard.nextInt();
    }
    
    public void inputNilai(){
        for (int i = 1; i<= n; i++){
            System.out.print("Nilai Mahasiswa ke-" + i + " = ");
            nilai[i] = keyboard.nextInt();
        }
    }
    
    public void outputNilai(){
        for ( int i = 1; i <= n; i++){
            System.out.println("Nilai Mahasiswa ke-" + i + " = " + nilai[i]);
        }
    }
    
    public int nilaiTerbesarMhs(){
        nilaiTerbesar = nilai [1];
        for(int i = 1; i <= n; i++){
            if (nilai[i] > nilaiTerbesar ){
                nilaiTerbesar = nilai[i];
            }
        }
        return nilaiTerbesar;
    }
    
    public int nilaiTerkecilMhs(){
        nilaiTerkecil = nilai[1];
        for (int i = 1; i <= n; i++){
            if (nilai[i] < nilaiTerkecil){
                nilaiTerkecil = nilai[i];
            }
        }
        return nilaiTerkecil;
    }
        
        
}
