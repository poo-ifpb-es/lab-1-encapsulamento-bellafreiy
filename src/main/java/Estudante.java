public class Estudante{
    int matricula;
    private String nome;
  
    public Estudante(String nome, int matricula){
        this.nome = nome;
        this.matricula = matricula;
    }
    public String getNome(){
        return this.nome;
    }
  
    public void setNome(String nome){
        this.nome = nome;
    }
  
  
    public int getMatricula(){
        return this.matricula;
    }
  
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
    public static void main(String[] args) {
        Estudante e = new Estudante("Ana Gabriella", 123456);
        System.out.println(e.getNome());
        System.out.println(e.getMatricula());
    }
}