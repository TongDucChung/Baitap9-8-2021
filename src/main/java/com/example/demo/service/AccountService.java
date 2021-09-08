package com.example.demo.service;

import com.example.demo.models.Account;
import com.example.demo.repository.IAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class AccountService implements UserDetailsService {
@Autowired
    IAccountRepository iAccountRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Account account=iAccountRepository.findByUsername(username);
        List<GrantedAuthority> authorities=new ArrayList<>();
        authorities.add(account.getRole());
        UserDetails userDetails=new User(
                account.getUsername(),
                account.getPassword(),
                authorities
        );
        return userDetails;
    }
}
