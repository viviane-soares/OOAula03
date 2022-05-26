package br.com.dio.orientacaoobjeto.herancas;

public class RodarOperacao {

    public static void main(String[] args) {

        ClasseMae[] classes = new ClasseMae[] {new ClasseFilha1(), new ClasseFilha2(), new ClasseMae()};
//feito um foreat, no qual percorreu os objetos e chamou o metodo 1 de cada um deles.

        for (ClasseMae classe: classes){
            classe.metodo1();
        }
        System.out.println("");
        for (ClasseMae classe: classes){

        }
        System.out.println("");

        ClasseFilha2 classeFilha2 = new ClasseFilha2();
        classeFilha2.metodo2();
    }
}
