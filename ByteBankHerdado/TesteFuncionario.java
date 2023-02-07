public class TesteFuncionario {
    public static void main(String[] args) {

        Funcionario nico = new Funcionario("Nico Steppat", "065.454.455-50", 2600.00);
       

        System.out.println(nico.getNome());
        System.out.println(nico.getBonificacao());

    }
}
