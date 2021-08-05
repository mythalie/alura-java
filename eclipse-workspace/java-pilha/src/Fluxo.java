//�ltimo a entrar, o primeiro a sair.

public class Fluxo {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
        	metodo1();
        } catch(Exception ex) { //captura qualquer exce��o
        	String msg = ex.getMessage();
        	System.out.println("Exception" + msg);
        	ex.printStackTrace();
        }
        System.out.println("Fim do main");
    }

    private static void metodo1() throws MinhaExcecao {
        System.out.println("Ini do metodo1");
        	metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() throws MinhaExcecao {
        System.out.println("Ini do metodo2");

      //throw new - cria um objeto e devolve a refer�ncia; pega essa refer�ncia e transforma em uma "bomba" e deixa cair na pilha.
        throw new MinhaExcecao("deu errado"); 
              
//        System.out.println("Fim do metodo2");
    }
}
