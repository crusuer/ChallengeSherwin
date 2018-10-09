package br.com.sherwin.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sherwin.model.Post;
import br.com.sherwin.repository.PostRepository;

@Service
public class PostService {

    @Autowired
    private PostRepository repository;

    public List<Post> findAll() {
        return repository.findAll();
    }

    public Optional<Post> findOne(Long id) {
        return repository.findById(id);
    }

    public Post save(Post post) {
        return repository.saveAndFlush(post);
    }
}
