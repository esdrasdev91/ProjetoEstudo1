package cursojava.executavel;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {
	
	/*Main é um método auto executavél em Java*/
	public static void main(String[] args) {
		
		/*New Aluno é uma instância (Criação de Objetos)*/
		/*aluno1 é uma referência para o objeto aluno*/
		
		Aluno aluno1 = new Aluno(); /*Aqui será o nome aluno(Esdras)*/
		aluno1.setNome ("Esdras Pinheiro Alves");
		aluno1.setIdade(30);
		aluno1.setDataNascimento("24/08/1991");
		aluno1.setRegistroGeral("123.456.1");
		aluno1.setNumeroCpf("333.444.555-66");
		aluno1.setNomeMae("Claudia costa Pinheiro");
		aluno1.setNomePai("Joselito Jose Alves");
		aluno1.setDataMatricula("06/06/2021");
		aluno1.setNomeEscola("Anhanguera Educacional");
		aluno1.setSerieMatriculado("Segundo semestre");
		aluno1.setNota1(90);
		aluno1.setNota2(80.8);
		aluno1.setNota3(70.9);
		aluno1.setNota4(90.7);
		
		
		System.out.println("Nome: " + aluno1.getNome());
		System.out.println("Idade: " + aluno1.getIdade());
		System.out.println("Data Nascimento: " + aluno1.getDataNascimento());
		System.out.println("Registro Geral: " + aluno1.getRegistroGeral());
		System.out.println("Número CPF: " + aluno1.getNumeroCpf());
		System.out.println("Nome Mãe: " + aluno1.getNomeMae());
		System.out.println("Nome Pai: " + aluno1.getNomePai());
		System.out.println("Data Matrícula: " + aluno1.getDataMatricula());
		System.out.println("Nome Faculdade: " + aluno1.getNomeEscola());
		System.out.println("Série Matriculado: " + aluno1.getSerieMatriculado());
		System.out.println("Média Aluno: " + aluno1.getMediaNota());
		System.out.println("Resultado = " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		System.out.println("Resultado 2 = " + aluno1.getAlunoAprovado2());
		

		

		System.out.println("======================================");

		Aluno aluno2 = new Aluno(); /*Aqui será o Arnoud*/
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
		System.out.println("Número CPF: " + aluno2.getNumeroCpf());
		System.out.println("Nome Mãe: " + aluno2.getNomeMae());
		System.out.println("Nome Pai: " + aluno2.getNomePai());
		System.out.println("Data Matrícula: " + aluno2.getDataMatricula());
		System.out.println("Nome Faculdade: " + aluno2.getNomeEscola());
		System.out.println("Série Matriculado: " + aluno2.getSerieMatriculado());
		System.out.println("Média Aluno: " + aluno2.getMediaNota());


		
		
		Aluno aluno3 = new Aluno(); /*Aqui será o Alex*/

		Aluno aluno4 = new Aluno("Maria");
		
		Aluno aluno5 = new Aluno("José", 50);
		
	}

}
