

import javax.swing.*;
import javax.swing.border.TitledBorder;

import java.awt.event.*;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.GridLayout;
/*
 * Temporary Quick layout for GUI
 */
public class GUI extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2975177357369104744L;
	private JTextField textField;
	private JPasswordField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JPasswordField textField_4;
	private JTextArea txtArea1;
	
	public GUI() {
		setTitle("CardinalBot");
		setSize(469, 382);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		SpringLayout springLayout = new SpringLayout();
		getContentPane().setLayout(springLayout);
		
		JPanel panel = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel, 0, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel, 0, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel, 350, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel, 453, SpringLayout.WEST, getContentPane());
		getContentPane().add(panel);
		SpringLayout sl_panel = new SpringLayout();
		panel.setLayout(sl_panel);
		
		JPanel panel_1 = new JPanel();
		sl_panel.putConstraint(SpringLayout.SOUTH, panel_1, 103, SpringLayout.NORTH, panel);
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Reddit", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		sl_panel.putConstraint(SpringLayout.NORTH, panel_1, 10, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, panel_1, 10, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.EAST, panel_1, 443, SpringLayout.WEST, panel);
		panel.add(panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{57, 86, 86, 86, 46, 0};
		gbl_panel_1.rowHeights = new int[]{20, 0, 0, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.anchor = GridBagConstraints.NORTHWEST;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 0;
		panel_1.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		sl_panel.putConstraint(SpringLayout.NORTH, panel_2, 7, SpringLayout.SOUTH, panel_1);
		sl_panel.putConstraint(SpringLayout.WEST, panel_2, 0, SpringLayout.WEST, panel_1);
		sl_panel.putConstraint(SpringLayout.EAST, panel_2, -10, SpringLayout.EAST, panel);
		panel_2.setBorder(new TitledBorder(null, "Twitter", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		
		JLabel lblNewLabel = new JLabel("Username");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 2;
		gbc_lblNewLabel.gridy = 0;
		panel_1.add(lblNewLabel, gbc_lblNewLabel);
		
		textField_1 = new JPasswordField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.anchor = GridBagConstraints.NORTHWEST;
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.gridx = 1;
		gbc_textField_1.gridy = 1;
		panel_1.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 2;
		gbc_lblNewLabel_2.gridy = 1;
		panel_1.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		textField_2 = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.anchor = GridBagConstraints.NORTHWEST;
		gbc_textField_2.insets = new Insets(0, 0, 0, 5);
		gbc_textField_2.gridx = 1;
		gbc_textField_2.gridy = 2;
		panel_1.add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Subreddit");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_3.gridx = 2;
		gbc_lblNewLabel_3.gridy = 2;
		panel_1.add(lblNewLabel_3, gbc_lblNewLabel_3);
		panel.add(panel_2);
		
		JButton btnGo = new JButton("Go");
		sl_panel.putConstraint(SpringLayout.SOUTH, btnGo, -10, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, btnGo, -196, SpringLayout.EAST, panel);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[]{102, 86, 86, 46, 0};
		gbl_panel_2.rowHeights = new int[]{20, 0, 0};
		gbl_panel_2.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_2.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);
		
		textField_3 = new JTextField();
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.anchor = GridBagConstraints.NORTHWEST;
		gbc_textField_3.insets = new Insets(0, 0, 5, 5);
		gbc_textField_3.gridx = 1;
		gbc_textField_3.gridy = 0;
		panel_2.add(textField_3, gbc_textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 2;
		gbc_lblNewLabel_1.gridy = 0;
		panel_2.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		textField_4 = new JPasswordField();
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.anchor = GridBagConstraints.NORTHWEST;
		gbc_textField_4.insets = new Insets(0, 0, 0, 5);
		gbc_textField_4.gridx = 1;
		gbc_textField_4.gridy = 1;
		panel_2.add(textField_4, gbc_textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Password");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_4.gridx = 2;
		gbc_lblNewLabel_4.gridy = 1;
		panel_2.add(lblNewLabel_4, gbc_lblNewLabel_4);
		panel.add(btnGo);
		
		JPanel panel_3 = new JPanel();
		sl_panel.putConstraint(SpringLayout.NORTH, panel_3, 197, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, panel_3, -6, SpringLayout.NORTH, btnGo);
		sl_panel.putConstraint(SpringLayout.SOUTH, panel_2, -6, SpringLayout.NORTH, panel_3);
		sl_panel.putConstraint(SpringLayout.WEST, panel_3, 0, SpringLayout.WEST, panel_1);
		sl_panel.putConstraint(SpringLayout.EAST, panel_3, 0, SpringLayout.EAST, panel_1);
		panel_3.setBorder(new TitledBorder(null, "Status", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		panel.add(panel_3);
		panel_3.setLayout(new GridLayout(1, 0, 0, 0));
		
		txtArea1 = new JTextArea(10,10);
		txtArea1.setEditable(false);
		JScrollPane txtStatus = new JScrollPane();
		txtStatus.setViewportView(txtArea1);
		
		panel_3.add(txtStatus);
	}
}
