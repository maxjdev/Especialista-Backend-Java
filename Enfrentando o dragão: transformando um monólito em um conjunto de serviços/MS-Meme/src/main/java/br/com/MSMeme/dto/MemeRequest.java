package br.com.MSMeme.dto;

import br.com.MSMeme.model.Meme;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;

import java.sql.Date;
import java.time.LocalDate;

@Builder
public record MemeRequest(
        @NotBlank
        String nome,
        @NotBlank
        String descricao,
        @NotNull
        Long idCategoriaMeme,
        @NotNull
        Long idUsuario
) {
    public static Meme fromEntity(MemeRequest m) {
        return Meme.builder()
                .nome(m.nome)
                .descricao(m.descricao)
                .dataCadastro(Date.valueOf(LocalDate.now()))
                .idCategoriaMeme(m.idCategoriaMeme)
                .idUsuario(m.idUsuario)
                .build();
    }
}
