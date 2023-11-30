public class funcionario {
    private String nome;
    private int idade;

    // Metodos Getters and Setters(Encpsulamento) que vão ser herdados nas classes Horalista e Mensalista
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Método que será utilizado para poliformismo: 

    public String realizarTarefa() {

        return "Bom trabalho, Funcionario.";
    }

}
