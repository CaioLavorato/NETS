/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

/**
 *
 * @author NETS
 */
public class Produto {

    private String nome;
    private String descricao;
    private double precoCompra;
    private double precoVenda;
    private int quantidade;
    private int id;
    private boolean flagProduto;
    private String categoria;
    private String dataCadastro;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPrecoCompra() {
        return precoCompra;
    }

    public void setPrecoCompra(double precoCompra) {
        this.precoCompra = precoCompra;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public boolean isFlagProduto() {
        return flagProduto;
    }

    public void setFlagProduto(boolean flagProduto) {
        this.flagProduto = flagProduto;
    }

    public void setId(int Id) {
        this.id = Id;

    }

    public int getId() {
        return id;
    }

    public String getCategoria() {
        return categoria;
    }
        public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setData (String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getData() {
        return dataCadastro;
    }



}
