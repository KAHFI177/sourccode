/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kahfi.uts.jadwal.data.model;

/**
 * MUHAMMAD KAHFI
 * 211011400006
 * 04TPLE001
 */
public class Dosen {
    private final String namaLengkap;
    private final String nidn;
    private final String jenisKelamin;
    private final String prodi;
    /**
     * 
     * @param namaLengkap
     * @param nidn
     * @param jenisKelamin
     * @param prodi
     */

     public Dosen(String namaLengkap, String nidn, String jenisKelamin, String prodi){
        this.namaLengkap = namaLengkap;
        this.nidn = nidn;
        this.jenisKelamin = jenisKelamin;
        this.prodi = prodi;
    
}
public String getName(){
        return namaLengkap;
    }
    public String getNidn(){
        return nidn;
    }
        public String getJenisKelamin(){
        return jenisKelamin;
    }

    /**
     * getter
     * method untuk mengembalikan prodi dari object Dosen
     * @return 
     */
    public String getProdi(){
        return prodi;
    }
}
