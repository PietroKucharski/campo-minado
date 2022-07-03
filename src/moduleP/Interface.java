package moduleP;

import java.awt.*;  
import javax.swing.*;
  
public class Interface {  
	private Tabuleiro tabuleiro;
	Interface(Tabuleiro tabuleiro) { 
	  this.tabuleiro = tabuleiro;
    	  
    	  
        JFrame f= new JFrame("campo-minado");        
        //JPanel panel = new JPanel();
        
        	//JLabel label = new JLabel("Digite seu NickName: ");
        	//label.setBounds(5, 5, 550, 400);
        	//label.setBackground(Color.black);
        	//panel.add(label);
//	        JLabel textField = new JLabel(" " + tabuleiro);
        	JTextArea textField = new JTextArea(" " + tabuleiro);
        	textField.setBounds(5, 5, 100, 115);
        	textField.setBackground(Color.gray);
        	f.add(textField);
        	f.setSize(580,400);    
        	f.setLayout(null);    
        	f.setVisible(true);   
        	f.setBackground(Color.gray);
        	/*
			JTextField textField = new JTextField("Tabuleiro");
	        textField.setBounds(5, 5, 550, 250);
	        textField.setBackground(Color.gray);
	        
			nickName = entrada.nextLine();
			this.pontuacao = 0;
			
			boolean continuar = true;

			while (continuar) {
				cicloDoJogo();

				System.out.println("Deseja jogar novamente? (S/N): ");
				String resposta = entrada.nextLine();

				if ("N".equalsIgnoreCase(resposta)) {
					continuar = false;
					System.out.println("Sua pontuacao de: " + pontuacao + " pontos");
					System.out.println("At� mais");
				} else {
					tabuleiro.reiniciar();
				}
			}

		} catch (SairException e) {
			System.out.println("Sua pontuacao de: " + pontuacao + "pontos");
			System.out.println("At� mais");
		} finally {
			entrada.close();
		}

        
        
        JTextField textField = new JTextField("Tabuleiro");
        textField.setBounds(5, 5, 550, 250);
        textField.setBackground(Color.gray);
        panel.add(textField);
        */
        }
        public static void main(String args[])  
        {  
    	Tabuleiro tabuleiro = new Tabuleiro(6, 6, 6);
    	//System.out.println(tabuleiro);
         new Interface(tabuleiro);  
        } 
    }  
      
      
      
      