import java.util.Scanner;

public class conversion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double tempConv = 0;
		char carac = 'O';
		
		System.out.println("Bienvenue dans le convertisseur celsius Fahrenheit !");
		System.out.println("____________________________________________________");
		
		do {
			System.out.println("Choisissez le mode de conversion :");
			System.out.println("1 : celsius --> fahrenheit");
			System.out.println("2 : fahrenheit --> celsius");
			int choix = sc.nextInt();
			
			System.out.println("Entrez la température a convertire :");
			double temp = sc.nextDouble();
			
			if (choix == 1) 
			{
				tempConv = ((9.0/5.0)*temp)+32.0;
				System.out.println(temp +"°C correspond à : "+ arrondi(tempConv, 2) + "°F");
			} 
			else if (choix == 2) 
			{
				tempConv = ((temp-32.0)*5.0)/9.0;
				System.out.println(temp +"°F correspond à : "+ arrondi(tempConv, 2) + "°C");
			} 
			else
			{
				System.out.println("Ce choix n'existe pas...");
			}
			
			System.out.println("Voulez vous convertir une autre température ? (O/N)");
			sc.nextLine();
			String str = sc.nextLine();
			carac = str.charAt(0);
		}while(carac == 'O');
		System.out.println("Au revoir !");
	}
	
	public static double arrondi(double A, int B) {
		  return (double) ( (int) (A * Math.pow(10, B) + .5)) / Math.pow(10, B);
		}

}
