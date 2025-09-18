package Livraria;

public class Operacao implements Livraria {
    private String tipo;
    private double valorOperacao;
    private Livro livro;

    public Operacao(String tipo, Livro livro) {
        this.tipo = tipo;
        this.livro = livro;
    }

    public Livro getLivro() {
        return livro;
    }

    public String getTipo() {
        return tipo;
    }

    public double getValorOperacao() {
        return valorOperacao;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    @Override
    public void venderLivro() {
        this.valorOperacao = livro.getValor() * 1.09; // +9%
    }

    @Override
    public void emprestarLivro() {
        this.valorOperacao = (livro.getValor() * 0.02) + taxaEmprestimo;
    }

    @Override
    public String toString() {
        return "Operacao [tipo=" + tipo + ", valorOperacao=" + valorOperacao + ", livro=" + livro + "]";
    }
}
