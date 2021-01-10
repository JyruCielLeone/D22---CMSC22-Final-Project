package com.d22;

import java.util.ArrayList;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.event.*;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;

public class D22Main extends JFrame {

	private static final long serialVersionUID = 1;
	private JPanel contentPane;

	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					D22Main app = new D22Main();
					app.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public D22Main() {
		
		setResizable(false);
		setTitle("D22");
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 444, 444);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel inputPanel = new JPanel();
		inputPanel.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		inputPanel.setBackground(new Color(255, 255, 255));
		inputPanel.setBounds(10, 11, 254, 384);
		contentPane.add(inputPanel);
		inputPanel.setLayout(null);
		
		
		
		JLabel numberOfDiceTitle = new JLabel("Number of Dice");
		numberOfDiceTitle.setHorizontalAlignment(SwingConstants.CENTER);
		numberOfDiceTitle.setForeground(new Color(0, 0, 0));
		numberOfDiceTitle.setBounds(10, 11, 144, 24);
		inputPanel.add(numberOfDiceTitle);
		
		JLabel numberOfDiceLabel = new JLabel();
		numberOfDiceLabel.setHorizontalAlignment(SwingConstants.CENTER);
		numberOfDiceLabel.setBounds(170, 16, 74, 14);
		numberOfDiceLabel.setText("1d");
		inputPanel.add(numberOfDiceLabel);
		
