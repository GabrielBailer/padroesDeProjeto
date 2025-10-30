package builder;

public class Main {
    public static void main(String[] args) {
        try {
            Carro limosine = new CarroBuilder().
                    addPlaca("MSH-1234").
                    addNomeMotorista("Jorge").
                    addNCNHMotorista("123456789").
                    addChassi("Chassi123").
                    addAnoFabricacao(2000).
                    addAnoModelo(2001).
                    addMarca("Chevrolet").
            build();
            System.out.println(limosine);
        } catch (Exception e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
