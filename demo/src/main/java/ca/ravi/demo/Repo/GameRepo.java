package ca.ravi.demo.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ca.ravi.demo.Beans.Game;

@Repository
public interface GameRepo extends JpaRepository<Game, Long> {
    public List<Game> findByOrderByPriceDesc(); 

    public List<Game> findByOrderByPriceAsc();
}
