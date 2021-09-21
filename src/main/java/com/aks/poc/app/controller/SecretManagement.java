package com.aks.poc.app.controller;

import com.aks.poc.app.dto.Secret;
import com.aks.poc.app.dto.SecretWrapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;


@RestController()
@Slf4j
public class SecretManagement {

    @GetMapping("/secrets/{key}")
    public SecretWrapper getSecret( @PathVariable("key") String key) {
        return populateSecret(key);
    }

    private SecretWrapper populateSecret(String key) {
        log.info("Retrieving value for key {}", key);
        Secret secret = new Secret();
        secret.setKey("connectionstr");
        secret.setValue("jdbc://somedb");
        SecretWrapper wrapper = new SecretWrapper();
        wrapper.setSecret(secret);
        return wrapper;
    }
}
