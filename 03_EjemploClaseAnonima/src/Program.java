
public class Program {
	public static void main(String[] args) {
		Object o1 = new Object();
		System.out.println(o1.toString());

		Object o2 = new Object() {
			
//			public String toString() {
//				return "Estoy adentro de una clase anónima";
//			}
		};
		System.out.println(o2);
		
		Object o3 = new Object() {
			
//			public String toString() {
//				return "Estoy adentro de una clase anónima";
//			}
		};
		System.out.println(o3);
	}
}
