package com.envelopes.services;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;


import com.envelopes.dto.UserRegistrationDto;
import com.envelopes.model.User;

@Service
public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);

}
