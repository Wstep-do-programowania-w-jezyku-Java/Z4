import java.util.ArrayList;
import java.util.Random;

public class MainClass {
	public static final double maxszer=10, maxwys=6;
	public static void main(String[] args) {
		ArrayList<Figura> figury=new ArrayList<>();
		
		Random r=new Random();
		for(int i=0;i<5;i++) {
			double szer=r.nextDouble()*maxszer;
			double wys=r.nextDouble()*maxwys;
			Figura p=new Prostokat(szer, wys);
			
			figury.add(p);
		}
		
		for(int i=0;i<5;i++) {
			double bok=r.nextDouble()*maxszer;
			Figura p=new Kwadrat(bok);
			
			figury.add(p);
		}
		
		for(int i=0;i<5;i++) {
			double ro=r.nextDouble()*maxszer;
			Figura p=new Kolo(ro);
			
			figury.add(p);
		}
		
		for(Figura p: figury)
			System.out.println(p.toString()+", obw="+p.getObwod()+", pole="+p.getPole());
	}

}
