package khoalb;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainCT extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtC;
	private JTextField txtKQ;
	public MainCT() {
		setTitle("GIẢI PHƯƠNG TRÌNH BẬC 2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 928, 451);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Giải phương trình bậc 2 có dang: ax2+bx+c=0 (a≠0)");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(156, 27, 404, 43);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nhập vào a:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(46, 80, 93, 33);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nhập vào b:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(46, 145, 93, 33);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Nhập vào c:");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_2.setBounds(46, 208, 93, 33);
		contentPane.add(lblNewLabel_1_2);
		
		txtA = new JTextField();
		txtA.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtA.setBounds(166, 80, 136, 33);
		contentPane.add(txtA);
		txtA.setColumns(10);
		
		txtB = new JTextField();
		txtB.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtB.setColumns(10);
		txtB.setBounds(166, 145, 136, 33);
		contentPane.add(txtB);
		
		txtC = new JTextField();
		txtC.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtC.setColumns(10);
		txtC.setBounds(166, 208, 136, 33);
		contentPane.add(txtC);
		
		JButton btnGiai = new JButton("Giải phương trình");
		btnGiai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//XỬ LÝ KHI ẤN NÚT GIẢI PT BẬC 2
				HamGiaiPTBac2();
			}
		});
		btnGiai.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnGiai.setBounds(46, 296, 182, 59);
		contentPane.add(btnGiai);
		
		txtKQ = new JTextField();
		txtKQ.setEnabled(false);
		txtKQ.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtKQ.setBounds(423, 253, 404, 122);
		contentPane.add(txtKQ);
		txtKQ.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Kết quả:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(294, 305, 67, 41);
		contentPane.add(lblNewLabel_2);
	}
	void HamGiaiPTBac2() {
	    try {
	        // Lấy giá trị từ các trường nhập
	        double a = Double.parseDouble(txtA.getText());
	        double b = Double.parseDouble(txtB.getText());
	        double c = Double.parseDouble(txtC.getText());

	        // Kiểm tra hệ số a
	        if (a == 0) {
	            txtKQ.setText("Hệ số a phải khác 0");
	            return;
	        }

	        // Tính toán nghiệm của phương trình bậc hai
	        double delta = b * b - 4 * a * c;
	        if (delta < 0) {
	            txtKQ.setText("Phương trình không có nghiệm thực");
	        } else if (delta == 0) {
	            double x = -b / (2 * a);
	            txtKQ.setText("Phương trình có nghiệm kép x = " + x);
	        } else {
	            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
	            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
	            txtKQ.setText("Phương trình có 2 nghiệm phân biệt: x1 = " + x1 + ", x2 = " + x2);
	        }
	    } catch (NumberFormatException ex) {
	        txtKQ.setText("Vui lòng nhập đúng định dạng số");
	    }
	}

}
