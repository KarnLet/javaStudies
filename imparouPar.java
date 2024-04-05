import java.util.Scanner;
public class imparouPar{
	public static void main(String[] args){
		Scanner lTcl = new Scanner(System.in);
		int num1;
		System.out.println("Informe um numero:");
		num1 = lTcl.nextInt();
		if (num1 % 2 == 0){
			System.out.println(num1 + " e par.");
		} else{
			System.out.println(num1 + " e impar.");
		}
	}
}