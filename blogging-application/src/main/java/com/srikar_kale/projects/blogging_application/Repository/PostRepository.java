package com.srikar_kale.projects.blogging_application.Repository;

import com.srikar_kale.projects.blogging_application.Models.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long>{
}
