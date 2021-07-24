programa
{// Desenvolva um sistema em que:
//Leia 4 (quatro) números;
//Calcule o quadrado de cada um;
//Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
//Caso contrário, imprima os valores lidos e seus respectivos quadrados.

	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real a , b , c , d , aq , bq , cq , dq

		escreva("Insira o 1º número: ")
		leia(a)

		escreva("Insira o 2º número: ")
		leia(b)

		escreva("Insira o 3º número: ")
		leia(c)

		escreva("Insira o 4º número: ")
		leia(d)
		
		aq = mat.potencia (a, 2.0)
		bq = mat.potencia (b, 2.0)
		cq = mat.potencia (c, 2.0)
		dq = mat.potencia (d, 2.0)

		se (cq >= 1000){
			escreva("O quadrado do 3º número é ",cq)
		}
		senao{
			escreva("\nO resultado do 1º é ",aq)
			escreva("\nO resultado do 2º é ",bq)
			escreva("\nO resultado do 3º é ",cq) 
			escreva("\nO resultado do 4º é ",dq)
		}	
			
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 674; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */