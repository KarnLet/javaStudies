import java.util.Scanner;
public class maiorMenor{
	public static void main(String[] args){
		Scanner lTcl = new Scanner(System.in);
		int num1, num2;
		System.out.println("Informe dois numeros:");
		num1 = lTcl.nextInt();
		num2 = lTcl.nextInt();
		if(num1 > num2){
			System.out.println(num1 + " e maior que " + num2);
		} else if (num1 < num2){
			System.out.println(num2 + " e maior que " + num1);
		} else{
			System.out.println(num1 + " e igual a " + num2);
		}
	}
}