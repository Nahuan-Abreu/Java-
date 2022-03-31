
public class TestaPontoFlutuante {
	public static void main(String[] args) {
		double salario;
		salario = 1250.70;
		System.out.println("meu salário é " + salario);
		
		double divisao = 3.14/2;
		System.out.println(divisao);
		
		int outraDivisao = 5 / 2;
		System.out.println(outraDivisao);
		//mesmo a conta dando resultado quebrado ele volta inteiro
		
		double novaTentativa = 5.0 / 2; // 5 / 2 = 2.0 <-> 5.0 / 2 = 2.5 
		System.out.println(novaTentativa);
		// ao colocar um numero com ponto flutuante na conta ele consegue executar a conta e da o resultado certo.
	}
}
