package com.photoPolio.api.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.photoPolio.api.Model.Login;

@Repository
public interface LoginRepository  extends JpaRepository<Login, Object>{
	List<Login> findByIdAndPassword(String id,String password);
}
