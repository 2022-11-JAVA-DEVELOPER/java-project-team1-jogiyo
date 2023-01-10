package com.team1.jogiyo.ui.이은지;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

import com.team1.jogiyo.cart.*;
import com.team1.jogiyo.product.*;
import com.team1.jogiyo.user.*;

import javax.swing.JTextField;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Cursor;

public class HansikPanel_이은지 extends JPanel {
	ProductService productService;
	CartService cartService;
	
	User loginUser=null;
	
	JComboBox hansikComboBox1;
	JComboBox hansikComboBox2;
	JComboBox hansikComboBox3;
	JLabel hansikNameLB1;
	JLabel hansikNameLB2;
	JLabel hansikNameLB3;
	
	
	/**
	 * Create the panel.
	 */
	
	private final JPanel hansikMenuPanel1 = new JPanel();
	
	public HansikPanel_이은지() throws Exception {
		
		setLayout(null);
		
		JScrollPane hansikListScrollPane = new JScrollPane();
		hansikListScrollPane.setBounds(0, 498, 350, -496);
		add(hansikListScrollPane);
		hansikMenuPanel1.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		hansikMenuPanel1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("순대국밥 상세보기로 이동");
			}
		});
		hansikMenuPanel1.setBounds(0, 0, 350, 167);
		add(hansikMenuPanel1);
		hansikMenuPanel1.setLayout(null);
		
		
		JLabel hansikImageLB1 = new JLabel("");
		hansikImageLB1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		hansikImageLB1.setBounds(0, 0, 234, 167);
		hansikImageLB1.setIcon(new ImageIcon("C:\\Users\\itwill\\Downloads\\p_image1 (2).jpg"));
		hansikMenuPanel1.add(hansikImageLB1);
		
		
		JLabel hansikNameLB1 = new JLabel("순대국밥");
		hansikNameLB1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		hansikNameLB1.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		hansikNameLB1.setBounds(229, 36, 109, 30);
		hansikNameLB1.setHorizontalAlignment(SwingConstants.RIGHT);
		hansikMenuPanel1.add(hansikNameLB1);
		
		JLabel hansikPriceLB1 = new JLabel("\\ 9,000");
		hansikPriceLB1.setFont(new Font("맑은 고딕", Font.PLAIN, 17));
		hansikPriceLB1.setHorizontalAlignment(SwingConstants.RIGHT);
		hansikPriceLB1.setBounds(263, 76, 75, 24);
		hansikMenuPanel1.add(hansikPriceLB1);
		
		/*
		 * 해당 라벨 클릭 시 장바구니에 상품 추가
		 */
		JLabel hansikCartLB1 = new JLabel("");
		hansikCartLB1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		hansikCartLB1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					menuToCart1(hansikNameLB1.getText());
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		hansikCartLB1.setBounds(311, 114, 27, 27);
		hansikMenuPanel1.add(hansikCartLB1);
		hansikCartLB1.setIcon(new ImageIcon("C:\\Users\\itwill\\Downloads\\cart.png"));
		
		JComboBox hansikComboBox1 = new JComboBox();
		hansikComboBox1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		hansikComboBox1.setBounds(263, 118, 32, 23);
		hansikMenuPanel1.add(hansikComboBox1);
		
		/*
		 * 해당 패널 클릭 시 김치찜 상세보기로 이동
		 */
		JPanel hansikMenuPanel2 = new JPanel();
		hansikMenuPanel2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("김치찜 상세보기로 이동");
			}
		});
		hansikMenuPanel2.setLayout(null);
		hansikMenuPanel2.setBounds(0, 166, 350, 167);
		add(hansikMenuPanel2);
		
		JLabel hansikImageLB2 = new JLabel("");
		hansikImageLB2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		hansikImageLB2.setIcon(new ImageIcon("C:\\Users\\itwill\\Downloads\\p_image2.jpg"));
		hansikImageLB2.setBounds(0, 0, 251, 167);
		hansikMenuPanel2.add(hansikImageLB2);
		
		JLabel hansikNameLB2 = new JLabel("김치찜");
		hansikNameLB2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		hansikNameLB2.setHorizontalAlignment(SwingConstants.RIGHT);
		hansikNameLB2.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		hansikNameLB2.setBounds(229, 36, 109, 30);
		hansikMenuPanel2.add(hansikNameLB2);
		
		JLabel hansikPriceLB2 = new JLabel("\\ 24,000");
		hansikPriceLB2.setHorizontalAlignment(SwingConstants.RIGHT);
		hansikPriceLB2.setFont(new Font("맑은 고딕", Font.PLAIN, 17));
		hansikPriceLB2.setBounds(263, 76, 75, 24);
		hansikMenuPanel2.add(hansikPriceLB2);
		
		/*
		 * 해당 라벨 클릭 시 장바구니에 상품 추가
		 */
		JLabel hansikCartLB2 = new JLabel("");
		hansikCartLB2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		hansikCartLB2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		hansikCartLB2.setIcon(new ImageIcon("C:\\Users\\itwill\\Downloads\\cart.png"));
		hansikCartLB2.setBounds(311, 114, 27, 27);
		hansikMenuPanel2.add(hansikCartLB2);
		
		JComboBox hansikComboBox2 = new JComboBox();
		hansikComboBox2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		hansikComboBox2.setBounds(263, 118, 32, 23);
		hansikMenuPanel2.add(hansikComboBox2);
		
		/*
		 * 해당 패널 클릭 시 삼겹살 상세보기로 이동
		 */
		JPanel hansikMenuPanel3 = new JPanel();
		hansikMenuPanel3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("삼겹살 상세보기로 이동");
			}
		});
		hansikMenuPanel3.setLayout(null);
		hansikMenuPanel3.setBounds(0, 333, 350, 167);
		add(hansikMenuPanel3);
		
		JLabel hansikImageLB3 = new JLabel("");
		hansikImageLB3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		hansikImageLB3.setIcon(new ImageIcon("C:\\Users\\itwill\\Downloads\\p_image3.jpg"));
		hansikImageLB3.setBounds(0, 0, 251, 167);
		hansikMenuPanel3.add(hansikImageLB3);
		
		JLabel hansikNameLB3 = new JLabel("삼겹살");
		hansikNameLB3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		hansikNameLB3.setHorizontalAlignment(SwingConstants.RIGHT);
		hansikNameLB3.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		hansikNameLB3.setBounds(229, 36, 109, 30);
		hansikMenuPanel3.add(hansikNameLB3);
		
		JLabel hansikPriceLB3 = new JLabel("\\ 15,000");
		hansikPriceLB3.setHorizontalAlignment(SwingConstants.RIGHT);
		hansikPriceLB3.setFont(new Font("맑은 고딕", Font.PLAIN, 17));
		hansikPriceLB3.setBounds(263, 76, 75, 24);
		hansikMenuPanel3.add(hansikPriceLB3);
		
		/*
		 * 해당 라벨 클릭 시 장바구니에 상품 추가
		 */
		JLabel hansikCartLB3 = new JLabel("");
		hansikCartLB3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		hansikCartLB3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		hansikCartLB3.setIcon(new ImageIcon("C:\\Users\\itwill\\Downloads\\cart.png"));
		hansikCartLB3.setBounds(311, 114, 27, 27);
		hansikMenuPanel3.add(hansikCartLB3);
		
		JComboBox hansikComboBox3 = new JComboBox();
		hansikComboBox3.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		hansikComboBox3.setBounds(263, 118, 32, 23);
		hansikMenuPanel3.add(hansikComboBox3);

		
		/**********************************************/
		loginUser = new User("asas","1111","가가가","제주","012-345-6789");
		
		//메소드 사용

	}
	
	/*메소드*/
	private void menuToCart1(String p_name) throws Exception {
		/* 
		 * 제품 수량으로 카트에 넣고싶음
		 * insert cart 필요함
		 * 근데 UI에선 service 사용해야지
		 * cartService 봤더니 addCartInProduct 메소드가 있네
		 * 인자를 Cart 객체로 받네?
		 * Cart 객체를 만들자 
		 * Cart 객체 만드는 재료는 뭐였더라 
		 * private int c_no;
			private int c_qty;
			private String m_id;
			//private int p_no;
			private Product product;
			
			c_no은 시퀀스라 그냥 0넣어도 되겠네
			나머지 재료 다 있네
			 시작 
		 */
		
		Cart cartInMenu1 = new Cart(0, (int)hansikComboBox1.getSelectedItem(), loginUser.getM_id(), productService.findByName(p_name));
		if(hansikNameLB1.getText().equals(p_name)) {
			cartService.addCartInProduct(cartInMenu1);
		}
	}
}
