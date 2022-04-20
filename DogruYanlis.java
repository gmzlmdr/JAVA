
public class DogruYanlis extends Sorular{

	public DogruYanlis(String soruMetni, String cevap, int puan, int zorlukDerecesi) {
		super(soruMetni, cevap, puan, zorlukDerecesi);
		
		
	}

	public String toString() {
		return soruMetni;
	}

	@Override
	public String getSoruTipi() {
		return "DogruYanlis";
	}

	
	
}
