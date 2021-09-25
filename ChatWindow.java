package SwingChatInterface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ChatWindow extends JFrame {
    public ChatWindow() {
        setTitle("Chat Window");
        setBounds(300, 300, 400, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(null);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("Window Closing");
            }
        });

        JButton enter = new JButton("Enter");
        enter.setBounds(290, 300, 90, 35);

        JTextArea chatWindow = new JTextArea();
        chatWindow.setBounds(10, 10, 360, 280);

        JTextField message = new JTextField();
        message.setBounds(10, 300, 270, 35);
        message.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
               //System.out.println(message.getText());
                chatWindow.setText(message.getText());
            }});

        add(chatWindow);
        add(message);
        add(enter);

        enter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent logActionEvent) {
                //  enter.setText("ent done");
                chatWindow.setText(message.getText());
            }});
        setVisible(true);
    }
}
