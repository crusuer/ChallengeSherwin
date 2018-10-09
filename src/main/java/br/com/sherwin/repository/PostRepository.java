package br.com.sherwin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.sherwin.model.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
}
