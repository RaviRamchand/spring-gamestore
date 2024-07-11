package ca.ravi.demo.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import ca.ravi.demo.Beans.Game;
import ca.ravi.demo.Repo.GameRepo;
import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class Data implements CommandLineRunner {
    private GameRepo gameRepo;

    @Override
    public void run(String... args) throws Exception {
        Game game1 = new Game(0L, "Smackdown vs Raw 2007", 20.00, "2006",
                "https://m.media-amazon.com/images/I/718+HvR4O7L._AC_UF1000,1000_QL80_.jpg");
        Game game2 = new Game(0L, "Ultimate Spider-Man", 20.00, "2005",
                "https://m.media-amazon.com/images/M/MV5BMjlkNWRmMTQtMzhkYi00Zjg5LTgzNDktNjJiYjdiMzFkNzczXkEyXkFqcGdeQXVyMTA0MTM5NjI2._V1_FMjpg_UX1000_.jpg");
        Game game3 = new Game(0L, "Spider-Man PS4", 23.99, "2018",
                "https://m.media-amazon.com/images/I/81d6JU6g1pL._AC_UF1000,1000_QL80_.jpg");

        Game game4 = new Game(0L, "Hogwarts Legacy", 90.0, "2023", "https://image.api.playstation.com/vulcan/ap/rnd/202208/0921/Ah7Ar9MU0r1BBlzAUflmhyQP.png"); 
        
        Game game5 = new Game(0L, "NHL 22", 24.99, "2021", "https://upload.wikimedia.org/wikipedia/en/thumb/3/3e/NHL_22_Cover.jpg/220px-NHL_22_Cover.jpg"); 

        gameRepo.save(game1);
        gameRepo.save(game2);
        gameRepo.save(game3);
        gameRepo.save(game4);
        gameRepo.save(game5);
    }

}
