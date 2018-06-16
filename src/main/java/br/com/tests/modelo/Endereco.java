package br.com.tests.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Entity
@Table(name = "endereco")
public class Endereco {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;

	private String logradouro;

	private Integer numero;

	private String complemento;

	private String bairro;

	private String cidade;

	private String estado;

	@ManyToOne
	@JoinColumn(name = "codigo_pessoa")
	@JsonIgnore
	private Pessoa pessoa;
}
