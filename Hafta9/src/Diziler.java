/*
  dizi2.length: Eleman Sayısı
  System.arraycopy(dizi2, 0, dizi1, 0, 3);
  //dizi2'nin 0.indisinden baslayarak 3 elemani dizi1e kopyala
  Arrays.sort(dizi1);
  //Dizinin tumunu sıralar (A-Z)
  Arrays.sort(dizi1,2,5);
  //Dizinin 2.indisi ile 5.indisi arasindakileri sıralar (A-Z)
  Arrays.fill(dizi1, 2,4, 100);
  //Dizinin 2. indisten 4.indise kadar 100 degeri atama
  Arrays.equals(dizi1, dizi2)); 
  //dizi1 ve dizi2 nin esit olup olmadigina bakar: true ya da false donderir	
  Arrays.binarySearch(dizi1, 23));
  //23 sayısının dizi1'de olup olmadigini kontrol eder
  //Varsa kacinci indiste oldugunu getirir yoksa -1
 */
import java.util.Arrays;

public class Diziler {

	public static void main(String[] args) {
		int[] dizi1=new int[10];
		int[] dizi2= {1,44,23,56,78, 100,100};
		int[] dizi3;		
		dizi3=new int[10];
		
		
		for(int i=0; i<dizi2.length;i++) {
			System.out.print(dizi2[i]+" ");
		}
		System.out.println("");
		for(int sayi:dizi2) {
			System.out.print(sayi+" ");
		}
		
		System.out.println("");
		int elemanSayisi=dizi2.length;
		System.out.println(elemanSayisi);
		System.out.println("-------");
		
		System.out.println(Arrays.binarySearch(dizi2, 100));
		//100 sayisi birden fazla sayıda varsa enson indisini getirir
		//Yoksa -1 donderir
		
		System.arraycopy(dizi2, 0, dizi1, 0, 5);
		//Dizi2'nin 0.indisinden baslayarak 3 elemani dizi1'e 
		//0.indisinden baslayarak kopyala
		//arraycopy(KopyalanacakDizi, kactanBasla, 
		//       YeniDizi, kactanBasla, kacElemanKopyalanacak)
		
		for(int sayi:dizi1) {
			System.out.print(sayi+" ");
		}
		System.out.println("-------");
		//Arrays.sort(dizi1);
		//Dizinin tumunu sıralar (A-Z)
		/* for(int sayi: dizi1) {
			System.out.print(sayi+" ");
		}
		System.out.println("-------");
		*/
		Arrays.sort(dizi1,2,7);
		//Dizinin 2.indisi ile 7.indisi arasinddakileri sıralar (A-Z)
		for(int sayi: dizi1) {
			System.out.print(sayi+" ");
		}
		System.out.println("-------");
		
		
		Arrays.fill(dizi1, 2,3, 100);
		//Dizinin 2. indisten 4.indise kadar 100 degeri atama
		//Varsayılan olarak degerlendirir arammalarda erisemez
		for(int sayi: dizi1) {
			System.out.print(sayi+" ");
		}
		System.out.println("-------");
		
		
		System.out.println(Arrays.equals(dizi1, dizi2)); 
		//dizi1 ve dizi2 nin esit olup olmadigina bakar
		//true ya da false donderir
		
		System.out.println(Arrays.binarySearch(dizi1, 23));
		// sayısının dizi1'de olup olmadigini kontrol eder
		//Varsa kacinci indiste oldugunu getirir yoksa -1
		
		int [][] cokboyut=new int[5][5];
		int [][] cokboyut2= {{1,2}, {2,3}, {100,150}};
		cokboyut2[1][1]=45;
		
		}
}
