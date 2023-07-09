import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Aplicacao {

    public static void main(String[] args) {

        Aplicacao aplicacao = new Aplicacao();

        aplicacao.exercicio01("Hello, Word! OpenAl is amazing");

        aplicacao.exercicio02("Hello, Word!");

        aplicacao.exercicio03("babad");

    }

    public void exercicio01(String texto) {

        /* Split para separar cada palavra da frase */
        String[] textoSeparado = texto.split(" ");

        /* Colocar todas as palavras separadas em um array uma lista */
        List<String> lista = new ArrayList<>(Arrays.asList(textoSeparado));

        /* Usando o string buffer para concatena-las novamente na frase porem inversa */
        StringBuffer concatenar = new StringBuffer();

        /*
         * Obter quantidade de palavras que foram separadas
         * para utilziar o a interação for preciso colocar menos,
         * pois a iteração inicia no zero
         */
        int size = lista.size();
        int iterador = size - 1;

        /*
         * Pego a quantidade total de palavras separadas, intero concatenando no buffer,
         * de traz pra frente
         * formando a frase invertida
         */
        for (int i = iterador; i >= 0; i--) {
            concatenar.append(lista.get(i) + " ");

        }

        System.out.println(concatenar.toString());
    }

    public void exercicio02(String texto) {
        /*
         * Utilizando o String Buffer devido sua funcionalidade append para concatenar
         * string
         */
        StringBuffer TextoSemPalavrasRepetidas = new StringBuffer();
        /*
         * Utilizando a funcionalidade da propria classe string para separar
         * cada caracter da palavra com o chars e o distinct para remover os caracter
         * duplicados,
         * , e realizando um forEach um iterador para construir essa frase atraves dos
         * caractere que retorna,
         * da append do buffer.
         */
        texto.chars().distinct().forEach(letra -> TextoSemPalavrasRepetidas.append((char) letra));
        System.out.println(TextoSemPalavrasRepetidas.toString());
    }

    public void exercicio03(String texto) {

        /*
         * Utilizando uma lista de caracter, usei recursos de coleções da classe String
         * chars para desmebrar palavras em caracteres, e o foreach para adicionar a
         * essa lista
         */
        List<Character> arrayDeCaracter = new ArrayList<>();
        texto.chars().forEach(letra -> arrayDeCaracter.add((char) letra));
        /* String buffer para concatenar o texto final */
        StringBuffer StringFinal = new StringBuffer();

        int quantidadeDeCaracter = arrayDeCaracter.size();

        /*
         * Utilizando o for para interar dentro da coleções que contem os caracteres,
         * o mesmo ira construindo a palavra dentro do for, e fara uma validação, se for
         * palavra que tiver o mesmo sentido invertido
         */
        for (int i = 0; i < quantidadeDeCaracter; i++) {
            StringFinal.append(arrayDeCaracter.get(i));
            if (i > 1 && StringFinal.toString()
                    .equals(new StringBuffer()
                            .append(StringFinal.toString()).reverse().toString())) {

                System.out.println(StringFinal.toString());

            }
        }

    }

}