programa
{//Elaborar um programa que efetue a leitura sucessiva de valores
//numéricos e apresente no final o total do somatório, a média e o
//total de valores lidos. O programa deve fazer as leituras dos
//valores enquanto o usuário estiver fornecendo valores positivos.
//Ou seja, o programa deve parar quando o usuário fornecer um valor negativo.

	
	funcao inicio()
	{
		real valorDigitado = 0.0, soma = 0.0 , media , contador = 0.0

		enquanto(valorDigitado >=0) {
			escreva("\nDigite um valor para a soma: ")
			leia(valorDigitado)
			se(valorDigitado < 0){
				pare
			}
			soma = soma + valorDigitado
		
			escreva("\nTotal: " + soma)
			limpa()
			contador = contador + 1
			
		}
			
		media = soma/contador
		escreva("\nResultado: " + media)
	escreva("\nO número de valores inseridos foi de: " + contador)
		

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 660; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */