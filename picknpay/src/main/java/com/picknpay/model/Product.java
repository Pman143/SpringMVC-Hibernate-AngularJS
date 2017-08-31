package com.picknpay.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotEmpty;


@Entity
@Table(name="product")

public class Product{

 	
        @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userID;
        
        
	@Size(min=3, max=50)
        @NotNull
	@Column(name = "productPrice", nullable = false)
	private int prodPrice;
        
        @Size(min=3, max=50)
        @NotNull
	@Column(name = "productQuantity", nullable = false)
	private int prodQuantity;
              
        @NotNull        
	@Column(name = "productName", nullable = false)
	private String prodName;       
	
	
	@NotNull
	@Size(min=3, max=50)
	@Column(name = "productBrand", nullable = false)
       
	private String prodBrand;
	
	@NotNull
	@Column(name = "productDescription", nullable = false)
	private String prodDescription;

	@NotEmpty
	@Column(name = "productImageUrl",unique=true)
        @Transient
	private String prodImageUrl;
        
        @NotNull
	@Column(name = "productCategory", nullable = false)
	private String prodCategory;
        
        
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
	
	public String getProductBrand() {
		return prodBrand;
	}

	public void setProductBrand(String prodBrand) {
		this.prodBrand = prodBrand;
	}

	public String getProductDescription() {
		return prodDescription;
	}

	public void setProductDescription(String prodDescription) {
		this.prodDescription = prodDescription;
	}
	
	public String getProductImageUrl() {
		return prodImageUrl;
	}

	public void setProductImageUrl(String prodImageUrl) {
		this.prodImageUrl = prodImageUrl;
	}
        
        
        public String getProductCategory() {
		return prodCategory;
	}

	public void setProductCategory(String prodCategory) {
		this.prodCategory = prodCategory;
	}
	
		

	@Override
	public String toString() {
		return "Product [Product Name=" + prodName + ", Product Brand=" + prodBrand + ", Product Description=" + prodDescription 
                            +  ", Product Category=" + prodCategory + ",Product ImageUrl=" + prodImageUrl + ", Product Price=" + prodPrice + "]";
	}

   
}
