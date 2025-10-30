package criacional.prototype;

public class Main {
    public static void main(String[] args) throws Exception{
        Jogador atacanteInfantil =
            Jogador.builder().nome("Romario").
                    categoria(Jogador.Categoria.INFANTIL).
                    numeroCamisa(11).
                    posicao(Jogador.Posicao.ATACANTE).
                    idade(10).peso(55).altura(170).build();

        Jogador atacanteInfantil2 = atacanteInfantil.clone();
        atacanteInfantil2.setNome("Ronaldinho");
        atacanteInfantil2.setNumeroCamisa(9);
        System.out.println();


    }
}
