package com.anbr.restapi.model;

public class ProductDetails {
	
	
	String itemcode="";
	String description="";
	float MRP=0;
	float itemprice=0;
	float discount=0;
	
	
	public ProductDetails(String itemcode,String description, float MRP,  float discount)
		{
			this.itemcode=itemcode;
	
			this.description=description;
	
			this.MRP=MRP;
	
			this.itemprice=MRP-discount;
	
			this.discount=discount;
	
		}
	
	public String getItemcode() {
		return itemcode;
	}
	public void setItemcode(String itemcode) {
		this.itemcode = itemcode;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public float getMRP() {
		return MRP;
	}
	public void setMRP(float mRP) {
		MRP = mRP;
	}
	public float getItemprice() {
		return itemprice;
	}
	public void setItemprice(float itemprice) {
		this.itemprice = itemprice;
	}
	public float getDiscount() {
		return discount;
	}
	public void setDiscount(float discount) {
		this.discount = discount;
	}

	
	

}
