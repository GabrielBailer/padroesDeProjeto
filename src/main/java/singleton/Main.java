package singleton;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        PessoaManager manager = PessoaManager.getInstance();
        manager.adicionar(new Pessoa("Amanda", "479999888"));
        manager.adicionar(new Pessoa("Eduardo", "4897877766"));
        manager.adicionar(new Pessoa("Mariana", "1178777888"));
        manager.listarTodos();
        PessoaManager manager2 = PessoaManager.getInstance();
        manager2.adicionar(new Pessoa("Thiago", "9999977777"));
        manager2.adicionar(new Pessoa("Herman", "321321654"));
        manager2.adicionar(new Pessoa("Tulio", "6666666"));
        manager2.listarTodos();
        PessoaManager.getInstance().adicionar(new Pessoa("Maria Julia", "99999999999"));
        manager2.listarTodos();
        PessoaManager m3 = PessoaManager.getInstance();
        m3.listarTodos();

        Pessoa renato = Pessoa.builder().
                nome("Renato").
                telefone("321654").build();
        ArrayList<Pessoa> todos = PessoaManager.getInstance().getTodas();
        todos.getFirst().setNome("TESTE123");
        System.out.println();
    }
}
