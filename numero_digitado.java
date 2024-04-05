import java.util.Scanner;
public class lTeclado{
	public static void main(String[] args){
		Scanner lTcl = new Scanner (System.in);
		int numero;
		System.out.println("Digite um numero:");
		numero = lTcl.nextInt();
		System.out.println("Numero digitado: "+numero);
		lTcl.close();//fechar entrada de dados
	}
}