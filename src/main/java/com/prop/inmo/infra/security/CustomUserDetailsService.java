package com.prop.inmo.infra.security;


import com.prop.inmo.infra.exceptions.UserNotFoundException;
import com.prop.inmo.infra.persistence.UserEntity;
import com.prop.inmo.infra.persistence.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;



    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        UserEntity userEntity = userRepository.findByEmail(email).orElseThrow(()-> new UserNotFoundException("User not found"));

        return new CustomUserDetails(userEntity);
    }
}
