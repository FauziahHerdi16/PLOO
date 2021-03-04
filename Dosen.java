package Model;

import java.util.ArrayList;

/**
 *
 * @author Acer
 */
public class Dosen extends Person{
    
    private String nidn;
    ArrayList<Matakuliah> listMatakuliahPengampu = new ArrayList();
    private Matakuliah matakuliahPengampu;
    
    public Dosen(String nidn, String nama){
        super (nama);
        this.nidn = nidn;
    }
    
    public void lihatListMatakuliahPengampu(){
        
    }
    
    public void tambahMatakuliahPengampu(Matakuliah matakuliah){
        
    }
    
    public void setNidn(String nidn){
        this.nidn = nidn;
    }
    
    public String getNidn(){
        return nidn;
    }

    @Override
    void showProfil() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
