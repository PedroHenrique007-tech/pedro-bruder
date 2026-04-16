public class OnibusEscolar {
    int Alunos;
    int Professores;

    @Override
    public String toString() {
        return "Quantidade de Alunos:" + Alunos + "\nQuantidade Professores: " + Professores;
    }

    public OnibusEscolar(int professores, int Alunos) {
        setProfessores(professores);
        setAlunos(Alunos);

    }
    public void setProfessores(int professores) {
        Professores = professores;
    }
    public void setAlunos(int Alunos){
        this.Alunos = Alunos;
        if (Professores == 0){
            this.Alunos = 0;
        }else if (Alunos < 0) {
            throw new IllegalArgumentException("Erro numero de alunos negativo!");
        }else if(Alunos > 40){
            this.Alunos = 40;
        }
    }




}
