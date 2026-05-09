public class Atividade3 {

    public static void main(String[] args) {

        AlunoQ3 a1 = new AlunoQ3("Joãozinho", 20, "4394394834839", "Desi",8.5);
        AlunoQ3 a2 = new AlunoQ3("Pedro", 18, "65685968598", "Arquitetura",9);
        AlunoQ3 a3 = new AlunoQ3("Kevin", 38, "111111111111", "Desi",2.4);
        AlunoQ3 a4 = new AlunoQ3("Eduardo", 56, "32324545343", "Desi",10);

        SistemaDeAlunosQ3 s1 = new SistemaDeAlunosQ3();

        s1.adicionarAluno(a1);
        s1.adicionarAluno(a2);
        s1.adicionarAluno(a3);
        s1.adicionarAluno(a4);

        System.out.println(s1.obterAlunos("Desi", 18, 8));

        System.out.println(s1.obterAluno("111111111111"));
    }
}
