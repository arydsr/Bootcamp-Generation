programa
{

    funcao inicio()
    {
        real n[10], maiorN = 0.0, media = 0.0, soma = 0.0

        inteiro x, cont=0

        para(x=0; x<=9; x++){
        escreva("Digite o valor do dado: ")
        leia(n[x])

            se(n[x] > maiorN){
                maiorN = n[x]
            }

            se(n[x] == maiorN){
                cont++
            }

            soma = soma + n[x]
            media = soma / 10
        }



        escreva("O maior número é: " + maiorN + "\n")
        escreva("A média é de: " + media)
        escreva("\nO maior número se repetiu: " + cont + " vezes.")
    }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 609; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */