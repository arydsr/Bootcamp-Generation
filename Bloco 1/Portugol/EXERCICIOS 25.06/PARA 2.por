programa
{//2- Desenvolver um sistema que efetue a soma de todos os números ímpares que são 
//múltiplos de três e que se encontram no conjunto dos números de 1 até 500.
	
	funcao inicio()
	{	inteiro numeros , contador , soma , somaTotal = 0
	
		para (contador = 1; contador <= 500; contador++) {
			se(contador%2 !=0) {
				se(contador%3 == 0) {
					somaTotal = somaTotal + contador
				}
			}
		}
		escreva("A soma total é: " + somaTotal)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 436; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */