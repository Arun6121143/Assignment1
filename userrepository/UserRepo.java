package com.example.usermanage1.userrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.usermanage1.usermodel.UserModel;

@Repository

public interface UserRepo extends JpaRepository<UserModel, Integer> {

}
