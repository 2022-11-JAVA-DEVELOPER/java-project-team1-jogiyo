package com.team1.jogiyo.ui.이은지;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

import com.team1.jogiyo.cart.*;
import com.team1.jogiyo.product.*;
import com.team1.jogiyo.ui.*;
import com.team1.jogiyo.user.*;

import com.team1.jogiyo.ui.JogiyoMainFrame;
import com.team1.jogiyo.user.User;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Cursor;

public class BunsikPanel_이은지 extends JPanel {
	JogiyoMainFrame frame;
	User loginUser=null;
	public void setFrame(JogiyoMainFrame frame) {
		this.frame = frame;
	}
	public void setUser(User loginUser) {
		this.loginUser=loginUser;
	}
	
	
	private final JPanel bunsikPanel1 = new JPanel();

	JLabel bunsikNameLB1;
	JLabel bunsikNameLB2;
	JLabel bunsikNameLB3;
	JLabel bunsikCartLB1;
	JLabel bunsikCartLB2;
	JLabel bunsikCartLB3;
	JComboBox bunsikComboBox1;
	JComboBox bunsikComboBox2;
	JComboBox bunsikComboBox3;

	/**
	 * Create the panel.
	 */
	public BunsikPanel_이은지() throws Exception {
		setLayout(null);
		
		JScrollPane bunsikListScrollPane = new JScrollPane();
		bunsikListScrollPane.setBounds(0, 499, 400, -497);
		add(bunsikListScrollPane);
		
		//패널생성
		/*
		 * 해당 패널 클릭 시 떡볶이 상세보기로 이동
		 */
		JPanel bunsikPanel1 = new JPanel();
		bunsikPanel1.setBounds(0, 0, 400, 167);
		add(bunsikPanel1);
		bunsikPanel1.setLayout(null);
		
		JLabel bunsikImageLB1 = new JLabel("");
		bunsikImageLB1.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		bunsikImageLB1.setBounds(0, 0, 236, 167);
		bunsikImageLB1.setIcon(new ImageIcon("C:\\2022-11-JAVA-DEVELOPER\\git-repositories-home\\java-project-team1-jogiyo\\src\\images\\productList\\p_image7.jpg"));
		bunsikPanel1.add(bunsikImageLB1);
		
		JLabel bunsikNameLB1 = new JLabel("떡볶이");
		bunsikNameLB1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					System.out.println("순대국밥 상세보기로 이동");
					Product clickedProduct=productDetail(bunsikNameLB1.getText());
					frame.changePanel(frame.PRODUCTDETAILPANE,clickedProduct);
				} catch (Exception e1) {
					System.out.println(e1.getMessage());
				}
			}
		});
		bunsikNameLB1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		bunsikNameLB1.setHorizontalAlignment(SwingConstants.RIGHT);
		bunsikNameLB1.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		bunsikNameLB1.setBounds(263, 36, 109, 30);
		bunsikPanel1.add(bunsikNameLB1);
		
		JLabel bunsikPriceLB1 = new JLabel("\\ 5,000");
		bunsikPriceLB1.setHorizontalAlignment(SwingConstants.RIGHT);
		bunsikPriceLB1.setFont(new Font("맑은 고딕", Font.PLAIN, 17));
		bunsikPriceLB1.setBounds(297, 76, 75, 24);
		bunsikPanel1.add(bunsikPriceLB1);
		
		/*
		 * 해당 라벨 클릭 시 장바구니에 상품 추가
		 */
		JLabel bunsikCartLB1 = new JLabel("");
		bunsikCartLB1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		bunsikCartLB1 = new JLabel("");
		bunsikCartLB1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		bunsikCartLB1.setIcon(new ImageIcon("C:\\Users\\itwill\\Downloads\\cart.png"));
		bunsikCartLB1.setBounds(345, 114, 27, 27);
		bunsikPanel1.add(bunsikCartLB1);
		
		bunsikComboBox1 = new JComboBox();
		bunsikComboBox1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		bunsikComboBox1.setBounds(297, 118, 32, 23);
		bunsikPanel1.add(bunsikComboBox1);
		
		/*
		 * 해당 패널 클릭 시 어묵 상세보기로 이동
		 */
		JPanel bunsikPanel2 = new JPanel();
		bunsikPanel2.setLayout(null);
		bunsikPanel2.setBounds(0, 167, 400, 167);
		add(bunsikPanel2);
		
		JLabel bunsikImageLB2 = new JLabel("");
		bunsikImageLB2.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		bunsikImageLB2.setIcon(new ImageIcon("C:\\2022-11-JAVA-DEVELOPER\\git-repositories-home\\java-project-team1-jogiyo\\src\\images\\productList\\p_image8.jpg"));
		bunsikImageLB2.setBounds(0, 0, 236, 167);
		bunsikPanel2.add(bunsikImageLB2);
		
		JLabel bunsikNameLB2 = new JLabel("어묵");
		bunsikNameLB2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					System.out.println("순대국밥 상세보기로 이동");
					Product clickedProduct=productDetail(bunsikNameLB2.getText());
					frame.changePanel(frame.PRODUCTDETAILPANE,clickedProduct);
				} catch (Exception e1) {
					System.out.println(e1.getMessage());
				}
			}
		});
		bunsikNameLB2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		bunsikNameLB2.setHorizontalAlignment(SwingConstants.RIGHT);
		bunsikNameLB2.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		bunsikNameLB2.setBounds(263, 35, 109, 30);
		bunsikPanel2.add(bunsikNameLB2);
		
		JLabel bunsikPriceLB2 = new JLabel("\\ 4,000");
		bunsikPriceLB2.setHorizontalAlignment(SwingConstants.RIGHT);
		bunsikPriceLB2.setFont(new Font("맑은 고딕", Font.PLAIN, 17));
		bunsikPriceLB2.setBounds(297, 75, 75, 24);
		bunsikPanel2.add(bunsikPriceLB2);
		
		/*
		 * 해당 라벨 클릭 시 장바구니에 상품 추가
		 */
		JLabel bunsikCartLB2 = new JLabel("");
		bunsikCartLB2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		bunsikCartLB2 = new JLabel("");
		bunsikCartLB2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		bunsikCartLB2.setIcon(new ImageIcon("C:\\Users\\itwill\\Downloads\\cart.png"));
		bunsikCartLB2.setBounds(345, 113, 27, 27);
		bunsikPanel2.add(bunsikCartLB2);
		
		bunsikComboBox2 = new JComboBox();
		bunsikComboBox2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		bunsikComboBox2.setBounds(297, 117, 32, 23);
		bunsikPanel2.add(bunsikComboBox2);
		
		/*
		 * 해당 패널 클릭 시 순대 상세보기로 이동
		 */
		JPanel bunsikPanel3 = new JPanel();
		bunsikPanel3.setLayout(null);
		bunsikPanel3.setBounds(0, 333, 400, 167);
		add(bunsikPanel3);
		
		JLabel bunsikImageLB3 = new JLabel("");
		bunsikImageLB3.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		bunsikImageLB3.setIcon(new ImageIcon("C:\\2022-11-JAVA-DEVELOPER\\git-repositories-home\\java-project-team1-jogiyo\\src\\images\\productList\\p_image9.jpg"));
		bunsikImageLB3.setBounds(0, 0, 236, 167);
		bunsikPanel3.add(bunsikImageLB3);
		
		JLabel bunsikNameLB3 = new JLabel("순대");
		bunsikNameLB3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					System.out.println("순대국밥 상세보기로 이동");
					Product clickedProduct=productDetail(bunsikNameLB3.getText());
					frame.changePanel(frame.PRODUCTDETAILPANE,clickedProduct);
				} catch (Exception e1) {
					System.out.println(e1.getMessage());
				}
			}
		});
		bunsikNameLB3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		bunsikNameLB3.setHorizontalAlignment(SwingConstants.RIGHT);
		bunsikNameLB3.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		bunsikNameLB3.setBounds(263, 36, 109, 30);
		bunsikPanel3.add(bunsikNameLB3);
		
		JLabel bunsikPriceLB3 = new JLabel("\\ 6,000");
		bunsikPriceLB3.setHorizontalAlignment(SwingConstants.RIGHT);
		bunsikPriceLB3.setFont(new Font("맑은 고딕", Font.PLAIN, 17));
		bunsikPriceLB3.setBounds(297, 76, 75, 24);
		bunsikPanel3.add(bunsikPriceLB3);
		
		/*
		 * 해당 라벨 클릭 시 장바구니에 상품 추가
		 */
		JLabel bunsikCartLB3 = new JLabel("");
		bunsikCartLB3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		bunsikCartLB3 = new JLabel("");
		bunsikCartLB3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		bunsikCartLB3.setIcon(new ImageIcon("C:\\Users\\itwill\\Downloads\\cart.png"));
		bunsikCartLB3.setBounds(345, 114, 27, 27);
		bunsikPanel3.add(bunsikCartLB3);
		
		bunsikComboBox3 = new JComboBox();
		bunsikComboBox3.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		bunsikComboBox3.setBounds(297, 118, 32, 23);
		bunsikPanel3.add(bunsikComboBox3);

		
		/**********************생성자 끝************************/
		
	}
	
	/*
	 * 메뉴 이름 클릭 시, 각 상품 상세 페이지로 이동
	 */
	public Product productDetail(String p_name) throws Exception{
		return frame.productService.findByName(p_name);
	}
	
	
	/*
	 * 콤보박스로 선택한 수량만큼 카트에 상품 담기
	 */
	private void bunsikToCart1(String p_name) throws Exception {
		
		Cart cartInMenu7 = new Cart(0, (int)bunsikComboBox1.getSelectedItem(), loginUser.getM_id(), frame.productService.findByName(p_name));
		if(bunsikNameLB1.getText().equals(p_name)) {
			frame.cartService.addCartInProduct(cartInMenu7);
		}
		
	}
	
	private void bunsikToCart2(String p_name) throws Exception {
		
		Cart cartInMenu8 = new Cart(0, (int)bunsikComboBox2.getSelectedItem(), loginUser.getM_id(), frame.productService.findByName(p_name));
		if(bunsikNameLB2.getText().equals(p_name)) {
			frame.cartService.addCartInProduct(cartInMenu8);
		}
		
	}
	
		private void bunsikToCart3(String p_name) throws Exception {
		
		Cart cartInMenu9 = new Cart(0, (int)bunsikComboBox3.getSelectedItem(), loginUser.getM_id(), frame.productService.findByName(p_name));
		if(bunsikNameLB3.getText().equals(p_name)) {
			frame.cartService.addCartInProduct(cartInMenu9);
		}
		
	}
}
