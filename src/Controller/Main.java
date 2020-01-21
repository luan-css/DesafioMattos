package Controller;

import javax.swing.JOptionPane;

import Mensagem.Mensagem;
import Mensagem.MensagemFactory;
import Mensagem.MensagemSMS;

public class Main {

	public static void main(String[] args) {
		String texto = JOptionPane.showInputDialog(null);
		
		Mensagem mensagem = MensagemFactory.getMensagem(2);
		mensagem.enviar(texto);
	}

}
