package com.user.auth.dao;

import com.user.auth.model.user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface authDao extends JpaRepository<user,Integer> {

    user findByMobileNo(String mobileNo);
}
