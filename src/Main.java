import br.com.dio.dominio.Conteudo;
import br.com.dio.dominio.Curso;
import br.com.dio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Curso curso1 = new Curso("Java","AWS com Java",60);
        Curso curso2 = new Curso("AWS","AWS",40);
        Mentoria mentoria1 = new Mentoria("Mentoria AWS","mentoria com murilo", LocalDate.of(2025,8,12));
        Mentoria mentoria2 = new Mentoria("WEB E HTTP","mentoria WEBHTTP", LocalDate.now());

        Conteudo c1 = new Curso("Java","AWS com Java",60);
        Conteudo c2 = new Mentoria("TEste","teste",LocalDate.now());
        /// apagar esses bagui aqui dos metodos e depos ver sobre a constante se tipo la pelo fato de estar em conteudo como vai ser usada e talz vai ser constande de cada um aidna no caso ne
        // e tipo realemten nos usamos tipo List<String> list = newArrayList()<> -> oq na verdade significa isso e tem outros casos tbm né


        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);
        System.out.println(mentoria2);
        System.out.println(c1);
        System.out.println(c2.getClass().getSimpleName());
    }
}
