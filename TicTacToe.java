import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class TicTacToeGui extends JFrame implements ActionListener {
	// adds images
	ImageIcon player1X = new ImageIcon(
			"/Users/jakeburns/Documents/Java Coding/Weber Tic Tac Toe/src/x.png");
	ImageIcon player1O = new ImageIcon(
			"/Users/jakeburns/Documents/Java Coding/Weber Tic Tac Toe/src/circle4.png");

	private JPanel panel;
	public JButton[] button;
	int width = 153;
	int height = 153;
	int runOrNot = 0;
	int amountXWins, amountOWins, numberTies, numberUntilWinINT = 0;
	String numberUntilWin;

	public TicTacToeGui() {

		setTitle("Tic Tac Toe");
		setSize(463, 475);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		buildPanel();
		add(panel);
		panel.setLayout(new GridLayout(3, 3));
		setVisible(true);
		for (int j = 0; j <= 8; j++) { // adds action listener for all buttons
			button[j].addActionListener(this);
		}
	}

	private void buildPanel() {

		button = new JButton[9];
		panel = new JPanel();

		for (int i = 0; i <= 8; i++) { // Initiates all buttons
			button[i] = new JButton();
			panel.add(button[i]);
		}
		// setting single or multiplayer
		// button[0].setText("Click for player one");
		// button[1].setText("Click for player two.");

		int askNumberUntilWin = JOptionPane.showConfirmDialog(null,
				"Set number of wins needed to win?");
		if (askNumberUntilWin == JOptionPane.CANCEL_OPTION) {
			return;
		}
		if (askNumberUntilWin == JOptionPane.NO_OPTION) {

		}
		if (askNumberUntilWin == JOptionPane.YES_OPTION) {
			numberUntilWin = JOptionPane
					.showInputDialog("Enter number of max wins.");
			numberUntilWinINT = Integer.parseInt(numberUntilWin);
			System.out.println(numberUntilWin);
		}

		String XAndOColor = JOptionPane
				.showInputDialog("Enter 1 - Blue, 2 - red, 3 - green, 4 - yellow, 5 - pink, or press ok for default (black).");
		if (XAndOColor.equalsIgnoreCase("1")) {
			player1X = new ImageIcon(
					"/Users/jakeburns/Documents/Java Coding/Weber Tic Tac Toe/src/blueX2.jpeg");
		}

		if (XAndOColor.equalsIgnoreCase("2")) {
			player1X = new ImageIcon(
					"/Users/jakeburns/Documents/Java Coding/Weber Tic Tac Toe/src/redX.png");
		}
		if (XAndOColor.equalsIgnoreCase("3")) {
			player1X = new ImageIcon(
					"/Users/jakeburns/Documents/Java Coding/Weber Tic Tac Toe/src/greenX.png");
		}
		if (XAndOColor.equalsIgnoreCase("4")) {
			player1X = new ImageIcon(
					"/Users/jakeburns/Documents/Java Coding/Weber Tic Tac Toe/src/yellowX.png");
		}
		if (XAndOColor.equalsIgnoreCase("5")) {
			player1X = new ImageIcon(
					"/Users/jakeburns/Documents/Java Coding/Weber Tic Tac Toe/src/pinkX.png");
		}

	}

	void checkForWinnerO() {

		if (button[0].getIcon() != null && button[1].getIcon() != null
				&& button[2].getIcon() != null) {
			if (button[0].getIcon().equals(player1O)
					&& button[1].getIcon().equals(player1O)
					&& button[2].getIcon().equals(player1O)) {
				JOptionPane.showMessageDialog(null, "O wins!");
				runOrNot++;

				for (int j = 0; j <= 8; j++) {
					button[j].setEnabled(false);
				}
				amountOWins++;
				askToRestart();

			}
		}

		if (button[3].getIcon() != null && button[0].getIcon() != null
				&& button[6].getIcon() != null) {
			if (button[3].getIcon().equals(player1O)
					&& button[0].getIcon().equals(player1O)
					&& button[6].getIcon().equals(player1O)) {
				JOptionPane.showMessageDialog(null, "O wins!..");
				runOrNot++;
				for (int j = 0; j <= 8; j++) {
					button[j].setEnabled(false);
				}
				amountOWins++;
				askToRestart();

			}
		}
		if (button[4].getIcon() != null && button[0].getIcon() != null
				&& button[8].getIcon() != null) {
			if (button[0].getIcon().equals(player1O)
					&& button[4].getIcon().equals(player1O)
					&& button[8].getIcon().equals(player1O)) {
				JOptionPane.showMessageDialog(null, "O wins!.");
				runOrNot++;
				for (int j = 0; j <= 8; j++) {
					button[j].setEnabled(false);
				}
				amountOWins++;
				askToRestart();

			}
		}
		if (button[1].getIcon() != null && button[4].getIcon() != null
				&& button[7].getIcon() != null) {
			if (button[1].getIcon().equals(player1O)
					&& button[4].getIcon().equals(player1O)
					&& button[7].getIcon().equals(player1O)) {
				JOptionPane.showMessageDialog(null, "O wins!");
				runOrNot++;
				for (int j = 0; j <= 8; j++) {
					button[j].setEnabled(false);
				}
				amountOWins++;
				askToRestart();
			}
		}
		if (button[2].getIcon() != null && button[5].getIcon() != null
				&& button[8].getIcon() != null) {
			if (button[2].getIcon().equals(player1O)
					&& button[5].getIcon().equals(player1O)
					&& button[8].getIcon().equals(player1O)) {
				JOptionPane.showMessageDialog(null, "O wins!");
				runOrNot++;
				for (int j = 0; j <= 8; j++) {
					button[j].setEnabled(false);
				}
				amountOWins++;
				askToRestart();

			}
		}
		if (button[2].getIcon() != null && button[4].getIcon() != null
				&& button[6].getIcon() != null) {
			if (button[2].getIcon().equals(player1O)
					&& button[4].getIcon().equals(player1O)
					&& button[6].getIcon().equals(player1O)) {
				JOptionPane.showMessageDialog(null, "O wins!");
				runOrNot++;

				for (int j = 0; j <= 8; j++) {
					button[j].setEnabled(false);
				}
				amountOWins++;
				askToRestart();

			}
		}
		if (button[3].getIcon() != null && button[4].getIcon() != null
				&& button[5].getIcon() != null) {
			if (button[3].getIcon().equals(player1O)
					&& button[4].getIcon().equals(player1O)
					&& button[5].getIcon().equals(player1O)) {
				JOptionPane.showMessageDialog(null, "O wins!");
				runOrNot++;
				for (int j = 0; j <= 8; j++) {
					button[j].setEnabled(false);
				}
				amountOWins++;
				askToRestart();

			}
		}
		if (button[6].getIcon() != null && button[7].getIcon() != null
				&& button[8].getIcon() != null) {
			if (button[6].getIcon().equals(player1O)
					&& button[7].getIcon().equals(player1O)
					&& button[8].getIcon().equals(player1O)) {
				JOptionPane.showMessageDialog(null, "O wins!");
				runOrNot++;
				for (int j = 0; j <= 8; j++) {
					button[j].setEnabled(false);
				}
				amountOWins++;
				askToRestart();

			}
		}
	}

	void checkForWinnerX() {
		if (button[1].getIcon() != null && button[0].getIcon() != null
				&& button[2].getIcon() != null) {
			if (button[1].getIcon().equals(player1X)
					&& button[0].getIcon().equals(player1X)
					&& button[2].getIcon().equals(player1X)) {
				JOptionPane.showMessageDialog(null, "X wins!");

				runOrNot++;

				for (int j = 0; j <= 8; j++) {
					button[j].setEnabled(false);
				}
				amountXWins++;
				askToRestart();

			}
		}

		if (button[3].getIcon() != null && button[0].getIcon() != null
				&& button[6].getIcon() != null) {
			if (button[3].getIcon().equals(player1X)
					&& button[0].getIcon().equals(player1X)
					&& button[6].getIcon().equals(player1X)) {
				JOptionPane.showMessageDialog(null, "X wins!");
				runOrNot++;

				for (int j = 0; j <= 8; j++) {
					button[j].setEnabled(false);
				}
				amountXWins++;
				askToRestart();

			}
		}
		if (button[4].getIcon() != null && button[0].getIcon() != null
				&& button[8].getIcon() != null) {
			if (button[0].getIcon().equals(player1X)
					&& button[4].getIcon().equals(player1X)
					&& button[8].getIcon().equals(player1X)) {
				JOptionPane.showMessageDialog(null, "X wins!");
				runOrNot++;

				for (int j = 0; j <= 8; j++) {
					button[j].setEnabled(false);
				}
				amountXWins++;
				askToRestart();

			}
		}
		if (button[1].getIcon() != null && button[4].getIcon() != null
				&& button[7].getIcon() != null) {
			if (button[1].getIcon().equals(player1X)
					&& button[4].getIcon().equals(player1X)
					&& button[7].getIcon().equals(player1X)) {
				JOptionPane.showMessageDialog(null, "X wins!");
				runOrNot++;

				for (int j = 0; j <= 8; j++) {
					button[j].setEnabled(false);
				}
				amountXWins++;
				askToRestart();

			}
		}
		if (button[2].getIcon() != null && button[5].getIcon() != null
				&& button[8].getIcon() != null) {
			if (button[2].getIcon().equals(player1X)
					&& button[5].getIcon().equals(player1X)
					&& button[8].getIcon().equals(player1X)) {
				JOptionPane.showMessageDialog(null, "X wins!");
				runOrNot++;

				for (int j = 0; j <= 8; j++) {
					button[j].setEnabled(false);
				}
				amountXWins++;
				askToRestart();

			}
		}
		if (button[2].getIcon() != null && button[4].getIcon() != null
				&& button[6].getIcon() != null) {
			if (button[2].getIcon().equals(player1X)
					&& button[4].getIcon().equals(player1X)
					&& button[6].getIcon().equals(player1X)) {
				JOptionPane.showMessageDialog(null, "X wins!");
				runOrNot++;
				for (int j = 0; j <= 8; j++) {
					button[j].setEnabled(false);
				}
				amountXWins++;
				askToRestart();

			}
		}
		if (button[3].getIcon() != null && button[4].getIcon() != null
				&& button[5].getIcon() != null) {
			if (button[3].getIcon().equals(player1X)
					&& button[4].getIcon().equals(player1X)
					&& button[5].getIcon().equals(player1X)) {
				JOptionPane.showMessageDialog(null, "X wins!");
				runOrNot++;
				for (int j = 0; j <= 8; j++) {
					button[j].setEnabled(false);
				}
				amountXWins++;
				askToRestart();

			}
		}
		if (button[6].getIcon() != null && button[7].getIcon() != null
				&& button[8].getIcon() != null) {
			if (button[6].getIcon().equals(player1X)
					&& button[7].getIcon().equals(player1X)
					&& button[8].getIcon().equals(player1X)) {
				JOptionPane.showMessageDialog(null, "X wins!");
				runOrNot++;
				for (int j = 0; j <= 8; j++) {
					button[j].setEnabled(false);
				}
				amountXWins++;
				askToRestart();

			}
		}
	}

	void RestartGame() { // reset all icons pictures and make them clickable
		for (int j = 0; j <= 8; j++) {
			button[j].setIcon(null);
			button[j].setEnabled(true);

		}
		playerTurn = 0;
	}

	void askToRestart() {
		if ((amountXWins | amountOWins) != 0) {
			displayWins();
		}
		int restart = JOptionPane.showConfirmDialog(null, "Restart?");
		if (restart == JOptionPane.OK_OPTION) {
			RestartGame();
		}
		if (restart == JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null, "Program terminated.");
			System.exit(0);
			return;
		}
	}

	void displayWins() {
		if (numberUntilWinINT != 0) {
			if ((amountXWins | amountOWins) == numberUntilWinINT) {
				if (amountXWins == numberUntilWinINT) {
					JOptionPane.showMessageDialog(null, "X wins match with "
							+ amountXWins + " wins! O only had " + amountOWins
							+ " wins!");
					System.exit(0);
				} else if (amountOWins == numberUntilWinINT) {
					JOptionPane.showMessageDialog(null, "O wins match with "
							+ amountOWins + " wins! X only had " + amountXWins
							+ " wins!");
					System.exit(0);
				}
			}
		}

		JOptionPane.showMessageDialog(null, "X has " + amountXWins
				+ " wins. O has " + amountOWins + " wins. There are "
				+ numberTies + " ties.");

	}

	int playerTurn = 0;

	int ran = 0;

	int runThis = 0;

	int clicked = 0;

	public void actionPerformed(ActionEvent e) {

		for (int clicked = 0; clicked <= 8; clicked++) {

			if (button[clicked] == e.getSource()) { // check which button was //

				if (playerTurn % 2 == 0) { // when it is x's turn
					button[clicked].setIcon(player1X);
					button[clicked].setEnabled(false);
					button[clicked].setDisabledIcon(player1X);
					playerTurn++;
					System.out.println(playerTurn);
					checkForWinnerO();
					checkForWinnerX();

					if (playerTurn > 8) { // checking for tie
						numberTies++;
						JOptionPane.showMessageDialog(null, "Tie!");
						displayWins();
						int restart = JOptionPane.showConfirmDialog(null,
								"Restart?");
						if (restart == JOptionPane.OK_OPTION) {
							RestartGame();

						}
						if (restart == JOptionPane.NO_OPTION) {
							JOptionPane.showMessageDialog(null,
									"Program terminated.");
							System.exit(0);
							return;
						}
					}

				} else {
					button[clicked].setIcon(player1O);
					button[clicked].setEnabled(false);
					button[clicked].setDisabledIcon(player1O);
					playerTurn++;
					System.out.println(playerTurn);
					checkForWinnerO();
					checkForWinnerX();

				}

			}
		}
	}

	public static void main(String[] args) {
		new TicTacToeGui();

	}
}
