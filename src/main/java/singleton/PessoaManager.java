package criacional.singleton;
import java.util.ArrayList;
public class PessoaManager {
    private static PessoaManager instance;
    private PessoaManager(){}
    public static PessoaManager getInstance() {
        if(instance == null) {
            instance = new PessoaManager();
        }
        return instance;
    }
    private ArrayList<Pessoa> pessoas = new ArrayList<>();

    public void adicionar(Pessoa p){
        System.out.println("Adicionando: " + p);
        pessoas.add(p);
    }
    public void listarTodos(){
        System.out.println("--- Pessoas Cadastradas ---");
        for(Pessoa p: pessoas){
            System.out.println(p);
        }
    }
    public ArrayList<Pessoa> getTodas() throws Exception{
        ArrayList<Pessoa> novaLista = new ArrayList<>();
        for(Pessoa p: pessoas){
            novaLista.add(p.clone());
        }
        return novaLista;
    }
}





