package com.online.Shopping.OlineShopping.Controller;


import com.online.Shopping.OlineShopping.entity.Registration;
import com.online.Shopping.OlineShopping.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/registration")
public class RegistrationControl {
    @Autowired
    private RegistrationService registrationService;

    @PostMapping("/register")
    public Registration save(@RequestBody Registration registration)
    {
        return registrationService.saveemp(registration);
    }

}
