package Default;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.List;
import java.util.Scanner;

import javax.swing.JPanel;

public class Frame extends JPanel implements ActionListener, KeyListener  {
	private static String[][] board;
	private static int turn;
	private static boolean redWon;
	private static boolean yellowWon;
    private static boolean Ai = false;
	
	public static void main(String[] args) {
		if (args.length == 0) {
			Ai = false;
		}
		else if (args[0].equals("Ai")) {
			Ai = true;
		}
		Frame f = new Frame();
		
		while (redWon == false && yellowWon == false && turn <= 42) {
			System.out.println("Turn " + turn + "!");
			System.out.println(f);
			didYellowWin();
	        if (yellowWon) {
	        	System.out.println("X wins!");
	        	break;
	        }
	        didRedWin();
	        if (redWon) {
	        	System.out.println("O wins!");
	        	break;
	        }
			if (turn % 2 != 0) {
				Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter your input: ");
		        String userInput = scanner.nextLine();
		       
		        if (userInput.equals("1")) {
		        	for (int i = board.length-1; i > 0; i--) {
						if (board[i][1].equals(".")) {
							board[i][1] = "X";
							break;
						}
					}
		        }
		        if (userInput.equals("2")) {
		        	for (int i = board.length-1; i > 0; i--) {
						if (board[i][2].equals(".")) {
							board[i][2] = "X";
							break;
						}
					}
		        }
		        if (userInput.equals("3")) {
		        	for (int i = board.length-1; i > 0; i--) {
						if (board[i][3].equals(".")) {
							board[i][3] = "X";
							break;
						}
					}
		        }
		        if (userInput.equals("4")) {
		        	for (int i = board.length-1; i > 0; i--) {
						if (board[i][4].equals(".")) {
							board[i][4] = "X";
							break;
						}
					}
		        }
		        if (userInput.equals("5")) {
		        	for (int i = board.length-1; i > 0; i--) {
						if (board[i][5].equals(".")) {
							board[i][5] = "X";
							break;
						}
					}
		        }
		        if (userInput.equals("6")) {
		        	for (int i = board.length-1; i > 0; i--) {
						if (board[i][6].equals(".")) {
							board[i][6] = "X";
							break;
						}
					}
		        }
		        if (userInput.equals("7")) {
		        	for (int i = board.length-1; i > 0; i--) {
						if (board[i][7].equals(".")) {
							board[i][7] = "X";
							break;
						}
					}
		        }
				turn++;
			}
			else {
				String userInput = "";
				if (Ai == false) {
					Scanner scanner = new Scanner(System.in);
			        System.out.print("Enter your input: ");
			        userInput = scanner.nextLine();
				}
				else {
					userInput = ((int)(Math.random()*8))+"";
				}
				
		        if (userInput.equals("1")) {
		        	for (int i = board.length-1; i > 0; i--) {
						if (board[i][1].equals(".")) {
							board[i][1] = "O";
							break;
						}
					}
		        }
		        if (userInput.equals("2")) {
		        	for (int i = board.length-1; i > 0; i--) {
						if (board[i][2].equals(".")) {
							board[i][2] = "O";
							break;
						}
					}
		        }
		        if (userInput.equals("3")) {
		        	for (int i = board.length-1; i > 0; i--) {
						if (board[i][3].equals(".")) {
							board[i][3] = "O";
							break;
						}
					}
		        }
		        if (userInput.equals("4")) {
		        	for (int i = board.length-1; i > 0; i--) {
						if (board[i][4].equals(".")) {
							board[i][4] = "O";
							break;
						}
					}
		        }
		        if (userInput.equals("5")) {
		        	for (int i = board.length-1; i > 0; i--) {
						if (board[i][5].equals(".")) {
							board[i][5] = "O";
							break;
						}
					}
		        }
		        if (userInput.equals("6")) {
		        	for (int i = board.length-1; i > 0; i--) {
						if (board[i][6].equals(".")) {
							board[i][6] = "O";
							break;
						}
					}
		        }
		        if (userInput.equals("7")) {
		        	for (int i = board.length-1; i > 0; i--) {
						if (board[i][7].equals(".")) {
							board[i][7] = "O";
							break;
						}
					}
		        }
		        
		        
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
		for (int i = 1; i < board.length-5; i++) {
			for (int j = 1; j < board[0].length-5; j++) {
				if (board[i][j].equals("O")) {
					if (board[i+1][j].equals("O")&&board[i+2][j].equals("O")&&board[i+3][j].equals("O")) {
						redWon = true;
					}
					if (board[i][j+1].equals("O")&&board[i][j+2].equals("O")&&board[i][j+3].equals("O")) {
						redWon = true;
					}
					if (board[i-1][j-1].equals("O")&&board[i-2][j-2].equals("O")&&board[i-3][j-3].equals("O")) {
						redWon = true;
					}
					if (board[i-1][j+1].equals("O")&&board[i-2][j+2].equals("O")&&board[i-3][j+3].equals("O")) {
						redWon = true;
					}
				}
			}
		}
	}
	public static void didYellowWin() {
		for (int i = 1; i < board.length-5; i++) {
			for (int j = 1; j < board[0].length-5; j++) {
				if (board[i][j].equals("X")) {
					if (board[i+1][j].equals("X")&&board[i+2][j].equals("X")&&board[i+3][j].equals("X")) {
						yellowWon = true;
					}
					if (board[i][j+1].equals("X")&&board[i][j+2].equals("X")&&board[i][j+3].equals("X")) {
						yellowWon = true;
					}
					if (board[i-1][j-1].equals("X")&&board[i-2][j-2].equals("X")&&board[i-3][j-3].equals("X")) {
						yellowWon = true;
					}
					if (board[i-1][j+1].equals("X")&&board[i-2][j+2].equals("X")&&board[i-3][j+3].equals("X")) {
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
			for (int i = board.length; i > 0; i--) {
				if (board[i][1].equals(".")) {
					
					break;
				}
			}
		}
		
//		int keyCode = e.getKeyCode();
//
//        
//		if (keyCode == KeyEvent.VK_1) {
//            boolean exists = false;
//            for (String col : redCoinCol) {
//                if (col.equals("1")) {
//                    exists = true;
//                    break;
//                }
//            }
//
//            if (!exists) {
//                redCoinCol.add("1");
//                if (turn % 2 != 0) {
//                    board[7][1] = "X";
//                } else {
//                    board[7][1] = "O";
//                }
//            }
//        } else if (keyCode == KeyEvent.VK_2) {
//            boolean exists = false;
//            for (String col : redCoinCol) {
//                if (col.equals("2")) {
//                    exists = true;
//                    break;
//                }
//            }
//
//            if (!exists) {
//                redCoinCol.add("2");
//                if (turn % 2 != 0) {
//                    board[7][2] = "X";
//                } else {
//                    board[7][2] = "O";
//                }
//                turn++;
//            }
//        } else if (keyCode == KeyEvent.VK_3) {
//            boolean exists = false;
//            for (String col : redCoinCol) {
//                if (col.equals("3")) {
//                    exists = true;
//                    break;
//                }
//            }
//
//            if (!exists) {
//                redCoinCol.add("3");
//                if (turn % 2 != 0) {
//                    board[7][3] = "X";
//                } else {
//                    board[7][3] = "O";
//                }
//                turn++;
//            }
//        } else if (keyCode == KeyEvent.VK_4) {
//            boolean exists = false;
//            for (String col : redCoinCol) {
//                if (col.equals("4")) {
//                    exists = true;
//                    break;
//                }
//            }
//
//            if (!exists) {
//                redCoinCol.add("4");
//                if (turn % 2 != 0) {
//                    board[7][4] = "X";
//                } else {
//                    board[7][4] = "O";
//                }
//                turn++;
//            }
//        } else if (keyCode == KeyEvent.VK_5) {
//            boolean exists = false;
//            for (String col : redCoinCol) {
//                if (col.equals("5")) {
//                    exists = true;
//                    break;
//                }
//            }
//
//            if (!exists) {
//                redCoinCol.add("5");
//                if (turn % 2 != 0) {
//                    board[7][5] = "X";
//                } else {
//                    board[7][5] = "O";
//                }
//                turn++;
//            }
//        } else if (keyCode == KeyEvent.VK_6) {
//            boolean exists = false;
//            for (String col : redCoinCol) {
//                if (col.equals("6")) {
//                    exists = true;
//                    break;
//                }
//            }
//
//            if (!exists) {
//                redCoinCol.add("6");
//                if (turn % 2 != 0) {
//                    board[7][6] = "X";
//                } else {
//                    board[7][6] = "O";
//                }
//                turn++;
//            }
//        } else if (keyCode == KeyEvent.VK_7) {
//            boolean exists = false;
//            for (String col : redCoinCol) {
//                if (col.equals("7")) {
//                    exists = true;
//                    break;
//                }
//            }
//
//            if (!exists) {
//                redCoinCol.add("7");
//                if (turn % 2 != 0) {
//                    board[7][7] = "X";
//                } else {
//                    board[7][7] = "O";
//                }
//                turn++;
//            }
//        }
//
//        System.out.println(this);
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
