package com.anbr.restapi.dao;

import java.util.HashMap;
import java.util.Map;

import com.anbr.restapi.model.ProductDetails;

public class GetProductDetailsDAO {
	
	
	Map<String, ProductDetails> products = new HashMap<String, ProductDetails>();
	
	
	public GetProductDetailsDAO()
	{

		//product details to be retrieved from the database. 
		
		products.put("1", new ProductDetails("1", "LCD TV", 60000, 4000));
		products.put("2", new ProductDetails("2", "LED TV", 70000, 5000));
		products.put("3", new ProductDetails("3", "AC", 40000, 3000));
		products.put("4", new ProductDetails("4", "Laptop", 50000, 1000));
		
	}
	
	public ProductDetails getProductDetails(String itemcode)
	{
		
		return products.get(itemcode);
		
	}
	
}
