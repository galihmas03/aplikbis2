/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikbis2;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Agus
 */
public class table_suplier extends AbstractTableModel {
    List<class_suplier> datasuplier=new ArrayList<>();
    String[] kolom = {"Kode","Nama","Alamat","Telepon","Nama Kontak"};

    public table_suplier(List<class_suplier> datasuplier) {
        this.datasuplier = datasuplier;
    }

    public String getColumnName(int index) {
        return kolom[index];
    }

    @Override
    public int getRowCount() {
        return datasuplier.size();
    }

    @Override
    public int getColumnCount() {
        return kolom.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex) {
            case 0: return datasuplier.get(rowIndex).getKode();
            case 1: return datasuplier.get(rowIndex).getNama();
            case 2: return datasuplier.get(rowIndex).getAlamat();
            case 3: return datasuplier.get(rowIndex).getTelepon();
            case 4: return datasuplier.get(rowIndex).getKontak();
            default: return null;
    }
    }   
}
