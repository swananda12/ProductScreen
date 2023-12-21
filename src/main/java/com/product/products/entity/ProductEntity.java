package com.product.products.entity;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "product")
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private long productId;
    @Column(name = "product_name")
    private String productName;
    @Column(name = "price_range")
    private int priceRange;
    @Column(name = "status")
    private int productStatus;
    @Column(name = "posted_date")
    private Date productDateRange;
	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getPriceRange() {
		return priceRange;
	}
	public void setPriceRange(int priceRange) {
		this.priceRange = priceRange;
	}
	public int getProductStatus() {
		return productStatus;
	}
	public void setProductStatus(int productStatus) {
		this.productStatus = productStatus;
	}
	public Date getProductDateRange() {
		return productDateRange;
	}
	public void setProductDateRange(Date productDateRange) {
		this.productDateRange = productDateRange;
	}
    
    
}