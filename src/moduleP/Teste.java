package moduleP;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Teste extends JPanel {
	private JTextField nickName;
	private JTextField Entrada;

	/**
	 * Create the panel.
	 */
	public Teste() {
		setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(Color.BLACK);
		textArea.setForeground(Color.WHITE);
		textArea.setSelectedTextColor(Color.BLACK);
		textArea.setBounds(10, 57, 481, 98);
		add(textArea);
		
		JLabel lblNewLabel = new JLabel("NickName: ");
		lblNewLabel.setBounds(20, 29, 71, 20);
		add(lblNewLabel);
		
		nickName = new JTextField();
		nickName.setBounds(74, 26, 339, 20);
		add(nickName);
		nickName.setColumns(10);
		
		JButton btnNickName = new JButton("Salvar");
		btnNickName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNickName.setBounds(412, 25, 89, 23);
		add(btnNickName);
		
		JLabel lblNewLabel_1 = new JLabel("Digite (linha, coluna): ");
		lblNewLabel_1.setBounds(20, 182, 105, 20);
		add(lblNewLabel_1);
		
		Entrada = new JTextField();
		Entrada.setBounds(125, 182, 288, 20);
		add(Entrada);
		Entrada.setColumns(10);
		
		JButton btnEntrada = new JButton("Ok");
		btnEntrada.setBounds(412, 181, 89, 23);
		add(btnEntrada);

	}
}
