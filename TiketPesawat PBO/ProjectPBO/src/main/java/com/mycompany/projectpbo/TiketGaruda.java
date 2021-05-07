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
public class TiketGaruda extends TiketPesawat{
    private String nama;
    
    public TiketGaruda(String namaMaskapai, int harga, int jumlah){
        super(harga,jumlah);
        nama = namaMaskapai;
    }
    
    public void setNama(){
        nama = "Garuda Indonesia";
    }
}
