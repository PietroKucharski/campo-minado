package visao;

import java.io.*;

import modelo.Campo;
import modelo.Serialize;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import excessao.ExplosaoException;
import excessao.SairException;
import modelo.Tabuleiro;

public class TabuleiroConsole {

	private String nickName;
	private String nickNameRecorde;
	private String nickNameMenorPontuacao;
	private int qtdJogadaPorJogador;
	private int qtdChamadaConsole;
	private int recorde;
	private int menorPontuacao;
	private List<String> nickNames = new ArrayList<String>();
	
	private int pontuacao;
	private Tabuleiro tabuleiro;
	private Scanner entrada = new Scanner(System.in);

	public TabuleiroConsole(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;

		executarJogo();
	}

	private void executarJogo() {
		try {
			System.out.println("Digite seu NickName: ");
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

	}

	private void cicloDoJogo() {
		try {
			while (!tabuleiro.objetivoAlcancado()) {
				System.out.println(tabuleiro);
				System.out.println("Pontuação: " + this.pontuacao);
				String digitado = capturarValorDigitado("Digite (linha, coluna): ");
				Iterator<Integer> xy = Arrays.stream(digitado.split(",")).map(e -> Integer.parseInt(e.trim()))
						.iterator();
				digitado = capturarValorDigitado("1 - Abrir ou 2 - (Des)Marcar: ");
				if ("1".equals(digitado)) {
					tabuleiro.abrir(xy.next(), xy.next());
				} else if ("2".equals(digitado)) {
					tabuleiro.alternarMarcacao(xy.next(), xy.next());
				}
			}

			System.out.println(tabuleiro);
			System.out.println("Voc� ganhou!!");
			
			this.pontuacao += 100;
		} catch (ExplosaoException e) {
			System.out.println(tabuleiro);
			System.out.println("Voc� perdeu!!");
		}
		
		String filename = "dadosPontuacao.ser";
		
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
			this.nickNameMenorPontuacao = object1.nickNameMenorPontuacao;
			this.nickNameRecorde = object1.nickNameRecorde;
			this.qtdJogadaPorJogador = object1.qtdJogadaPorJogador;
			this.qtdChamadaConsole = object1.qtdChamadaConsole;
			this.recorde = object1.recorde;
			this.menorPontuacao = object1.menorPontuacao;
			this.nickNames = object1.nickNames;
		}
		
		catch(IOException ex)
		{
			System.out.println("IOException is caught");
		}
		
		if (!this.nickNames.contains(this.nickName)) {
			this.nickNames.add(this.nickName);
        }
		
		if (this.pontuacao > this.recorde) {
			this.recorde = this.pontuacao;
			this.nickNameRecorde = this.nickName;
		}
		
		if (this.pontuacao < this.menorPontuacao) {
			this.menorPontuacao = this.pontuacao;
			this.nickNameMenorPontuacao = this.nickName;
		}
		
		Serialize object = new Serialize(nickNames.size(), this.qtdChamadaConsole, this.nickNameRecorde, this.recorde, this.nickNameMenorPontuacao, this.menorPontuacao, this.nickNames);
		// Serialization
		try
		{
			//Saving of object in a file
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			// Method for serialization of object
			out.writeObject(object);
			
			out.close();
			file.close();
			
			System.out.println("Object has been serialized");

		}
		
		catch(IOException ex)
		{
			System.out.println("IOException is caught");
		}

	}

	private String capturarValorDigitado(String texto) {
		System.out.print(texto);
		String digitado = entrada.nextLine();

		if ("sair".equalsIgnoreCase(digitado)) {
			throw new SairException();
		}
		return digitado;
	}
}
