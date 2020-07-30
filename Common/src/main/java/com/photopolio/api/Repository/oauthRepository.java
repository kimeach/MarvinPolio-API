package com.photopolio.api.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.photopolio.api.Model.oauth;

@Repository
public interface oauthRepository extends JpaRepository<oauth, Object>{

}
