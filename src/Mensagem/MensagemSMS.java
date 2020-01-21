package Mensagem;

import javax.swing.JOptionPane;

public class MensagemSMS implements Mensagem{

	@Override
	public void enviar(String Mensagem) {
		JOptionPane.showMessageDialog(null, "SMS: " + Mensagem);
 
		
	}
	
}
