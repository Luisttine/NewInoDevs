package com.api.inodevs.entidades;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

//Criando entidade da cotrato:
@Entity
public class Contrato {
	// Colunas do contrato:
    @Id // Referenciando o Id
	private Long codigo;
	
	@ManyToOne
	@JoinColumn(name = "codigo_concessionaria")
	private Concessionaria concessionaria;
	
	@ManyToOne
	@JoinColumn(name = "cnpj_unidade")
	private Unidade unidade;
	
	private String status;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_notificacoes", referencedColumnName = "id")
    private Notificacoes notificacoes;
	
	 // Getters e Setters:
	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public Concessionaria getConcessionaria() {
		return concessionaria;
	}
	public void setConcessionaria(Concessionaria concessionaria) {
		this.concessionaria = concessionaria;
	}
	public Unidade getUnidade() {
		return unidade;
	}
	public void setUnidade(Unidade unidade) {
		this.unidade = unidade;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Notificacoes getNotificacoes() {
		return notificacoes;
	}
	public void setNotificacoes(Notificacoes notificacoes) {
		this.notificacoes = notificacoes;
	}
	
}
