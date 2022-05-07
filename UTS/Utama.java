import mesin.Mesin;
import kendaraan.Mobil;
import kendaraan.SepedaMotor;
public class Utama
{
	public static void main(String args[])
	{
		SepedaMotor Ninja = new SepedaMotor();
		Ninja.setMesin("Kawasaki bertipe Liquid cooled, 16-valve DOHC");
		mesin.jumlah_silinder = 4;
		/*Ninja.kapasitas_silinder = "249,8 cc";
		Ninja.langkah = 31.8f;
		Ninja.setBahan_bakar("Bensin (disarankan RON <92)");
		Ninja.setTransmisi("Manual, 6 percepatan");*/
		System.out.println("Motor Ninja ZX-25R memiliki mesin "+Ninja.getMesin());
		System.out.println("Menggunakan silinder berjumlah "+mesin.jumlah_silinder+" silinder");
		/*System.out.println("Memiliki kapasitas silinder "+Ninja.kapasitas_silinder);
		System.out.println("menggunakan piston berukuran 50 mm dengan langkah piston "+Ninja.langkah+" mm");
		System.out.println("Mengkonsumsi bahan bakar berjenis "+Ninja.getBahan_bakar());
		System.out.println("Transmisi yang digunakan berjenis "+Ninja.getTransmisi());*/
		
		Mobil Toyota = new Mobil();
		Toyota.setMesin("Toyota bertipe F33A-FTV, V6 Turbodiesel");
		/*Toyota.jumlah_silinder = 6;
		Toyota.kapasitas_silinder = "3346 cc";
		Toyota.langkah = 96.0f;
		Toyota.setBahan_bakar("Solar");
		Toyota.setTransmisi("Otomatis, 10 percepatan");*/
		System.out.println("Mobil Toyota Land Cruiser 300 memiliki mesin "+Toyota.getMesin());
		/*System.out.println("Memiliki kapasitas silinder "+Toyota.kapasitas_silinder);
		System.out.println("menggunakan piston berukuran 86.0 mm dengan langkah piston "+Toyota.langkah+" mm");
		System.out.println("Mengkonsumsi bahan bakar berjenis "+Toyota.getBahan_bakar());
		System.out.println("Transmisi yang digunakan berjenis "+Toyota.getTransmisi());*/
	}
}