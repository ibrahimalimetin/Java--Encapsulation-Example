/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ibrahim Ali Metin
 */
public class Main {
    
    public static void main(String[] args) {
        
       /* Abone abone = new Abone();
        
        abone.isim = "Ali Metin";
        abone.bakiye = 300; // Abone class 'ı içerisinde maksimum bakiye miktarımıza 100 TL demiştik; fakat direk olarak erişim sağladığımızdan değeri verebildik! Public yerine private verseydik ilgili durum olmayacaktı!!
        abone.sehir = "İzmir";
        
        
        abone.elektrik_tuket(300);*/
       
       YeniAbone abone = new YeniAbone("Ali Metin", 200, "İzmir"); 
      // abone.bakiye_sor(); // 200 vermemize rağmen 100 olarak kaldı. Koşulu sağlamadığı içi bakiyeyi güncellemedi!!
      
      // Encapsulation 'un bir diğer avantajı herhangi bir alanın ismini değiştirdiğimizde. Yalnızca kendi class içini değiştirmek yeterli olacaktır. 
      
    }
}
