package br.com.dio.orientacaoobjeto;
/**Crie uma classe Carro com seus atributos;**/

class Carro {
    String cor;
    String modelo;
    int capacidadeTanque;
    //**metodo construtor**//
    Carro(){
    }
    Carro(String cor, String modelo, int capacidadeTanque){
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }
    // construtor aqui
    void setCor(String cor){
        this.cor = cor;
    }
    String getCor() {
        return cor;
    }
    void setModelo(String modelo) {
        this.modelo = modelo;
    }
    String getModelo() {
        return modelo;
    }
    void setCapacidadeTanque( int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    // metodo total  para encher o tanque
    double totalValorTanque ( double valorCombustivel){
    return capacidadeTanque * valorCombustivel;

    }

}