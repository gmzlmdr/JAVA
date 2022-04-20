
public class BoslukDoldurma extends Sorular {
	
	public BoslukDoldurma(String soruMetni, String cevap, int puan, int zorlukDerecesi) {
		super(soruMetni, cevap, puan, zorlukDerecesi);
		
	}
	public String toString( ) {
		return soruMetni;
	}
	@Override
	public String getSoruTipi() {
		
		return "BoslukDoldurma";
	}
	
	
}
