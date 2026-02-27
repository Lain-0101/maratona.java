package lainyuu.maratona.introducao.java;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        // Doar se salario > 5000
        double salario = 2000;
        // (condiçao) ? verdadeiro : falso

        String resultado = salario > 5000 ? "Eu vou doar 500 ao DevDojo" : "Ainda não tenho condições, mas vou ter!";
        System.out.println(resultado);
    }
}
 /* Ou
           // Doar se salario > 5000
        double salario = 3000;
        String mensagemDoar = "Eu vou doar 500 ao DevDojo";
        String mensagemNaoDoar = "ainda não tenho condições, mas vou ter!";
        String resultado;
        if (salario > 5000) {
            resultado = mensagemDoar;
        }else{
            resultado = mensagemNaoDoar;
        }
        System.out.println(resultado);
    }
}

  */