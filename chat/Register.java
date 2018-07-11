package com.alex.chat;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Register extends JFrame {

	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtPassword;

	private String nickname;
	private String password;
	
	private List<String> users = new ArrayList<String>();

	public Register() {
		windowRegister();
	}

	//Create a Window registration
	private void windowRegister() {
		setResizable(false);
		setTitle("Register");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCreateAUser = new JLabel("Create a user :");
		lblCreateAUser.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCreateAUser.setBounds(56, 27, 105, 16);
		contentPane.add(lblCreateAUser);
		
		JLabel lblChooseANickname = new JLabel("Choose a Nickname");
		lblChooseANickname.setBounds(56, 85, 138, 16);
		contentPane.add(lblChooseANickname);
		
		JLabel lblChooseAPassword = new JLabel("Choose a password");
		lblChooseAPassword.setBounds(56, 142, 126, 16);
		contentPane.add(lblChooseAPassword);
		
		txtName = new JTextField();
		txtName.setBounds(233, 82, 116, 22);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		txtPassword = new JTextField();
		txtPassword.setBounds(233, 139, 116, 22);
		contentPane.add(txtPassword);
		txtPassword.setColumns(10);
		
		JButton btnRegister = new JButton("register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nickname = txtName.getText();
				password = txtPassword.getText();
				users.add(nickname);
				addUser();
			}
		});
		btnRegister.setBounds(252, 195, 97, 25);
		contentPane.add(btnRegister);
		setVisible(true);		
	}

	private void addUser() {
		if(nickname.length()<4 || nickname.length()>15) {
			System.out.println("Error , enter nickname between 4-15 charecters");
		}else if(password.length()<5) {
			System.out.println("Error password must be a least 5 chrarecters.");
		}else {
			users.add(nickname);
			users.add(password);
		}
		
	}
}
