package khoalb;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ManHinhTinhToan extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtKQ;
	public ManHinhTinhToan() {
		setFont(new Font("Dialog", Font.PLAIN, 16));
		setTitle("Chương Trình Tính Toán đơn giản");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 625, 382);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nhập số thứ nhất (a)");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(62, 26, 161, 48);
		contentPane.add(lblNewLabel);
		
		JLabel lblNhpSTh = new JLabel("Nhập số thứ hai (b)");
		lblNhpSTh.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNhpSTh.setBounds(62, 84, 161, 48);
		contentPane.add(lblNhpSTh);
		
		txtA = new JTextField();
		txtA.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtA.setBounds(225, 37, 336, 37);
		contentPane.add(txtA);
		txtA.setColumns(10);
		
		txtB = new JTextField();
		txtB.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtB.setColumns(10);
		txtB.setBounds(225, 84, 336, 37);
		contentPane.add(txtB);
		
		JButton btnCong = new JButton("Cộng");
		btnCong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code xử lý cộng
				//viết lệnh xử lý ở một thủ tục, rồi gọi ở đây
				HamXuLyCong();
			}
		});
		btnCong.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCong.setBounds(53, 181, 85, 37);
		contentPane.add(btnCong);
		
		JButton btnTru = new JButton("Trừ");
		btnTru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code xử lý trừ
				//viết lệnh xử lý ở một thủ tục, rồi gọi ở đây
				HamXuLyTru();
			}
		});
		btnTru.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnTru.setBounds(167, 181, 85, 37);
		contentPane.add(btnTru);
		
		JButton btnNhan = new JButton("Nhân");
		btnNhan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code xử lý nhân
				//viết lệnh xử lý ở một thủ tục, rồi gọi ở đây
				HamXuLyNhan();
			}
		});
		btnNhan.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNhan.setBounds(289, 181, 85, 37);
		contentPane.add(btnNhan);
		
		JButton btnChia = new JButton("Chia");
		btnChia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code xử lý chia
				//viết lệnh xử lý ở một thủ tục, rồi gọi ở đây
				HamXuLyChia();
			}
		});
		btnChia.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnChia.setBounds(423, 181, 85, 37);
		contentPane.add(btnChia);
		
		txtKQ = new JTextField();
		txtKQ.setEditable(false);
		txtKQ.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtKQ.setColumns(10);
		txtKQ.setBounds(225, 273, 336, 37);
		contentPane.add(txtKQ);
		
		JLabel lblHinKtQu = new JLabel("Kết quả tính toán:");
		lblHinKtQu.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblHinKtQu.setBounds(35, 267, 161, 48);
		contentPane.add(lblHinKtQu);
	}//hết hàm tạo
	void HamXuLyCong() {
		//lấy dữ liệu từ điều khiển
		String str_soA = txtA.getText();
		String str_soB = txtB.getText();
		//CHUYỂN KIỀU
		double soA = Double.parseDouble(str_soA);
		double soB = Double.parseDouble(str_soB);
		//tính toán
		double tong = soA + soB;
		//Đưa ra hiển thị lên điều khiển
		txtKQ.setText(String.valueOf(tong));
	}
	void HamXuLyTru() {
		//lấy dữ liệu từ điều khiển
				String str_soA = txtA.getText();
				String str_soB = txtB.getText();
				//CHUYỂN KIỀU
				double soA = Double.parseDouble(str_soA);
				double soB = Double.parseDouble(str_soB);
				//tính toán
				double hieu = soA - soB;
				//Đưa ra hiển thị lên điều khiển
				txtKQ.setText(String.valueOf(hieu));
	}
	void HamXuLyNhan() {
		//lấy dữ liệu từ điều khiển
				String str_soA = txtA.getText();
				String str_soB = txtB.getText();
				//CHUYỂN KIỀU
				double soA = Double.parseDouble(str_soA);
				double soB = Double.parseDouble(str_soB);
				//tính toán
				double tich = soA * soB;
				//Đưa ra hiển thị lên điều khiển
				txtKQ.setText(String.valueOf(tich));
	}
	void HamXuLyChia() {
		//lấy dữ liệu từ điều khiển
				String str_soA = txtA.getText();
				String str_soB = txtB.getText();
				//CHUYỂN KIỀU
				double soA = Double.parseDouble(str_soA);
				double soB = Double.parseDouble(str_soB);
				//tính toán
				double thuong = soA / soB;
				//Đưa ra hiển thị lên điều khiển
				txtKQ.setText(String.valueOf(thuong));
	}
}
