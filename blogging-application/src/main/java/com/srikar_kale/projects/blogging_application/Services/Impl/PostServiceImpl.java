package com.srikar_kale.projects.blogging_application.Services.Impl;

import com.srikar_kale.projects.blogging_application.Models.Post;
import com.srikar_kale.projects.blogging_application.Repository.PostRepository;
import com.srikar_kale.projects.blogging_application.Services.PostService;
import org.hibernate.grammars.hql.HqlParser;
import org.springframework.stereotype.Service;
import org.w3c.dom.stylesheets.LinkStyle;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class PostServiceImpl implements PostService {

    private final PostRepository postRepository ;

    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public Optional<Post> getById(Long id) {
        return postRepository.findById(id);
    }

    @Override
    public Optional<List<Post>> getAll(){
        return Optional.of(postRepository.findAll());
    }

    @Override
    public Post save(Post post){
        if(post.getId() == null)
            post.setCreatedAt(LocalDateTime.now());
        return postRepository.save(post);
    }
}
