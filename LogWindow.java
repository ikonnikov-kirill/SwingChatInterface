package SwingChatInterface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class LogWindow extends JFrame {
    public LogWindow() {
        setTitle("Log Window");
        setBounds(300, 300, 400, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(null);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("Window Closing");
            }
        });
        JTextField userName = new JTextField();
        userName.setBounds(20, 40, 120, 35);
        JTextField password = new JTextField();
        password.setBounds(20, 90, 120, 35);
        JButton login = new JButton("Log in");
        login.setBounds(20, 140, 90, 35);
        JButton register = new JButton("Register");
        register.setBounds(140, 140, 120, 35);


        add(userName);
        add(password);
     //   setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS));

        add(login);
        login.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent logActionEvent) {
        login.setText("log done");
        }});
        add(register);
        register.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent regActionEvent) {
        register.setText("register done");
        }});
        setVisible(true);
    }
}
