

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
	private JPasswordField reddPassField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JPasswordField twitPassField;
	private JTextArea txtArea1;
	
	public GUI() {
		setTitle("CardinalBot");
		setSize(460, 255);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		SpringLayout springLayout = new SpringLayout();
		getContentPane().setLayout(springLayout);
		
		JPanel panel = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel, 0, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel, 0, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel, 343, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel, 453, SpringLayout.WEST, getContentPane());
		getContentPane().add(panel);
		SpringLayout sl_panel = new SpringLayout();
		panel.setLayout(sl_panel);
		
		JPanel panel_1 = new JPanel();
		sl_panel.putConstraint(SpringLayout.NORTH, panel_1, 10, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, panel_1, 10, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, panel_1, -247, SpringLayout.SOUTH, panel);
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Reddit", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		panel.add(panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{57, 86, 0, 86, 86, 46, 0};
		gbl_panel_1.rowHeights = new int[]{20, 0, 0, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JPanel panel_2 = new JPanel();
		sl_panel.putConstraint(SpringLayout.WEST, panel_2, 215, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.EAST, panel_1, -6, SpringLayout.WEST, panel_2);
		sl_panel.putConstraint(SpringLayout.NORTH, panel_2, 22, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, panel_2, 0, SpringLayout.SOUTH, panel_1);
		sl_panel.putConstraint(SpringLayout.EAST, panel_2, -79, SpringLayout.EAST, panel);
		panel_2.setBorder(new TitledBorder(null, "Twitter", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.anchor = GridBagConstraints.NORTH;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 0;
		panel_1.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Username");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 2;
		gbc_lblNewLabel.gridy = 0;
		panel_1.add(lblNewLabel, gbc_lblNewLabel);
		
		reddPassField = new JPasswordField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.anchor = GridBagConstraints.NORTH;
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.gridx = 1;
		gbc_textField_1.gridy = 1;
		panel_1.add(reddPassField, gbc_textField_1);
		reddPassField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 2;
		gbc_lblNewLabel_2.gridy = 1;
		panel_1.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		textField_2 = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.anchor = GridBagConstraints.NORTH;
		gbc_textField_2.insets = new Insets(0, 0, 0, 5);
		gbc_textField_2.gridx = 1;
		gbc_textField_2.gridy = 2;
		panel_1.add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
		panel.add(panel_2);
		
		JButton btnGo = new JButton("Go");
		sl_panel.putConstraint(SpringLayout.WEST, btnGo, 6, SpringLayout.EAST, panel_2);
		btnGo.addActionListener(new GoCapture());
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[]{102, 86, 0, 86, 46, 0};
		gbl_panel_2.rowHeights = new int[]{20, 0, 0};
		gbl_panel_2.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_2.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);
		
		textField_3 = new JTextField();
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.anchor = GridBagConstraints.NORTH;
		gbc_textField_3.insets = new Insets(0, 0, 5, 5);
		gbc_textField_3.gridx = 1;
		gbc_textField_3.gridy = 0;
		panel_2.add(textField_3, gbc_textField_3);
		textField_3.setColumns(10);
		panel.add(btnGo);
		
		JPanel panel_3 = new JPanel();
		sl_panel.putConstraint(SpringLayout.NORTH, panel_3, 6, SpringLayout.SOUTH, panel_1);
		sl_panel.putConstraint(SpringLayout.SOUTH, panel_3, -127, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, btnGo, -38, SpringLayout.NORTH, panel_3);
		sl_panel.putConstraint(SpringLayout.WEST, panel_3, 0, SpringLayout.WEST, panel_1);
		sl_panel.putConstraint(SpringLayout.EAST, panel_3, -10, SpringLayout.EAST, panel);
		
		JLabel lblNewLabel_3 = new JLabel("Subreddit");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_3.gridx = 2;
		gbc_lblNewLabel_3.gridy = 2;
		panel_1.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 2;
		gbc_lblNewLabel_1.gridy = 0;
		panel_2.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		twitPassField = new JPasswordField();
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.anchor = GridBagConstraints.NORTH;
		gbc_textField_4.insets = new Insets(0, 0, 0, 5);
		gbc_textField_4.gridx = 1;
		gbc_textField_4.gridy = 1;
		panel_2.add(twitPassField, gbc_textField_4);
		twitPassField.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Password");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_4.gridx = 2;
		gbc_lblNewLabel_4.gridy = 1;
		panel_2.add(lblNewLabel_4, gbc_lblNewLabel_4);
		panel_3.setBorder(new TitledBorder(null, "Status", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		panel.add(panel_3);
		panel_3.setLayout(new GridLayout(1, 0, 0, 0));
		
		txtArea1 = new JTextArea(10,10);
		txtArea1.setLineWrap(true);
		txtArea1.setWrapStyleWord(true);
		txtArea1.setEditable(false);
		JScrollPane txtStatus = new JScrollPane();
		txtStatus.setViewportView(txtArea1);
		
		panel_3.add(txtStatus);
	}
	private class GoCapture implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			try{
			String status = "Gathering Information";
			txtArea1.setText(status);
			String rUn = textField.getText();
			char[] rPw = reddPassField.getPassword();
			String rSubR = textField_2.getText();
			String twitUn= textField_3.getText();
			char[] twitPw = twitPassField.getPassword();
			}catch (NullPointerException e1){
			String nullFields = "Error: Fields can't be blank";
			txtArea1.setText(nullFields);
			}
			
		}
	}
}
