public class Contribuinte {
     private String nome;
     private String cpf;
     private String UF;
    private double rendaAnual;

    @Override
    public String toString() {
        return String.format("Nome: %s\nImposto: %.2f",nome,impostoPagar());
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        if (cpf == null || cpf.isBlank() || cpf.length() < 11){
            throw new IllegalArgumentException("Erro CPF Invalido!");
        }else{
            this.cpf = cpf;
        }

    }

    public void setUF(String UF) {
        this.UF = UF;
    }

    public void setRendaAnual(double rendaAnual) {

        if (rendaAnual < 0){
            throw new IllegalArgumentException("Erro Valor de Renda Negativa!");
        }else{
            this.rendaAnual = rendaAnual;
        }
    }

    public Contribuinte(String nome, String cpf, String UF, double rendaAnual) {
        setNome(nome);
        setCpf(cpf);
        setUF(UF);
        setRendaAnual(rendaAnual);
    }
    public double impostoPagar() {
        if (rendaAnual <= 4000){
            return  rendaAnual *0;
        } else if (rendaAnual <= 9000) {
            return rendaAnual *0.058;
        } else if (rendaAnual <= 25000) {
            return rendaAnual *0.15;
        } else if (rendaAnual <= 35000) {
            return rendaAnual *0.275;
        } else {
            return rendaAnual * 0.30;
        }
    }
}

