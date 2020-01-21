package Mensagem;

import javax.swing.JOptionPane;

public class MensagemEmail implements Mensagem{

	@Override
	public void enviar(String Mensagem) {

		JOptionPane.showMessageDialog(null, "E-Mail: " + Mensagem);
		
	}

}
