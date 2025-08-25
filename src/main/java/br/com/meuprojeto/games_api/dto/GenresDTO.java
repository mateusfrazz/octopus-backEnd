package br.com.meuprojeto.games_api.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties (ignoreUnknown = true)


public class GenresDTO {
        private long id;
        private String name;
        private String slug;
        private Number games_count;
        private String image_backgroung;
}
