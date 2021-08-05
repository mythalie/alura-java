
public class TesteIR {

	    public static void main(String[] args) {

	        double salario = 3300.0;

	        //ifs aqui
	        
	        if (salario >= 1900.0 && salario <= 2800.0) {
	        	System.out.println("o IR é de 7.5% e pode deduzir na declaração o valor de R$ 142");
	        } else if (salario >= 2800.1 && salario <= 3751.0) {
	        		System.out.println("o IR é de 15% e pode deduzir R$ 350");
	        } else if (salario >= 3751.1 && salario <= 4664.0) {
	        		System.out.println("o IR é de 22.5% e pode deduzir R$ 636");
	        }
	    }
	}


// Mas se precisarmos fazer vários testes? Para esses casos, existe o comando switch.
// O break irá interromper a execução do caso que o contém, para os outros não serem executados, 
// e se nenhuma condição for aceita, o código do default é que será executado. 


/*public class TestaMes {

    public static void main(String[] args) {

        int mes = 13;

        switch (mes) {
            case 1:
                System.out.println("O mês é Janeiro");
                break;
            case 2:
                System.out.println("O mês é Fevereiro");
                break;
            case 3:
                System.out.println("O mês é Março");
                break;
            case 4:
                System.out.println("O mês é Abril");
                break;
            case 5:
                System.out.println("O mês é Maio");
                break;
            case 6:
                System.out.println("O mês é Junho");
                break;
            case 7:
                System.out.println("O mês é Julho");
                break;
            case 8:
                System.out.println("O mês é Agosto");
                break;
            case 9:
                System.out.println("O mês é Setembro");
                break;
            case 10:
                System.out.println("O mês é Outubro");
                break;
            case 11:
                System.out.println("O mês é Novembro");
                break;
            case 12:
                System.out.println("O mês é Dezembro");
                break;
            default:
                System.out.println("Mês inválido");
                break;
        }
    }
}
*/