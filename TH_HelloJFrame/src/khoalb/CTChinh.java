package khoalb;

import java.awt.FlowLayout;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class CTChinh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				JFrame f = new JFrame();
				f.setTitle("Ví dụ JFrame");
				f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
				f.setSize(300,200);
				
				f.setLayout(new FlowLayout());
				
				//tạo một nút bấm
				JButton btnOK = new JButton("Nhấn tôi đi");
				btnOK.addActionListener( new ActionListener() {
					@Override
					public void actionPerformed (ActionEvent e) {
						JDialog dialog = new JDialog();
						dialog.setTitle("Thông báo gì đó");
						dialog.setSize(220,120);
						dialog.show();
					}
				});
				
				JButton btnKhac = new JButton("Nhấn em đi");
				//gắn lên form
				f.add(btnOK);
				f.add(btnKhac);
				f.show();
	}
//	private static class BoLangNgheOK implements ActionListener{
//		@Override
//		public void actionPerformed (ActionEvent e) {
//			JDialog dialog = new JDialog();
//			dialog.setTitle("Thông báo gì đó");
//			dialog.setSize(220,120);
//			dialog.show();
//		}
//	}
//
//}
	}
