import java.util.Scanner;
public class LendoDados {

	public static void main(String[] args) {
		
		//as duas linha abaixo exibe mensagens na tela
        System.out.println("Programa Educado!");
        System.out.println("Por favor, digite o seu nome");
        //para ler dados, a linha abaixo CRIA um Scanner
        Scanner leitor = new Scanner(System.in);
        //para guardar dados de texto, a linha abaixo CRIA uma vari�vel
        String nome;
        //para ler dados e quardar na vari�vel, usamos o scanner criado
       nome = leitor.next();
       //a linha abaixo exibe a mensagem com conte�do da vari�vel
       
       System.out.println("Boa noite, "+ nome );
       
	}

}
