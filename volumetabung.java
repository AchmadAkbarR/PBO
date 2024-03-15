package pbo;

public class volumetabung {
	public static void main(String[]args) {
		double diameter = 5.0;
		double tinggi = 10.0;
		double jarijari = diameter / 2.0;
		double volume = Math.PI * Math.pow(jarijari, 2) * tinggi;
		
		System.out.println("Volume dengan diameter " + diameter + "dan tinggi " + tinggi + "adalah = " + volume);
	}
}
