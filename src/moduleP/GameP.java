

import modelo.Tabuleiro;
import visao.TabuleiroConsole;
import gameShared.Game;

public class GameP implements Game {
	public static void main(String[] args) {

		Tabuleiro tabuleiro = new Tabuleiro(6, 6, 6);
		new TabuleiroConsole(tabuleiro);
	}
}