		JSlider diceSlider = new JSlider();
		diceSlider.setMajorTickSpacing(2);
		diceSlider.setPaintLabels(true);
		diceSlider.setMinorTickSpacing(1);
		diceSlider.setPaintTicks(true);
		diceSlider.setForeground(new Color(128, 128, 128));
		diceSlider.setBackground(new Color(255, 255, 255));
		diceSlider.setMaximum(22);
		diceSlider.setMinimum(1);
		diceSlider.setSnapToTicks(true);
		diceSlider.setBounds(10, 49, 234, 45);
		diceSlider.setValue(1);
		diceSlider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				numberOfDiceLabel.setText(diceSlider.getValue() + "d");
			}
		});
		inputPanel.add(diceSlider);
		
		
		
		JLabel dieSidesTitle = new JLabel("Die Sides");
		dieSidesTitle.setForeground(new Color(0, 0, 0));
		dieSidesTitle.setHorizontalAlignment(SwingConstants.CENTER);
		dieSidesTitle.setBounds(10, 134, 144, 24);
		inputPanel.add(dieSidesTitle);
		
		JComboBox<Integer> diceSidesBox = new JComboBox<>();
		diceSidesBox.addItem(4);
		diceSidesBox.addItem(6);
		diceSidesBox.addItem(8);
		diceSidesBox.addItem(10);
		diceSidesBox.addItem(12);
		diceSidesBox.addItem(20);
		diceSidesBox.addItem(22);
		diceSidesBox.setMaximumRowCount(7);
		diceSidesBox.setBounds(170, 134, 74, 24);
		diceSidesBox.setSelectedIndex(0);
		inputPanel.add(diceSidesBox);
		
		
		
		JLabel modifierTitle = new JLabel("Modifier");
		modifierTitle.setHorizontalAlignment(SwingConstants.CENTER);
		modifierTitle.setForeground(new Color(0, 0, 0));
		modifierTitle.setBounds(10, 194, 144, 14);
		inputPanel.add(modifierTitle);
		
		JLabel modifiersLabel = new JLabel();
		modifiersLabel.setHorizontalAlignment(SwingConstants.CENTER);
		modifiersLabel.setBounds(170, 194, 74, 14);
		modifiersLabel.setText("0");
		inputPanel.add(modifiersLabel);
		
		JSlider modifiersSlider = new JSlider();
		modifiersSlider.setMinorTickSpacing(1);
		modifiersSlider.setPaintLabels(true);
		modifiersSlider.setMajorTickSpacing(5);
		modifiersSlider.setBackground(new Color(255, 255, 255));
		modifiersSlider.setMinimum(-20);
		modifiersSlider.setMaximum(20);
		modifiersSlider.setPaintTicks(true);
		modifiersSlider.setForeground(new Color(128, 128, 128));
		modifiersSlider.setSnapToTicks(true);
		modifiersSlider.setBounds(10, 230, 234, 45);
		modifiersSlider.setValue(0);
		modifiersSlider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				modifiersLabel.setText(modifiersSlider.getValue() + "");
			}
		});
		inputPanel.add(modifiersSlider);
		
		
		
		JPanel rollDisplayPanel = new JPanel();
		rollDisplayPanel.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		rollDisplayPanel.setBackground(new Color(255, 255, 255));
		rollDisplayPanel.setBounds(274, 11, 144, 384);
		contentPane.add(rollDisplayPanel);
		rollDisplayPanel.setLayout(null);
		
		JLabel rollTitle = new JLabel("1d4+0");
		rollTitle.setHorizontalAlignment(SwingConstants.CENTER);
		rollTitle.setForeground(new Color(0, 0, 0));
		rollTitle.setBounds(10, 11, 124, 34);
		rollDisplayPanel.add(rollTitle);
		
		JLabel rollLabel = new JLabel("");
		rollLabel.setHorizontalAlignment(SwingConstants.CENTER);
		rollLabel.setForeground(new Color(0, 0, 0));
		rollLabel.setBounds(10, 44, 124, 124);
		rollDisplayPanel.add(rollLabel);
		
		JLabel rollTotalTitle = new JLabel("Modified Total:");
		rollTotalTitle.setHorizontalAlignment(SwingConstants.CENTER);
		rollTotalTitle.setForeground(new Color(0, 0, 0));
		rollTotalTitle.setBounds(10, 184, 124, 34);
		rollDisplayPanel.add(rollTotalTitle);
		
		JLabel rollTotalLabel = new JLabel("");
		rollTotalLabel.setHorizontalAlignment(SwingConstants.CENTER);
		rollTotalLabel.setForeground(new Color(0, 0, 0));
		rollTotalLabel.setBounds(10, 229, 124, 144);
		rollDisplayPanel.add(rollTotalLabel);
		
		JButton rollButton = new JButton("Roll");
		rollButton.setBackground(new Color(255, 255, 255));
		rollButton.setForeground(new Color(0, 0, 0));
		rollButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int diceNumber = diceSlider.getValue();
				int diceSides = (int) diceSidesBox.getSelectedItem();
				int rollModifier = modifiersSlider.getValue();
				if (rollModifier == 0){
					rollTitle.setText(diceNumber + "d" + diceSides);
				}
				else if (rollModifier < 0){
					rollTitle.setText(diceNumber + "d" + diceSides + rollModifier);
				}
				else {
					rollTitle.setText(diceNumber + "d" + diceSides + "+" + rollModifier);
				}
				DiceRoll userRoll = new DiceRoll();
				ArrayList<Integer> userResult = userRoll.rollNew(diceNumber, diceSides, rollModifier);
				String allRolls = userRoll.displayRolls(userResult);
				int modifiedTotal = userRoll.addRolls(userResult, rollModifier);
				rollLabel.setText("<html>"+ allRolls +"</html>");
				if (modifiedTotal < 0) {
					rollTotalLabel.setForeground(new Color(255, 0, 0));
					rollTotalLabel.setText(modifiedTotal + "");
				}
				else if (modifiedTotal >= 20) {
					rollTotalLabel.setForeground(new Color(0, 0, 255));
					rollTotalLabel.setText(modifiedTotal + "");
				}
				else {
					rollTotalLabel.setForeground(new Color(255, 0, 255));
					rollTotalLabel.setText(modifiedTotal + "");
				}
			}
		});
		rollButton.setBounds(10, 299, 234, 74);
		inputPanel.add(rollButton);
		
	}
	
}