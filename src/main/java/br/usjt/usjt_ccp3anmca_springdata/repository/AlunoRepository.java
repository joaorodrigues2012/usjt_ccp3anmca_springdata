package br.usjt.usjt_ccp3anmca_springdata.repository;

import br.usjt.usjt_ccp3anmca_springdata.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.concurrent.Future;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {

    public Aluno findByEmail(String email);

    public List <Aluno> queryByNome (String nome);

    @Async
    public Future< List<Aluno>> findByNome (String nome);

    @Query ("select a from Aluno a where a.email = ?1")
    public List<Aluno> buscaPeloEmail(String email);

    @Query ("select a from Aluno a where a.nome like ?1%")
    public List<Aluno> buscarPorLetraInicialDoNome (String letra);

    @Query("select a from Aluno a where a.fone = :fone")
    public List <Aluno> buscarPeloTelefone (@Param("fone") String telefone);

    public Aluno buscarPeloNomeEPeloEmail (@Param("nome")String nome, @Param("email") String email);

}
