package ejemplodaofactory;

public class ClaseDAODB implements InterfazDAO{
	ClaseDAODB(){
		
	}
	
	public void read(){
		System.out.println("Leyendo de la base de datos");
	}
	
	public void write(){
		System.out.println("Escribiendo en la base de datos");
	}
}
