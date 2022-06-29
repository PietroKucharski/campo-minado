package moduleP;

import modelo.Tabuleiro;
import visao.TabuleiroConsole;

import javax.swing.JPanel;

import gameShared.Game;
import gameShared.Player;

public class GameP implements Game {
	public static void main(String[] args) {

		Tabuleiro tabuleiro = new Tabuleiro(6, 6, 6);
		new TabuleiroConsole(tabuleiro);
		
	}

	@Override
	public int getActivations() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Player getBestPlayer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getBestPlayerPoints() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getHowManyPlayers() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JPanel getPanel() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Player getWorstPlayer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getWorstPlayerPoints() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void start(Player p) {
		Tabuleiro tabuleiro = new Tabuleiro(6, 6, 6);
		new TabuleiroConsole(tabuleiro);
		
	}
}
