package aplicacao;

//java Program to create a simple JPanel add components to it
import java.awt.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;

import modelo.Serialize;
//A sub class is created b extending JFrame
class GameX extends JFrame {
	
	private String nickNameRecorde;
	private String nickNameMenorPontuacao;
	private int qtdChamadaConsole;
	private int recorde;
	private int menorPontuacao;
	private List<String> nickNames = new ArrayList<String>();
//creates a JFrame
static JFrame fr;
//creates JButton
static JButton bt, bt1, bt2;
//creates JLabel that helps in displaying the text
static JLabel lb;
//main class
public static void main(String[] args)
{
//A new frame is created to store buttons
fr= new JFrame("Panel");
//Label to display text is created
String filename = "../modelo/dadosPontuacao.ser";

Serialize object1 = null;

// Deserialization
try
{
	// Reading the object from a file
	FileInputStream file = new FileInputStream(filename);
	ObjectInputStream in = new ObjectInputStream(file);
	
	// Method for deserialization of object
	try {
		object1 = (Serialize)in.readObject();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	in.close();
	file.close();
	String nickNameMenorPontuacao = object1.nickNameMenorPontuacao;
	String nickNameRecorde = object1.nickNameRecorde;
	int qtdChamadaConsole = object1.qtdChamadaConsole;
	int recorde = object1.recorde;
	int menorPontuacao = object1.menorPontuacao;
	List<String> nickNames = object1.nickNames;

	lb= new JLabel("Recorde: " + nickNameRecorde + " " + recorde);
	//new buttons are created
	bt = new JButton("Jogar");
	//Panel to add buttons is created
	JPanel p = new JPanel();
	//Add buttons and text field to panel
	p.add(bt);
	p.add(lb);
	//set the background color of panel
	p.setBackground(Color.DARK_GRAY);
	//add panel to frame
	fr.add(p);
	//set the size of frame
	fr.setSize(500, 480);
	fr.show();
}

catch(IOException ex)
{
	System.out.println("IOException is caught");
}
	}
}