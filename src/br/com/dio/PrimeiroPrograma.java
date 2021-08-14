package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    private static Object Livros;
    private static Object Livro;

    public static void main(String[] args) {
        Gato gato = new Gato();
        System.out.println(gato);

        Livro = new Livro("O problema dos 3 corpos", 300);
        System.out.println(Livro);

       /* int a = 5;e
        int b = 3;
        System.out.println("Hello word!" + (a+b));*/
    }

}
class Livro{
    private String nome;
    private Integer numPaginas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }

    public Livro(String nome, Integer numPaginas) {
        this.nome = nome;
        this.numPaginas = numPaginas;
    }
}

