/*
    Elektrik Abonesi
 */

/**
 *
 * @author Ibrahim Ali Metin
 */
public class Abone {
    
    public String isim;
    public int bakiye;
    public String sehir;
    
    //puclic durumunda encapsulation olmaz!
    
    public void elektrik_tuket(int miktar){
        
        if ((this.bakiye - miktar) < 0 ){
            
            System.out.println("Yeterli bakiyeniz ulunmamaktadır. ");
        }
        
        else {
            this.bakiye -= miktar;
            
            if (this.bakiye <= 0 ){
                System.out.println("Bakiyeniz Bitti!! Yükleme Yapın! Kredi Tutarı = 100 TL");
            }
            
            else {
                System.out.println("Yeni Bakiye = " + bakiye);
            }
        }
    }
    
    public void bakiye_sor(){
        
        System.out.println("Bakiye = " + bakiye);
    }
}
