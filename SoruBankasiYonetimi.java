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
		String islemler ="1.soru ekle\n" + "2.Soru çýkart\n" 
		+ "3.sorularý listele\n" + "4.Sýnav yap\n" + "5.çýkýþ";
		System.out.println(islemler);
		System.out.println("bir iþlem seçiniz:");
		String islemKodu = scan.nextLine();
		switch(islemKodu){
		
			case "1" : 
				String islemler2="a.Çoktan Seçmeli sorular \n" + "b.Boþluk doldurmalý sorular\n" + "c.Doðru yanlýþ sorularý\n" + "d.Klasik sorular";
				System.out.println(islemler2);
				System.out.println("Lütfen soru tarzýný seçiniz");
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
				
				System.out.println("Çýkartmak istediðiniz sorunun içerisinde yer alan metni giriniz.");
				String arananMetin=scan.nextLine();
				soruEkle.soruSil(arananMetin);
			break;	
			
			case"3":
				String islemler3 = "a.Sorularý soru metinleri içerisinde aramak için \n" 
									+"b.Soru Þýkkýna göre aramak için \n"
									+"c.Doðru þýk üzerinden aramak için\n" 
									+"d.Puan üzerinden arama yapmak için\n"
									+"e.Zorluk derecesine göre sýralama yapmaak için\n"
									+"f.puanlarý küçükten büyüðe doðru sýralamak için\n"
									+"g.tüm sorularu görüntüle";
				System.out.println(islemler3);
				System.out.println("nasýl sýralamak istersiniz..?");
				String islemKodu3=scan.nextLine();
				switch(islemKodu3){
				case "a" :
					System.out.println("Görüntülemek istediðiniz sorunun içerisinde yer alan metni giriniz.");
					String arananMetin2=scan.nextLine();
					soruEkle.sorulariGoruntule1(arananMetin2);
					break;
				case "b" :
					System.out.println("Görüntülemek istediðiniz sorunun ceaplarýnda yer alan metni giriniz.");
					String arananMetin3=scan.nextLine();
					soruEkle.sorulariGoruntule2(arananMetin3);
					break;
				case "c" :
					System.out.println("Hangi cevaba ait sorularý istiyorsunuz?");
					String KullanýcýCevap=scan.nextLine();
					soruEkle.sorulariGoruntule3(KullanýcýCevap.toLowerCase());
					
					
					break;
					
				case "d" :
					System.out.println("Görüntülemek istediðiniz soru puanýný giriniz");
					int arananPuan = scan.nextInt();
					soruEkle.sorulariGoruntule4(arananPuan);
					break;
				case "e" :
					System.out.println("Görüntülemek istediðiniz soru derecesini giriniz");
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
				String sinavÝslemi = "a. Çoktan seçmeli sýnav\n"+ "b.klasik sýnav\n" + "c.Boþluk Doldurma sýnavý\n" 
						+ "d.Doðru yanlýþ sýnavý\n" + "e.karýþýk sýnav\n";
				System.out.println(sinavÝslemi);
				System.out.println("Sýnav türünüz :");
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
						System.out.println("Hatalý tuþlama yaptýnýz.");
					}
					soruEkle.SinavKagidi(sinavSorulari);
				}else {
					System.out.println("Sýnav yapmak için yeterli sorunuz yoktur.");
				}
				
				
				break;
			case"5":
				isDevam=false;
				break;
		}
		
	}
	}
	

