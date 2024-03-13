public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        aluno larissa = new aluno( "Larissa", "111.111.111-12", 2321044, "13/03/2005", "Feminino");
        
        larissa.setNome("Larissa");

        System.out.println(larissa.getnome());
        System.out.println(larissa.getra());


    }

}