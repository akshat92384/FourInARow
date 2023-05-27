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
	private List<String> redCoinCol;
    private List<String> redCoinRow;
    private List<String> yellowCoinCol;
    private List<String> yellowCoinRow;
	
	public static void main(String[] args) {
		Frame f = new Frame();
		while (redWon == false && yellowWon == false && turn <= 42) {
			System.out.println("Turn " + turn + "!");
			System.out.println(redWon+" "+yellowWon);
			System.out.println(f);
			if (turn % 2 != 0) {
				Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter your input: ");
		        String userInput = scanner.nextLine();
		        if (userInput.equals("1")) {
		        	for (int i = board.length-1; i > 0; i--) {
						if (board[i][1].equals(".")) {
							board[i][1] = "Y";
							break;
						}
					}
		        }
		        if (userInput.equals("2")) {
		        	for (int i = board.length-1; i > 0; i--) {
						if (board[i][2].equals(".")) {
							board[i][2] = "Y";
							break;
						}
					}
		        }
		        if (userInput.equals("3")) {
		        	for (int i = board.length-1; i > 0; i--) {
						if (board[i][3].equals(".")) {
							board[i][3] = "Y";
							break;
						}
					}
		        }
		        if (userInput.equals("4")) {
		        	for (int i = board.length-1; i > 0; i--) {
						if (board[i][4].equals(".")) {
							board[i][4] = "Y";
							break;
						}
					}
		        }
		        if (userInput.equals("5")) {
		        	for (int i = board.length-1; i > 0; i--) {
						if (board[i][5].equals(".")) {
							board[i][5] = "Y";
							break;
						}
					}
		        }
		        if (userInput.equals("6")) {
		        	for (int i = board.length-1; i > 0; i--) {
						if (board[i][6].equals(".")) {
							board[i][6] = "Y";
							break;
						}
					}
		        }
		        if (userInput.equals("7")) {
		        	for (int i = board.length-1; i > 0; i--) {
						if (board[i][7].equals(".")) {
							board[i][7] = "Y";
							break;
						}
					}
		        }
		        didYellowWin();
		        if (yellowWon) {
		        	System.out.println("Yellow wins!");
		        	break;
		        }
				turn++;
			}
			else {
				Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter your input: ");
		        String userInput = scanner.nextLine();
		        if (userInput.equals("1")) {
		        	for (int i = board.length-1; i > 0; i--) {
						if (board[i][1].equals(".")) {
							board[i][1] = "R";
							break;
						}
					}
		        }
		        if (userInput.equals("2")) {
		        	for (int i = board.length-1; i > 0; i--) {
						if (board[i][2].equals(".")) {
							board[i][2] = "R";
							break;
						}
					}
		        }
		        if (userInput.equals("3")) {
		        	for (int i = board.length-1; i > 0; i--) {
						if (board[i][3].equals(".")) {
							board[i][3] = "R";
							break;
						}
					}
		        }
		        if (userInput.equals("4")) {
		        	for (int i = board.length-1; i > 0; i--) {
						if (board[i][4].equals(".")) {
							board[i][4] = "R";
							break;
						}
					}
		        }
		        if (userInput.equals("5")) {
		        	for (int i = board.length-1; i > 0; i--) {
						if (board[i][5].equals(".")) {
							board[i][5] = "R";
							break;
						}
					}
		        }
		        if (userInput.equals("6")) {
		        	for (int i = board.length-1; i > 0; i--) {
						if (board[i][6].equals(".")) {
							board[i][6] = "R";
							break;
						}
					}
		        }
		        if (userInput.equals("7")) {
		        	for (int i = board.length-1; i > 0; i--) {
						if (board[i][7].equals(".")) {
							board[i][7] = "R";
							break;
						}
					}
		        }
		        
		        didRedWin();
		        if (redWon) {
		        	System.out.println("Red wins!");
		        	break;
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
		for (int i = 0; i < board.length-5; i++) {
			for (int j = 0; j < board[0].length-5; j++) {
				if (board[i][j].equals("R")) {
					if (board[i+1][j].equals("R")&&board[i+2][j].equals("R")&&board[i+3][j].equals("R")) {
						redWon = true;
					}
					if (board[i][j+1].equals("R")&&board[i][j+2].equals("R")&&board[i][j+3].equals("R")) {
						redWon = true;
					}
					if (board[i+1][j+1].equals("R")&&board[i+2][j+2].equals("R")&&board[i+3][j+3].equals("R1")) {
						redWon = true;
					}
				}
			}
		}
	}
	public static void didYellowWin() {
		for (int i = 0; i < board.length-5; i++) {
			for (int j = 0; j < board[0].length-5; j++) {
				if (board[i][j].equals("Y")) {
					if (board[i+1][j].equals("Y")&&board[i+2][j].equals("Y")&&board[i+3][j].equals("Y")) {
						yellowWon = true;
					}
					if (board[i][j+1].equals("Y")&&board[i][j+2].equals("Y")&&board[i][j+3].equals("Y")) {
						yellowWon = true;
					}
					if (board[i+1][j+1].equals("Y")&&board[i+2][j+2].equals("Y")&&board[i+3][j+3].equals("Y")) {
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
	public void yellowTurn() {
		
	}
	public void redTurn() {
		
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
//                    board[7][1] = "Y";
//                } else {
//                    board[7][1] = "R";
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
//                    board[7][2] = "Y";
//                } else {
//                    board[7][2] = "R";
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
//                    board[7][3] = "Y";
//                } else {
//                    board[7][3] = "R";
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
//                    board[7][4] = "Y";
//                } else {
//                    board[7][4] = "R";
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
//                    board[7][5] = "Y";
//                } else {
//                    board[7][5] = "R";
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
//                    board[7][6] = "Y";
//                } else {
//                    board[7][6] = "R";
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
//                    board[7][7] = "Y";
//                } else {
//                    board[7][7] = "R";
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
