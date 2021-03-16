
public class Kwadrat extends Prostokat {

	public Kwadrat(double bok) {
		super(bok, bok);
		setRodzaj("kwadrat");
	}
	
	@Override
	protected String getOpis() {
		return ", bok="+getSzer();
	}

}
