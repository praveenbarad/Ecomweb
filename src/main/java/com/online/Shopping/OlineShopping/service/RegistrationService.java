package com.online.Shopping.OlineShopping.service;

import com.online.Shopping.OlineShopping.entity.Registration;
import com.online.Shopping.OlineShopping.repository.Registrationrepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Service
public class RegistrationService {
    @Autowired
   private Registrationrepos registartionrepos;

    public Registration saveemp(Registration registration)
    {
        return registartionrepos.save(registration);
    }

}
