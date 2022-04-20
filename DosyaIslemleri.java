import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

public class DosyaIslemleri {

	
    public void sorulariYaz(Sorular soru) {
    	try {
    	BufferedWriter bufferedWriter=null;
    	 
        File file=new File("sorular.dat");
 
        if(!file.exists()){
 
            file.createNewFile();
        }
 
        //  fileWriter nesnesine true parametre geçersek eklenen content'i dosyanýn sonuna ekler
        
        FileWriter fileWriter = new FileWriter(file,true);
        bufferedWriter=new BufferedWriter(fileWriter);
        bufferedWriter.newLine();
        bufferedWriter.write("----------------SORU-------------");
        bufferedWriter.newLine();
        if(soru.getSoruTipi()=="CoktanSecmeli") {
        	CoktanSecmeli sorumuz = (CoktanSecmeli)soru;
        	bufferedWriter.write("Soru metni:" + sorumuz.getSoruMetni());
        	bufferedWriter.newLine();
        	bufferedWriter.write("A:" + sorumuz.get_A());
        	bufferedWriter.newLine();
        	bufferedWriter.write("B:" + sorumuz.get_B());
        	bufferedWriter.newLine();
        	bufferedWriter.write("C:" + sorumuz.get_C());
        	bufferedWriter.newLine();
        	bufferedWriter.write("D:" + sorumuz.get_D());
        	bufferedWriter.newLine();
        	bufferedWriter.write("cevabý:" + sorumuz.getCevap());
        	bufferedWriter.newLine();
        	bufferedWriter.write("puaný:" + sorumuz.getPuan());
        	bufferedWriter.newLine();
        	bufferedWriter.write("Zorluk derecesi:" + sorumuz.getZorlukDerecesi());
        	bufferedWriter.newLine();
        }else if(soru.getSoruTipi()=="BoslukDoldurma") {
        	BoslukDoldurma sorumuz = (BoslukDoldurma)soru;
        	bufferedWriter.write("Soru metni:" + sorumuz.getSoruMetni());
        	bufferedWriter.newLine();
        	bufferedWriter.write("cevabý:" + sorumuz.getCevap());
        	bufferedWriter.newLine();
        	bufferedWriter.write("puaný:" + sorumuz.getPuan());
        	bufferedWriter.newLine();
        	bufferedWriter.write("Zorluk derecesi:" + sorumuz.getZorlukDerecesi());
        	bufferedWriter.newLine();
        }else if(soru.getSoruTipi()=="DogruYanlis") {
        	DogruYanlis sorumuz = (DogruYanlis)soru;
        	bufferedWriter.write("Soru metni:" + sorumuz.getSoruMetni());
        	bufferedWriter.newLine();
        	bufferedWriter.write("cevabý:" + sorumuz.getCevap());
        	bufferedWriter.newLine();
        	bufferedWriter.write("puaný:" + sorumuz.getPuan());
        	bufferedWriter.newLine();
        	bufferedWriter.write("Zorluk derecesi:" + sorumuz.getZorlukDerecesi());
        	bufferedWriter.newLine();
        }else if(soru.getSoruTipi()=="Klasik") {
        	Klasik sorumuz = (Klasik)soru;
        	bufferedWriter.write("Soru metni:" + sorumuz.getSoruMetni());
        	bufferedWriter.newLine();
        	bufferedWriter.write("cevabý:" + sorumuz.getCevap());
        	bufferedWriter.newLine();
        	bufferedWriter.write("puaný:" + sorumuz.getPuan());
        	bufferedWriter.newLine();
        	bufferedWriter.write("Zorluk derecesi:" + sorumuz.getZorlukDerecesi());
        	bufferedWriter.newLine();
        }
        bufferedWriter.flush();
        bufferedWriter.close();
        fileWriter.close();
        
        System.out.println("Soru eklendi.");
    	}catch(Exception e){
    		
    	}
    
}
    public void SinavSorulariniYaz(ArrayList<Sorular> soru) {
    	
    	try {
        	BufferedWriter bufferedWriter=null;
        	 
            File file=new File("sinav.dat");
     
            if(!file.exists()){
     
                file.createNewFile();
            }
     
            FileWriter fileWriter = new FileWriter(file,true);
            bufferedWriter=new BufferedWriter(fileWriter);
            bufferedWriter.newLine();
       	 	bufferedWriter.write("-----------------SINAV----------------");
            for(int i=0;i<soru.size();i++) {
                if(soru.get(i).getSoruTipi()=="CoktanSecmeli") {
                	CoktanSecmeli sorumuz = (CoktanSecmeli)soru.get(i);
                	bufferedWriter.write("Soru metni:" + sorumuz.getSoruMetni());
                	bufferedWriter.newLine();
                	bufferedWriter.write("A:" + sorumuz.get_A());
                	bufferedWriter.newLine();
                	bufferedWriter.write("B:" + sorumuz.get_B());
                	bufferedWriter.newLine();
                	bufferedWriter.write("C:" + sorumuz.get_C());
                	bufferedWriter.newLine();
                	bufferedWriter.write("D:" + sorumuz.get_D());
                	bufferedWriter.newLine();
                	
                }else if(soru.get(i).getSoruTipi()=="BoslukDoldurma") {
                	BoslukDoldurma sorumuz = (BoslukDoldurma)soru.get(i);
                	bufferedWriter.write("Soru metni:" + sorumuz.getSoruMetni());
                	bufferedWriter.newLine();
                	
                }else if(soru.get(i).getSoruTipi()=="DogruYanlis") {
                	DogruYanlis sorumuz = (DogruYanlis)soru.get(i);
                	bufferedWriter.write("Soru metni:" + sorumuz.getSoruMetni());
                	bufferedWriter.newLine();
                	
                }else if(soru.get(i).getSoruTipi()=="Klasik") {
                	Klasik sorumuz = (Klasik)soru.get(i);
                	bufferedWriter.write("Soru metni:" + sorumuz.getSoruMetni());
                	bufferedWriter.newLine();
                	
                }
            }
           
            bufferedWriter.flush();
            bufferedWriter.close();
            fileWriter.close();
            System.out.println("Soru eklendi.");
        	}catch(Exception e){
        		
        	}
}		public static void dosyaTemizleme() {
		try {
			String str = "";

			File file = new File("sorular.dat");
			File file2 = new File("sinav.dat");
			if (!file.exists()) {
				file.createNewFile();
			}
			if (!file2.exists()) {
				file2.createNewFile();
			}

			FileWriter fileWriter = new FileWriter(file, false);
			BufferedWriter bWriter = new BufferedWriter(fileWriter);
			bWriter.write(str);
			bWriter.close();
			
			FileWriter fileWriter2 = new FileWriter(file2, false);
			BufferedWriter bWriter2 = new BufferedWriter(fileWriter2);
			bWriter2.write(str);
			bWriter2.close();
		}catch(Exception e){
		
	}
}
}
