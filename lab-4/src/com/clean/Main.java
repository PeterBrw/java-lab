package com.clean;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Main {
    private static Quiz firstQuestion = new Quiz("Who create Java", "D. Ritchie", "B. Stroustrup", "J. Gosling", "B. Eich", "J. Gosling");
    private static Quiz secondQuestion = new Quiz("When Java was released?", "Jan 1996", "Feb 1991", "Dec 1995", "Oct 1985", "Jan 1996");
    private static Quiz thirdQuestion = new Quiz("What's the last stable release of Java?", "14.0.0", "15.0.1", "14.5.0", "13.0.9", "15.0.1");
    private static Quiz fourthQuestion = new Quiz("What kind of programming language is Java?", "Procedural", "Functional", "Imperative", "OOP", "OOP");
    private static Quiz fifthQuestion = new Quiz("What rank was Java ranked in 2020 by TIOBE Index?", "1", "2", "3", "4", "2");

    private static JRadioButton option1a, option1b, option1c, option1d, option2a, option2b, option2c, option2d, option3a, option3b, option3c, option3d, option4a, option4b, option4c, option4d, option5a, option5b, option5c, option5d;
    private static JButton firstButton, firstNextButton, secondButton, secondNextButton, thirdButton, thridNextButton, fourthButton, fourthNextButton, fifthButton, lastButton;
    private static Integer correctAnswers = 0;

    public static void main(String[] args) {
        JPanel panel = buildPanel();
        addActionToButtonOne(panel);

    }

    private static JPanel buildPanel() {
        JFrame frame = new JFrame("Quiz");
        frame.setSize(550, 230);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);

        placeFirstComponent(panel);

        frame.setVisible(true);

        return panel;
    }

    private static void placeFirstComponent(JPanel panel) {
        panel.setLayout(null);

        JLabel titleLabel = new JLabel("Java World!", SwingConstants.CENTER);
        titleLabel.setBounds(10, 10, 530, 25);
        panel.add(titleLabel);

        JLabel questionLabel = new JLabel(firstQuestion.getQuestion(), SwingConstants.CENTER);
        questionLabel.setBounds(10, 60, 530, 25);
        panel.add(questionLabel);

        option1a = new JRadioButton();
        option1a.setText(firstQuestion.getOption1());
        option1a.setBounds(20, 90, 120, 25);
        panel.add(option1a);

        option1b = new JRadioButton();
        option1b.setText(firstQuestion.getOption2());
        option1b.setBounds(150, 90, 120, 25);
        panel.add(option1b);

        option1c = new JRadioButton();
        option1c.setText(firstQuestion.getOption3());
        option1c.setBounds(280, 90, 120, 25);
        panel.add(option1c);

        option1d = new JRadioButton();
        option1d.setText(firstQuestion.getOption4());
        option1d.setBounds(410, 90, 120, 25);
        panel.add(option1d);

        firstButton = new JButton("Check");
        firstButton.setBounds(30, 150, 200, 25);
        panel.add(firstButton);

        firstNextButton = new JButton("Next");
        firstNextButton.setBounds(300, 150, 200, 25);
        panel.add(firstNextButton);
    }

    private static void placeSecondComponent(JPanel panel) {
        panel.setLayout(null);

        JLabel titleLabel = new JLabel("Java World!", SwingConstants.CENTER);
        titleLabel.setBounds(10, 10, 530, 25);
        panel.add(titleLabel);

        JLabel questionLabel = new JLabel(secondQuestion.getQuestion(), SwingConstants.CENTER);
        questionLabel.setBounds(10, 60, 530, 25);
        panel.add(questionLabel);

        option2a = new JRadioButton();
        option2a.setText(secondQuestion.getOption1());
        option2a.setBounds(20, 90, 120, 25);
        panel.add(option2a);

        option2b = new JRadioButton();
        option2b.setText(secondQuestion.getOption2());
        option2b.setBounds(150, 90, 120, 25);
        panel.add(option2b);

        option2c = new JRadioButton();
        option2c.setText(secondQuestion.getOption3());
        option2c.setBounds(280, 90, 120, 25);
        panel.add(option2c);

        option2d = new JRadioButton();
        option2d.setText(secondQuestion.getOption4());
        option2d.setBounds(410, 90, 120, 25);
        panel.add(option2d);

        secondButton = new JButton("Check");
        secondButton.setBounds(30, 150, 200, 25);
        panel.add(secondButton);

        secondNextButton = new JButton("Next");
        secondNextButton.setBounds(300, 150, 200, 25);
        panel.add(secondNextButton);
    }

    private static void placeThirdComponent(JPanel panel) {
        panel.setLayout(null);

        JLabel titleLabel = new JLabel("Java World! ", SwingConstants.CENTER);
        titleLabel.setBounds(10, 10, 530, 25);
        panel.add(titleLabel);

        JLabel questionLabel = new JLabel(thirdQuestion.getQuestion(), SwingConstants.CENTER);
        questionLabel.setBounds(10, 60, 530, 25);
        panel.add(questionLabel);

        option3a = new JRadioButton();
        option3a.setText(thirdQuestion.getOption1());
        option3a.setBounds(20, 90, 120, 25);
        panel.add(option3a);

        option3b = new JRadioButton();
        option3b.setText(thirdQuestion.getOption2());
        option3b.setBounds(150, 90, 120, 25);
        panel.add(option3b);

        option3c = new JRadioButton();
        option3c.setText(thirdQuestion.getOption3());
        option3c.setBounds(280, 90, 120, 25);
        panel.add(option3c);

        option3d = new JRadioButton();
        option3d.setText(thirdQuestion.getOption4());
        option3d.setBounds(410, 90, 120, 25);
        panel.add(option3d);

        thirdButton = new JButton("Check");
        thirdButton.setBounds(30, 150, 200, 25);
        panel.add(thirdButton);

        thridNextButton = new JButton("Next");
        thridNextButton.setBounds(300, 150, 200, 25);
        panel.add(thridNextButton);
    }

    private static void placeFourthComponent(JPanel panel) {
        panel.setLayout(null);

        JLabel titleLabel = new JLabel("Java World!", SwingConstants.CENTER);
        titleLabel.setBounds(10, 10, 530, 25);
        panel.add(titleLabel);

        JLabel questionLabel = new JLabel(fourthQuestion.getQuestion(), SwingConstants.CENTER);
        questionLabel.setBounds(10, 60, 530, 25);
        panel.add(questionLabel);

        option4a = new JRadioButton();
        option4a.setText(fourthQuestion.getOption1());
        option4a.setBounds(20, 90, 120, 25);
        panel.add(option4a);

        option4b = new JRadioButton();
        option4b.setText(fourthQuestion.getOption2());
        option4b.setBounds(150, 90, 120, 25);
        panel.add(option4b);

        option4c = new JRadioButton();
        option4c.setText(fourthQuestion.getOption3());
        option4c.setBounds(280, 90, 120, 25);
        panel.add(option4c);

        option4d = new JRadioButton();
        option4d.setText(fourthQuestion.getOption4());
        option4d.setBounds(410, 90, 120, 25);
        panel.add(option4d);

        fourthButton = new JButton("Check");
        fourthButton.setBounds(30, 150, 200, 25);
        panel.add(fourthButton);

        fourthNextButton = new JButton("Next");
        fourthNextButton.setBounds(300, 150, 200, 25);
        panel.add(fourthNextButton);
    }

    private static void placeFifthComponent(JPanel panel) {
        panel.setLayout(null);

        JLabel titleLabel = new JLabel("Java World!", SwingConstants.CENTER);
        titleLabel.setBounds(10, 10, 530, 25);
        panel.add(titleLabel);

        JLabel questionLabel = new JLabel(fifthQuestion.getQuestion(), SwingConstants.CENTER);
        questionLabel.setBounds(10, 60, 530, 25);
        panel.add(questionLabel);

        option5a = new JRadioButton();
        option5a.setText(fifthQuestion.getOption1());
        option5a.setBounds(20, 90, 120, 25);
        panel.add(option5a);

        option5b = new JRadioButton();
        option5b.setText(fifthQuestion.getOption2());
        option5b.setBounds(150, 90, 120, 25);
        panel.add(option5b);

        option5c = new JRadioButton();
        option5c.setText(fifthQuestion.getOption3());
        option5c.setBounds(280, 90, 120, 25);
        panel.add(option5c);

        option5d = new JRadioButton();
        option5d.setText(fifthQuestion.getOption4());
        option5d.setBounds(410, 90, 120, 25);
        panel.add(option5d);

        fifthButton = new JButton("Check");
        fifthButton.setBounds(30, 150, 200, 25);
        panel.add(fifthButton);

        lastButton = new JButton("Finish it");
        lastButton.setBounds(300, 150, 200, 25);
        panel.add(lastButton);
    }

    private static void addActionToButtonOne(JPanel panel) {
        firstButton.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        String answer = null;

                        if (option1a.isSelected())
                            answer = option1a.getText();
                        else if (option1b.isSelected())
                            answer = option1b.getText();
                        else if (option1c.isSelected())
                            answer = option1c.getText();
                        else if (option1d.isSelected())
                            answer = option1d.getText();
                        else
                            JOptionPane.showMessageDialog(panel, "Choose an answer!",
                                    "Error", JOptionPane.ERROR_MESSAGE);

                        JLabel dataLabel;
                        if (answer != null) {
                            if (answer.equals(firstQuestion.getCorrectAnswer())) {
                                dataLabel = new JLabel("You're RIGHT!", SwingConstants.CENTER);
                                dataLabel.setBounds(10, 120, 530, 25);
                                panel.add(dataLabel);
                                correctAnswers++;
                            } else {
                                dataLabel = new JLabel("You're WRONG! The answer is " + firstQuestion.getCorrectAnswer(), SwingConstants.CENTER);
                                dataLabel.setBounds(10, 120, 530, 25);
                                panel.add(dataLabel);
                            }
                        }
                        panel.updateUI();
                    }
                }
        );

        firstNextButton.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        panel.removeAll();
                        placeSecondComponent(panel);
                        panel.updateUI();
                        addActionToButtonTwo(panel);
                    }
                }
        );
    }

    private static void addActionToButtonTwo(JPanel panel) {
        secondButton.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        String answer = null;

                        if (option2a.isSelected())
                            answer = option2a.getText();
                        else
                        if (option2b.isSelected())
                            answer = option2b.getText();
                        else
                        if (option2c.isSelected())
                            answer = option2c.getText();
                        else
                        if (option2d.isSelected())
                            answer = option2d.getText();
                        else
                            JOptionPane.showMessageDialog(panel, "Choose an answer!",
                                    "Error", JOptionPane.ERROR_MESSAGE);

                        JLabel dataLabel;
                        if (answer != null) {
                            if (answer.equals(secondQuestion.getCorrectAnswer())) {
                                dataLabel = new JLabel("You're RIGHT!", SwingConstants.CENTER);
                                dataLabel.setBounds(10, 120, 530, 25);
                                panel.add(dataLabel);
                                correctAnswers++;
                            } else {
                                dataLabel = new JLabel("You're WRONG! The answer is " + secondQuestion.getCorrectAnswer(), SwingConstants.CENTER);
                                dataLabel.setBounds(10, 120, 530, 25);
                                panel.add(dataLabel);
                            }
                        }
                        panel.updateUI();
                    }
                }
        );
        secondNextButton.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        panel.removeAll();
                        placeThirdComponent(panel);
                        panel.updateUI();
                        addActionToButtonThree(panel);
                    }
                }
        );
    }

    private static void addActionToButtonThree(JPanel panel) {
        thirdButton.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        String answer = null;

                        if (option3a.isSelected())
                            answer = option3a.getText();
                        else if (option3b.isSelected())
                            answer = option3b.getText();
                        else if (option3c.isSelected())
                            answer = option3c.getText();
                        else
                        if (option3d.isSelected())
                            answer = option3d.getText();
                        else
                            JOptionPane.showMessageDialog(panel, "Choose an answer!",
                                    "Error", JOptionPane.ERROR_MESSAGE);

                        JLabel dataLabel;
                        if (answer != null) {
                            if (answer.equals(thirdQuestion.getCorrectAnswer())) {
                                dataLabel = new JLabel("You're RIGHT!", SwingConstants.CENTER);
                                dataLabel.setBounds(10, 120, 530, 25);
                                panel.add(dataLabel);
                                correctAnswers++;
                            } else {
                                dataLabel = new JLabel("You're WRONG! The correct answer is " + thirdQuestion.getCorrectAnswer(), SwingConstants.CENTER);
                                dataLabel.setBounds(10, 120, 530, 25);
                                panel.add(dataLabel);
                            }
                        }
                        panel.updateUI();
                    }
                }
        );
        thridNextButton.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        panel.removeAll();
                        placeFourthComponent(panel);
                        panel.updateUI();
                        addActionToButtonFour(panel);
                    }
                }
        );
    }

    private static void addActionToButtonFour(JPanel panel) {
        fourthButton.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        String answer = null;

                        if (option4a.isSelected())
                            answer = option4a.getText();
                        else
                        if (option4b.isSelected())
                            answer = option4b.getText();
                        else
                        if (option4c.isSelected())
                            answer = option4c.getText();
                        else
                        if (option4d.isSelected())
                            answer = option4d.getText();
                        else
                            JOptionPane.showMessageDialog(panel, "Check an answer!!",
                                    "Error", JOptionPane.ERROR_MESSAGE);

                        JLabel dataLabel;
                        if (answer != null) {
                            if (answer.equals(fourthQuestion.getCorrectAnswer())) {
                                dataLabel = new JLabel("You're RIGHT!", SwingConstants.CENTER);
                                dataLabel.setBounds(10, 120, 530, 25);
                                panel.add(dataLabel);
                                correctAnswers++;
                            } else {
                                dataLabel = new JLabel("You're WRONG! The correct answer is " + fourthQuestion.getCorrectAnswer(), SwingConstants.CENTER);
                                dataLabel.setBounds(10, 120, 530, 25);
                                panel.add(dataLabel);
                            }
                        }
                        panel.updateUI();
                    }
                }
        );
        fourthNextButton.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        panel.removeAll();
                        placeFifthComponent(panel);
                        panel.updateUI();
                        addActionToButtonFive(panel);
                    }
                }
        );
    }

    private static void addActionToButtonFive(JPanel panel) {
        fifthButton.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        String answer = null;

                        if (option5a.isSelected())
                            answer = option5a.getText();
                        else
                        if (option5b.isSelected())
                            answer = option5b.getText();
                        else
                        if (option5c.isSelected())
                            answer = option5c.getText();
                        else
                        if (option5d.isSelected())
                            answer = option5d.getText();
                        else
                            JOptionPane.showMessageDialog(panel, "Check an answer!",
                                    "Error", JOptionPane.ERROR_MESSAGE);

                        JLabel dataLabel;
                        if (answer != null) {
                            if (answer.equals(fifthQuestion.getCorrectAnswer())) {
                                dataLabel = new JLabel("You're RIGHT!", SwingConstants.CENTER);
                                dataLabel.setBounds(10, 120, 530, 25);
                                panel.add(dataLabel);
                                correctAnswers++;
                            } else {
                                dataLabel = new JLabel("You're WRONG! The correct answer is " + fifthQuestion.getCorrectAnswer(), SwingConstants.CENTER);
                                dataLabel.setBounds(10, 120, 530, 25);
                                panel.add(dataLabel);
                            }
                        }
                        panel.updateUI();
                    }
                }
        );
        lastButton.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        panel.removeAll();
                        JLabel L1 = new JLabel(correctAnswers + " correct answers and " + (5 - correctAnswers) + " wrong answers", SwingConstants.CENTER);
                        L1.setBounds(10, 75, 530, 25);
                        panel.add(L1);
                        JLabel L2 = new JLabel(20 * correctAnswers + "%", SwingConstants.CENTER);
                        L2.setBounds(10, 110, 530, 25);
                        panel.add(L2);
                        panel.updateUI();

                    }
                }
        );
    }
}