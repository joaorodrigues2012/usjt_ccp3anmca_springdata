package br.usjt.usjt_ccp3anmca_springdata.test;

import br.usjt.usjt_ccp3anmca_springdata.model.Aluno;
import br.usjt.usjt_ccp3anmca_springdata.repository.AlunoRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

@SpringBootTest
@RunWith(SpringRunner.class)
public class OperacaoAssicronaTest {

    @Autowired
    private AlunoRepository alunoRepository;

    @Test
    public  void m() throws ExecutionException, InterruptedException {
        Future <List<Aluno>> future = alunoRepository.findByNome("Ana");
        System.out.println("fazendo algo");
        System.out.println("fazendo mais alguma coisa");
        List<Aluno> alunos = future.get();
        alunos.forEach(System.out::println);
    }
}
