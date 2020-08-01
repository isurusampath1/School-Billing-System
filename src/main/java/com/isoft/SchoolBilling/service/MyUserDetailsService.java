package com.isoft.SchoolBilling.service;

import com.isoft.SchoolBilling.model.User;
import com.isoft.SchoolBilling.model.UserPrincipal;
import com.isoft.SchoolBilling.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.websocket.server.ServerEndpoint;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired  UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = userRepository.findByUsername(username);

        if (user == null){
            throw new UsernameNotFoundException("Username Not Found.!");

        }

        return new UserPrincipal(user);
    }
}
