package Calculators;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator {

	double firstNumber;
	double secondNumber;
	String operations;
	String answer;
	double result;

	private JFrame frame;
	private JTextField mainText;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 263, 394);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = mainText.getText() + btn0.getText();
				mainText.setText(EnterNumber);
			}
		});
		btn0.setBounds(10, 296, 48, 38);
		frame.getContentPane().add(btn0);

		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = mainText.getText() + btn1.getText();
				mainText.setText(EnterNumber);
			}
		});
		btn1.setBounds(68, 296, 48, 38);
		frame.getContentPane().add(btn1);

		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = mainText.getText() + btn2.getText();
				mainText.setText(EnterNumber);
			}
		});
		btn2.setBounds(126, 296, 48, 38);
		frame.getContentPane().add(btn2);

		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(mainText.getText());
				mainText.setText(null);
				operations = "+";
			}
		});
		btnPlus.setBounds(184, 296, 48, 38);
		frame.getContentPane().add(btnPlus);

		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = mainText.getText() + btn3.getText();
				mainText.setText(EnterNumber);
			}
		});
		btn3.setBounds(10, 247, 48, 38);
		frame.getContentPane().add(btn3);

		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = mainText.getText() + btn4.getText();
				mainText.setText(EnterNumber);
			}
		});
		btn4.setBounds(68, 247, 48, 38);
		frame.getContentPane().add(btn4);

		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = mainText.getText() + btn5.getText();
				mainText.setText(EnterNumber);
			}
		});
		btn5.setBounds(126, 247, 48, 38);
		frame.getContentPane().add(btn5);

		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = mainText.getText() + btn6.getText();
				mainText.setText(EnterNumber);
			}
		});
		btn6.setBounds(10, 198, 48, 38);
		frame.getContentPane().add(btn6);

		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = mainText.getText() + btn7.getText();
				mainText.setText(EnterNumber);
			}
		});
		btn7.setBounds(68, 198, 48, 38);
		frame.getContentPane().add(btn7);

		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = mainText.getText() + btn8.getText();
				mainText.setText(EnterNumber);
			}
		});
		btn8.setBounds(126, 198, 48, 38);
		frame.getContentPane().add(btn8);

		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = mainText.getText() + btn9.getText();
				mainText.setText(EnterNumber);
			}
		});
		btn9.setBounds(10, 149, 48, 38);
		frame.getContentPane().add(btn9);

		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				firstNumber = Double.parseDouble(mainText.getText());
				mainText.setText(null);
				operations = "-";
			}
		});
		btnMinus.setBounds(184, 247, 48, 38);
		frame.getContentPane().add(btnMinus);

		JButton btnMultiply = new JButton("*");
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				firstNumber = Double.parseDouble(mainText.getText());
				mainText.setText(null);
				operations = "*";
			}
		});
		btnMultiply.setBounds(184, 198, 48, 38);
		frame.getContentPane().add(btnMultiply);

		JButton btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				firstNumber = Double.parseDouble(mainText.getText());
				mainText.setText(null);
				operations = "/";
			}
		});
		btnDivide.setBounds(184, 149, 48, 38);
		frame.getContentPane().add(btnDivide);

		JButton btnDecimal = new JButton(".");
		btnDecimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					firstNumber = Double.parseDouble(mainText.getText() + ".");
					String temp = String.valueOf(firstNumber);
					mainText.setText(temp);
				} catch (NumberFormatException g) {
					System.out.println("Unknown Number Format.");
				}
			}
		});
		btnDecimal.setBounds(126, 149, 48, 38);
		frame.getContentPane().add(btnDecimal);

		JButton btnCancel = new JButton("C");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainText.setText("");
			}
		});
		btnCancel.setBounds(68, 149, 48, 38);
		frame.getContentPane().add(btnCancel);

		mainText = new JTextField();
		mainText.setFont(new Font("Consolas", Font.PLAIN, 23));
		mainText.setHorizontalAlignment(SwingConstants.CENTER);
		mainText.setBounds(10, 11, 222, 69);
		frame.getContentPane().add(mainText);
		mainText.setColumns(10);

		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					String answer;
					switch (operations) {

					case "+":
						secondNumber = Double.parseDouble(mainText.getText());
						answer = String.valueOf(firstNumber + secondNumber);
						mainText.setText(answer);
						break;
					case "-":
						secondNumber = Double.parseDouble(mainText.getText());
						answer = String.valueOf(firstNumber - secondNumber);
						mainText.setText(answer);
						break;
					case "*":
						secondNumber = Double.parseDouble(mainText.getText());
						answer = String.valueOf(firstNumber * secondNumber);
						mainText.setText(answer);
						break;
					case "/":
						secondNumber = Double.parseDouble(mainText.getText());
						answer = String.valueOf(firstNumber / secondNumber);
						mainText.setText(answer);
						break;
					case "=":
						answer = String.valueOf(firstNumber);
						mainText.setText(answer);
						break;
					default:
						System.out.println("Default entered.");
						break;

					}
				} catch (NullPointerException f) {
					String first = String.valueOf(mainText.getText());
					mainText.setText(first);
				}
			}
		});
		btnCalculate.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		btnCalculate.setBounds(122, 100, 110, 38);
		frame.getContentPane().add(btnCalculate);

		JButton btnBackSpace = new JButton("Backspace");
		btnBackSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (mainText.getText().length() > 0) {
					StringBuilder sb = new StringBuilder(mainText.getText());
					mainText.setText(sb.substring(0, sb.length() - 1));
				}
			}
		});
		btnBackSpace.setBounds(10, 100, 102, 38);
		frame.getContentPane().add(btnBackSpace);
	}

}
