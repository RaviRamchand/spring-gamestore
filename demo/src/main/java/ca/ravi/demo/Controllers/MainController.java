package ca.ravi.demo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import ca.ravi.demo.Beans.Game;
import ca.ravi.demo.Repo.GameRepo;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
@AllArgsConstructor
public class MainController {
    private GameRepo gamesRepo; 

    @GetMapping("/")
    public String goHome(Model model) {
        model.addAttribute("gameList", gamesRepo.findAll());
        return "index.html";
    }

    @GetMapping("/addGames")
    public String addGames(Model model) {
        model.addAttribute("game", new Game());
        return "addGames.html";
    }

    @GetMapping("/viewGames")
    public String viewGames(Model model) {
       model.addAttribute("gameList", gamesRepo.findAll());
       return "viewGames.html";
    }

    @PostMapping("/processGame")
    public String postMethodName(@ModelAttribute Game game) {
        gamesRepo.save(game);        
        return "redirect:/";
    }

    @GetMapping("/sortGamesHighest")
    public String getHighestGames(Model model) {
        model.addAttribute("gameList", gamesRepo.findByOrderByPriceDesc());
        return "index.html";
    }

    @GetMapping("/sortGamesLowest")
    public String getLowestGames(Model model) {
        model.addAttribute("gameList", gamesRepo.findByOrderByPriceAsc());
        return "index.html";
    }
    
    
}
