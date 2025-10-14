package com.bankingAPI.BankingAPI1.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bankingAPI.BankingAPI1.Entities.BankingEntity;

@Repository
public interface BankingRepo extends JpaRepository<BankingEntity , Long>{

}
