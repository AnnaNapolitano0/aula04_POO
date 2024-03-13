import javax.xml.crypto.Data;

public class aluno {
    private String nome ;
    private String cpf;
    private int ra;
    private String data_nascimento;
    private String sexo;

    public aluno (String nome, String cpf, int ra, String data_nascimento, String sexo){
        this.nome = nome;
        this.cpf = cpf;
        this.ra = ra;
        this.data_nascimento = data_nascimento;
        this.sexo = sexo;
    }
    public aluno() {

    }

    public void setNome (String entrada){
        this.nome = entrada;
    
    }
    public void setra (int entrada){
        this.ra = entrada;
    
    }
    public String getnome(){
        return this.nome;
    }
    public int getra(){
        return this.ra;
    }
    
}
