public class capitulo3_ejercicio1 {

	public static void main (String[] args) {

		int a = 6;

		if (a == 4) {
			System.out.println("variable es 4");
		}

		if (a > 5) {
			System.out.println("variable es mayor 5");
		} else {
			System.out.println("variable es menor 6");
		}

		if (a > 5) {
			System.out.println("variable es mayor 5");
		} else if (a == 5) {
			System.out.println("variable es igual 5");
		} else {
			System.out.println("variable es menor 5");
		}
		
		int matematicas = 4, lengua = 2;
		
		if(matematicas >= 5 && lengua >= 5) {
			System.out.println("mates y lengua bien");			
		}else if (matematicas <5 && lengua >=5){
			System.out.println("mates mal lengua bien");
		}else if (matematicas >=5 && lengua <5) {
			System.out.println("mates bien  lengua mal");
		}else {
			System.out.println("TODO MAL");
		}
		
	}

}
