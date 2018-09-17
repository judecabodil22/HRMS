package com.clover.hrms.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clover.hrms.Model.User;

public interface UserRepository extends JpaRepository<User,Long> {

}
