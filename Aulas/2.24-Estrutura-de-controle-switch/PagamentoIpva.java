import java.util.Scanner;

public class PagamentoIpva{
	public static void main(String[]args){
		Scanner entrada = new Scanner(System.in);	
	
		System.out.println("Digite o final da placa: ");
		int finalPlaca = entrada.nextInt();
		
		// avalia a expressão
		switch(finalPlaca){
			case 1: 
				System.out.println("Vencimento dia 11 de Janeiro"); 
				break;
			case 2: 
				System.out.println("Vencimento dia 12 de Janeiro");
				break;
			default:
				System.out.println("Vencimento sem data");
		}
	}
}