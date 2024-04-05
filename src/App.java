public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
            //%s subistitui no texto um valor String
            System.out.printf("vai imprimir %s %s %s\n", "um texto" ,"qualquer" );
            //%d substitui o coringa %d por um numero inteiro no texto
            System.out.printf("minha idade é: &d" , 33);
            //%f substitui o coringa %f por um numero flutuante
            System.out.printf("\n o valor de PI é: %f", 3.1415f);
            //%.2f substitui o coringa %.2f por numero flutuante com duas casas decimais
            System.out.printf("\n o valor de PI é: %.2f" , 3.1415f);
            // %b substitui o coringa %b por um valor booleano
            System.out.printf("\n esse valor é %b" , true);
            System.out.printf("\n esse valor é %b" , false);
            //%c subtitui o coringa %c por um caractere
            System.out.printf("\n caractere é %c" , 'A');
            System.out.printf("\n caractere é %c" , '5');
            System.out.printf("\n caractere é %c" , '*');
            System.out.printf("\n caractere é %c" , '\\');
            System.out.printf("\n caractere é %c" , '\"');
            //Printf com todos os tipos de variaveis 
            string texto="alguma coisa";
            int numeroInteiro= 1;
            float NumeroQuebrado= 123.321f;
            booblean valorVerdadeiro= true;
            char Umcaratere= '°';
            charsistem.out.printf("\n %s, $d, %.2f, %b, %c",
            texto, numeroInteiro, NumeroQuebrado valorVerdadeiro, Umcaratere);

    }
}
