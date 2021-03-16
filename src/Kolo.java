
public class Kolo extends Figura {
	private double r;
	public Kolo(double r) {
		this.r=r;
		setRodzaj("koło");
	}

	@Override
	public double getPole() {
		return Math.PI*Math.pow(r, 2);
	}

	@Override
	public double getObwod() {
		return 2*Math.PI*r;
	}

	@Override
	protected String getOpis() {
		return ", promien="+r;
	}
}
