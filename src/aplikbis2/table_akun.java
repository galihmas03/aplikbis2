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
public class table_akun extends AbstractTableModel {
    List<class_akun> akun=new ArrayList<>();
    String[] kolom = {"Username","Nama","Password","Status"};

    public table_akun(List<class_akun> akun) {
        this.akun = akun;
    }

    public String getColumnName(int index) {
        return kolom[index];
    }

    @Override
    public int getRowCount() {
        return akun.size();
    }

    @Override
    public int getColumnCount() {
        return kolom.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex) {
            case 0: return akun.get(rowIndex).getUser();
            case 1: return akun.get(rowIndex).getNama();
            case 2: return akun.get(rowIndex).getPass();
            case 3: return akun.get(rowIndex).getStatus();
            default: return null;
    }
    }   
}
