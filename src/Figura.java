
public abstract class Figura {
	private String rodzaj;
	public abstract double getPole();
	public abstract double getObwod();
	protected abstract String getOpis();
	protected void setRodzaj(String rodzaj) {
		this.rodzaj=rodzaj;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return rodzaj+getOpis();
	}
}
