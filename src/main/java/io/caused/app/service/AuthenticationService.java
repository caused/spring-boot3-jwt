package io.caused.app.service;

import io.caused.app.model.request.AuthenticationRequest;
import io.caused.app.model.request.RegisterRequest;
import io.caused.app.model.response.AuthenticationResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationService {
    public AuthenticationResponse register(RegisterRequest request) {
        
    }

    public AuthenticationResponse authenticate(AuthenticationRequest request) {
    }
}
