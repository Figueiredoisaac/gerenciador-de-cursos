import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

    public static void main(String[] args) {
        String aula1 = "conhecendo mais de listas";
        String aula2 = "modelando classe aula";
        String aula3 = "trabalhando com Cursos e Sets";

        ArrayList<String> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);

        System.out.println(aulas);

        aulas.remove(0);
        System.out.println(aulas);

        for (String aula:aulas) {
            System.out.println("Aula:" + aula);
        }
        aulas.forEach(aula -> {
            System.out.println("percorrendo:");
            System.out.println("Aula " + aula);
        });

        aulas.add("Aumentando Conhecimento");
        Collections.sort(aulas);

        System.out.println(aulas);
    }
}
