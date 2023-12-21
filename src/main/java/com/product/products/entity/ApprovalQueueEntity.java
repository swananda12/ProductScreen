package com.product.products.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "approval_queue")
public class ApprovalQueueEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "approval_queue_id")
    private int ApprovalQueueId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "product_id")
    private ProductEntity productEntity;

	private  Date dateCreated; {
		
		
	}


	public int getApprovalQueueId() {
		return ApprovalQueueId;
	}


	public void setApprovalQueueId(int approvalQueueId) {
		ApprovalQueueId = approvalQueueId;
	}


	public ProductEntity getProductEntity() {
		return productEntity;
	}


	public void setProductEntity(ProductEntity productEntity) {
		this.productEntity = productEntity;
	}


	public Date getDateCreated() {
		return dateCreated;
	}


	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}


    
}