package curso.java.treinamento;

public class OperLogicas2 {

	public static void main(String[] args) {

		int nota1 = 10;
		int nota2 = 60;
		int nota3 = 10;
		int nota4 = 10;
		int media = 0;

		media = (nota1 + nota2 + nota3 + nota4) / 4;

		if (media >= 70) {
			System.out.println("Aluno aprovado: " + media);

		}
		if (media >= 40 && media <= 69) {
			System.out.println("Aluno em recupera��o: " + media);
		} else {
			System.out.println("Aluno reprovado: " + media);
		}
		/* Operadores tern�rios s�o para micro valida��es*/
		
		String saidaResultado;
		
		saidaResultado = media >= 70 ? "aprovado" : (media >= 40 && media <= 69) ? "Aluno em recupera��o" : "Aluno Reprovado";
		System.out.println (saidaResultado);
		
		
		
	}

}
