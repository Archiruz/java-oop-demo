/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projectpbo;

/**
 *
 * @author USER
 */
public class Matarmaja implements Kereta{
    private String nama;
    private int harga, jumlah;

    public Matarmaja(){
        this.setNama();
        this.setHarga();
    }
    
    public String getNama(){
        return this.nama;
    }
    
    @Override
    public void setNama(){
        this.nama = "MATARMAJA";
    }
    
    public int getHarga(){
        return this.harga;
    }
    
    @Override
    public void setHarga(){
        this.harga = 170000;
    }
    
    public int getJumlah(){
        return this.jumlah;
    }
    
    @Override
    public void setJumlah(int newJumlah){
        this.jumlah = newJumlah;
    }
}
