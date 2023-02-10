public class TesteReferencias {
    public static void main(String[] args) {
        
        Gerente g1 = new Gerente();
        g1.setNome("Marcos Santana");
        g1.setCpf("065.545.545-33");
        g1.setSalario(5000.00);

        Designer d = new Designer ();
        d.setNome("Tiago Matos");
        d.setCpf("065.545.631-30");
        d.setSalario(2000.00);

        EditorDeVideo ev = new EditorDeVideo();
        ev.setNome("Italo Alves");
        ev.setCpf("065.632.214-40");
        ev.setSalario(2500.00);
        

        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(g1);
        controle.registra(d);
        controle.registra(ev);

        System.out.println(controle.getSoma());    

              
    }
}