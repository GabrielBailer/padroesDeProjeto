package singleton;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Pessoa implements Cloneable {
    private String nome;
    private String telefone;

    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.setNome("Renato");
        p.setTelefone("4798887777");
        System.out.printf("Nome: %s\n", p.getNome());
        System.out.printf("Telefone: %s\n", p.getTelefone());
        System.out.println(p);
    }

    @Override
    protected Pessoa clone() throws CloneNotSupportedException {
        return (Pessoa)super.clone();
    }
}
