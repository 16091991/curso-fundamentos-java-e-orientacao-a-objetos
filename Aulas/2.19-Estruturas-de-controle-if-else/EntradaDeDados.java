import java.util.Scanner;

public class EntradaDeDados{
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Nome: ");
		String nome = entrada.next();
		
		System.out.println("Peso: ");
		int peso= entrada.nextInt();
		
		System.out.println("Altura: ");
		double altura = entrada.nextDouble();
		
		double imc = peso / (altura * altura);
		System.out.println("IMC de "+ nome + " "+ imc);
		if(imc < 18.5){
			System.out.println("Abaixo do peso ideal");
		}else if(imc < 25){
			System.out.println("Peso ideal ");
		}else if (imc < 30){
			System.out.println("Acima do Peso ");
		}else{
		  System.out.println("Obeso");
   		}
		
	}
}