import java.util.Scanner;
public class bask{
	public static void main (String[] args){
		int a, b, c ;
		double resultadoMais, resultadoMenos, delta;
		Scanner lTcl = new Scanner(System.in);
		System.out.println("Informe os elementos da formua de Bhaskara: a, b, c");
		a = lTcl.nextInt();
		b = lTcl.nextInt();
		c = lTcl.nextInt();
		delta = (b * b) - ( 4 * (a * c));

		if (delta < 0){
			System.out.println("Nao existe raiz de numero negativo, delta e: " + delta);
		} else {
			resultadoMais = (-b + (int)Math.sqrt(delta)) / (2*a);
			resultadoMenos = (-b - (int)Math.sqrt(delta)) / (2*a);

		System.out.println(resultadoMais);
		System.out.println(resultadoMenos);
		}
	}
}