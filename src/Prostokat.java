
public class Prostokat extends Figura{
	private double szer, wys;

	public Prostokat(double szer, double wys) {
		this.szer = szer;
		this.wys = wys;
		setRodzaj("prostokąt");
	}

	public double getSzer() {
		return szer;
	}

	public double getWys() {
		return wys;
	}
	
	public double getPole() {
		return szer*wys;
	}
	
	public double getObwod() {
		return 2*(wys+szer);
	}

	@Override
	protected String getOpis() {
		return ", szer="+szer+", wys="+wys;
	}
}
