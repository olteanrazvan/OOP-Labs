import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args){
        JFrame bossFrame = new JFrame("Frame");
        bossFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        bossFrame.setSize(500, 200);
        JPanel usernamePanel = new JPanel();
        JPanel passwordPanel = new JPanel();
        JPanel termsPanel = new JPanel();

        JLabel user = new JLabel("username");
        JTextField userText = new JTextField();
        userText.setColumns(20);
        usernamePanel.add(user);
        usernamePanel.add(userText);

        JLabel pass = new JLabel("password");
        JPasswordField passText = new JPasswordField();
        passText.setColumns(20);
        passwordPanel.add(pass);
        passwordPanel.add(passText);

        JCheckBox termBox = new JCheckBox();
        termsPanel.add(termBox);
        termBox.setText("Terms and Conditions");

        JButton logIn = new JButton();
        logIn.setText("Log In");
        JLabel loggedIn = new JLabel("Not logged in");
        logIn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(userText.getText().equals("admin") && passText.getText().equals("admin") && termBox.isSelected())
                    loggedIn.setText("Logged in");
            }
        });

        JPanel bossPanel = new JPanel();
        bossPanel.add(usernamePanel);
        bossPanel.add(passwordPanel);
        bossPanel.add(termsPanel);
        bossPanel.add(logIn);
        bossPanel.add(loggedIn);
        bossPanel.setLayout(new BoxLayout(bossPanel,BoxLayout.Y_AXIS));

        bossFrame.setContentPane(bossPanel);
        bossFrame.setVisible(true);
    }
}