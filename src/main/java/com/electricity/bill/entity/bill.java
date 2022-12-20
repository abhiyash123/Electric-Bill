package com.electricity.bill.entity;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="bill")
public class bill {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long billId;
	private String billDate;
	private String billdueDate;
	private int unitsConsumed;
	private int billAmount;
	private String status;
	
	public bill() {
		super();
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public bill(Long billId, String billDate, String billdueDate, int unitsConsumed, int billAmount, String status) {
		super();
		this.billId = billId;
		this.billDate = billDate;
		this.billdueDate = billdueDate;
		this.unitsConsumed = unitsConsumed;
		this.billAmount = billAmount;
		this.status = status;
	}
	
	public Long getBillId() {
		return billId;
	}
	public void setBillId(Long billId) {
		this.billId = billId;
	}
	public String getBillDate() {
		return billDate;
	}
	public void setBillDate(String billDate) {
		this.billDate = billDate;
	}
	public String getBilldueDate() {
		return billdueDate;
	}
	public void setBilldueDate(String billdueDate) {
		this.billdueDate = billdueDate;
	}
	public int getUnitsConsumed() {
		return unitsConsumed;
	}
	public void setUnitsConsumed(int unitsConsumed) {
		this.unitsConsumed = unitsConsumed;
	}
	public int getBillAmount() {
		return billAmount;
	}
	public void setBillAmount(int billAmount) {
		this.billAmount = billAmount;
	}
	@Override
	public String toString() {
		return "bill [billId=" + billId + ", billDate=" + billDate + ", billdueDate=" + billdueDate + ", unitsConsumed="
				+ unitsConsumed + ", billAmount=" + billAmount + "]";
	}
	
	
	
	
}
