package br.com.prog3.semanaPratica2.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Carro {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_carro;
	private String placa;
	private String cor;
	private Integer ano;
	private Integer anoModelo;
	private String marca;
	private String modelo;
	@ManyToOne(cascade=CascadeType.ALL) 
	@JoinColumn(name="id_cliente", referencedColumnName="id_cliente",nullable=false) 
	private Cliente cliente;
	@ManyToOne(cascade=CascadeType.ALL) 
	@JoinColumn(name="codigo", referencedColumnName="codigo",nullable=false) 
	private Oficina oficina;

	public Carro() {
	}	

	public Integer getId_carro() {
		return id_carro;
	}

	public void setId_carro(Integer id_carro) {
		this.id_carro = id_carro;
	}



	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public Integer getAnoModelo() {
		return anoModelo;
	}

	public void setAnoModelo(Integer anoModelo) {
		this.anoModelo = anoModelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Oficina getOficina() {
		return oficina;
	}

	public void setOficina(Oficina oficina) {
		this.oficina = oficina;
	}

}