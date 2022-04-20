import java.util.ArrayList;

public abstract class Sorular implements Comparable<Sorular> {

	ArrayList<Object> arrList = new ArrayList<Object>();

	protected String soruMetni;
	protected String cevap;
	protected int puan;
	protected int zorlukDerecesi;
	
	
	
	public Sorular(String soruMetni, String cevap, int puan, int zorlukDerecesi) {
		this.soruMetni = soruMetni;
		this.cevap = cevap;
		this.puan = puan;
		this.zorlukDerecesi = zorlukDerecesi;
	}
	
	public abstract String getSoruTipi() ;
		
	public Sorular() {
	}


	public String getSoruMetni() {
		return soruMetni;
	}

	public void setSoruMetni(String soruMetni) {
		this.soruMetni = soruMetni;
	}

	public String getCevap() {
		return cevap;
	}

	public void setCevap(String cevap) {
		this.cevap = cevap;
	}

	public int getPuan() {
		return puan;
	}

	public void setPuan(int puan) {
		this.puan = puan;
	}

	public int getZorlukDerecesi() {
		return zorlukDerecesi;
	}

	public void setZorlukDerecesi(int zorlukDerecesi) {
		this.zorlukDerecesi = zorlukDerecesi;
	}
	@Override
	public int compareTo(Sorular o) {
		if(this.puan>o.puan) return 1;
		if(this.puan<o.puan) return -1;
		else return 0;
		
	}


	
}
