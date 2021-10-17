package com.envelopes.service;

import com.envelopes.dto.UserRegistrationDto;
import com.envelopes.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@Service
public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);

}
