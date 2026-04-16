public class Livro {
    private String titulo;
    private boolean emprestado = false;

    @Override
    public String toString() {
        if (emprestado) {
            return titulo + " - Status: Emprestado";
        } else {
            return titulo + " - Status: Disponível";
        }
    }

    public Livro(String titulo) {
        setTitulo(titulo);
    }

    public void setTitulo(String titulo) {
        if (titulo == null || titulo.isBlank()){
            throw new IllegalArgumentException("Erro nome não registrado");
        }else {
            this.titulo = titulo;
        }
    }


    public void emprestar() {
        emprestado = true;
    }

    public void devolver() {
        emprestado = false;
    }
}