package rascunho;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

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



}