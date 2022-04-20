import java.util.ArrayList;
import java.util.Random;

public class KarisikSinav extends SinavYap{

	@Override
	public ArrayList<Sorular> sinavOlustur(ArrayList<Sorular> sorular) {
		ArrayList<Sorular> donecekSorular = new ArrayList<Sorular>();
		int puan = 0;
		
		Random r=new Random(); 
		while(puan<100) {
			int a=r.nextInt(sorular.size() + 1)-1;
			boolean eklenebilir=true;
			for(int i=0;i<donecekSorular.size();i++) {
				if(donecekSorular.get(i)==sorular.get(a)) {
					eklenebilir=false;
				}
			}
			if(eklenebilir==true) {
				
				puan += sorular.get(a).getPuan();
				if(puan<110) {
					donecekSorular.add(sorular.get(a));
				}else {
					puan -= sorular.get(a).getPuan();
				}
			}
			
	}
		return donecekSorular;
	}

}
