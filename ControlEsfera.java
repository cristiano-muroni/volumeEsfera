package volumesfera;

import java.util.Locale;
import java.util.Scanner;

public class ControlEsfera {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Volume volume = new Volume();
		double volumeR = 0;
		

		System.out.println("entre com o valor do raio");
		volume.esfera.setRaio(Double.parseDouble(sc.nextLine()));
		System.out.println(volume.Calculo(volumeR));

		sc.close();

	}

}

