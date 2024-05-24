package main.java.aut.utcluj.isp.app.views;

import javax.swing.*;
import java.awt.*;

public class LoginJFrame extends JFrame {
  public LoginJFrame() {
    this.setTitle("Login");
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.setLayout(new GridLayout(4, 2));
    this.setBounds(200, 200, 300, 200);

    JLabel titleLabel = new JLabel("Welcome!");
    JLabel userLabel = new JLabel("Username");
    JTextField userInput = new JTextField();
    JLabel passwordLabel = new JLabel("Password");
    JPasswordField passwordInput = new JPasswordField();
    JButton submitButton = new JButton("Login");
    submitButton.addActionListener(_e -> System.out.println("Logging in"));

    this.add(titleLabel);
    this.add(new JLabel(""));
    this.add(userLabel);
    this.add(userInput);
    this.add(passwordLabel);
    this.add(passwordInput);
    this.add(submitButton);
    this.add(new JLabel(""));

    this.setVisible(true);
  }
}
