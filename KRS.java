package Model;

import java.util.ArrayList;

/**
 *
 * @author Acer
 */
public class KRS {
    
    private String noKRS;
    private ArrayList<Matakuliah> paketMatakuliah;
    private Matakuliah matakuliah;
    
    public KRS(String noKRS){
        this.noKRS = noKRS;
    }
    
    public void tambahMatakuliahKRS(Matakuliah matakuliah){
        
    }
    
    public ArrayList<Matakuliah> showMatakuliahKRS(){
        return Matakuliah;   
    }
            
    public void setNoKRS(String noKRS){
        this.noKRS = noKRS;
    }
    
    public String getNoKRS(){
        return this.noKRS;
    }
    
}
