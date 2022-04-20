import java.util.ArrayList;

public class SinavOlusturucu {
	private SinavYap sinavOlustur;
	
	
	public SinavOlusturucu(SinavYap sinavYap)
	 {
			
	this.sinavOlustur=sinavYap;
		
	}
		
		
	public ArrayList<Sorular> SinavOlustur(ArrayList<Sorular> sorular) {
			
	ArrayList<Sorular> gelenSorular =sinavOlustur.sinavOlustur(sorular);
	
	DosyayaYaz(gelenSorular);
	
	return gelenSorular;
		
	}
	public static boolean sinavKontrolu(ArrayList<Sorular> sorular,String sinavTipi) {
		int puan=0;
		for(int i=0;i<sorular.size();i++) {
			if(sorular.get(i).getSoruTipi()==sinavTipi) {
				puan+=sorular.get(i).getPuan();
			}else if ("Karisik"==sinavTipi) {
				puan+=sorular.get(i).getPuan();
			}
				
		}
		if(puan<100) {
			return false;
		}
		return true;
	}
	private void DosyayaYaz(ArrayList<Sorular> sorular) {
		DosyaIslemleri di = new DosyaIslemleri();
		di.SinavSorulariniYaz(sorular);
	}


}
