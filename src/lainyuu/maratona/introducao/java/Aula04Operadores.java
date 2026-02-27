package lainyuu.maratona.introducao.java;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *
        int numero01 = 10;
        int numero02 = 20;
        double resultado = numero01 / (double) numero02;
        System.out.println(resultado);

        //%
        int resto = 21 % 7;
        System.out.println(resto);

        //< >    <= >=    ==    !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualQueVinte = 10 == 20;
        boolean isDezDiferenteQueVinte = 10 != 20;
        System.out.println(isDezMaiorQueVinte +" isDezMaiorQueVinte"+" 10 > 20");
        System.out.println(isDezMenorQueVinte +" isDezMenorQueVinte"+" 10 < 20");
        System.out.println(isDezIgualQueVinte +" isDezmIgualQueVinte"+" 10 == 20");
        System.out.println(isDezDiferenteQueVinte +" isDezDiferenteQueVinte"+" 10 != 20");

        // && (AND) || (OR) !

        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta " +isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta " +isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10.000;
        float valorPlaystation = 5000F;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlaystationCincoCompravel "+isPlaystationCincoCompravel );

        // = += -= /= %=
        // uma forma de abreviar

        double bonus = 2000;
        bonus -= 500;
        bonus = bonus - 300;
        System.out.println(bonus);

        // ++ --
        int contador = 0;
        contador += 1;
        contador++;
        --contador;
        int contador2 = 2;
        System.out.println(++contador2);
    }
}
