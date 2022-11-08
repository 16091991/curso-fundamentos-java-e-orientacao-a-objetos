import java.util.Scanner;

public class Escopo{
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		System.out.println("Idade:");
		int idade = entrada.nextInt();
		boolean podeDirigir = idade >= 18;
		String nomePai = "";// declara a variavel global.
		
		if(!podeDirigir){
			System.out.println("Nome do pai: ");
			nomePai = entrada.next(); // atribui o valor na variavel
		}
		System.out.println("Voce pode dirigir");
		
		if(podeDirigir){
			System.out.println("Sim, claro");
		}else{
			System.out.println("Nao, se fizer isso, seu pai" + nomePai + " vai preso");
		}
    }
 }