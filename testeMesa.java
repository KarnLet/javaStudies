import java.util.Scanner;
public class testeMesa{
	public static void main(String[] args){
		Scanner lTcl = new Scanner(System.in);
		int x,y;
		System.out.println("Digite os valores de: x e y:");
		x = lTcl.nextInt();
		y = lTcl.nextInt();
		x = y + 1;
		y = x + 5;
		System.out.println("x = " +(x + 1));
		System.out.println("y = " +(y + 3));
	}
}