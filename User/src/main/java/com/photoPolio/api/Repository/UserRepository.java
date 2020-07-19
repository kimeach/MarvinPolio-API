package com.photoPolio.api.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.photoPolio.api.Model.User;

@Repository
public interface UserRepository  extends JpaRepository<User, Object>{
	List<User> findByIdAndPassword(String id,String password);
}
