package com.product.products.entity;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiParam;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ApiModel(description = "Product price should not be more than $10000 and Status should be as Pending(1) or Approved(2) or Rejected(3)")
public class ProductDTO {
    @ApiModelProperty(example = "Bed")
    private String name;
    @ApiModelProperty(example = "6000")
    private int price;
    @ApiModelProperty(example = "1")
    private int status;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	
}