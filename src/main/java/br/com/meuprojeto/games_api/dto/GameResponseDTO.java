// Em src/main/java/br/com/meuprojeto/games_api/dto/GameResponseDTO.java

package br.com.meuprojeto.games_api.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import java.util.List;

// As anotações e os campos devem estar diretamente na classe principal
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class GameResponseDTO {
    private Integer count;
    private String next;
    private List<GameDTO> results;
}