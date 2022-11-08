import java.util.Scanner;

public class OperadorTernario{
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite sua idade: ");
		int idade = entrada.nextInt();
						//		_Expressao_      __verifica__    __se verdadeiro__   __se_nao__          __falso__
			String indicacao = (idade >= 18)           ?              "Adulto"            :         "Crianca/Adolescente"; 
			System.out.println(indicacao);

    }
}