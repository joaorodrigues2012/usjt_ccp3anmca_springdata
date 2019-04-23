package br.usjt.usjt_ccp3anmca_springdata.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tb_aluno")
@NamedQuery(query = "select a from Aluno a Where a.nome = :nome AND a.email = :email", name="Aluno.buscarPeloNomeEPeloEmail")
public class Aluno implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome,fone,email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
