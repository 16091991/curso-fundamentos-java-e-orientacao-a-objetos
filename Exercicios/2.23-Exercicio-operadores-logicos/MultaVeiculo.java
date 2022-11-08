import java.util.Scanner;

public class MultaVeiculo{
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);

		System.out.println("Tipo do veiculo (Passeio, Caminhao)");
		String tipoVeiculo = entrada.nextLine();

		System.out.println("Velocidade maxima da via");
		int velocidadeMaximaVia = entrada.nextInt();

		System.out.println("Velocidade do veiculo");
		int velocidadeVeiculo = entrada.nextInt();

		if((tipoVeiculo.equals("Passeio") && velocidadeVeiculo > velocidadeMaximaVia * 1.1) || (tipoVeiculo.equals("Caminhao") && velocidadeVeiculo > velocidadeMaximaVia * 1.05)){
			System.out.println("Multa");
		}
	}
}