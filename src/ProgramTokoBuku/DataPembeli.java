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
public class DataPembeli {
    protected String nama_pembeli, alamat;
    protected int id_pembeli;
    protected long no_telp;

    public int getId_pembeli() {
        return id_pembeli;
    }

    public void setId_pembeli(int id_pembeli) {
        this.id_pembeli = id_pembeli;
    }

    public void tampilkan()
    {       
        Scanner input = new Scanner(System.in);
        String nama_pembeli, alamat;
        int id_pembeli;
        long no_telp;
        setId_pembeli(27);
        System.out.println("Id Pembeli    : "+getId_pembeli());       
        System.out.print("Nama Pembeli  : ");
        nama_pembeli = input.next();
        System.out.print("Alamat        : ");
        alamat = input.next();
        System.out.print("No Telepon    : ");
        no_telp = input.nextLong();
    }
}
