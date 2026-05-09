public class A3 {

    public static void main(String[] args) {

        Q3Aluno a1 = new Q3Aluno("Joãozinho", 20, "4394394834839", "Desi",8.5);
        Q3Aluno a2 = new Q3Aluno("Pedro", 18, "65685968598", "Arquitetura",9);
        Q3Aluno a3 = new Q3Aluno("Kevin", 38, "111111111111", "Desi",2.4);
        Q3Aluno a4 = new Q3Aluno("Eduardo", 56, "32324545343", "Desi",10);

        Q3SistemaDeAlunos s1 = new Q3SistemaDeAlunos();

        s1.adicionarAluno(a1);
        s1.adicionarAluno(a2);
        s1.adicionarAluno(a3);
        s1.adicionarAluno(a4);

        System.out.println(s1.obterAlunos("Desi", 18, 8));

        System.out.println(s1.obterAluno("111111111111"));
    }
}
