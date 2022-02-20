package metodos;

public class Main {

    public static void  main(String[] args) {
        //calculadora
        System.out.println("Excercício calculadora");
        calculadora.soma(3,6);
        calculadora.subtracao(9,1.8);
        calculadora.multiplicacao(7,8);
        calculadora.divisao(5, 2.5);

        //mensagem
        System.out.println("Exercício mensagem");
        mensagem.obterMensagem(9);
        mensagem.obterMensagem(14);
        mensagem.obterMensagem(1);

        //emprestimo
        System.out.println("Exercício emprestimo");
        emprestimo.calcular(1000, emprestimo.getDuasParcelas()); //pode se passar o parâmetro com o metodo
        emprestimo.calcular(1000, emprestimo.getTresParcelas());
        emprestimo.calcular(1000, 5); //pode se passar o parâmetro sem o método
    }
}
