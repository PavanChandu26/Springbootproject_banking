package com.bankingAPI.BankingAPI1.Entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Banking")
public class BankingEntity {
	
	@Id
	@Column
	private long Id;
	@Column
	private String name;
	@Column
	private double balance;
	
	
	
	public BankingEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BankingEntity(long id, String name, double balance) {
		super();
		this.Id = id;
		this.name = name;
		this.balance = balance;
	}
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		this.Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "BankingEntity [Id=" + Id + ", name=" + name + ", balance=" + balance + "]";
	}
	
	
	
	
	

}
