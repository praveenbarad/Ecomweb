package com.online.Shopping.OlineShopping.repository;

import com.online.Shopping.OlineShopping.entity.Registration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Registrationrepos extends JpaRepository<Registration, Long> {
}
