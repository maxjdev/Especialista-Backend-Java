package br.com.MSMeme.repository;

import br.com.MSMeme.model.Meme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemeRepository extends JpaRepository<Meme, Long> {
}
