package com.team1.jogiyo.product.test;

import com.team1.jogiyo.product.Product;
import com.team1.jogiyo.product.ProductDao;

public class ProductDaoTestMain {

	public static void main(String[] args) throws Exception {

		//상품 추가
		ProductDao productDao = new ProductDao();
		int result = productDao.insert(new Product(12,"떡떡볶이","aaaa.jpg",4500,"왕맛있는떡볶이",30));
		System.out.println("상품추가 : " + result );
		
		//상품 수정
		productDao.update(new Product(11,"찰순대","bbb.jpg",4000,"순대맛있",30));
		
		//상품 삭제
		productDao.delete("떡떡볶이");		
		
		//상품 검색(번호)
		System.out.println(productDao.findByPrimaryKey(10));
		
		
		//상품 검색(이름)
		System.out.println(productDao.findByName("찰순대"));
		
		
		//상품 검색(전체)
		System.out.println(productDao.findAll());
		
	}

}