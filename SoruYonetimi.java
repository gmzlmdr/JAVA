import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SoruYonetimi implements Comparable{
	static ArrayList<Sorular> arrList = new ArrayList<Sorular>();
	DosyaIslemleri di = new DosyaIslemleri();
	public static ArrayList<Sorular> getArrList(){
		return arrList;
	}
	public void TumSorulariListele() {
		for(int i=0;i<arrList.size();i++) {
			System.out.println(i+". soru : "+arrList.get(i).getSoruMetni());		}
	}
	public void coktanSecmeliSoruEkle() {
		Scanner scn = new Scanner(System.in);
		System.out.print("\nL�tfen soru metnini giriniz.");
		String soruMetin=scn.nextLine();
		System.out.print("\nL�tfen A ��kk�n� giriniz.");
		String cevapA=scn.nextLine();
		System.out.print("\nL�tfen B ��kk�n� giriniz.");
		String cevapB=scn.nextLine();
		System.out.print("\nL�tfen C ��kk�n� giriniz.");
		String cevapC=scn.nextLine();
		System.out.print("\nL�tfen D ��kk�n� giriniz.");
		String cevapD=scn.nextLine();
		System.out.print("\nL�tfen sorunun cevab�n� giriniz.");
		String dogruCevap=scn.nextLine();
		
		System.out.print("\nL�tfen puan giriniz.");
		int puan = scn.nextInt();
		
		System.out.print("\nL�tfen zorlukDerecesi giriniz.");
		int zorlukDerecesi = scn.nextInt();
		CoktanSecmeli csSoruEkle = new CoktanSecmeli(cevapA,cevapB,cevapC,cevapD,soruMetin
				,dogruCevap,puan,zorlukDerecesi);
		arrList.add(csSoruEkle);
		 di.sorulariYaz(csSoruEkle);
	}
	public void boslukDoldurmaSoruEkle() {
		Scanner scan1 = new Scanner(System.in);
		System.out.println("L�tfen soru metnini giriniz.");
		String soruMetni2 = scan1.nextLine();
		System.out.println("L�tfen cevab� giriniz.");
		String cevap2 = scan1.nextLine();
		System.out.println("L�tfen puan giriniz.");
		int puan2 = scan1.nextInt();
		System.out.println("L�tfen zorlukDerecesi giriniz.");
		int zorlukDerecesi2 = scan1.nextInt();
		BoslukDoldurma bdSoruEkle =new BoslukDoldurma(soruMetni2,cevap2,puan2,zorlukDerecesi2);
		
		arrList.add(bdSoruEkle);
		di.sorulariYaz(bdSoruEkle);
	}
	public void dogruYanlisSoruEkle() {
		Scanner scan2 = new Scanner(System.in);
		System.out.println("L�tfen soru metnini giriniz.");
		String soruMetni3 = scan2.nextLine();
		System.out.println("L�tfen cevab� giriniz.");
		String cevap3 = scan2.nextLine();
		System.out.println("L�tfen puan giriniz.");
		int puan3 = scan2.nextInt();
		System.out.println("L�tfen zorlukDerecesi giriniz.");
		int zorlukDerecesi3 = scan2.nextInt();
		DogruYanlis dySoruEkle =new DogruYanlis(soruMetni3,cevap3,puan3,zorlukDerecesi3);
		arrList.add(dySoruEkle);
		di.sorulariYaz(dySoruEkle);
	}
	public void KlasikSoruEkle() {
		Scanner scan3 = new Scanner(System.in);
		System.out.println("L�tfen soru metnini giriniz.");
		String soruMetni2 = scan3.nextLine();
		System.out.println("L�tfen cevab� giriniz.");
		String cevap2 = scan3.nextLine();
		System.out.println("L�tfen puan giriniz.");
		int puan2 = scan3.nextInt();
		System.out.println("L�tfen zorlukDerecesi giriniz.");
		int zorlukDerecesi2 = scan3.nextInt();
		Klasik kSoruEkle =new Klasik(soruMetni2,cevap2,puan2,zorlukDerecesi2);
		
		arrList.add(kSoruEkle);
		di.sorulariYaz(kSoruEkle);
	}
	
	public void soruSil(String arananMetin) {

		Scanner scan = new Scanner(System.in);
		for(int i = 0 ; i<arrList.size() ; i++) {
			if(arrList.get(i).getSoruMetni().contains(arananMetin)) {
				System.out.println(i+".soru" +arrList.get(i).toString());
					
				}
			}

		System.out.println(arrList.size());
		System.out.println("silmek istedi�iniz sorunun numaras�n� giriniz.");
		int soruNo=scan.nextInt();
		arrList.remove(soruNo);
		System.out.println("istedi�iniz soru ��kar�ld�");
		
		}
		
	public void sorulariGoruntule1(String arananMetin2) {

		Scanner scan = new Scanner(System.in);
		for(int i = 0 ; i<arrList.size() ; i++) {
			if(arrList.get(i).getSoruMetni().contains(arananMetin2)) {
				System.out.println(i+".soru " +arrList.get(i).toString());
				}
			}

	}

	public void sorulariGoruntule2(String arananMetin) {
		for(int i = 0 ; i<arrList.size() ; i++) {
			if(arrList.get(i).getSoruTipi()=="CoktanSecmeli") {
			if(((CoktanSecmeli) arrList.get(i)).get_A().contains(arananMetin)) {
				System.out.println(arrList.get(i).toString());
			}if(((CoktanSecmeli) arrList.get(i)).get_B().contains(arananMetin)) {
				System.out.println(arrList.get(i).toString());
			}if(((CoktanSecmeli) arrList.get(i)).get_C().contains(arananMetin)) {
				System.out.println(arrList.get(i).toString());
			}if(((CoktanSecmeli) arrList.get(i)).get_D().contains(arananMetin)) {
				System.out.println(arrList.get(i).toString());
			}
			}
		}
	}
	public void sorulariGoruntule3(String dogruCevap) {
		
		for(int i = 0 ; i<arrList.size() ; i++) {
			if(arrList.get(i).getSoruTipi()=="CoktanSecmeli") {
				if(arrList.get(i).getCevap().toLowerCase()==dogruCevap) {
					System.out.println(arrList.get(i).toString());
				}
			}
		}
	}
	public void sorulariGoruntule4(int arananPuan) {
		for(int i = 0 ; i<arrList.size() ; i++) {
			if(arrList.get(i).getPuan()==arananPuan) {
				System.out.println(arrList.get(i).toString());
			}
		}
		
	}
	public void sorulariGoruntule5(int arananDerece) {
	
		for(int i = 0 ; i<arrList.size() ; i++) {
			if(arrList.get(i).getZorlukDerecesi()==arananDerece) {
				System.out.println(arrList.get(i).toString());
			}
		}
	}
	public void sorulariGoruntule6() {
		Collections.sort(arrList);
        int i = 1;
        for (Sorular soru : arrList) {
        	System.out.println(i+". soru : "+soru);
        	i++;
        }
	}
	public void SinavKagidi(ArrayList<Sorular> sinavSorulari) {
		Scanner scan = new Scanner(System.in);
		int toplamPuan = 0;
		for(int i =0 ; i<sinavSorulari.size();i++) {
			System.out.println(sinavSorulari.get(i));
			System.out.println("Cevab�n�z:");
			String kCevabi = scan.nextLine();
			if(sinavSorulari.get(i).getCevap().toLowerCase()==kCevabi.toLowerCase()) {
				toplamPuan += sinavSorulari.get(i).getPuan();
			}
		}
		System.out.println("Ald���n�z puan : " + toplamPuan );
		
		
	}

	@Override
	public int compareTo(Object o) {
		return 0;
	}

	
	
}
