package com.bankingAPI.BankingAPI1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bankingAPI.BankingAPI1.Entities.BankingEntity;
import com.bankingAPI.BankingAPI1.Exceptions.UserNotFoundException;
import com.bankingAPI.BankingAPI1.Services.BankingService;

@RestController
@RequestMapping("/api")
public class BankingController {
	
	@Autowired
	BankingService bs;
	
	//Mappings 
	// CRUD 
	// C - create 
	// R - read 
	// U - Update 
	// D - Delete 
	
	@PostMapping("/newAcount")
	// Creating the new account service 
	public BankingEntity createNewAccount(@RequestBody BankingEntity be) {
		return bs.storeNewData(be);
	}
	//Read
	@GetMapping("/getall")
	public List<BankingEntity> readTheAllUsers() {
		return bs.getAllTheRecords();
	}
	
	@GetMapping("/get/{id}")
	
	public BankingEntity getById(@PathVariable long id)throws UserNotFoundException {
		return bs.findByIdUser(id).orElseThrow(()->new UserNotFoundException("User Not Found "));
	}
	//withdraw
	//Update
	@PutMapping("/with/{id}")
	public BankingEntity withdraw(@RequestBody BankingEntity b,@PathVariable long id)throws UserNotFoundException {
		BankingEntity b1=bs.findByIdUser(id).orElseThrow(()->new UserNotFoundException("User Not Found "));
		double newBal=b.getBalance();
		double oldBal=b1.getBalance();
		if(oldBal>newBal) {
		oldBal=oldBal-newBal;
		b1.setBalance(oldBal);
		return bs.withdrawamount(b1);
		}
		else {
			throw new UserNotFoundException(" SORRY INSUFFIENT AMOUNT");
		}
		
	}
	@PutMapping("/deposit/{id}")
	public BankingEntity deposit(@RequestBody BankingEntity b3,@PathVariable long id)throws UserNotFoundException {
		BankingEntity b2=bs.findByIdUser(id).orElseThrow(()->new UserNotFoundException("User Not Found "));
		double newBal=b3.getBalance();
		double oldBal=b2.getBalance();
		
		oldBal=oldBal+newBal;
		b2.setBalance(oldBal);
		return bs.Depositamount(b2);
		
		
	}
	
	
}
