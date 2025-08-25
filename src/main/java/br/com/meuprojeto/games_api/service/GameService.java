package br.com.meuprojeto.games_api.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service // anotacao que diz ao spring que esta e uma classe de servico
public class GameService {

    // Injeta os valores do application.properties no codigo
    @Value("${rawg.api.url}")
    private String rawgApiUrl;

    @Value("${rawg.api.key}")
    private String rawgApiKey;

    //o RestTemplate e a ferramente do spring para fazer requisicoes HTTP
    private final RestTemplate restTemplate = new RestTemplate();

    public String fetchGamesFromRawg() {
        //Monta a URL final para a API da RAWG
        String url = rawgApiUrl +  "/games?key=" + rawgApiKey;

        System.out.println("Buscando dados da URL: " + url);

        // Fazendo a chamada GEt para a URL
        return restTemplate.getForObject(url, String.class);
    }
}
