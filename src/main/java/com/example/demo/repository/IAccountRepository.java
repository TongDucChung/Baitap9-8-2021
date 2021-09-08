package com.example.demo.repository;

import com.example.demo.models.Account;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.Access;

public interface IAccountRepository extends CrudRepository<Account, Long> {
    Account findByUsername(String username);
    

}
