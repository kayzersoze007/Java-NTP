/*
 ArrayList<String> listem=new ArrayList<>(n);
 listem.add(i+".ci sayi"); // Sona eleman ekleme
 listem.add(0, "Mehmet");  //Listenin 0.indisine ekleme yapar
 listem.contains("Gokhan"); //varsa true yoksa false donderir
 listem.remove(4); //Verilen indexteki degeri siler		
 listem.remove("Gokhan"); // Verilen degeri siler
 listem.get(3); 	//Listenin 3.indeksindeki elemanı getirir	
 listem.set(0, "Yeni değer"); //Listede 0.indisteki degeri "Yeni değerim"	 yapar	
 listem.indexof("Aranan Deger"); //Aranan degerin kacinci indekste ilk gectigi
 for(String a:listem) {
			System.out.println(a);
		}
 
 */
import java.util.Comparator;
import java.util.*;

public class ArrayListem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		ArrayList<String> listem=new ArrayList<>(n);
		ArrayList<Integer> listem2=new ArrayList<>();
		for(int i=1;i<=n;i++) {
			listem.add(i+".ci sayi");
			//listenin sonuna yeni ekleme
		}
		
		
		
		listem.add("Gokhan");		
		//Listenin sonuna ekleme yapar
		listem.add(0, "Mehmet");
		//Listenin 0.indisine ekleme yapar
		System.out.println(listem);
		
		
		System.out.println(listem.contains("Gokhan"));
		//listem.contains("Gokhan"); //varsa true yoksa false donderir
		System.out.println(listem.indexOf("Gokhan"));
		//Gokhan degerinin hangi indiste oldugunu verir
		
		if(listem.contains("Gokhan")) {
			System.out.println("Aranan Eleman liste içerisinde var");
		}
		else {
			System.out.println("Aranan Eleman yok");
		}
		Collections.sort(listem);
		//Sıralama (A-->Z)
		
		Collections.sort(listem, Collections.reverseOrder()); 
		//Sıralama (Z--> A)
		
		//listem.sort(listem, String listem2 = new String());
		listem.remove(4); //Verilen indexteki degeri siler
		System.out.println(listem);
		
		listem.remove("Gokhan"); // Verilen degeri siler		
		System.out.println(listem);
		
		//listem.clear();
		//Listeyi tamamen temizler
		System.out.println(listem);
		
		for(String a:listem) {
			System.out.println(a);
		}
		/*
		for(int i=0;i<listem.size();i++) {
			System.out.println(listem.get(i));
		}
		*/
		System.out.println(listem.size());
		
		System.out.println(listem.get(3));
		//dizinin 3.indeksindeki elemanı getirir
		
		listem.set(0, "Yeni değer");
		//Listede 0.indisteki degeri "Yeni değerim"	 yapar
		System.out.println(listem);
		
		
		ArrayList listem3=new ArrayList<>();
		listem3.add(199);
		listem3.add("Deneme");
		
		
	}

}


class Deneme{
	public static int a;

	public static int getA() {
		return a;
	}

	public static void setA(int a) {
		Deneme.a = a;
	}
}
