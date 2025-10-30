package criacional.prototype;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Jogador implements Cloneable{
    public enum Posicao{
        GOLEIRO,
        ZAGUEIRO,
        LATERAL_DIREITO,
        LATERAL_ESQUERDO,
        MEIO_CAMPO,
        CENTRO_AVANTE,
        ATACANTE
    }
    public enum Categoria{
        INFANTIL,JUVENIL, ADULTO
    }
    private String nome;
    private int idade;
    private int numeroCamisa;
    private Posicao posicao;
    private double peso;
    private double altura;
    private Categoria categoria;

    @Override
    protected Jogador clone() throws CloneNotSupportedException {
        return (Jogador) super.clone();
    }
}
