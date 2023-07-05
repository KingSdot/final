package movie.theater.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import movie.theater.entity.Movie;

public interface MovieDao extends JpaRepository<Movie, Long> {

}
