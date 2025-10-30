package auladia30exe;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Time {

    public enum Esporte{
        FUTEBOL,
        BASQUETE,
        VOLEI
    }

    private String nomeTime;
    private Participantes participantes;
    private Esporte esporte;

}
