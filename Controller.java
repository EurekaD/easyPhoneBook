package myPhoneBook;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

public class Controller implements ActionListener{
	
	JTextField query_text,result_text;
	JButton query_button, add_button, del_button;
	View view;
	
	Model model = new Model();
	
	Controller(View view){
		this.view = view;
	}
	
	public void setJTextField(JTextField... t) {
		query_text = t[0];
		result_text = t[1];

	}

	public void setJButton(JButton... button) {
		query_button = button[0];
		add_button = button[1];
		del_button = button[2];
	}
	
	
	public void query() {
		String query_name = view.get_query_text();
		String query_result = model.get(query_name);
		view.show_result(query_result);
	}
	public void delete() {
//		Êó±êÊÂ¼þ
	}
	public void add() {
		String[] str = view.add_input_window();
		String str_name = str[0];
		String str_tel = str[1];
//		System.out.println(str_name);
//		System.out.println(str_tel);
		
		model.put(str_name, str_tel);
		
	}
	
	
	public void actionPerformed(ActionEvent e) {
		String str = e.getActionCommand();
		if (str.equals("query")) {
			query();
		}
		else if(str.equals("delete")) {
			delete();
		}
		else if(str.equals("add")) {
			add();
		}
		
	}
	
}
