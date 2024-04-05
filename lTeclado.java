import java.util.Scanner;
public class lTeclado {
	public static void main(String [] args) {
		Scanner lTcl = new Scanner(System.in);
		String str;
		System.out.println("Digite seu nome:");
		str = lTcl.nextLine();
		System.out.println("Bem vindo" + str);
		lTcl.close(); //Fechar entrada de dados
	}
}