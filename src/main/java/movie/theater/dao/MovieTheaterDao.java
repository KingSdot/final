package movie.theater.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import movie.theater.entity.MovieTheater;

public interface MovieTheaterDao extends JpaRepository<MovieTheater, Long> {

}
