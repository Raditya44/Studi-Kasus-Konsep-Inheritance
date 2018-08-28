/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramTokoBuku;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Barang extends DataPembeli{

    private static int fb() {
                    int bolpoin, total, harga = 2000;
                    Scanner input = new Scanner(System.in); 
                    
                    System.out.println("Merk yang dipilih adalah Faber Castell ");
        System.out.print("Masukkan Jumlah yang Ingin Dibeli    : "); 
            bolpoin = input.nextInt();
            total = bolpoin * harga;
            System.out.println("Jumlah yang Harus Dibayar adalah     : Rp "+total); 
        return 0;
    }

    private static int s() {
        int bolpoin, total, harga = 1500;
                    Scanner input = new Scanner(System.in); 
                    System.out.println("Merk yang dipilih adalah Standart ");
        System.out.print("Masukkan Jumlah yang Ingin Dibeli    : "); 
            bolpoin = input.nextInt();
            total = bolpoin * harga;
            System.out.println("Jumlah yang Harus Dibayar adalah     : Rp "+total); 
        return 0;
    }

    private static int z() {
        int bolpoin, total, harga = 1200;
                    Scanner input = new Scanner(System.in); 
                    System.out.println("Merk yang dipilih adalah Zebra ");
        System.out.print("Masukkan Jumlah yang Ingin Dibeli    : "); 
            bolpoin = input.nextInt();
            total = bolpoin * harga;
            System.out.println("Jumlah yang Harus Dibayar adalah     : Rp "+total); 
        return 0;
    }
    protected int id_barang, harga_barang;
    protected String nama_barang, merk_barang;
    public int pensil, buku;

    public int getId_barang() {
        return id_barang;
    }
    public void setId_barang(int id_barang) {
        this.id_barang = id_barang;
    }

    public int getHarga_barang() {
        return harga_barang;
    }

    public void setHarga_barang(int harga_barang) {
        this.harga_barang = harga_barang;
    }

    public String getNama_barang() {
        return nama_barang;
    }

    public void setNama_barang(String nama_barang) {
        this.nama_barang = nama_barang;
    }

    public String getMerk_barang() {
        return merk_barang;
    }

    public void setMerk_barang(String merk_barang) {
        this.merk_barang = merk_barang;
    }
    public void tampilkan()
    {   
        Scanner inputkan = new Scanner(System.in);
        int Pilih=7;       
        do
        {
            System.out.println("========================================================");
            System.out.println("Tentukan Barang yang Ingin Dibeli (Hanya Bisa Memilih 1)");
            System.out.println("1. Bolpoin");
            System.out.println("2. Pensil");
            System.out.println("3. Penghapus");
            System.out.println("4. Buku");
            System.out.println("5. Rautan");
            System.out.println("6. Semua");
            System.out.println("7. Tidak Jadi");
            System.out.print("Tentukan Pilihan Anda : "); 
            Pilih = inputkan.nextInt();
            System.out.println("========================================================");
            switch(Pilih)
            {
                case 1 : bolpoin();break;
                case 2 : pensil();break;
                case 3 : penghapus();break;
                case 4 : buku();break;
                case 5 : rautan();break;
                case 6 : semua();break;
            }             
        }while(Pilih!=7);
        
    }
    public static void bolpoin()
        {
            int harga = 1500, total;
            int merk = 3;
            Scanner input = new Scanner(System.in);  
            System.out.println("Anda Memilih Bolpoin");
            System.out.println("Daftar Merk ");
            System.out.println("1. Faber Castell ");
            System.out.println("2. Standart ");
            System.out.println("3. Zebra ");
            System.out.print("Masukkan Nama Merk yang Ingin Dibeli : ");
            merk = input.nextInt();
            switch(merk)
            {
                case 1 : fb();break;
                case 2 : s();break;
                case 3 : z();break;
            }                    
        }

    private void pensil() {
        int harga = 1000, total;
            int pensil;
            Scanner input = new Scanner(System.in);         
            System.out.print("Masukkan Jumlah yang Ingin Dibeli : "); 
            pensil = input.nextInt();
            total = pensil * harga;
            System.out.println("Jumlah yang Harus Dibayar adalah  : Rp "+total); 
    }

    private void buku() {
        int harga = 2500, total;
            int buku;
            Scanner input = new Scanner(System.in);         
            System.out.print("Masukkan Jumlah yang Ingin Dibeli : "); 
            buku = input.nextInt();
            total = buku * harga;
            System.out.println("Jumlah yang Harus Dibayar adalah  : Rp "+total); 
    }

    private void penghapus() {
        int harga = 500, total;
            int penghapus;
            Scanner input = new Scanner(System.in);         
            System.out.print("Masukkan Jumlah yang Ingin Dibeli : "); 
            penghapus = input.nextInt();
            total = penghapus * harga;
            System.out.println("Jumlah yang Harus Dibayar adalah  : Rp "+total); 
    }

    private void rautan() {
        int harga = 750, total;
            int rautan;
            Scanner input = new Scanner(System.in);         
            System.out.print("Masukkan Jumlah yang Ingin Dibeli : "); 
            rautan = input.nextInt();
            total = rautan * harga;
            System.out.println("Jumlah yang Harus Dibayar adalah  : Rp "+total); 
    }

    private void semua() {
        int hargaB = 1500,hargaP = 1000,hargaBu = 2500,hargaPe = 500,hargaR = 750, total;
            int bolpoin, rautan, penghapus, pensil, buku;
            Scanner input = new Scanner(System.in);         
            System.out.print("Masukkan Jumlah Bolpoin yang Ingin Dibeli    : "); 
            bolpoin = input.nextInt();
            System.out.print("Masukkan Jumlah Pensil yang Ingin Dibeli     : "); 
            pensil = input.nextInt();
            System.out.print("Masukkan Jumlah Penghapus yang Ingin Dibeli  : "); 
            penghapus = input.nextInt();
            System.out.print("Masukkan Jumlah Buku yang Ingin Dibeli       : "); 
            buku = input.nextInt();
            System.out.print("Masukkan Jumlah Rautan yang Ingin Dibeli     : "); 
            rautan = input.nextInt();
            total = (bolpoin * hargaB)+(rautan * hargaR)+(penghapus * hargaPe)+(buku * hargaBu)+(pensil * hargaB);
            System.out.println("Jumlah yang Harus Dibayar adalah  : Rp "+total); 
    }
}
