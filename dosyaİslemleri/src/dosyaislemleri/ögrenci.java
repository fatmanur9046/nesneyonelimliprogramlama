
package dosyaislemleri;

import java.io.Serializable;

public class ögrenci  implements Serializable {
    
    private int numara;
    private String ad;
    private String soyad;
    private String sinif;

    public ögrenci() {
    }
    
    

    public ögrenci(int numara, String ad, String soyad, String sinif) {
        this.numara = numara;
        this.ad = ad;
        this.soyad = soyad;
        this.sinif = sinif;
    }
    
    

    public int getNumara() {
        return numara;
    }

    public String getAd() {
        return ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public String getSinif() {
        return sinif;
    }

    public void setNumara(int numara) {
        this.numara = numara;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public void setSinif(String sinif) {
        this.sinif = sinif;
    }
    
    /**
     *
     */
    @Override
    public String toString(){
        return "Nu:" + numara + ",ad:" + ad +",soyad: "+ soyad + ",sinif:" + sinif;
    }
}
