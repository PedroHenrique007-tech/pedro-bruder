public class Q3Aluno {

    private String nome;
    private int idade;
    private String matricula;
    private String curso;
    private double media;

    public Q3Aluno(String nome, int idade, String matricula, String curso, double media) {
        setNome(nome);
        setIdade(idade);
        setMatricula(matricula);
        setCurso(curso);
        setMedia(media);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isBlank()){
            throw new IllegalArgumentException("Erro! Campo deve estar preenchido.");
        }
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade < 18 ) {
            throw new IllegalArgumentException("Erro! Campo deve estar preenchido.");
        }
        this.idade = idade;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        if (matricula == null || matricula.isBlank()){
            throw new IllegalArgumentException("Erro! Campo deve estar preenchido.");
        }
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        if (curso == null || curso.isBlank()){
            throw new IllegalArgumentException("Erro! Campo deve estar preenchido.");
        }
        this.curso = curso;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        if (media < 0 || media > 10 ){
            throw new IllegalArgumentException("Erro! Campo deve estar preenchido.");
        }
        this.media = media;
    }

    @Override
    public String toString() {
        return  "\n nome= "+ nome + "\n idade= " + idade +
                "\n matricula= " + matricula + "\n curso= " + curso + "\n media= " + media;
    }
}
