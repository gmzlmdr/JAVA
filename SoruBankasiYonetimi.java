import java.util.ArrayList;
import java.util.Scanner;

public class SoruBankasiYonetimi {
	SoruYonetimi soruEkle = new SoruYonetimi();
	private Scanner scan;
	private boolean isDevam=true;
	public void Program() {
		
		while(isDevam) {
			VeriGirisi();
		}
	}
	public void VeriGirisi() {
		scan = new Scanner(System.in);
		ArrayList<Sorular> arrList = new ArrayList<Sorular>();
		String islemler ="1.soru ekle\n" + "2.Soru ��kart\n" 
		+ "3.sorular� listele\n" + "4.S�nav yap\n" + "5.��k��";
		System.out.println(islemler);
		System.out.println("bir i�lem se�iniz:");
		String islemKodu = scan.nextLine();
		switch(islemKodu){
		
			case "1" : 
				String islemler2="a.�oktan Se�meli sorular \n" + "b.Bo�luk doldurmal� sorular\n" + "c.Do�ru yanl�� sorular�\n" + "d.Klasik sorular";
				System.out.println(islemler2);
				System.out.println("L�tfen soru tarz�n� se�iniz");
				String islemKodu2=scan.nextLine();
				
				switch(islemKodu2) {
				case "a" : 
						soruEkle.coktanSecmeliSoruEkle();
					break;
				case "b":
					soruEkle.boslukDoldurmaSoruEkle();
					break;
				case "c":
					soruEkle.dogruYanlisSoruEkle();					
					break;
				case "d":
					soruEkle.KlasikSoruEkle();					
					break;
				}
				
			break;
			case "2" :
				
				System.out.println("��kartmak istedi�iniz sorunun i�erisinde yer alan metni giriniz.");
				String arananMetin=scan.nextLine();
				soruEkle.soruSil(arananMetin);
			break;	
			
			case"3":
				String islemler3 = "a.Sorular� soru metinleri i�erisinde aramak i�in \n" 
									+"b.Soru ��kk�na g�re aramak i�in \n"
									+"c.Do�ru ��k �zerinden aramak i�in\n" 
									+"d.Puan �zerinden arama yapmak i�in\n"
									+"e.Zorluk derecesine g�re s�ralama yapmaak i�in\n"
									+"f.puanlar� k���kten b�y��e do�ru s�ralamak i�in\n"
									+"g.t�m sorularu g�r�nt�le";
				System.out.println(islemler3);
				System.out.println("nas�l s�ralamak istersiniz..?");
				String islemKodu3=scan.nextLine();
				switch(islemKodu3){
				case "a" :
					System.out.println("G�r�nt�lemek istedi�iniz sorunun i�erisinde yer alan metni giriniz.");
					String arananMetin2=scan.nextLine();
					soruEkle.sorulariGoruntule1(arananMetin2);
					break;
				case "b" :
					System.out.println("G�r�nt�lemek istedi�iniz sorunun ceaplar�nda yer alan metni giriniz.");
					String arananMetin3=scan.nextLine();
					soruEkle.sorulariGoruntule2(arananMetin3);
					break;
				case "c" :
					System.out.println("Hangi cevaba ait sorular� istiyorsunuz?");
					String Kullan�c�Cevap=scan.nextLine();
					soruEkle.sorulariGoruntule3(Kullan�c�Cevap.toLowerCase());
					
					
					break;
					
				case "d" :
					System.out.println("G�r�nt�lemek istedi�iniz soru puan�n� giriniz");
					int arananPuan = scan.nextInt();
					soruEkle.sorulariGoruntule4(arananPuan);
					break;
				case "e" :
					System.out.println("G�r�nt�lemek istedi�iniz soru derecesini giriniz");
					int arananDerece = Integer.parseInt(scan.nextLine());
					soruEkle.sorulariGoruntule5(arananDerece);
					break;
				case "f" :
					 soruEkle.sorulariGoruntule6();
					break;
				case "g":
					soruEkle.TumSorulariListele();
					break;
				}
				break;
					
			case"4":
				String sinav�slemi = "a. �oktan se�meli s�nav\n"+ "b.klasik s�nav\n" + "c.Bo�luk Doldurma s�nav�\n" 
						+ "d.Do�ru yanl�� s�nav�\n" + "e.kar���k s�nav\n";
				System.out.println(sinav�slemi);
				System.out.println("S�nav t�r�n�z :");
				String giris = scan.nextLine();
				String sinavTipi="";
				switch(giris) {
				case "a":
					sinavTipi="CoktanSecmeli";
					break;
				case "b":
					sinavTipi="Klasik";
					break;
				case "c":
					sinavTipi="BoslukDoldurma";
					break;
				case "d":
					sinavTipi="DogruYanlis";
					break;
				case "e":
					sinavTipi="Karisik";
					break;
				}
				if(SinavOlusturucu.sinavKontrolu(arrList,sinavTipi)) {
					ArrayList<Sorular> sinavSorulari= new ArrayList<Sorular>();
					
					if(giris.equals("a")) {
						SinavOlusturucu so = new SinavOlusturucu(new CoktanSinav());
						sinavSorulari =so.SinavOlustur(arrList);
					} 
					else if(giris.equals("b")) {
						SinavOlusturucu so = new SinavOlusturucu(new KlasikSinav());
						sinavSorulari =so.SinavOlustur(arrList);
					}
					else if(giris.equals("c")) {
						SinavOlusturucu so = new SinavOlusturucu(new BoslukDoldurmaSinav());
						sinavSorulari =so.SinavOlustur(arrList);
					}else if(giris.equals("d")) {
						SinavOlusturucu so = new SinavOlusturucu(new DogruYanlisSinav());
						sinavSorulari =so.SinavOlustur(arrList);
					}else if(giris.equals("e")) {
						SinavOlusturucu so = new SinavOlusturucu(new KarisikSinav());
						sinavSorulari =so.SinavOlustur(arrList);
					}else {
						System.out.println("Hatal� tu�lama yapt�n�z.");
					}
					soruEkle.SinavKagidi(sinavSorulari);
				}else {
					System.out.println("S�nav yapmak i�in yeterli sorunuz yoktur.");
				}
				
				
				break;
			case"5":
				isDevam=false;
				break;
		}
		
	}
	}
	

