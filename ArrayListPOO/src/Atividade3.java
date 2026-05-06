public class Atividade3 {

    public static void main(String[] args) {

        aluno a1 = new aluno ("Joãozinho", 20, "4394394834839", "Desi",8.5);
        aluno a2 = new aluno ("Pedro", 18, "65685968598", "Arquitetura",9);
        aluno a3 = new aluno ("Kevin", 38, "111111111111", "Desi",2.4);
        aluno a4 = new aluno ("Eduardo", 56, "32324545343", "Desi",10);

        sistemaDeAlunos s1 = new sistemaDeAlunos();

        s1.adicionarAluno(a1);
        s1.adicionarAluno(a2);
        s1.adicionarAluno(a3);
        s1.adicionarAluno(a4);

        System.out.println(s1.obterAlunos("Desi", 18, 8));

        System.out.println(s1.obterAluno("111111111111"));
    }
}
