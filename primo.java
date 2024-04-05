import java.util.Scanner;
public class primo {
	public static void main(String []args){
		int x,y, aux=0;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um valor");
		y = teclado.nextInt();
		for(x=2; x <= y-1; x+=1){
			if(y % x != 0) {
				aux+=1;
			}
		}
		if(aux + 2== y){
			System.out.println("Primo");
		}else{
        System.out.println("Nao e primo");
    }
	}
}