package com.srikar_kale.projects.blogging_application.Services;

import com.srikar_kale.projects.blogging_application.Models.Post;
import com.srikar_kale.projects.blogging_application.Repository.PostRepository;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public interface PostService {
    Optional<Post> getById(Long id);

    Optional<List<Post>> getAll();

    Post save(Post post);
}
