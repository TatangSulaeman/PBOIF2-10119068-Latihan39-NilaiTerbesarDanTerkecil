/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.tatangsulaeman.nilaiterbesardanterkecil.tugas;

/**
 *
 * @author 
 * NAMA     : TATANG SULAEMAN
 * KELAS    : PBOIF2
 * NIM      : 10119068
 * Deskripsi program    : Menampilkan perhitungan Nilai Terbesar dan terkecil
 */
public class Main {
    public static void main(String[] args){
        Nilai dataNilai = new Nilai();
        
        System.out.println("----------Program Terbesar dan Terkecil Nilai Mahasiswa----------");
        dataNilai.inputNamaPetugas();
        dataNilai.inputBanyakNilai();
        dataNilai.inputNilai();
        System.out.println();
        System.out.println("----------Hasil Nilai Mahasiswa----------");
        dataNilai.outputNilai();
        System.out.println("");
        System.out.println("Nilai Terbesar adalah : " + dataNilai.nilaiTerbesarMhs());
        System.out.println("Nilai Terkecil adalah : " + dataNilai.nilaiTerkecilMhs());
        System.out.println("");
        System.out.println("Petugas : " + dataNilai.namaPetugas);
        System.out.println("DIBUAT OLEH TATANG SULAEMAN");
    }
    
}
