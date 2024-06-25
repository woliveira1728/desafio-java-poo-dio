import com.dio.challenge.domain.Bootcamp;
import com.dio.challenge.domain.Curso;
import com.dio.challenge.domain.Dev;
import com.dio.challenge.domain.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de JAVA");
        curso1.setDescricao("Curso completo de JAVA");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de Javascript");
        curso2.setDescricao("Curso completo de Javascript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de JAVA");
        mentoria.setDescricao("Mentoria completa de JAVA");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devBobEsponja = new Dev();
        devBobEsponja.setNome("Bob Esponja");
        devBobEsponja.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Bob Esponja: " + devBobEsponja.getConteudosInscritos());
        devBobEsponja.progredir();
        devBobEsponja.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Bob Esponja: " + devBobEsponja.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Bob Esponja: " + devBobEsponja.getConteudosConcluidos());
        System.out.println("XP:" + devBobEsponja.calcularTotalXp());

        System.out.println("-------");

        Dev devPatrick = new Dev();
        devPatrick.setNome("Patrick");
        devPatrick.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Patrick: " + devPatrick.getConteudosInscritos());
        devPatrick.progredir();
        devPatrick.progredir();
        devPatrick.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Patrick: " + devPatrick.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Patrick: " + devPatrick.getConteudosConcluidos());
        System.out.println("XP:" + devPatrick.calcularTotalXp());

    }

}