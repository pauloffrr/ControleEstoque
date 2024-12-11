package br.projeto.controleEstoque.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Produto extends ProdutoBase {

    @ManyToOne
    @JoinColumn(name = "id_fornecedor")  // Nome da chave estrangeira que faz referência ao Fornecedor
    private Fornecedor fornecedor;

    @OneToMany(mappedBy = "produto")
    private List<MovimentacaoEstoque> movimentacoesEstoque;

    @Override
    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    @Override
    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public List<MovimentacaoEstoque> getMovimentacoesEstoque() {
        return movimentacoesEstoque;
    }

    public void setMovimentacoesEstoque(List<MovimentacaoEstoque> movimentacoesEstoque) {
        this.movimentacoesEstoque = movimentacoesEstoque;
    }
}
