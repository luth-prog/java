//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Aluno> listaAlunos = new ArrayList<Aluno>();
        int quant = 7;
        String continua = "s";
        Aluno a = new Aluno();

        a.register();

        while(continua.equals("s")) {
            Aluno aluno = new Aluno();
            aluno.declaraInfo();
            listaAlunos.add(aluno);
            System.out.println("Deseja adicionar mais um aluno? s para sim e n para não.");
            continua = sc.nextLine();
            }
        System.out.println(listaAlunos.get(0));
//        System.out.println(listaAlunos.get(1));

        listaAlunos.get(0).register();
        }

    }


