import java.util.Scanner;
import java.security.SecureRandom;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pessoa {
    SecureRandom random = new SecureRandom();
    Scanner sc = new Scanner(System.in);
    String nome;
    int idade;
    String registro;

    void register(){
        System.out.println("Email:");
        String email = sc.nextLine();
        boolean validEmail = ValidarEmail.isValidEmail(email);
        if(validEmail){
            System.out.println("Esse email é valido!");
        }else{
            System.out.println("Email invalido!!");
        }
        IO.println("Senha:");
        String senha = sc.nextLine();
    }
}

class Aluno extends Pessoa {
    int matricula;

    void declaraInfo(){
        System.out.println("Qual é o seu nome?");
        nome = sc.nextLine();
        System.out.println("Qual sua idade?");
        idade = sc.nextInt();
        sc.nextLine();
        System.out.println("Qual seu número de registro?");
        registro = sc.nextLine();
        matricula = random.hashCode();
        System.out.println(String.format("Sua Matricula é %s", matricula));


    }
    @Override
    public String toString(){
        return this.nome;
//    return "\nAluno{nome=" + this.nome + "\n idade=" + this.idade + "\n registro=" + this.registro + "\n matricula=" + this.matricula + "}";
    }


    void mostrarInfo(String name, int idade, String registro, String matricula){
        System.out.println(String.format("Olá %s\nVocê tem %s\nSeu registro é %s\nE sua matricula é %s", nome, idade, registro, matricula));
    }

    boolean authMat(String matricula){
        boolean matriculado = true;
        if(matricula == ""){
            matriculado = false;
        }
        return matriculado;
    }

}
