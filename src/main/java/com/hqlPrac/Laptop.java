package com.hqlPrac;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Laptops")
public class Laptop{
	
	@Id
	private int lId;
	
	
	public int getlId() {
		return lId;
	}

	public void setlId(int lId) {
		this.lId = lId;
	}

	@Column(name="Laptop_Name")
	private String lName;
    public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	@Column(name="Modal")
	private String lModal;
    public String getlModal() {
		return lModal;
	}

	public void setlModal(String lModal) {
		this.lModal = lModal;
	}

	@Column(name = "Price")
	private int lPrice;
	public int getlPrice() {
		return lPrice;
	}

	public void setlPrice(int lPrice) {
		this.lPrice = lPrice;
	}
	
//	@ManyToOne //to remove creation of 3rd table
//	private Student std;
//
//
//	public Student getStd() {
//		return std;
//	}
//
//	public void setStd(Student std) {
//		this.std = std;
//	}

	@Override
	public String toString() {
		return "Laptop [lId=" + lId + ", lName=" + lName + ", lModal=" + lModal + ", lPrice=" + lPrice	+ "]";
	}


	

	

}
