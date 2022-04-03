package com.caasi;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.SwingConstants.CENTER;

public final class Myframe extends JFrame implements ActionListener {
    JButton button = new JButton("Find courses on sustainability in your area");
    JButton button1 = new JButton("Analyse my electrical consumption wasteage");
    JButton submit = new JButton("submit");
    JLabel question = new JLabel();
    JTextField textField = new JTextField();
    JButton option1 = new JButton("Bens website on sustainability" + "   Price : free" + "  Location:City square");
    JButton option2 = new JButton("Course on sustainable auditor"+ "   Price: 10$" + "   Location: City square");
    JButton back = new JButton("Back");
    Myframe(){
        GraphicsEnvironment graphics =
                GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice device = graphics.getDefaultScreenDevice();
        textField.setPreferredSize(new Dimension(600,40));
        textField.setVisible(false);

        button.setPreferredSize(new Dimension(600,110)) ;
        button.addActionListener(this);
        button1.setPreferredSize(new Dimension(600,110));
        button.addActionListener(this);
        submit.setPreferredSize(new Dimension(600,25));
        submit.addActionListener(this);
        submit.setVisible(false);
        option2.setVisible(false);
        option1.setVisible(false);
        back.setPreferredSize(new Dimension(600,25));
        back.setVisible(false);
        back.addActionListener(this);


        question.setText("How may we help you today?");
        question.setVerticalAlignment(JLabel.TOP);
        question.setHorizontalAlignment(CENTER);
        JPanel buttonpanel = new JPanel();
        buttonpanel.setBackground(Color.white);
        buttonpanel.add(question);
        buttonpanel.setBounds(300,100,600,300);
        buttonpanel.add(textField);
        buttonpanel.add(button);
        buttonpanel.add(button1);
        buttonpanel.add(submit);
        buttonpanel.add(option1);
        buttonpanel.add(option2);
        buttonpanel.add(back);

        ImageIcon logo = new ImageIcon("img_1.png");
        Border border = BorderFactory.createLineBorder(Color.white);


        JLabel label = new JLabel();
        label.setIcon(logo);
        label.setOpaque(true);
        label.setVisible(true);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.VERTICAL);
        this.setBackground(new Color(255,255,255));
        this.setTitle("Solaris");
        this.add(buttonpanel,BorderLayout.CENTER);
        this.add(label);
        this.setResizable(true);
        device.setFullScreenWindow(this);
        label.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==button){
            button.setVisible(false);
            button1.setVisible(false);
            question.setText("please enter your location");
            submit.setVisible(true);
            textField.setVisible(true);
            back.setVisible(true);


        }
        if (e.getSource()== submit){
            if (textField.getText().equalsIgnoreCase("New York")){
                submit.setVisible(false);
                textField.setVisible(false);
                option1.setVisible(true);
                option2.setVisible(true);
                question.setText("");
                back.setVisible(true);


            }else{
                question.setText("this is still in beta testing");
            }
        }
        if (e.getSource()== back){
            button.setVisible(true);
            button1.setVisible(true);
            submit.setVisible(false);
            option1.setVisible(false);
            option2.setVisible(false);
            back.setVisible(false);
            question.setText("How may we help you today?");
        }else{
            question.setText("this is still in beta testing");
        }
    }
}
