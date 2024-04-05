import java.util.Scanner;
public class calculadoraMedia{
	public static void main(String[] args){
		Scanner lTcl = new Scanner(System.in);
		int num1, num2;
		double  med;
		System.out.println("Digite dois numeros para calcularmos a media:");
		num1 = lTcl.nextInt();
		num2 = lTcl.nextInt();
		med = (num1 + num2) / 2;
		System.out.println("A media e: " + med);
	}
}