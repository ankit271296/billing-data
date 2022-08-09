package Billing_system;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Billing_system {

	JFrame frame;
	private JTextField txtCoke;
	private JTextField txtPopCorn;
	private JTextField txtFrenchFries;
	private JTextField txtBurger;
	private JTextField txtMcPuff;
	private JTextField txtcostCoke;
	private JTextField txtcostPopCorn;
	private JTextField txtcostFrenchFries;
	private JTextField txtcostBurger;
	private JTextField txtcostMcPuff;
	private JTextField txtSubtotal;
	private JTextField txtTax;
	private JTextField txtTotalCost;
	private JTextField txtContactNo;
	private JTextField txtReceipt;
	   double Coke=40;
	   double PopCorn=3;
	   double FrenchFries=5.5;
	   double Burger=7.5;
	   double McPuff=8.5;
	   double itax=0.75;
	   double ContactNo=10;
	   private JTextField textField;
	   

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Billing_system window = new Billing_system();
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
	public Billing_system() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.addWindowListener(new WindowAdapter() {
			@Override
			
			public void windowActivated(WindowEvent arg0) {
				  
				
				
				
			}
		});
		frame.setBounds(0, 0, 1000, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(85, 48, 688, 67);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Shop Billing System");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(10, 0, 668, 54);
		panel.add(lblNewLabel);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Coke");
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				
				
			   
			}
		  });
		chckbxNewCheckBox.setBounds(68, 147, 93, 21);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("PopCorn");
		chckbxNewCheckBox_1.setBounds(68, 194, 93, 21);
		frame.getContentPane().add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("FrenchFries");
		chckbxNewCheckBox_2.setBounds(68, 242, 93, 21);
		frame.getContentPane().add(chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("Burger");
		chckbxNewCheckBox_3.setBounds(68, 290, 93, 21);
		frame.getContentPane().add(chckbxNewCheckBox_3);
		
		JCheckBox chckbxNewCheckBox_4 = new JCheckBox("McPuff");
		chckbxNewCheckBox_4.setBounds(68, 332, 93, 21);
		frame.getContentPane().add(chckbxNewCheckBox_4);
		
		txtCoke = new JTextField();
		txtCoke.setBounds(189, 148, 96, 19);
		frame.getContentPane().add(txtCoke);
		txtCoke.setColumns(10);
		
		txtPopCorn = new JTextField();
		txtPopCorn.setBounds(189, 195, 96, 19);
		frame.getContentPane().add(txtPopCorn);
		txtPopCorn.setColumns(10);
		
		txtFrenchFries = new JTextField();
		txtFrenchFries.setBounds(189, 243, 96, 19);
		frame.getContentPane().add(txtFrenchFries);
		txtFrenchFries.setColumns(10);
		
		txtBurger = new JTextField();
		txtBurger.setBounds(189, 292, 96, 19);
		frame.getContentPane().add(txtBurger);
		txtBurger.setColumns(10);
		
		txtMcPuff = new JTextField();
		txtMcPuff.setBounds(189, 333, 96, 19);
		frame.getContentPane().add(txtMcPuff);
		txtMcPuff.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Cost of Coke");
		lblNewLabel_1.setBounds(399, 151, 93, 21);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Cost of PopCorn");
		lblNewLabel_2.setBounds(399, 198, 93, 19);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Cost of FrenchFries");
		lblNewLabel_3.setBounds(399, 246, 93, 17);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_5 = new JLabel("Cost of McPuff");
		lblNewLabel_5.setBounds(399, 332, 93, 21);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_4 = new JLabel("Cost of Burger");
		lblNewLabel_4.setBounds(399, 294, 93, 17);
		frame.getContentPane().add(lblNewLabel_4);
		
		txtcostCoke = new JTextField();
		txtcostCoke.setBounds(510, 148, 96, 19);
		frame.getContentPane().add(txtcostCoke);
		txtcostCoke.setColumns(10);
		
		txtcostPopCorn = new JTextField();
		txtcostPopCorn.setBounds(510, 198, 96, 19);
		frame.getContentPane().add(txtcostPopCorn);
		txtcostPopCorn.setColumns(10);
		
		txtcostFrenchFries = new JTextField();
		txtcostFrenchFries.setBounds(510, 243, 96, 19);
		frame.getContentPane().add(txtcostFrenchFries);
		txtcostFrenchFries.setColumns(10);
		
		txtcostBurger = new JTextField();
		txtcostBurger.setBounds(510, 291, 96, 19);
		frame.getContentPane().add(txtcostBurger);
		txtcostBurger.setColumns(10);
		
		txtcostMcPuff = new JTextField();
		txtcostMcPuff.setBounds(510, 332, 96, 27);
		frame.getContentPane().add(txtcostMcPuff);
		txtcostMcPuff.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Sub total");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_6.setBounds(56, 432, 116, 36);
		frame.getContentPane().add(lblNewLabel_6);
		
		txtSubtotal = new JTextField();
		txtSubtotal.setBounds(158, 420, 232, 42);
		frame.getContentPane().add(txtSubtotal);
		txtSubtotal.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Tax");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_7.setBounds(56, 496, 105, 36);
		frame.getContentPane().add(lblNewLabel_7);
		
		txtTax = new JTextField();
		txtTax.setBounds(158, 496, 232, 42);
		frame.getContentPane().add(txtTax);
		txtTax.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Total Cost");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_8.setBounds(56, 566, 105, 36);
		frame.getContentPane().add(lblNewLabel_8);
		
		txtTotalCost = new JTextField();
		txtTotalCost.setBounds(158, 566, 232, 36);
		frame.getContentPane().add(txtTotalCost);
		txtTotalCost.setColumns(10);
		
		JButton btnNewButton = new JButton("Total ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double L = Coke*Double.parseDouble(txtCoke.getText());
				double T = PopCorn*Double.parseDouble(txtPopCorn.getText());
				double P = FrenchFries*Double.parseDouble(txtFrenchFries.getText());
				double C = Burger*Double.parseDouble(txtBurger.getText());
				double CH = McPuff*Double.parseDouble(txtMcPuff.getText());
				
				double SumUp =L+T+P+C+CH;
				
				double cTax=(itax * SumUp)/100;
				
				
				String S= String.format("€ % 2f", SumUp);
				txtSubtotal.setText(S);
				
				String ttax= String.format("€ % 2f", cTax);
				txtTax.setText(ttax);
				
				double Sumtotal =SumUp+cTax;
				
				String ttotal= String.format("€ %.2f", Sumtotal);
				txtTax.setText(ttotal);
				
				String Cost_of_L=String.format("€%.2f,L");
				txtcostCoke.setText(Cost_of_L);
				
				String Cost_of_T=String.format("€%.2f,T");
				txtcostPopCorn.setText(Cost_of_T);
				
				String Cost_of_P=String.format("€%.2f,P");
				txtcostFrenchFries.setText(Cost_of_P);
				
				String Cost_of_C=String.format("€%.2f,C");
				txtcostBurger.setText(Cost_of_C);
				
				String Cost_of_CH=String.format("€%.2f,CH");
				txtcostMcPuff.setText(Cost_of_CH);
				
			
				
			}
			
		});
		btnNewButton.setToolTipText("Total");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnNewButton.setBounds(38, 664, 123, 36);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.setToolTipText("Reset");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 txtTax.setText(null);
				 txtSubtotal.setText(null);
				 txtTotalCost.setText(null);
				 txtPopCorn.setText(null);
				 txtFrenchFries.setText(null);
				 txtCoke.setText(null);
				 txtBurger.setText(null);
				 txtContactNo.setText(null);
				 
				 txtcostCoke.setText(null);
				 txtcostPopCorn.setText(null);
				 txtcostFrenchFries.setText(null);
				 txtcostBurger.setText(null);
				 txtcostMcPuff.setText(null);
				 txtContactNo.setText(null);
				
				txtReceipt.setText(null);
				 
				 
				 
				 chckbxNewCheckBox.setSelected(false);
				 chckbxNewCheckBox_1.setSelected(false);
				 chckbxNewCheckBox_2.setSelected(false);
				 chckbxNewCheckBox_3.setSelected(false);
				 chckbxNewCheckBox_4.setSelected(false);
				 
				 
				 
				
		
			  
				
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnNewButton_1.setBounds(187, 664, 98, 36);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton txtreceipt = new JButton("Receipt");
		txtreceipt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		txtreceipt.setToolTipText("Receipt");
		txtreceipt.setFont(new Font("Tahoma", Font.BOLD, 22));
		txtreceipt.setBounds(332, 664, 132, 36);
		frame.getContentPane().add(txtreceipt);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit","Billing System",
						JOptionPane.YES_NO_OPTION) ==JOptionPane.YES_NO_OPTION) {
							System.exit(0);
						}
				
				}
		
		});
		btnExit.setToolTipText("Exit");
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnExit.setBounds(510, 664, 116, 36);
		frame.getContentPane().add(btnExit);
		
		JLabel lblNewLabel_9 = new JLabel("Contact No");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_9.setBounds(68, 380, 93, 13);
		frame.getContentPane().add(lblNewLabel_9);
		
		textField = new JTextField();
		textField.setBounds(189, 374, 201, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
	}
}
