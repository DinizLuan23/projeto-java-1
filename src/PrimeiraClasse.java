// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class PrimeiraClasse {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match!");
        System.out.println("Filme: Top Gun: Maverick");

        int ano = 2022;
        System.out.println("Ano de lançamento: " + ano);
        boolean incluidoNoPlano = false;
        double notaDoFilme = 8.1;

        // Media calculada pelas 3 notas da Jack, Paulo e Suelem
        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(media);
        String sinopse;

        sinopse = """
        Filme Top Gun
        Filme de aventura com galão dos anos 80
        Muito Bom!
        Ano de lançamento
        """ + ano;
        System.out.println(sinopse);

        int classificacao = (int) media / 2;
        System.out.println(classificacao);
    }
}