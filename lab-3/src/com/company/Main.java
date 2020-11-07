package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main implements ActionListener {
    private JFrame frame;
    private JPanel panel;
    private  JTextField firstNameInput;
    private  JTextField lastNameInput;
    private JTextField ageInput;
    private JRadioButton male;
    private JRadioButton female;
    private ButtonGroup group;
    private JCheckBox checkBox;
    private JTextArea addressInput;
    private JButton save;
    private JLabel firstNameLabel;
    private JLabel lastNameLabel;
    private JLabel ageLabel;
    private JLabel gender;
    private JLabel addressLabel;

    public Main() {
        frame = new JFrame();
        panel = new JPanel();

        panel.setLayout(null);

        firstNameLabel = new JLabel("First Name: ");
        firstNameLabel.setBounds(10, 20, 80, 25);
        panel.add(firstNameLabel);

        firstNameInput = new JTextField(20);
        firstNameInput.setBounds(100,20,165,25);
        panel.add(firstNameInput);

        lastNameLabel = new JLabel("Last Name: ");
        lastNameLabel.setBounds(10, 60, 80, 25);
        panel.add(lastNameLabel);

        lastNameInput = new JTextField(20);
        lastNameInput.setBounds(100, 60, 165, 25);
        panel.add(lastNameInput);

        ageLabel = new JLabel("Age: ");
        ageLabel.setBounds(10, 100, 80, 25);
        panel.add(ageLabel);

        ageInput = new JTextField(20);
        ageInput.setBounds(100, 100, 165, 25);
        panel.add(ageInput);

        gender = new JLabel("Gender: ");
        male = new JRadioButton();
        male.setText("Male");
        female = new JRadioButton();
        female.setText("Female");
        male.setBounds(100, 140, 80, 50);
        female.setBounds(200, 140, 80, 50);
        gender.setBounds(10, 140, 140, 50);
        panel.add(gender);
        panel.add(male);
        panel.add(female);
        group = new ButtonGroup();
        group.add(male);
        group.add(female);

        checkBox = new JCheckBox("Married?");
        checkBox.setBounds(10, 180, 80, 50);
        panel.add(checkBox);

        addressLabel = new JLabel("Address: ");
        addressLabel.setBounds(10, 240, 80, 25);
        panel.add(addressLabel);

        addressInput = new JTextArea(20, 20);
        addressInput.setBounds(100,240,165,100);
        panel.add(addressInput);

       save = new JButton("Save");
       save.setBounds(100, 350, 80, 25);
       save.addActionListener(this);
       panel.add(save);


        frame.add(panel);
        frame.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
        frame.setTitle("Our GUI");
        frame.pack();
        frame.setSize(500, 500);
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new Main();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String firstName = firstNameInput.getText();
        String lastname = lastNameInput.getText();
        Integer age = Integer.parseInt(ageInput.getText());
        String genderS = " ";
        Boolean marriedS = false;
        String address = addressInput.getText();

        if(male.isSelected()) {
            genderS = "Male";
        } else if (female.isSelected()) {
            genderS = "Female";
        } else {
            genderS = "No gender selected!";
        }

        if(checkBox.isSelected()) {
            marriedS = true;
        }

        Person person = new Person(firstName, lastname, age, genderS, marriedS, address);

        panel.updateUI();
        panel.removeAll();

        firstNameLabel = new JLabel("First Name: " + person.getFirstName());
        firstNameLabel.setBounds(10,20,200,25);
        panel.add(firstNameLabel);
        lastNameLabel = new JLabel("Last Name: " + person.getLastName());
        lastNameLabel.setBounds(10,60,200,25);
        panel.add(lastNameLabel);
        ageLabel = new JLabel("Age: " + person.getAge());
        ageLabel.setBounds(10,100,200,25);
        panel.add(ageLabel);
        gender = new JLabel("Gender: " + person.getGender() );
        gender.setBounds(10,140,200,25);
        panel.add(gender);
        JLabel married = new JLabel("Married: " + person.isMarried() );
        married.setBounds(10,180,200,25);
        panel.add(married);
        addressLabel = new JLabel("Address: " + person.getAddress() );
        addressLabel.setBounds(10,220,200,25);
        panel.add(addressLabel);
    }
}
