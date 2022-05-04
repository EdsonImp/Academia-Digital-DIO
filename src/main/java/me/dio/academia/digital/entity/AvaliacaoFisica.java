package me.dio.academia.digital.entity;

import lombok.AllArgsConstructor;  
import lombok.NoArgsConstructor;


import javax.persistence.*;
import java.time.LocalDateTime;


@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_avaliacoes")
public class AvaliacaoFisica {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ManyToOne(cascade = CascadeType.ALL)//alteração refletira em cascata, em aluno
  @JoinColumn(name = "aluno_id") //Join column a fk(aluno_id) estara dentro dessa tabela
  private Aluno aluno;

  private LocalDateTime dataDaAvaliacao = LocalDateTime.now();

  @Column(name="peso_atual")
  private double peso;

  @Column(name="altura_atual")
  private double altura;

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public Aluno getAluno() {
	return aluno;
}

public void setAluno(Aluno aluno) {
	this.aluno = aluno;
}

public LocalDateTime getDataDaAvaliacao() {
	return dataDaAvaliacao;
}

public void setDataDaAvaliacao(LocalDateTime dataDaAvaliacao) {
	this.dataDaAvaliacao = dataDaAvaliacao;
}

public double getPeso() {
	return peso;
}

public void setPeso(double peso) {
	this.peso = peso;
}

public double getAltura() {
	return altura;
}

public void setAltura(double altura) {
	this.altura = altura;
}

  
}
