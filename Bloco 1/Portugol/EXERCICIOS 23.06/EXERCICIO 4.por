programa
{		// Exercicio 4
// Autor : Ary de Sá Ribeiro
// Data : 23/06/2021

	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real A , B , C , D
		real R , S

		escreva("Digite o valor de A:")
		leia(A)

		escreva("Digite o valor de B:")
		leia(B)

		escreva("Digite o valor de A:")
		leia(C)

		//D = R + S / 2
		//R = (A+B)²
		//S = (B+C)²

		R = mat.potencia((A+B), 2.0)
		S = mat.potencia((B+C), 2.0)
		D = R + S / 2

		escreva("O resultado da expressão é de " + D)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 77; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */