package Default;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

public class Frame extends JPanel implements ActionListener, KeyListener  {
	private static String[][] board;
	private static int turn;
	private static boolean redWon;
	private static boolean yellowWon;
	
	public static void main(String[] args) {
		Frame f = new Frame();
		while (redWon == false && yellowWon == false) {
			System.out.println("Turn " + turn + "!");
			
			System.out.println(f);
			if (turn % 2 != 0) {
				
				didYellowWin();
				
				turn++;
			}
			else {
				
				didRedWin();
				turn++;
			}
		}
		
	
		
	}
	public Frame() {
		
		board = new String [8][9];
		turn = 1;
		redWon = false;
		yellowWon = false;
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
		
		board[0][0] = " ";
		board[0][board[0].length-1] = " ";
		for (int i = 1 ; i < board[0].length-1; i ++) {
			board[0][i]= i+"";
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
	public String[][] getBoard(){
		return board;
	}
	public static boolean getRedWon() {
		return redWon;
	}
	public static boolean getYellowWon() {
		return yellowWon;
	}
	public static void didRedWin() {
		for (int i = 0; i < board.length-5; i++) {
			for (int j = 0; j < board[0].length-5; j++) {
				if (board[i][j].equals("r")) {
					if (board[i+1][j].equals("r")&&board[i+2][j].equals("r")&&board[i+3][j].equals("r")) {
						redWon = true;
					}
					if (board[i][j+1].equals("r")&&board[i][j+2].equals("r")&&board[i][j+3].equals("r")) {
						redWon = true;
					}
					if (board[i+1][j+1].equals("r")&&board[i+2][j+2].equals("r")&&board[i+3][j+3].equals("r")) {
						redWon = true;
					}
				}
			}
		}
	}
	public static void didYellowWin() {
		for (int i = 0; i < board.length-5; i++) {
			for (int j = 0; j < board[0].length-5; j++) {
				if (board[i][j].equals("y")) {
					if (board[i+1][j].equals("y")&&board[i+2][j].equals("y")&&board[i+3][j].equals("y")) {
						yellowWon = true;
					}
					if (board[i][j+1].equals("y")&&board[i][j+2].equals("y")&&board[i][j+3].equals("y")) {
						yellowWon = true;
					}
					if (board[i+1][j+1].equals("y")&&board[i+2][j+2].equals("y")&&board[i+3][j+3].equals("y")) {
						yellowWon = true;
					}
				}
			}
		}
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
		
				
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode() == 97) {
		System.out.println("1");	
		}
		if (e.getKeyCode() == 2) {
			System.out.println("1");	
		}
		if (e.getKeyCode() == 3) {
			System.out.println("1");
		}
		if (e.getKeyCode() == 4) {
			System.out.println("1");
		}
		if (e.getKeyCode() == 5) {
			System.out.println("1");
		}
		if (e.getKeyCode() == 6) {
			System.out.println("1");
		}
		if (e.getKeyCode() == 7) {
			System.out.println("1");
		}

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
