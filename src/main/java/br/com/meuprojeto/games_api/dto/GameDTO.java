// Em src/main/java/br/com/meuprojeto/games_api/dto/GameDTO.java

package br.com.meuprojeto.games_api.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// As anotações e os campos devem estar diretamente na classe principal
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class GameDTO {
    private long id;
    private String name;
    private String background_image;
    private Double rating;
}