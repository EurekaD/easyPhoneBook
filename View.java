package myPhoneBook;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class View extends JFrame {

	JTextField query_text, result_text;
	JButton query_button, add_button, del_button;
	JTextArea add_input;

	Controller controller;

	View() {
		controller = new Controller(this);

		setTitle("电话簿");
		setBounds(100, 100, 400, 400);

		setLayout(null);

		query_text = new JTextField(11);
		query_text.requestFocus();
		add(query_text);

		query_button = new JButton("查询");
		add(query_button);

		add_button = new JButton("添加");
		add(add_button);

		del_button = new JButton("删除");
		add(del_button);

		result_text = new JTextField();
		result_text.setEditable(false);
		add(result_text);
	
		
		query_text.setBounds(20, 20, 250, 50);
		query_button.setBounds(295, 20, 80, 50);
		add_button.setBounds(295, 140, 80, 50);
		del_button.setBounds(295, 280, 80, 50);
		result_text.setBounds(20, 90, 250, 250);

		controller.setJButton(query_button, add_button, del_button);
		controller.setJTextField(query_text, result_text);

		query_button.setActionCommand("query");
		add_button.setActionCommand("add");
		del_button.setActionCommand("delete");

		query_button.addActionListener(controller);
		add_button.addActionListener(controller);
		del_button.addActionListener(controller);

		setVisible(true);
		validate();
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
	
	public String get_query_text() {
		return query_text.getText();
	}
	
	public void show_result(String query_result) {
		result_text.setText(query_result);
	}
	
	public String[] add_input_window() {
		Add_input add_input = new Add_input();
		
		String str_name = add_input.get_name();
		String str_tel = add_input.get_tel();
		String str[] = new String[]{str_name, str_tel};
		
		return str;
	}

}

class Add_input extends JDialog{
	JTextField name;
	JTextField tel;
	JLabel name_label;
	JLabel tel_label;
	String str_name;
	String str_tel;
	
	Add_input(){

		setTitle("添加");
		setModal(true);
		setBounds(100, 100, 350, 250);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(null);
		
		JLabel name_label = new JLabel("姓名:");
		JLabel tel_label = new JLabel("号码:");
		
		
		
		JTextField name = new JTextField(8);
		JTextField tel = new JTextField(11);
		
		name.requestFocus();
		tel.requestFocus();
		
		JPanel panel = new JPanel();
		
		panel.add(name_label);
		panel.add(name);
		panel.add(tel_label);
		panel.add(tel);
		
		panel.setLayout(null);
		name_label.setBounds(10,10,65,50);
		name.setBounds(80,10,190,50);
		tel_label.setBounds(10,90,65,50);
		tel.setBounds(80,90,190,50);
		
		
		JButton confirm = new JButton("确认");

		confirm.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						str_name = name.getText();
						str_tel = tel.getText();
						dispose();
					}
				}
			);
		
		panel.setBounds(10,10,280,150);
		confirm.setBounds(240,165,80,50);
		add(panel);
		add(confirm);
		
		setVisible(true);
	}
	
	public String get_name() {
		return str_name;
	}
	public String get_tel() {
		return str_tel;
	}
}
