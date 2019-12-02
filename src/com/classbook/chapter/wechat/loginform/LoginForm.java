package com.classbook.chapter.wechat.loginform;

import com.classbook.chapter.wechat.registerform.RegisterForm;
import com.classbook.chapter.wechat.wechatform.WeChatForm;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @program: classprogram
 * @Description:
 * @author: Mr.Cheng
 * @date: 2019/11/6 5:27 下午
 */
public class LoginForm extends JFrame {

    private JPanel panelLogin;
    private JLabel userLabel;
    private JTextField userText;
    private JLabel passwordLabel;
    private JPasswordField passwordText;
    private JButton loginButton;
    private JButton registerButton;

    public LoginForm(){
        setTitle("Login Form");
        setSize(280, 160);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panelLogin = new JPanel();
        panelLogin.setLayout(null);

        userLabel = new JLabel("User:");
        userLabel.setBounds(10,20,80,25);
        panelLogin.add(userLabel);

        userText = new JTextField(20);
        userText.setBounds(100,20,165,25);
        panelLogin.add(userText);

        passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(10,50,80,25);
        panelLogin.add(passwordLabel);

        passwordText = new JPasswordField(20);
        passwordText.setBounds(100,50,165,25);
        panelLogin.add(passwordText);

        loginButton = new JButton("login");
        loginButton.setBounds(10, 100, 80, 25);
        panelLogin.add(loginButton);
        loginButton.addActionListener(new LoginEventListener());

        registerButton = new JButton("register");
        registerButton.setBounds(100, 100, 80, 25);
        panelLogin.add(registerButton);
        registerButton.addActionListener(new RegisterEventListener());

        add(panelLogin);
    }

    /**
    * @Description: 设置界面可见
    * @Param: [visible]
    * @return: void
    * @Author: Mr.Cheng
    * @Date: 2019/11/6 6:19 下午
    */
    public void setFrameLoginVisible(Boolean visible){
        setVisible(visible);
    }

    public JButton getLoginButton() {
        return loginButton;
    }

    public JButton getRegisterButton() {
        return registerButton;
    }

    class LoginEventListener implements ActionListener {
        /**
         * Invoked when an action occurs.
         *
         * @param e
         */
        @Override
        public void actionPerformed(ActionEvent e) {
            String username = userText.getText();
            String userpassword = String.valueOf(passwordText.getPassword());
            WeChatForm weChatForm = new WeChatForm();
            weChatForm.setFrameWeChatVisible(true);
            dispose();
        }
    }

    class RegisterEventListener implements ActionListener {
        /**
         * Invoked when an action occurs.
         *
         * @param e
         */
        @Override
        public void actionPerformed(ActionEvent e) {
            RegisterForm registerForm = new RegisterForm();
            registerForm.setFrameRegisterVisible(true);
            dispose();
        }
    }
}
