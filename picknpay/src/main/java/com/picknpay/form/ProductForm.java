package com.picknpay.form;


public class ProductForm {
    

        private int prodPrice;
        private int userID;
	private String prodName;
	private String prodCategory;	
	private String prodImageUrl;
        private String prodDescription;
        private String prodBrand;
        private int prodQuantity;
        
        
        public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}
        
         public int getProductQuantity() {
		return prodQuantity;
	}

	public void setProductQuantity(int prodQuantity) {
		this.prodQuantity = prodQuantity;
	}

	
	public int getProductPrice() {
		return prodPrice;
	}

	public void setProductPrice(int prodPrice) {
		this.prodPrice = prodPrice;
	}

	public String getProductName() {
		return prodName;
	}

	public void setProductName(String prodName) {
		this.prodName = prodName;
	}
	
	public String getProductCategory() {
		return prodCategory;
	}

	public void setProductCategory(String prodCategory) {
		this.prodCategory = prodCategory;
	}

	public String getProductImageUrl() {
		return prodImageUrl;
	}

	public void setProductImageUrl(String prodImageUrl) {
		this.prodImageUrl = prodImageUrl;
	}
	
	public String getProductDescription() {
		return prodDescription;
	}

	public void setProductDescription(String prodDescription) {
		this.prodDescription = prodDescription;
	}
        
        public String getProductBrand() {
		return prodBrand;
	}

	public void setProductBrand(String prodBrand) {
		this.prodBrand = prodBrand;
	}
	
	
        @Override
	public String toString() {
		return "User [prodBrand=" + prodBrand + ", firstName=" + prodCategory + 
                            ", emailAddress=" + prodDescription +", lastName=" + prodImageUrl + "]";
	}
	

}
