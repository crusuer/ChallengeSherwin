package br.com.sherwin.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotBlank;

@Entity(name = "tb_cliente")
public class Post implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "post_seq", sequenceName = "post_seq")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "post_seq")
	private Long id;

	@Column(nullable = false, length = 150)
	@NotBlank(message = "Razão Social é uma informação obrigatória.")
	private String razaoSocial;

	@Column(nullable = false, length = 150)
	@NotBlank(message = "Nome Fantasia é uma informação obrigatória.")
	private String nomeFantasia;

	@Column(nullable = false, length = 18)
	@NotBlank(message = "CPF/CNPJ é uma informação obrigatória.")
	private String cpfCnpj;

	@Column(nullable = false, length = 100)
	@NotBlank(message = "Telefone é uma informação obrigatória.")
	private String telefones;

	@Column(nullable = false, length = 20)
	@NotBlank(message = "Status é uma informação obrigatória.")
	private String status;

	private Long codigo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getCpfCnpj() {
		return cpfCnpj;
	}

	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}

	public String getTelefones() {
		return telefones;
	}

	public void setTelefones(String telefones) {
		this.telefones = telefones;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

}
