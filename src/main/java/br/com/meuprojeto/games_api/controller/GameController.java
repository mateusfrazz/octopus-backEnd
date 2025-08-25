package br.com.meuprojeto.games_api.controller;
import br.com.meuprojeto.games_api.dto.GameResponseDTO;
import br.com.meuprojeto.games_api.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController // Anotacao que diz ao Spring esta e um controller de API
@RequestMapping ("/api/games") // todas as requisicoes para api/games virao para esta classe
@CrossOrigin(origins = "*") // Permite que o angular acesse esta API

public class GameController {
  @Autowired // anotacao para o spring fazer a injecao de dependencia
    private GameService gameService;

  @GetMapping // metodo usado para responder a requisicoes GET para a api
    public GameResponseDTO getAllGames () {
      // O controller pede o service fazer o trabalho pesado e resposta
      return gameService.fetchGamesFromRawg();
  }

}
