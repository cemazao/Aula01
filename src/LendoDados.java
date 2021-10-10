import java.util.Scanner;
public class LendoDados {

	public static void main(String[] args) {
		
		//as duas linha abaixo exibe mensagens na tela
        System.out.println("Programa Educado!");
        System.out.println("Por favor, digite o seu nome");
        //para ler dados, a linha abaixo CRIA um Scanner
        Scanner leitor = new Scanner(System.in);
        //para guardar dados de texto, a linha abaixo CRIA uma variável
        String nome;
        //para ler dados e quardar na variável, usamos o scanner criado
       nome = leitor.next();
       //a linha abaixo exibe a mensagem com conteúdo da variável
       
       System.out.println("Boa noite, "+ nome );
       
	}

}
