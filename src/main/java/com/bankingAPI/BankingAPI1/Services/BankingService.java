package com.bankingAPI.BankingAPI1.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bankingAPI.BankingAPI1.Entities.BankingEntity;
import com.bankingAPI.BankingAPI1.Repo.BankingRepo;

@Service
public class BankingService {
	@Autowired
	BankingRepo br;
	public BankingEntity storeNewData(BankingEntity be) {
		return br.save(be);
		}
	public List<BankingEntity> getAllTheRecords() {
		return br.findAll();
		
	}
	public Optional<BankingEntity> findByIdUser(long id) {
		return br.findById(id);
		
	}
	public BankingEntity withdrawamount(BankingEntity b1) {
		return br.save(b1);		
	}
	public BankingEntity Depositamount(BankingEntity b2) {
		
		return br.save(b2);
	}
}
