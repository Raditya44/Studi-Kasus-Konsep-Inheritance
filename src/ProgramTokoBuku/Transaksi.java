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
public class Transaksi extends Barang{
    public static void main(String[] args) {      
       DataPembeli uji = new DataPembeli();
       System.out.println("Data Pembeli");
       uji.tampilkan();
        
       Barang tes = new Barang();
       System.out.println("========================================================");
       System.out.println("Nama Kasir        : Arifin ");
       System.out.println("Tanggal Transaksi : 28/8/2018 -- 15.00 PM");
       tes.tampilkan();
    }
}
