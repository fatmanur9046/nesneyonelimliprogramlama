
package dosyaislemleri;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Dosyaİslemleri {

    public static void main(String[] args) {
        ögrenci ögrenci =new ögrenci();
        ögrenci.setNumara(1);
        ögrenci.setAd("atakan");
        ögrenci.setSoyad("kosum");
        ögrenci.setSinif("1");
        
        System.out.println(ögrenci);
        
        File file=new File("ögrenci.txt");
        FileOutputStream fileoutputstream=null;
        ObjectOutputStream objectoutputstream =null;
        
        try{
            fileoutputstream=new FileOutputStream (file);
            objectoutputstream=new ObjectOutputStream(fileoutputstream);
            objectoutputstream.writeObject(ögrenci);
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                if(objectoutputstream!=null){
                    objectoutputstream.close();
                }if(fileoutputstream!=null){
                    fileoutputstream.close();
                }
            }catch(Exception e2){
                e2.printStackTrace();
            }
        }
        
    }
    
}
