package auladia30exe;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Participantes {

    public enum TipoParticipante {
        TECNICO,
        JOGADOR
    }

    private String nomeParticipante;
    private TipoParticipante tipoParticipante;

}
