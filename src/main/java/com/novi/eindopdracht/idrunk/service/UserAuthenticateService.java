package com.novi.eindopdracht.idrunk.service;

import com.novi.eindopdracht.idrunk.payload.AuthenticationRequest;
import com.novi.eindopdracht.idrunk.payload.AuthenticationResponse;

public interface UserAuthenticateService {

    public AuthenticationResponse authenticateUser(AuthenticationRequest authenticationRequest);

}