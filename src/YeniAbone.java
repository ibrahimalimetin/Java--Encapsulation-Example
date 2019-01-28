/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ibrahim Ali Metin
 */
public class YeniAbone {
    
    private String isim;
    private int bakiye = 100; // Bakiye değerini vermez isek 100 'den başlatacak.
    private String sehir; 

    public YeniAbone(String isim,int bakiye, String sehir) {
        this.isim = isim;
        
        if(bakiye >=0 && bakiye <= 100){ // ilgili koşulu sağlıyor ise bakiyeyi güncelleyecek. Kullanıcı başka bir bakiye verdiyse 100 oalrak kalacak. 
            this.bakiye = bakiye;
        }
        
        this.sehir = sehir;
    }
    
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
