programa
{//2) Elabore um sistema que leia as variáveis C e N, respectivamente código e número de
//horas trabalhadas de um operário. E calcule o salário sabendo-se que ele ganha R$ 10,00
//por hora. Quando o número de horas exceder a 50 calcule o excesso de pagamento
//armazenando-o na variável E, caso contrário zerar tal variável. A hora excedente de
//trabalho vale R$ 20,00. No final do processamento imprimir o salário total e o salário excedente.
	
	funcao inicio()
	{
	real	N, salario, extra 
	inteiro C

     escreva("Digite o Código do Operário: ")
	leia(C)

     escreva("Digite as horas Trabalhadas: ")
	leia(N)

     se(N > 50.0){
    		salario = (N-50.0)*20.0 + 500.0
    		extra = salario - 500.0
    			escreva("O salário do operário " + C + " é de R$" + salario)
    			escreva("\nO valor em horas extras é de R$" + extra)
     }

    	senao se(N <= 50.0){
    		salario = (N*10)
    			escreva("O salário do operário " + C + " é de R$" + salario)
    			escreva("\nO operário " + C + " não possui horas extras")
    		}
 
	}
}
       
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1030; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */