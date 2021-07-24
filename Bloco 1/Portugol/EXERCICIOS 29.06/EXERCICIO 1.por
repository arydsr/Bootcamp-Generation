programa
{
		inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		
		
		real pontuacao[5], valor = 0.0
		real maior =0.0

		inteiro i

		escreva("Digite os cinco valores de pontuação: ")
		para(i=0; i<=4; i++) {
			leia(pontuacao[i])

			se (pontuacao[i] > maior){
				maior = pontuacao[i]
			}
		
		}
		
		
		escreva("\n A 1ª pontuação é de: " + pontuacao[0])
		escreva("\n A 2ª pontuação é de: " + pontuacao[1])
		escreva("\n A 3ª pontuação é de: " + pontuacao[2])
		escreva("\n A 4ª pontuação é de: " + pontuacao[3])
		escreva("\n A 5ª pontuação é de: " + pontuacao[4])

		escreva("\n A maior pontuação é de: " + maior)
	
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 421; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */