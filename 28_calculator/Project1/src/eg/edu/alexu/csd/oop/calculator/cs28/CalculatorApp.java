package eg.edu.alexu.csd.oop.calculator.cs28;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.SwingConstants;

public class CalculatorApp {

	private JFrame frame;
	private JTextField textFieldEquation;
	private JTextField textFieldResult;
	private final Action action = new SwingAction();
	private StringBuilder equation = new StringBuilder();
    private Calculator calc = new CalculatorCore();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorApp window = new CalculatorApp();
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
	public CalculatorApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 700, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblCalculator = new JLabel("Calculator");
		lblCalculator.setForeground(new Color(0, 0, 139));
		lblCalculator.setFont(new Font("Neo Tech Alt Medium", Font.BOLD | Font.ITALIC, 23));
		lblCalculator.setBounds(40, 41, 174, 29);
		frame.getContentPane().add(lblCalculator);
		
		textFieldEquation = new JTextField();
		textFieldEquation.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldEquation.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textFieldEquation.setBackground(new Color(255, 255, 255));
		textFieldEquation.setEditable(false);
		textFieldEquation.setBounds(40, 83, 322, 40);
		frame.getContentPane().add(textFieldEquation);
		textFieldEquation.setColumns(10);
		
		textFieldResult = new JTextField();
		textFieldResult.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textFieldResult.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldResult.setBackground(new Color(255, 255, 255));
		textFieldResult.setEditable(false);
		textFieldResult.setBounds(416, 83, 206, 40);
		frame.getContentPane().add(textFieldResult);
		textFieldResult.setColumns(10);
		
		JLabel label = new JLabel("=");
		label.setFont(new Font("Tahoma", Font.BOLD, 25));
		label.setForeground(new Color(0, 0, 0));
		label.setBounds(380, 95, 56, 17);
		frame.getContentPane().add(label);
		
