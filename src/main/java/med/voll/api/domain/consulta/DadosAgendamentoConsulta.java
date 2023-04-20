package med.voll.api.domain.consulta;

import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record DadosAgendamentoConsulta(
        Long idMedico,

        @NotNull Long idPaciente,

        @NotNull
        @Future
        LocalDateTime data) {
}
// @JsonFormat(pattern = "dd/MM/yyyy HH:mm")
// é usado como anotação em LocalDateTime para obter a data no formato passado para o pattern
