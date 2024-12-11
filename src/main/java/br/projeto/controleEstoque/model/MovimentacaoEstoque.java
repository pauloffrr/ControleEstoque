package br.projeto.controleEstoque.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class MovimentacaoEstoque {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_movimentacao") // Nome da coluna no banco de dados
    private Long idMovimentacao;

    @ManyToOne
    @JoinColumn(name = "id_produto") // Relacionamento com a tabela Produto
    private Produto produto;

    @ManyToOne
    @JoinColumn(name = "id_estoque") // Relacionamento com a tabela Estoque
    private Estoque estoque;

    @Column(name = "tipo_movimentacao")
    private String tipoMovimentacao;

    @Column(name = "quantidade")
    private Integer quantidade;

    @Column(name = "data_movimentacao")
    private LocalDateTime dataMovimentacao;

    // Getters e Setters
    public Long getIdMovimentacao() {
        return idMovimentacao;
    }

    public void setIdMovimentacao(Long idMovimentacao) {
        this.idMovimentacao = idMovimentacao;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Estoque getEstoque() {
        return estoque;
    }

    public void setEstoque(Estoque estoque) {
        this.estoque = estoque;
    }

    public String getTipoMovimentacao() {
        return tipoMovimentacao;
    }

    public void setTipoMovimentacao(String tipoMovimentacao) {
        this.tipoMovimentacao = tipoMovimentacao;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public LocalDateTime getDataMovimentacao() {
        return dataMovimentacao;
    }

    public void setDataMovimentacao(LocalDateTime dataMovimentacao) {
        this.dataMovimentacao = dataMovimentacao;
    }
}
