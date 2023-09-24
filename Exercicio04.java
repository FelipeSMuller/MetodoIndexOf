package MetodosDeString;

import javax.swing.JOptionPane;

public class Exercicio04 {

	public static void main(String[] args) {

		String buscaCaractere;

		char caractere = 'a';

		do {

			buscaCaractere = JOptionPane.showInputDialog(null,

					"Digite uma frase, o programa irá fazer uma busca específica");

			if (buscaCaractere == null) {

				JOptionPane.showMessageDialog(null, " Você não preencheu o campo corretamente");

			} else {

				JOptionPane.showMessageDialog(null, "Frase antes da modificação : " + buscaCaractere);

				buscaCaractere = buscaCaractere.toLowerCase();

				JOptionPane.showMessageDialog(null, "Frase depois da modificação : " + buscaCaractere);

				int indice = buscaCaractere.indexOf(caractere);

				JOptionPane.showMessageDialog(null, "A primeira ocorrência do caractere selecionado : " + "\n"
						+ caractere + "\nestá no índice : " + indice);

			}

		} while (buscaCaractere != null);

	}

}
