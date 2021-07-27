package rascunho;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class RascunhoTest {

            @Test /* Indica o inicio do Test, tudo que vim após ele, vai ser considerado como test
                ate o proximo @Test
             */
            @Disabled /* Desabilita o test. Tem que ser indica após o @Test*/


            @BeforeAll  /*Deve ser chamado antes do testes*/
            public static void setup(){
                calculadora = new Calculadora();
            }

            assertEquals() /*RECEBE COMO PARAMETRO O VALOR ESPERADO E VALOR OBTIDO E VERIFICA SE SAO IGUAIS*/

            /*Exemplos:*/
            /*
            * assertAll --->>> Recebe uma coleção de executaveis
            * assertArray --->>> Verifica duas arrays se sao iguais
            * Mais verifica no doc do JUnit 5
            *
            *
            * */
            @BeforeEach /* Roda antes de cada teste, separado*/

            @AfterEach /* Depois de cada teste*/

            @AfterAll /* Executa uma vez*/

            @ParameterizedTest /*Proximo test recebe parametros*/

            @CsvSource /* Formato CSV, vai entra no test, como parametros*/




}