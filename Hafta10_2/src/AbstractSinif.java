
public class AbstractSinif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		General a=new General();
		a.EnUstKomutan("OHAL");
		a.Yetki();
		//Askerler b=new Askerler();
		//Abstract classtan dogrudan nesne türetilemez
	}
}

abstract class Askerler{
	int yas;

	public int getYas() {
		return yas;
	}

	public void setYas(int yas) {
		this.yas = yas;
	}	
	public abstract void Yetki();
	//Abtract fonksiyonlarda herhangi bir kod blogu bulunmaz
	//Sadece isim tanımlanı ve ; ile bitirilir	
	
	//Final yapılar herhangi bir lekilde değiştirilmeden işlemini yapar
	// Kalıtım sonrası türetilen yeni nesnelerde override edilemez
	public final void EnUstKomutan(String durum) {
		if(durum!="OHAL") {
			System.out.println("Ordunun başında Genel Kurmay Başkanı");
		}
		else {
			System.out.println("Ordunun başında Cumhurbaşkanı");
		}
	}
	
}

class General extends Askerler{
	//Ust abstract class da abstract olarak tanımlanan fonksiyonlar override edilmelidir
		
	@Override
	public void Yetki() {
		System.out.println("Askeriyenin en üst emir komuta zinciridir ");
	}	
	//Bu kısım Override işlemi değildir
	//Bu kısım Overloading işlemidir
	//Bu yüzden abstract metotlar override edilirken dikkat edilmelidir
	public void Yetki(String a) {
		System.out.println("Yetki: "+a);
	}	
	/*
	void EnUstKomutan(String durum) {
		System.out.println("Askeriyenin en üst emir komuta zinciri: İSTE'dir ");
		//Final tanımlı oldugu için Override edilemez
	}
	*/
	
	
	
}
