package br.edu.libertas.dto;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class Produto {
	
	private int id;
	private String descricao;
	private Double preco_custo;
	private Double preco_venda;
	private Date data_fabricacao;
	private Date data_validade;
	private int quantidade;
	private String dataFabricacaoFormatada;
	private String dataValidadeFormatada;
	
	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public Double getPreco_custo() {
		return preco_custo;
	}
	
	public void setPreco_custo(Double preco_custo) {
		this.preco_custo = preco_custo;
	}
	
	public Double getPreco_venda() {
		return preco_venda;
	}
	
	public void setPreco_venda(Double preco_venda) {
		this.preco_venda = preco_venda;
	}

	public Date getData_fabricacao() {
		return data_fabricacao;
	}

	public void setData_fabricacao(Date data_fabricacao) {
		this.data_fabricacao = data_fabricacao;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		this.dataFabricacaoFormatada = sdf.format(data_fabricacao);
	}

	public Date getData_validade() {
		return data_validade;
	}

	public void setData_validade(Date data_validade) {
		this.data_validade = data_validade;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		this.dataValidadeFormatada = sdf.format(data_validade);
	}
	
	public String getDataFabricacaoFormatada() {
		return dataFabricacaoFormatada;
	}
	
	public String getDataValidadeFormatada() {
		return dataValidadeFormatada;
	}
	
}
