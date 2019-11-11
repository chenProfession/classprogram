package com.classbook.chapter.wechat.registerform;

import javax.swing.*;

/**
 * @program: classprogram
 * @Description:
 * @author: Mr.Cheng
 * @date: 2019/11/11 5:34 下午
 */
public class RegisterForm extends JFrame {

    private JPanel panelRegister;
    private JLabel userLabel;
    private JTextField userText;
    private JLabel passwordLabel;
    private JPasswordField passwordText;
    private JButton loginButton;
    private JButton registerButton;

    public RegisterForm(){
        setTitle("Register Form");
        setSize(280, 160);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
