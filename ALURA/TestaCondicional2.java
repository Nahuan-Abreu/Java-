
public class TestaCondicional2 {

	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		int idade = 20;
		int quantidadePessoas = 3;
		
		 // o boolean so aceita, true e false, nao aceita outra coisa
		boolean acompanhado = quantidadePessoas >=2;
		
		System.out.println("Valor de acompanhado = " + acompanhado);
		// || = ou, or  | && = e, and
		if (idade >= 18 && acompanhado) { 
			System.out.println("Seja bem vindo");
		} else {
			System.out.println("Infelizmente voce nao pode entrar");
		}
	}
}