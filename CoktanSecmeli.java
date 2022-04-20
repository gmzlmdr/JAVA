
public class CoktanSecmeli extends Sorular{

	
	private String _A;
	private String _B;
	private String _C;
	private String _D;
	
	
	public CoktanSecmeli(String _A, String _B, String _C, String _D, String soruMetni,String cevap,int puan,int zorlukDerecesi ) {
		super(soruMetni,cevap,puan,zorlukDerecesi);
		this._A = _A;
		this._B = _B;
		this._C = _C;
		this._D = _D;
		
	}
	
	public void Kontrol(String cevap) {
		
	}
	public String get_A() {
		return _A;
	}

	public void set_A(String _A) {
		this._A = _A;
	}

	public String get_B() {
		return _B;
	}

	public void set_B(String _B) {
		this._B = _B;
	}

	public String get_C() {
		return _C;
	}

	public void set_C(String _C) {
		this._C = _C;
	}

	public String get_D() {
		return _D;
	}

	public void set_D(String _D) {
		this._D = _D;
	}
	
	public String toString() {
		
		return this.soruMetni + "\n" + this._A + "\n" + this._B + "\n" + this._C + "\n" + this._D + "\n" ;
	}

	@Override
	public String getSoruTipi() {
		return "CoktanSecmeli";
	}
	
	
	
	
}
