package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {
	
	/*Main � um m�todo auto executav�l em Java*/
	public static void main(String[] args) {
		
		/*New Aluno � uma inst�ncia (Cria��o de Objetos)*/
		/*aluno1 � uma refer�ncia para o objeto aluno*/
		
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno ? ");
		String idade = JOptionPane.showInputDialog("Qual a idade do aluno ? ");
		String dataNascimento = JOptionPane.showInputDialog("Data de nascimento aluno ? ");
		String registroGeral = JOptionPane.showInputDialog("Qual o RG do aluno ? ");
		String cpf = JOptionPane.showInputDialog("Qual o CPF do aluno ? ");
		String nomeMae = JOptionPane.showInputDialog("Qual o nome M�e do aluno ? ");
		String nomePai = JOptionPane.showInputDialog("Qual o nome Pai do aluno ? ");
		String dataMatricula = JOptionPane.showInputDialog("Qual data matr�cula do aluno ? ");
		String nomeEscola = JOptionPane.showInputDialog("Qual nome escola do aluno ? ");
		String serieMatriculado = JOptionPane.showInputDialog("Qual a s�rie do aluno ? ");
		String nota1 = JOptionPane.showInputDialog("Qual a nota 1 do aluno ? ");
		String nota2 = JOptionPane.showInputDialog("Qual a nota 2 do aluno ? ");
		String nota3 = JOptionPane.showInputDialog("Qual a nota 3 do aluno ? ");
		String nota4 = JOptionPane.showInputDialog("Qual a nota 4 do aluno ? ");

		
		Aluno aluno1 = new Aluno(); /*Aqui ser� o nome aluno(Esdras)*/
		aluno1.setNome (nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(registroGeral);
		aluno1.setNumeroCpf(cpf);
		aluno1.setNomeMae(nomeMae);
		aluno1.setNomePai(nomePai);
		aluno1.setDataMatricula(dataMatricula);
		aluno1.setNomeEscola(nomeEscola);
		aluno1.setSerieMatriculado(serieMatriculado);
		aluno1.setNota1(Integer.valueOf(nota1));
		aluno1.setNota2(Integer.valueOf(nota2));
		aluno1.setNota3(Integer.valueOf(nota3));
		aluno1.setNota4(Integer.valueOf(nota4));
		
		
		System.out.println("Nome: " + aluno1.getNome());
		System.out.println("Idade: " + aluno1.getIdade());
		System.out.println("Data Nascimento: " + aluno1.getDataNascimento());
		System.out.println("Registro Geral: " + aluno1.getRegistroGeral());
		System.out.println("N�mero CPF: " + aluno1.getNumeroCpf());
		System.out.println("Nome M�e: " + aluno1.getNomeMae());
		System.out.println("Nome Pai: " + aluno1.getNomePai());
		System.out.println("Data Matr�cula: " + aluno1.getDataMatricula());
		System.out.println("Nome Faculdade: " + aluno1.getNomeEscola());
		System.out.println("S�rie Matriculado: " + aluno1.getSerieMatriculado());
		System.out.println("M�dia Aluno: " + aluno1.getMediaNota());
		System.out.println("Resultado = " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		System.out.println("Resultado 2 = " + aluno1.getAlunoAprovado2());
		

		

		System.out.println("======================================");

		Aluno aluno2 = new Aluno(); /*Aqui ser� o Arnoud*/
		aluno2.setNome ("Arnoud Pinheiro Alves");
		aluno2.setIdade(32);
		aluno2.setDataNascimento("02/07/1989");
		aluno2.setRegistroGeral("123.456.1");
		aluno2.setNumeroCpf("333.444.555-66");
		aluno2.setNomeMae("Claudia costa Pinheiro");
		aluno2.setNomePai("Joselito Jose Alves");
		aluno2.setDataMatricula("06/06/2022");
		aluno2.setNomeEscola("Anhanguera Educacional");
		aluno2.setSerieMatriculado("Primeiro semestre");
		aluno2.setNota1(90);
		aluno2.setNota2(80.8);
		aluno2.setNota3(70.9);
		aluno2.setNota4(90.7);
		
		System.out.println("Nome: " + aluno2.getNome());
		System.out.println("Idade: " + aluno2.getIdade());
		System.out.println("Data Nascimento: " + aluno2.getDataNascimento());
		System.out.println("Registro Geral: " + aluno2.getRegistroGeral());
		System.out.println("N�mero CPF: " + aluno2.getNumeroCpf());
		System.out.println("Nome M�e: " + aluno2.getNomeMae());
		System.out.println("Nome Pai: " + aluno2.getNomePai());
		System.out.println("Data Matr�cula: " + aluno2.getDataMatricula());
		System.out.println("Nome Faculdade: " + aluno2.getNomeEscola());
		System.out.println("S�rie Matriculado: " + aluno2.getSerieMatriculado());
		System.out.println("M�dia Aluno: " + aluno2.getMediaNota());


	}

}
