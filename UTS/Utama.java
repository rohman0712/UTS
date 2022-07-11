import mesin.Mesin;
import kendaraan.Mobil;
import kendaraan.SepedaMotor;
public class Utama
{
	public static void main(String args[])
	{
		SepedaMotor Ninja = new SepedaMotor();
		Mesin mesinNinja = new Mesin();
		mesinNinja.jumlah_silinder = 4;
		mesinNinja.kapasitas_silinder = "249,8 cc";
		mesinNinja.langkah = 31.8f;
		Ninja.setNama("Kawasaki bertipe Liquid cooled, 16-valve DOHC");
		Ninja.setMesin(mesinNinja);

		Ninja.setMesin(mesinNinja);
		Ninja.setBahan_bakar("Bensin (disarankan RON <92)");
		Ninja.setTransmisi("Manual, 6 percepatan");

		System.out.println("Motor ini bernama "+Ninja.getNama());
		System.out.println("Menggunakan silinder berjumlah "+Ninja.getMesin().jumlah_silinder+" silinder");
		System.out.println("Memiliki kapasitas silinder "+Ninja.getMesin().kapasitas_silinder);
		System.out.println("menggunakan piston berukuran 50 mm dengan langkah piston "+Ninja.getMesin().langkah+" mm");
		System.out.println("Mengkonsumsi bahan bakar berjenis "+Ninja.getBahan_bakar());
		System.out.println("Transmisi yang digunakan berjenis "+Ninja.getTransmisi());
		
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