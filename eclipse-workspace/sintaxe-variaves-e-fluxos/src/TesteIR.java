
public class TesteIR {

	    public static void main(String[] args) {

	        double salario = 3300.0;

	        //ifs aqui
	        
	        if (salario >= 1900.0 && salario <= 2800.0) {
	        	System.out.println("o IR � de 7.5% e pode deduzir na declara��o o valor de R$ 142");
	        } else if (salario >= 2800.1 && salario <= 3751.0) {
	        		System.out.println("o IR � de 15% e pode deduzir R$ 350");
	        } else if (salario >= 3751.1 && salario <= 4664.0) {
	        		System.out.println("o IR � de 22.5% e pode deduzir R$ 636");
	        }
	    }
	}


// Mas se precisarmos fazer v�rios testes? Para esses casos, existe o comando switch.
// O break ir� interromper a execu��o do caso que o cont�m, para os outros n�o serem executados, 
// e se nenhuma condi��o for aceita, o c�digo do default � que ser� executado. 


/*public class TestaMes {

    public static void main(String[] args) {

        int mes = 13;

        switch (mes) {
            case 1:
                System.out.println("O m�s � Janeiro");
                break;
            case 2:
                System.out.println("O m�s � Fevereiro");
                break;
            case 3:
                System.out.println("O m�s � Mar�o");
                break;
            case 4:
                System.out.println("O m�s � Abril");
                break;
            case 5:
                System.out.println("O m�s � Maio");
                break;
            case 6:
                System.out.println("O m�s � Junho");
                break;
            case 7:
                System.out.println("O m�s � Julho");
                break;
            case 8:
                System.out.println("O m�s � Agosto");
                break;
            case 9:
                System.out.println("O m�s � Setembro");
                break;
            case 10:
                System.out.println("O m�s � Outubro");
                break;
            case 11:
                System.out.println("O m�s � Novembro");
                break;
            case 12:
                System.out.println("O m�s � Dezembro");
                break;
            default:
                System.out.println("M�s inv�lido");
                break;
        }
    }
}
*/