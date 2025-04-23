public class Calculadora {
    
    public static void main (String [] args){
        Operadores op = new Operadores();

        //EXEMPLO DE ADIÇÃO
        System.out.println("O Resultado é: "+ op.adicao(10,5));

        //EXEMPLO DE SUBTRAÇÃO
        System.out.println("O Resultado é: "+ op.subtracao(10,5));

        //EXEMPLO DE MULTIPLICAÇÃO
        System.out.println("O Resultado é: "+ op.multiplicacao(10,5));

        //EXEMPLO DE DIVISÃO
        System.out.println("O Resultado é: "+ op.divisao(10,5));


    }
}
