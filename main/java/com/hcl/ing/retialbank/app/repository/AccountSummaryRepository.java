package com.hcl.ing.retialbank.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.ing.retialbank.app.entity.AccountSummary;

@Repository
public interface AccountSummaryRepository extends JpaRepository<AccountSummary, Long> {
	
	List<AccountSummary> findByAccountNoOrAccountName(Long accountNo,String accountName);
	
	AccountSummary findByAccountNo(Long accountNo);

}
