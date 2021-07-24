programa
{//Elabore um sistema que dada a idade de um nadador classifique-o em uma das seguintes categorias:
//Infantil A = 5 a 7 anos
//Infantil B = 8 a 11 anos
//Juvenil A = 12 a 13 anos
//Juvenil B = 14 a 17 anos
//Adultos = Maiores de 18 anos
	
	funcao inicio()
	{
		inteiro id

		escreva("Por favor, insira a idade do nadador: ")
		leia(id)
		

		se (id >= 5 e id <= 7){
			escreva ("O nadador pertence a categoria Infantil A.")
		}
		senao se (id >= 8 e id <= 1){
			escreva ("O nadador pertence aa categoria Infantil B.")
		}
		senao se (id >= 12 e id <= 13){
			escreva ("O nadador pertence a categoria Juvenil A.")
		}
		senao se (id >= 14 e id <= 17){
			escreva ("O nadador pertence a categoria Juvenil B.")
		}
		senao se (id >= 18){
			escreva ("O nadador pertence a categoria Adultos.")
		}
		senao{
			escreva("Sem classificação")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 413; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */