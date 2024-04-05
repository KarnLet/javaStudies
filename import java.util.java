import java.util.Scanner;
public class divisivel{
	public static void main(String[] args){
		Scanner lTcl = new Scanner(System.in);
		int num1;
		System.out.println("Informe um numero:");
		num1 = lTcl.nextInt();
		if(num1 % 11 == 0){
			System.out.println(num1 + " e divisivel por 11.");
		} else {
			System.out.println(num1 + " nao e divisivel por 11.");
		}
	}
}