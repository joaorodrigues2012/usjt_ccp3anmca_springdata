package br.usjt.usjt_ccp3anmca_springdata.test;

import br.usjt.usjt_ccp3anmca_springdata.model.Aluno;
import br.usjt.usjt_ccp3anmca_springdata.repository.AlunoRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class AlunoTest {

    @Autowired
    private AlunoRepository alunoRepository;

    @Test
    public void insercaoTest() {

        Aluno aluno = new Aluno();
        aluno.setNome("Ana");
        aluno.setFone("123456789");
        aluno.setEmail("asd@asd.com");
        alunoRepository.save(aluno);
    }

}
