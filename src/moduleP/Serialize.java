package moduleP;

import java.util.ArrayList;
import java.util.List;

public class Serialize implements java.io.Serializable
{
	public int qtdJogadaPorJogador;
	public int qtdChamadaConsole;
	public String nickNameRecorde;
	public int recorde;
	public String nickNameMenorPontuacao;
	public int menorPontuacao;
	public List<String> nickNames = new ArrayList<String>();

	// Default constructor
	public Serialize(int qtdJogadaPorJogador, int qtdChamadaConsole,String nickNameRecorde, int recorde,String nickNameMenorPontuacao, int menorPontuacao,  List<String> nickNames)
	{
		this.qtdJogadaPorJogador = qtdJogadaPorJogador;
		this.qtdChamadaConsole = qtdChamadaConsole;
		this.nickNameRecorde = nickNameRecorde;
		this.recorde = recorde;
		this.nickNameMenorPontuacao = nickNameMenorPontuacao;
		this.menorPontuacao = menorPontuacao;
		this.nickNames = nickNames;
	}
	
	

}