		JButton ONE = new JButton("1");
		ONE.setFont(new Font("Tahoma", Font.PLAIN, 11));
		ONE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				equation.append("1");
				textFieldEquation.setText(equation.toString());
			}
		});
		ONE.setBounds(40, 150, 40, 30);
		frame.getContentPane().add(ONE);
		
		JButton TWO = new JButton("2");
		TWO.setFont(new Font("Tahoma", Font.PLAIN, 11));
		TWO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				equation.append("2");
				textFieldEquation.setText(equation.toString());
			}
		});
		TWO.setBounds(90, 150, 40, 30);
		frame.getContentPane().add(TWO);
		
		JButton THREE = new JButton("3");
		THREE.setFont(new Font("Tahoma", Font.PLAIN, 11));
		THREE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				equation.append("3");
				textFieldEquation.setText(equation.toString());
			}
		});
		THREE.setBounds(140, 150, 40, 30);
		frame.getContentPane().add(THREE);
		
		JButton FOUR = new JButton("4");
		FOUR.setFont(new Font("Tahoma", Font.PLAIN, 11));
		FOUR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				equation.append("4");
				textFieldEquation.setText(equation.toString());
			}
		});
		FOUR.setBounds(40, 190, 40, 30);
		frame.getContentPane().add(FOUR);
		
		JButton FIVE = new JButton("5");
		FIVE.setFont(new Font("Tahoma", Font.PLAIN, 11));
		FIVE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				equation.append("5");
				textFieldEquation.setText(equation.toString());
			}
		});
		FIVE.setBounds(90, 190, 40, 30);
		frame.getContentPane().add(FIVE);
		
		JButton SIX = new JButton("6");
		SIX.setFont(new Font("Tahoma", Font.PLAIN, 11));
		SIX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				equation.append("6");
				textFieldEquation.setText(equation.toString());
			}
		});
		SIX.setBounds(140, 190, 40, 30);
		frame.getContentPane().add(SIX);
		
		JButton SEVEN = new JButton("7");
		SEVEN.setFont(new Font("Tahoma", Font.PLAIN, 11));
		SEVEN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				equation.append("7");
				textFieldEquation.setText(equation.toString());
			}
		});
		SEVEN.setBounds(40, 230, 40, 30);
		frame.getContentPane().add(SEVEN);
		
		JButton EIGHT = new JButton("8");
		EIGHT.setFont(new Font("Tahoma", Font.PLAIN, 11));
		EIGHT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				equation.append("8");
				textFieldEquation.setText(equation.toString());
			}
		});
		EIGHT.setBounds(90, 230, 40, 30);
		frame.getContentPane().add(EIGHT);
		
		JButton NINE = new JButton("9");
		NINE.setFont(new Font("Tahoma", Font.PLAIN, 11));
		NINE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				equation.append("9");
				textFieldEquation.setText(equation.toString());
			}
		});
		NINE.setBounds(140, 230, 40, 30);
		frame.getContentPane().add(NINE);
		
		JButton ZERO = new JButton("0");
		ZERO.setFont(new Font("Tahoma", Font.PLAIN, 11));
		ZERO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				equation.append("0");
				textFieldEquation.setText(equation.toString());
			}
		});
		ZERO.setBounds(90, 270, 40, 30);
		frame.getContentPane().add(ZERO);
		
		JButton buttonSUM = new JButton("+");
		buttonSUM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				equation.append("+");
				textFieldEquation.setText(equation.toString());
			}
		});
		buttonSUM.setFont(new Font("Tahoma", Font.BOLD, 20));
		buttonSUM.setBounds(250, 150, 50, 50);
		frame.getContentPane().add(buttonSUM);
		
		JButton buttonSUB = new JButton("-");
		buttonSUB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				equation.append("-");
				textFieldEquation.setText(equation.toString());
			}
		});
		buttonSUB.setFont(new Font("Tahoma", Font.BOLD, 23));
		buttonSUB.setBounds(312, 150, 50, 50);
		frame.getContentPane().add(buttonSUB);
		
		JButton buttonMULT = new JButton("*");
		buttonMULT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				equation.append("*");
				textFieldEquation.setText(equation.toString());
			}
		});
		buttonMULT.setFont(new Font("Tahoma", Font.BOLD, 23));
		buttonMULT.setBounds(250, 210, 50, 50);
		frame.getContentPane().add(buttonMULT);
		
		JButton buttonDIV = new JButton("/");
		buttonDIV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				equation.append("/");
				textFieldEquation.setText(equation.toString());
			}
		});
		buttonDIV.setFont(new Font("Tahoma", Font.BOLD, 23));
		buttonDIV.setBounds(312, 210, 50, 50);
		frame.getContentPane().add(buttonDIV);
		
		JButton buttonDOT = new JButton(".");
		buttonDOT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				equation.append(".");
				textFieldEquation.setText(equation.toString());
			}
		});
		buttonDOT.setFont(new Font("Tahoma", Font.BOLD, 25));
		buttonDOT.setBounds(252, 273, 110, 25);
		frame.getContentPane().add(buttonDOT);
		
		JButton btnSave = new JButton("SAVE");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc.save();
			}
		});
		btnSave.setBounds(471, 153, 97, 25);
		frame.getContentPane().add(btnSave);
		
		JButton btnLoad = new JButton("LOAD");
		btnLoad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc.load();
				textFieldResult.setText(calc.current());
			}
		});
		btnLoad.setBounds(471, 183, 97, 25);
		frame.getContentPane().add(btnLoad);
		
		JButton btnCALC = new JButton("Calculate");
		btnCALC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc.input(equation.toString());
				
				String s = calc.getResult();
				
				 textFieldResult.setText(s);
				 
			}
		});
		btnCALC.setBounds(447, 273, 144, 29);
		frame.getContentPane().add(btnCALC);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (equation.length()>0) {
				equation.deleteCharAt(equation.length()-1);
				textFieldEquation.setText(equation.toString());
				}
			}
		});
		btnDelete.setBounds(471, 213, 97, 25);
		frame.getContentPane().add(btnDelete);
		
		JButton btnNew = new JButton("NEW");
		btnNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				equation.delete(0, equation.length());
				textFieldEquation.setText(equation.toString());
			}
		});
		btnNew.setBounds(471, 243, 97, 25);
		frame.getContentPane().add(btnNew);
		
		JButton btnNewButton = new JButton("<");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldResult.setText(calc.prev());
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(416, 48, 50, 25);
		frame.getContentPane().add(btnNewButton);
		
		JButton button = new JButton(">");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldResult.setText(calc.next());
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 13));
		button.setBounds(572, 48, 50, 25);
		frame.getContentPane().add(button);
		
		JButton btnCurrent = new JButton("current");
		btnCurrent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			  textFieldResult.setText(calc.current());
			}
		});
		btnCurrent.setBounds(471, 48, 97, 25);
		frame.getContentPane().add(btnCurrent);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
