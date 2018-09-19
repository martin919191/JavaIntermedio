package program;

import entities.Bird;
import entities.Plane;
import interfaces.Flyer;

public class Program {

	public static void main(String[] args) {
		Flyer f = new Plane();

		if (f instanceof Bird) {
			Bird b = (Bird) f;
			b.sing();
		}
		f.land();
	}

}
