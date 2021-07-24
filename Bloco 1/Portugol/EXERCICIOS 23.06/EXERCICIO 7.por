programa
{ 		// Exercicio 7
// Autor : Ary de Sá Ribeiro
// Data : 23/06/2021
	
	funcao inicio()
	{
		real a , b , c , d , ee , f
		real x , y

		escreva("Digite o valor de a: ")
		leia(a)

		escreva("Digite o valor de b: ")
		leia(b)

		escreva("Digite o valor de c: ")
		leia(c)
		
		escreva("Digite o valor de d: ")
		leia(d)

		escreva("Digite o valor de ee: ")
		leia(ee)

		escreva("Digite o valor de f: ")
		leia(f)

		x = ((c*ee)-(b*f)) / ((a*ee)-(b*d))
		
		y = ((a*f)-(c*d)) / ((a*ee)-(b*d))

		escreva("Os valores são x= " + x + " e o de y= " + y)
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 27; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */