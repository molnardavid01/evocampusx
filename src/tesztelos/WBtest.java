package tesztelos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;


public class WBtest {

	private JFrame frmBejelentkezAblak;
	private JTextField idInput;
	private JPasswordField passwordInput;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WBtest window = new WBtest();
					window.frmBejelentkezAblak.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public WBtest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBejelentkezAblak = new JFrame();
		frmBejelentkezAblak.setTitle("Bejelentkez\u0151 ablak");
		frmBejelentkezAblak.getContentPane().setBackground(UIManager.getColor("Button.background"));
		frmBejelentkezAblak.getContentPane().setForeground(Color.BLACK);
		frmBejelentkezAblak.setBounds(100, 100, 450, 300);
		frmBejelentkezAblak.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBejelentkezAblak.getContentPane().setLayout(null);
		
		JLabel lblFelhasznlnv = new JLabel("Felhaszn\u00E1l\u00F3n\u00E9v:");
		lblFelhasznlnv.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblFelhasznlnv.setForeground(Color.BLACK);
		lblFelhasznlnv.setBounds(10, 70, 143, 24);
		frmBejelentkezAblak.getContentPane().add(lblFelhasznlnv);
		
		JLabel lblJelsz = new JLabel("Jelsz\u00F3:");
		lblJelsz.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblJelsz.setBounds(93, 118, 60, 25);
		frmBejelentkezAblak.getContentPane().add(lblJelsz);
		
		idInput = new JTextField();
		idInput.setFont(new Font("Tahoma", Font.PLAIN, 15));
		idInput.setBounds(165, 68, 152, 28);
		frmBejelentkezAblak.getContentPane().add(idInput);
		idInput.setColumns(10);
		
		passwordInput = new JPasswordField();
		passwordInput.setBounds(165, 115, 152, 28);
		frmBejelentkezAblak.getContentPane().add(passwordInput);
		
		JButton Login = new JButton("Bel\u00E9p\u00E9s");
		Login.addActionListener(new ActionListener() {


			public void actionPerformed(ActionEvent arg0) {
				
				String usn=idInput.getText();
				String psd=String.valueOf(passwordInput.getPassword());

				
				ArrayList<String> nevek = new ArrayList<String>();
				ArrayList<String> jelszo = new ArrayList<String>();
				
				nevek.add("David");
				nevek.add("Gabor");
				nevek.add("Dezso");
				jelszo.add("qwert");
				jelszo.add("asdfg");
				jelszo.add("�yxcv");
				
				int b=0;
				for(int i = 0; i < nevek.size(); i++) {
					if (usn.equals(nevek.get(i)) && (psd.equals(jelszo.get(i)))){ 
						JOptionPane.showMessageDialog(frmBejelentkezAblak, "Sikeres bel�p�s");
						b=1;
					}
				}
				if(b==0)JOptionPane.showMessageDialog(frmBejelentkezAblak, "Sikertelen bejelentkez�s");
			}
				/*if (usn.equals("David") && (psd.equals("qawsed"))){
				
				}
				else{
					
					}
				}*/
			
		});
		Login.setForeground(Color.BLACK);
		Login.setBackground(SystemColor.textHighlight);
		Login.setBounds(165, 170, 120, 40);
		frmBejelentkezAblak.getContentPane().add(Login);
		
		
	}
}
