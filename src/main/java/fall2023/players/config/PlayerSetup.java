package fall2023.players.config;

import fall2023.players.entity.Player;
import fall2023.players.repositories.PlayerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class PlayerSetup implements CommandLineRunner {

  PlayerRepository playerRepository;

  public PlayerSetup(PlayerRepository playerRepository) {
    this.playerRepository = playerRepository;
  }

  @Override
  public void run(String... args) throws Exception {
    List<Player> players = new ArrayList<>();
    players.add(new Player("Lionel Messi", "Argentina", "Forward"));
    players.add(new Player("Kylian Mbappe", "France", "Forward"));
    players.add(new Player("Sofyan Amrabat", "Morocco", "Midfielder"));
    players.add(new Player("Antoine Griezmann", "France", "Forward"));
    players.add(new Player("Hakim Ziyech", "Morocco", "Midfielder"));
    players.add(new Player("Harry Kane", "England", "Forward"));
    players.add(new Player("Bruno Fernandes", "Portugal", "Midfielder"));
    players.add(new Player("Olivier Giroud", "France", "Forward"));
    players.add(new Player("Bukayo Saka", "England", "Forward"));
    players.add(new Player("Yassine Bounou", "Morocco", "Goalkeeper"));
    players.add(new Player("Casemiro", "Brazil", "Midfielder"));
    players.add(new Player("Rodrigo de Paul", "Argentina", "Midfielder"));
    players.add(new Player("Wojciech Szczesny", "Poland", "Goalkeeper"));
    players.add(new Player("Dominik Livakovic", "Croatia", "Goalkeeper"));
    players.add(new Player("Achraf Hakimi", "Morocco", "Defender"));
    players.add(new Player("Ousmane Dembele", "France", "Forward"));
    players.add(new Player("Cody Gakpo", "Netherlands", "Forward"));
    players.add(new Player("Alexis Mac Allister", "Argentina", "Midfielder"));
    players.add(new Player("Richarlison", "Brazil", "Forward"));
    players.add(new Player("Jude Bellingham", "England", "Midfielder"));
    players.add(new Player("Memphis Depay", "Netherlands", "Forward"));
    players.add(new Player("Harry Maguire", "England", "Defender"));
    players.add(new Player("Adrien Rabiot", "France", "Midfielder"));
    players.add(new Player("Azzedine Ounahi", "Morocco", "Midfielder"));
    players.add(new Player("Vinicius Junior", "Brazil", "Forward"));

    playerRepository.saveAll(players);
    System.out.println("Players saved");
  }

}
