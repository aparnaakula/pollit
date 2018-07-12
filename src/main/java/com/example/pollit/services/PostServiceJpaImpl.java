package com.example.pollit.services;

import com.example.pollit.models.Post;
import com.example.pollit.models.User;
import com.example.pollit.repositories.PostRepository;
import com.example.pollit.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Primary
public class PostServiceJpaImpl implements PostService {

    @Autowired
    private PostRepository postRepo;

    @Override
    public List<Post> findAll() {
        return postRepo.findAll();
    }

    @Override
    public List<Post> findLatest5() {
        return postRepo.findLatest5Posts();
    }

    @Override
    public Post findById(Long id) {
        Optional<Post> opt=  this.postRepo.findById(id);
        return opt.get();
    }

    @Override
    public Post create(Post post) {

       return postRepo.save(post);
     }

    @Override
    public Post edit(Post post) {
        return null;
    }

    @Override
    public void deleteById(Long id) {
        postRepo.deleteById(id);
    }
}
