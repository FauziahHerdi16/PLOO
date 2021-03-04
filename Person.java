package Model;
/**
 *Fauziah Herdiyanti (1905007)
 */
abstract class Person {
    
    private String nama;
    
    public Person(String nama){
        this.nama = nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    } 
    
    public String getNama(){
        return nama;
    }
    
    abstract void showProfil();
    
}