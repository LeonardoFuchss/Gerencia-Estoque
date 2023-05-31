import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Produto {

    private String nome;
    private int codigo;
    private double valorCusto;
    private double valorVenda;

    public Produto(String nome, int codigo, double valorCusto, double valorVenda) {
        this.nome = nome;
        this.codigo = codigo;
        this.valorCusto = valorCusto;
        this.valorVenda = valorVenda;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public double getValorCusto() {
        return valorCusto;
    }

    public double getValorVenda() {
        return valorVenda;
    }
}

