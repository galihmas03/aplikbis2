/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikbis2;

/**
 *
 * @author galih
 */
public class class_akun {

     private String user, nama, pass, status;

    public class_akun(String user, String nama, String pass, String status) {
        this.user = user;
        this.nama = nama;
        this.pass = pass;
        this.status = status;
    }

    public class_akun() {
    }


    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
 
    
}
