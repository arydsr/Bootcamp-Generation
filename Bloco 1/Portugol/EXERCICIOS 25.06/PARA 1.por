programa
{
	
	funcao inicio()
	{
		inteiro contador , filhos , filhosT = 0
		real salario , salarioM = 0.0 , salarioT = 0.0 , porcentagemPobre , pessoasP = 0.0

		para (contador = 0; contador < 20; contador++) {
			limpa()
			escreva("Digite o salário: ")
			leia(salario)
			escreva("Digite o número de filhos: ")
			leia(filhos)
			
			salarioT += salario
			filhosT += filhos

			se (salario > salarioM){
				salarioM = salario
			}
			se (salario <= 100.0) {
				pessoasP = pessoasP + 1
			}
			limpa()
			escreva("Média sálario: " + (salarioT / 20))
			escreva("\nMédia filhos: " + (filhosT /20))
			escreva("\nMaior salário: " + salarioM)
				
			porcentagemPobre = (pessoasP * 100) /20
			
			escreva("\nPessoas com salário menor que R$100: " + porcentagemPobre + "% das pessoas.")
			
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 697; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */