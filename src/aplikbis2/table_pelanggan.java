

package aplikbis2;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Agus
 */
public class table_pelanggan extends AbstractTableModel {
    List<class_pelanggan> datapelanggan=new ArrayList<>();
    String[] kolom = {"Kode","Nama","Alamat","Telepon"};

    public table_pelanggan(List<class_pelanggan> datapelanggan) {
        this.datapelanggan = datapelanggan;
    }

    public String getColumnName(int index) {
        return kolom[index];
    }

    @Override
    public int getRowCount() {
        return datapelanggan.size();
    }

    @Override
    public int getColumnCount() {
        return kolom.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex) {
            case 0: return datapelanggan.get(rowIndex).getKode();
            case 1: return datapelanggan.get(rowIndex).getNama();
            case 2: return datapelanggan.get(rowIndex).getAlamat();
            case 3: return datapelanggan.get(rowIndex).getTelepon();
            default: return null;
    }
    }   
}
