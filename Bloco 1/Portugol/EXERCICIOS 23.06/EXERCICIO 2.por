programa
{ 		// Exercicio 2
// Autor : Ary de Sá Ribeiro
// Data : 23/06/2021
	
	funcao inicio()
	{
	
	inteiro idadeAnos, idadeMeses, idadeDias1, idadeDias

		escreva("Digita os dias: ")
		leia(idadeDias)

		idadeAnos = (idadeDias/365)
		idadeMeses = (idadeDias%365)/30
		idadeDias1 = (idadeDias%365)%30

		escreva("A idade é de ", idadeAnos, " anos, ", idadeMeses, " meses e ", idadeDias1, " dias ")

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