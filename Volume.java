package volumesfera;

public class Volume {

	private double raio;
	Esfera esfera = new Esfera(raio);

	public double Calculo(double volumeR) {

		double div = 4 / 3;
		volumeR = div *  Math.pow(esfera.getRaio(), 3) * Math.PI;
		return volumeR;
	}

}
