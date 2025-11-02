import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;

import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class ProjecTicToe {

	private JFrame frame;
	private JTextField oneCount;
	private JTextField twoCount;
	private int oneCount1 = 0;
	private int twoCount1=0;
	private String startGame="X";
	private int b1=10;
	private int b2=10;
	private int b3=10;
	private int b4=10;
	private int b5=10;
	private int b6=10;
	private int b7=10;
	private int b8=10;
	private int b9=10;
	private int i=0;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProjecTicToe window = new ProjecTicToe();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ProjecTicToe() {
		initialize();
	}
	
	private void gameWinner()
	
	//Player One
	{
	
		if(b1==1 && b2==1 &&b3==1)
		{
			JOptionPane.showMessageDialog(frame, "USER X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
		oneCount1++;
		oneCount.setText(String.valueOf(oneCount1));
		}
		
		if(b4==1 && b5==1 &&b6==1)
		{
			JOptionPane.showMessageDialog(frame, "USER X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
		oneCount1++;
		oneCount.setText(String.valueOf(oneCount1));
		}
		
		if(b7==1 && b8==1 &&b9==1)
		{
			JOptionPane.showMessageDialog(frame, "USER X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
		oneCount1++;
		oneCount.setText(String.valueOf(oneCount1));
		}
		
		if(b3==1 && b5==1 &&b7==1)
		{
			JOptionPane.showMessageDialog(frame, "USER X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
		oneCount1++;
		oneCount.setText(String.valueOf(oneCount1));
		}
		
		if(b1==1 && b5==1 &&b9==1)
		{
			JOptionPane.showMessageDialog(frame, "USER X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
		oneCount1++;
		oneCount.setText(String.valueOf(oneCount1));
		}
		
		if(b1==1 && b4==1 &&b7==1)
		{
			JOptionPane.showMessageDialog(frame, "USER X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
		oneCount1++;
		oneCount.setText(String.valueOf(oneCount1));
		}
		
		if(b2==1 && b5==1 &&b8==1)
		{
			JOptionPane.showMessageDialog(frame, "USER X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
		oneCount1++;
		oneCount.setText(String.valueOf(oneCount1));
		}
		
		if(b3==1 && b6==1 &&b9==1)
		{
			JOptionPane.showMessageDialog(frame, "USER X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
		oneCount1++;
		oneCount.setText(String.valueOf(oneCount1));
		}
		
		//Player Two
		
		if(b1==0 && b2==0 &&b3==0)
		{
			JOptionPane.showMessageDialog(frame, "USER O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
		twoCount1++;
		twoCount.setText(String.valueOf(twoCount1));
		}
		
		if(b4==0 && b5==0 &&b6==0)
		{
			JOptionPane.showMessageDialog(frame, "USER O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
		twoCount1++;
		twoCount.setText(String.valueOf(twoCount1));
		}
		
		if(b7==0 && b8==0 &&b9==0)
		{
			JOptionPane.showMessageDialog(frame, "USER O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
		twoCount1++;
		twoCount.setText(String.valueOf(twoCount1));
		}
		
		if(b3==0 && b5==0 &&b7==0)
		{
			JOptionPane.showMessageDialog(frame, "USER O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
		twoCount1++;
		twoCount.setText(String.valueOf(twoCount1));
		}
		
		if(b1==0 && b5==0 &&b9==0)
		{
			JOptionPane.showMessageDialog(frame, "USER O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
		twoCount1++;
		twoCount.setText(String.valueOf(twoCount1));
		}
		
		if(b1==0 && b4==0 &&b7==0)
		{
			JOptionPane.showMessageDialog(frame, "USER O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
		twoCount1++;
		twoCount.setText(String.valueOf(twoCount1));
		}
		
		if(b2==0 && b5==0 &&b8==0)
		{
			JOptionPane.showMessageDialog(frame, "USER O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
		twoCount1++;
		twoCount.setText(String.valueOf(twoCount1));
		}
		
		if(b3==0 && b6==0&&b9==0)
		{
			JOptionPane.showMessageDialog(frame, "USER O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
		twoCount1++;
		twoCount.setText(String.valueOf(twoCount1));
		}
		
		//No One wins
		
		
		if(i==9)
		{
			JOptionPane.showMessageDialog(frame, "What a Clash!! No one wins !", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
		
		}
		
		
		
	}
	

	private void choosePlayer() {
		if(startGame.equalsIgnoreCase("X"))
		{
			startGame="O";
		}
		else
		{
			startGame="X";
		}
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(3, 5, 2, 2));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JButton btn1 = new JButton("");
		btn1.setBackground(new Color(153, 204, 255));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn1.setText(startGame);
				if(startGame.equalsIgnoreCase("X"))
				{
					btn1.setForeground(Color.RED);
					b1=1;
					i++;
				}
				else
				{
					btn1.setForeground(Color.GREEN);
					b1=0;
					i++;
					
				}
				choosePlayer();
				gameWinner();
				
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 50));
		panel_1.add(btn1, BorderLayout.CENTER);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JButton btn2 = new JButton("");
		btn2.setBackground(new Color(153, 204, 255));
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn2.setText(startGame);
				if(startGame.equalsIgnoreCase("X"))
				{
					btn2.setForeground(Color.RED);
					b2=1;
					i++;
				}
				else
				{
					btn2.setForeground(Color.GREEN);
					b2=0;
					i++;
					
				}
				choosePlayer();
				gameWinner();
			
			
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 50));
		panel_2.add(btn2, BorderLayout.CENTER);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JButton btn3 = new JButton("");
		btn3.setBackground(new Color(153, 204, 255));
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn3.setText(startGame);
				if(startGame.equalsIgnoreCase("X"))
				{
					btn3.setForeground(Color.RED);
					b3=1;
					i++;
				}
				else
				{
					btn3.setForeground(Color.GREEN);
					b3=0;
					i++;
					
				}
				choosePlayer();
				gameWinner();
			
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 50));
		panel_3.add(btn3, BorderLayout.CENTER);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JButton btnNewButton_3 = new JButton("USER X");
		btnNewButton_3.setBackground(new Color(153, 204, 51));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_4.add(btnNewButton_3, BorderLayout.CENTER);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_5);
		panel_5.setLayout(new BorderLayout(0, 0));
		
		oneCount = new JTextField();
		oneCount.setBackground(new Color(204, 204, 204));
		oneCount.setHorizontalAlignment(SwingConstants.CENTER);
		oneCount.setFont(new Font("Tahoma", Font.BOLD, 40));
		oneCount.setText("0");
		panel_5.add(oneCount, BorderLayout.CENTER);
		oneCount.setColumns(10);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_6);
		panel_6.setLayout(new BorderLayout(0, 0));
		
		JButton btn4 = new JButton("");
		btn4.setBackground(new Color(153, 204, 255));
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn4.setText(startGame);
				if(startGame.equalsIgnoreCase("X"))
				{
					btn4.setForeground(Color.RED);
					b4=1;
					i++;
				}
				else
				{
					btn4.setForeground(Color.GREEN);
					b4=0;
					i++;
					
				}
				choosePlayer();
				gameWinner();
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 50));
		panel_6.add(btn4, BorderLayout.CENTER);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_7);
		panel_7.setLayout(new BorderLayout(0, 0));
		
		JButton btn5 = new JButton("");
		btn5.setBackground(new Color(153, 204, 255));
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn5.setText(startGame);
				if(startGame.equalsIgnoreCase("X"))
				{
					btn5.setForeground(Color.RED);
					b5=1;
					i++;
				}
				else
				{
					btn5.setForeground(Color.GREEN);
					b5=0;
					i++;
					
				}
				choosePlayer();
				gameWinner();
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 50));
		panel_7.add(btn5, BorderLayout.CENTER);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_8);
		panel_8.setLayout(new BorderLayout(0, 0));
		
		JButton btn6 = new JButton("");
		btn6.setBackground(new Color(153, 204, 255));
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn6.setText(startGame);
				if(startGame.equalsIgnoreCase("X"))
				{
					btn6.setForeground(Color.RED);
					b6=1;
					i++;
				}
				else
				{
					btn6.setForeground(Color.GREEN);
					b6=0;
					i++;
					
				}
				choosePlayer();
				gameWinner();
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 50));
		panel_8.add(btn6, BorderLayout.CENTER);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_9);
		panel_9.setLayout(new BorderLayout(0, 0));
		
		JButton btnNewButton_8 = new JButton("USER O");
		btnNewButton_8.setBackground(new Color(0, 204, 204));
		btnNewButton_8.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_9.add(btnNewButton_8, BorderLayout.CENTER);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_10);
		panel_10.setLayout(new BorderLayout(0, 0));
		
		twoCount = new JTextField();
		twoCount.setBackground(new Color(204, 204, 204));
		twoCount.setFont(new Font("Tahoma", Font.BOLD, 40));
		twoCount.setHorizontalAlignment(SwingConstants.CENTER);
		twoCount.setText("0");
		panel_10.add(twoCount, BorderLayout.CENTER);
		twoCount.setColumns(10);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_11);
		panel_11.setLayout(new BorderLayout(0, 0));
		
		JButton btn7 = new JButton("");
		btn7.setBackground(new Color(153, 204, 255));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn7.setText(startGame);
				if(startGame.equalsIgnoreCase("X"))
				{
					btn7.setForeground(Color.RED);
					b7=1;
					i++;
				}
				else
				{
					btn7.setForeground(Color.GREEN);
					b7=0;
					i++;
					
				}
				choosePlayer();
				gameWinner();
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 50));
		panel_11.add(btn7, BorderLayout.CENTER);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_12);
		panel_12.setLayout(new BorderLayout(0, 0));
		
		JButton btn8 = new JButton("");
		btn8.setBackground(new Color(153, 204, 255));
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn8.setText(startGame);
				if(startGame.equalsIgnoreCase("X"))
				{
					btn8.setForeground(Color.RED);
					b8=1;
					i++;
				}
				else
				{
					btn8.setForeground(Color.GREEN);
					b8=0;
					i++;
					
				}
				choosePlayer();
				gameWinner();
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 50));
		panel_12.add(btn8, BorderLayout.CENTER);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_13);
		panel_13.setLayout(new BorderLayout(0, 0));
		
		JButton btn9 = new JButton("");
		btn9.setBackground(new Color(153, 204, 255));
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				btn9.setText(startGame);
				if(startGame.equalsIgnoreCase("X"))
				{
					btn9.setForeground(Color.RED);
					b9=1;
					i++;
				}
				else
				{
					btn9.setForeground(Color.GREEN);
					b9=0;
					i++;
					
				}
				choosePlayer();
				gameWinner();
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 50));
		panel_13.add(btn9, BorderLayout.CENTER);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_14);
		panel_14.setLayout(new BorderLayout(0, 0));
		
		JButton btnReset = new JButton("CLEAR");
		btnReset.setForeground(new Color(255, 255, 240));
		btnReset.setBackground(new Color(255, 102, 102));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn1.setText(null);
				btn2.setText(null);
				btn3.setText(null);
				btn4.setText(null);
				btn5.setText(null);
				btn6.setText(null);
				btn7.setText(null);
				btn8.setText(null);
				btn9.setText(null);
				b1=10;
				b2=10;
				b3=10;
				b4=10;
				b5=10;
				b6=10;
				b7=10;
				b8=10;
				b9=10;
				i=0;
				
				
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 23));
		panel_14.add(btnReset, BorderLayout.CENTER);
		
		JPanel panel_15 = new JPanel();
		panel_15.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_15);
		panel_15.setLayout(new BorderLayout(0, 0));
		
		JButton btnExit = new JButton("EXIT");
		btnExit.setForeground(new Color(255, 250, 250));
		btnExit.setBackground(new Color(255, 69, 0));
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frame,"Confirm if you want to exit","Tic Tac Toe", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
				{
					System.exit(0);
				}
			}
		});
		panel_15.add(btnExit, BorderLayout.CENTER);
	}

}
