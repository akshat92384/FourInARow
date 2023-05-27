package Default;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

public class Frame extends JPanel implements ActionListener, KeyListener  {
	private String[][] board;
	
	public static void main(String[] args) {
		Frame f = new Frame();
		System.out.println(f);
		
	}
	public Frame() {
		board = new String [8][9];
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				board[i][j] = ".";
			}
		}
		for(int i = 0; i < board.length; i++) {
			board[i][0] = "|";
			board[i][board.length] = "|";
		}
		for(int i = 0; i < board.length; i++) {
			board[board.length-1][i] = "-";
		}
		
		
	}
	public String toString() {
		String result = "";
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				result += board[i][j]+" ";
			}
			result +="\n";
		}
		return result;
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
