package nguyentrinhan70.example.com.ui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.*;
//import com.sun.xml.internal.ws.api.server.Container;

public class CuaSoCuaTui extends JFrame {
	public CuaSoCuaTui(String tieude){
		//super(tieude);
		this.setTitle(tieude);
		addControls();
	}
	
	public void addControls() {
		
		//Lấy lớp chứa cửa sổ ra
		java.awt.Container con = getContentPane();
		//Tạo một lớp chứa control
		JPanel pn = new JPanel();
		pn.setBackground(Color.CYAN);
		JButton btn = new JButton("Đây là nút lệnh");
		//Đưa panel lên giao diện
		pn.add(btn);
		con.add(pn);
	}
	public void showWindow() {
		this.setSize(500,400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setVisible(true);
	}

}

