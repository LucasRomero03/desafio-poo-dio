import br.com.dio.dominio.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args){
        //Curso
        Curso curso1 = new Curso("Java","AWS com Java",60);
        Curso curso2 = new Curso("AWS","AWS",40);
        //Mentoria
        Mentoria mentoria1 = new Mentoria("Mentoria AWS","mentoria com murilo", LocalDate.of(2025,8,12));
        Mentoria mentoria2 = new Mentoria("WEB E HTTP","mentoria WEBHTTP", LocalDate.now());

        //Conteudo
        Conteudo c1 = new Curso("Conteudo1","AWS com Java",60);
        Conteudo c2 = new Mentoria("COnteudo2","teste",LocalDate.now());
        /// apagar esses bagui aqui dos metodos e depos ver sobre a constante se tipo la pelo fato de estar em conteudo como vai ser usada e talz vai ser constande de cada um aidna no caso ne
        // e tipo realemten nos usamos tipo List<String> list = newArrayList()<> -> oq na verdade significa isso e tem outros casos tbm né

        //BootCamp
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Accenture");
        bootcamp.setDescricao("Bootcamp Accenture Ultimate");
        bootcamp.setConteudos(Set.of(c1,c2,mentoria2,mentoria1,curso1,curso2));

        //Dev
        Dev dev1 = new Dev();
        dev1.setNome("ROmero");
        dev1.inscreverBootcamp(bootcamp);
        dev1.progredir();
        //////////////////////////
        Dev dev2 = new Dev();
        dev2.setNome("Lucas");
        dev2.inscreverBootcamp(bootcamp);

        //Inscrever nos bootcamps





        //System.out.println(bootcamp.getConteudos());
        //System.out.println(bootcamp.getDevsInscritos());
        //System.out.println(dev1.getConteudosInscritos());
        //System.out.println(dev1.getConteudosFinalizados());
        System.out.println("dev1");
        System.out.println(dev1.getNome());
        System.out.println("Conteudo Inscritos " + dev1.getConteudosInscritos());
        System.out.println("Conteudo COncluidos " + dev1.getConteudosFinalizados());
        System.out.println("XP total: "+dev1.calcularTotalXp());
        System.out.println("-------------");
        System.out.println("dev2");
        System.out.println(dev2.getNome());
        System.out.println("Conteudo Inscritos " + dev2.getConteudosInscritos());
        System.out.println("Conteudo COncluidos " + dev2.getConteudosFinalizados());
        System.out.println("XP total: "+dev2.calcularTotalXp());


    }
}
