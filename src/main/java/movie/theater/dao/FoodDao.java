package movie.theater.dao;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

import movie.theater.entity.Food;

public interface FoodDao extends JpaRepository<Food, Long> {

	Set<Food> findAllByFoodIn(Set<String> foods);

}
