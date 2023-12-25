package proekt_3;

import java.util.Scanner;

public class Proect_3 {

	public static void main(String[] args) {
		// jabolki-50den, krusi-60 kg, grozje - 100 den kg. //
		double smetka = 0;
		System.out.println("Vnesi sto si pazaruval vo KG : ");
		try (Scanner tastatura = new Scanner(System.in)) {
			System.out.println("Jabolki : ");
			double jabolki=tastatura.nextDouble();
			System.out.println("Krusi : ");
			double krusi=tastatura.nextDouble();
			System.out.println("Grozje : ");
			double grozje=tastatura.nextDouble();
			smetka=jabolki*50+krusi*60+grozje*100;
		}
		System.out.println("Smetkata iznesuva : "+smetka+" denari");
	}

}
