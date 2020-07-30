package com.photoPolio.api.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.photoPolio.api.Model.Comment;

@Repository
public interface CommentRepository  extends JpaRepository<Comment, Object>{
	List<Comment> findByIdAndPassword(String id,String password);
}
