package tesztelos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JDesktopPane;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WBreg {

	private JFrame frmgyflRegisztrls;
	private JTextField textFieldUsername;
	private JTextField textFieldTaxNumber;
	private JTextField textFieldEmail;
	private JTextField textFieldAddress;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WBreg window = new WBreg();
					window.frmgyflRegisztrls.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public WBreg() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmgyflRegisztrls = new JFrame();
		frmgyflRegisztrls.setTitle("\u00DCgyf\u00E9l regisztr\u00E1l\u00E1s");
		frmgyflRegisztrls.setBounds(100, 100, 600, 500);
		frmgyflRegisztrls.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmgyflRegisztrls.getContentPane().setLayout(null);
		
		JLabel lblUsername = new JLabel("Felhaszn\u00E1l\u00F3n\u00E9v:");
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblUsername.setBounds(24, 11, 149, 25);
		frmgyflRegisztrls.getContentPane().add(lblUsername);
		
		textFieldUsername = new JTextField();
		textFieldUsername.setBounds(178, 11, 396, 26);
		frmgyflRegisztrls.getContentPane().add(textFieldUsername);
		textFieldUsername.setColumns(10);
		
		JLabel lblTaxNumber = new JLabel("Ad\u00F3sz\u00E1m:");
		lblTaxNumber.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTaxNumber.setBounds(80, 47, 93, 25);
		frmgyflRegisztrls.getContentPane().add(lblTaxNumber);
		
		textFieldTaxNumber = new JTextField();
		textFieldTaxNumber.setColumns(10);
		textFieldTaxNumber.setBounds(178, 47, 396, 26);
		frmgyflRegisztrls.getContentPane().add(textFieldTaxNumber);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEmail.setBounds(110, 84, 63, 25);
		frmgyflRegisztrls.getContentPane().add(lblEmail);
		
		textFieldEmail = new JTextField();
		textFieldEmail.setColumns(10);
		textFieldEmail.setBounds(178, 84, 396, 26);
		frmgyflRegisztrls.getContentPane().add(textFieldEmail);
		
		JLabel lblAddress = new JLabel("C\u00EDm:");
		lblAddress.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblAddress.setBounds(124, 121, 41, 25);
		frmgyflRegisztrls.getContentPane().add(lblAddress);
		
		JButton btnSave = new JButton("Ment\u00E9s");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		textFieldAddress = new JTextField();
		textFieldAddress.setColumns(10);
		textFieldAddress.setBounds(178, 121, 396, 26);
		frmgyflRegisztrls.getContentPane().add(textFieldAddress);
		btnSave.setBounds(220, 416, 160, 40);
		frmgyflRegisztrls.getContentPane().add(btnSave);
	}
}
