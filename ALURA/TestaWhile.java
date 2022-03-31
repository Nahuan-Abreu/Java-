
public class TestaWhile {
	public static void main(String[] args) {
		int contador = 0;
		while(contador <= 10) {
			System.out.println(contador);
			//contador ++; apenas +1
			//contador =contador + 1 
			contador += 1;// podemos mudar para +2, 3 etc
		}
		System.out.println(contador);
	}
}
