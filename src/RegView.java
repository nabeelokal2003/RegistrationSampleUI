import javax.swing.*;
import java.awt.*;

public class RegView extends JFrame {
//    RegModel model;
    JLabel usernameLabel;
    JTextField usernameField;
    JLabel passwordLabel;
    JPasswordField passwordField;
    JLabel confirmPasswordLabel;
    JPasswordField confirmPasswordField;
    JLabel fullnameLabel;
    JTextField fullnameField;
    JLabel genderLabel;
    JLabel emailLabel;
    JTextField emailField;
    JLabel majorLabel;
    JTextField majorField;
    JLabel skillsLabel;
    JTextField skillsField;

    public RegView(/*RegModel model*/) {
//        this.model = model;

        // Create a frame
        this.setTitle("Registration Sample UI");
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        JPanel radiobuttonPanel = new JPanel();
        JPanel checkAndRegisterPanel = new JPanel();

        panel.setLayout(new GridLayout(9, 2));
        radiobuttonPanel.setLayout(new GridLayout(1, 3));
        checkAndRegisterPanel.setLayout(new BoxLayout(checkAndRegisterPanel, BoxLayout.Y_AXIS));  // new GridLayout(2, 1)

        usernameLabel = new JLabel("Username: ");   // this.model.getUsername()
        passwordLabel = new JLabel("Password: ");
        confirmPasswordLabel = new JLabel("Confirm Password: ");
        fullnameLabel = new JLabel("Fullname: ");
        genderLabel = new JLabel("Gender: ");
        emailLabel = new JLabel("Email: ");
        majorLabel = new JLabel("Major: ");
        skillsLabel = new JLabel("Skills: ");

        usernameField = new JTextField(10);
        passwordField = new JPasswordField(10);
        confirmPasswordField = new JPasswordField(10);
        fullnameField = new JTextField(10);
        emailField = new JTextField(10);
        majorField = new JTextField(10);
        skillsField = new JTextField(10);

        JRadioButton maleButton = new JRadioButton("Male");
        JRadioButton femaleButton = new JRadioButton("Female");
        ButtonGroup group = new ButtonGroup();
        group.add(maleButton);
        group.add(femaleButton);

        JCheckBox AcceptTermsCheckBox = new JCheckBox("Accept Terms and Conditions");

        JButton registerButton = new JButton("Register");

        panel.add(usernameLabel);
        panel.add(usernameField);

        panel.add(passwordLabel);
        panel.add(passwordField);

        panel.add(confirmPasswordLabel);
        panel.add(confirmPasswordField);

        panel.add(fullnameLabel);
        panel.add(fullnameField);

        radiobuttonPanel.add(genderLabel);
        radiobuttonPanel.add(maleButton);
        radiobuttonPanel.add(femaleButton);

        panel.add(emailLabel);
        panel.add(emailField);
        panel.add(majorLabel);
        panel.add(majorField);
        panel.add(skillsLabel);
        panel.add(skillsField);

        AcceptTermsCheckBox.setAlignmentX(Component.CENTER_ALIGNMENT);
        registerButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        checkAndRegisterPanel.add(AcceptTermsCheckBox);
        checkAndRegisterPanel.add(Box.createVerticalStrut(10));
        checkAndRegisterPanel.add(registerButton);

        panel.add(radiobuttonPanel, BorderLayout.CENTER);
        panel.add(new JLabel(""));

        panel.add(checkAndRegisterPanel);
        this.add(panel);

        this.pack();
        this.setVisible(true);
    }
}
