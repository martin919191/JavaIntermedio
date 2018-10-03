package ejemplosingleton;

public class Program {

	public static void main(String[] args) {
		
		//EjemploSingleton e1 = new EjemploSingleton();
		EjemploSingleton e  = EjemploSingleton.getInstance();
		e.texto = "Un texto";
		
		EjemploSingleton e2 = EjemploSingleton.getInstance();
		e2.texto = "Otro texto";
		
		System.out.println(e.texto);
		
	}

}
