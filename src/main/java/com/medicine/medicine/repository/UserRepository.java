package com.medicine.medicine.repository;

import com.medicine.medicine.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    UserEntity findByLoginid(String loginid);
}

