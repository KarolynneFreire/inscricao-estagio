package br.ifpe.model;

import java.io.File;
import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Entity
public class Candidato {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codigo;
	private String cpf;
	private String nome;
	private String email;
	@DateTimeFormat(iso = ISO.DATE)
	private LocalDate dataNascimento;
	private String areas;
	private SEXO sexo;
	private UF uf;
	private Integer anoConclusao;
	private Double salarioDesejado;
	private byte foto;
	private File curriculo;
	
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getAreas() {
		return areas;
	}
	public void setAreas(String areas) {
		this.areas = areas;
	}
	public SEXO getSexo() {
		return sexo;
	}
	public void setSexo(SEXO sexo) {
		this.sexo = sexo;
	}
	public UF getUf() {
		return uf;
	}
	public void setUf(UF uf) {
		this.uf = uf;
	}
	public Integer getAnoConclusao() {
		return anoConclusao;
	}
	public void setAnoConclusao(Integer anoConclusao) {
		this.anoConclusao = anoConclusao;
	}
	public Double getSalarioDesejado() {
		return salarioDesejado;
	}
	public void setSalarioDesejado(Double salarioDesejado) {
		this.salarioDesejado = salarioDesejado;
	}
	public byte getFoto() {
		return foto;
	}
	public void setFoto(byte foto) {
		this.foto = foto;
	}
	public File getCurriculo() {
		return curriculo;
	}
	public void setCurriculo(File curriculo) {
		this.curriculo = curriculo;
	}
	@Override
	public int hashCode() {
		return Objects.hash(anoConclusao, areas, codigo, cpf, curriculo, dataNascimento, email, foto, nome,
				salarioDesejado, sexo, uf);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Candidato other = (Candidato) obj;
		return Objects.equals(anoConclusao, other.anoConclusao) && Objects.equals(areas, other.areas)
				&& Objects.equals(codigo, other.codigo) && Objects.equals(cpf, other.cpf)
				&& Objects.equals(curriculo, other.curriculo) && Objects.equals(dataNascimento, other.dataNascimento)
				&& Objects.equals(email, other.email) && foto == other.foto && Objects.equals(nome, other.nome)
				&& Objects.equals(salarioDesejado, other.salarioDesejado) && sexo == other.sexo && uf == other.uf;
	}
	@Override
	public String toString() {
		return "Candidato [codigo=" + codigo + ", cpf=" + cpf + ", nome=" + nome + ", email=" + email
				+ ", dataNascimento=" + dataNascimento + ", areas=" + areas + ", sexo=" + sexo + ", uf=" + uf
				+ ", anoConclusao=" + anoConclusao + ", salarioDesejado=" + salarioDesejado + ", foto=" + foto
				+ ", curriculo=" + curriculo + "]";
	}
	
	
	
	
}
