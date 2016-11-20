/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikbis2;
public class class_suplier {
private String kode, nama, alamat, telepon, kontak;

    public class_suplier(String kode, String nama, String alamat, String telepon, String kontak) {
        this.kode = kode;
        this.nama = nama;
        this.alamat = alamat;
        this.telepon = telepon;
        this.kontak = kontak;
    }

    public class_suplier() {
    }
  
   
    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    public String getKontak() {
        return kontak;
    }

    public void setKontak(String kontak) {
        this.kontak = kontak;
    }
   

}
