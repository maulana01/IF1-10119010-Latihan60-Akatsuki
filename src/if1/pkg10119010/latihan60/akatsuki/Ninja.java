/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119010.latihan60.akatsuki;

/**
 *
 * @author Maulana Imam Malik
 * NAMA     : Maulana Imam Malik
 * KELAS    : IF1
 * NIM      : 10119010
 * Deskripsi Program : Program ini menampilkan daftar karakter anggota akatsuki
 *                     dengan konsep OOP
 */
public class Ninja {
    protected String nama, asalDesa;
    
    public String getNama() {
        return this.nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getAsalDesa() {
        return this.asalDesa;
    }
    
    public void setAsalDesa(String asalDesa) {
        this.asalDesa = asalDesa;
    }
}
