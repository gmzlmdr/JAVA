
public class Klasik extends Sorular{

	public Klasik(String soruMetni, String cevap, int puan, int zorlukDerecesi) {
		super(soruMetni, cevap, puan, zorlukDerecesi);
		
	}
	@Override
	public String getSoruTipi() {
		return "Klasik";
	}
	public String toString() {
		return soruMetni;
	}
}
