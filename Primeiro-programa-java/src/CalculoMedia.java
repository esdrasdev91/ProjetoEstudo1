import javax.swing.JOptionPane;

public class CalculoMedia {
	
	public static void main (String[] args) {
		
		String nota1 = JOptionPane.showInputDialog(" Informe a nota 1: ");
		String nota2 = JOptionPane.showInputDialog(" Informe a nota 2: ");
		String nota3 = JOptionPane.showInputDialog(" Informe a nota 3: ");
		String nota4 = JOptionPane.showInputDialog(" Informe a nota 4: ");

		Double dNota1 = Double.parseDouble(nota1);
		Double dNota2 = Double.parseDouble(nota2);
		Double dNota3 = Double.parseDouble(nota3);
		Double dNota4 = Double.parseDouble(nota4);

		Double media = (dNota1 + dNota2 + dNota3 + dNota4) / 4;
		
		if (media >= 50) {
			if (media >= 70) {
				JOptionPane.showMessageDialog(null, "Aluno est� aprovado com m�dia de: " + media);
			} else {
				JOptionPane.showMessageDialog(null, "Aluno em recupera��o com m�dia de: " + media);
		} 
	} else {	JOptionPane.showMessageDialog(null, "Aluno est� Reprovado com m�dia de: " + media);

		}
		
		JOptionPane.showMessageDialog(null, "A m�dia �: " + media);

		System.out.println("Resultado da m�dia �: " + media); /*Opcional*/ 

	}
	
}
