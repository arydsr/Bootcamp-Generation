programa
{		// Exercicio 3
// Autor : Ary de Sá Ribeiro
// Data : 23/06/2021
	
	funcao inicio()
	{
		inteiro segundos, minutos, horas, horasresto

		escreva("Insira o tempo total, em segundos, do evento: ")
		leia(segundos)

		horas = segundos / 3600
		horasresto = segundos%3600
		minutos = horasresto / 60
		segundos = horasresto%60
		
		escreva("O evento durou " , horas , " horas " , minutos , " minutos " , segundos , " segundos")
		
		
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 26; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */