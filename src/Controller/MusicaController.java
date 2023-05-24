/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DTO.musicDTO;

/**
 *
 * @author Administrador
 */
public class MusicaController {

    private musicDTO primeiro;
    
    private musicDTO ultimo;
    private musicDTO antecessor;
    int cont;
    
    public void add (String nome, Double duracao){
        musicDTO nova = new musicDTO(nome, duracao);
        
        if(cont == 0){
            this.primeiro = nova;
            this.ultimo = nova;
        } else {
            /**
             *Faço o ultimo elemento aponta para o proximo que sera inserido
             */
            this.ultimo.setProxima(nova);
            //guardo a referencia do ultimo elemento antes de atualizar , ja que sendo ele o antecessor
            //e preciso apontar para o anterior , pois e uma lista duplamente encadeada
            this.antecessor = this.ultimo;
            //Atualizo o novo elemento , ja que cada novo elemento e inserido usando  a variavel ultimo
            this.ultimo = nova;
            //Com o novo elemento inserido sendo ele o ultimo, faço o seu ponteiro anterior aponta para o
            //elemento anterior da lista
            this.ultimo.setAnterior(antecessor);

        }
        cont ++;
    }
    
     public musicDTO busca(String elemento){
        musicDTO busca = this.primeiro;

        for(int i = 0; i < this.cont; i++){
            if(busca.getNome().equalsIgnoreCase(elemento)){

                return busca;
            }
            busca = busca.getProxima();
        }
        return null;

    }
    public void passarMusica(){
        
    }
    public void remover(){
        
    }
    public void tamanho(){
        
    }
    
    public Double duracaoMusica(){
        return null;
    }
    
    public void musicaAleatoria(){
        
    }
    
     @Override
    public String toString() {
        if(this.cont == 0){
            return " ";

        }
        StringBuilder builder = new StringBuilder();
        musicDTO atual = this.primeiro;

        for (int i = 0; i < this.cont - 1; i++) {
            builder.append(atual.getNome() + " ");
            builder.append(atual.getDuracaoMusic()+  " ");
            builder.append(", ");
            atual = atual.getProxima();

        }
            builder.append(atual.getNome() + " ");
          builder.append(atual.getDuracaoMusic()+  " ");
        return builder.toString();

    }
    
    public void excluir(String elemento,Double duracao){
        
   
        musicDTO excluir = busca(elemento);
        if(cont == 0){
            System.out.println("lista vazia");
            return;
        }

          //se ouver somente um elemento na lista sera removido
         if(excluir.getAnterior() == null && excluir.getProxima() == null){
            this.primeiro = null;
            this.ultimo = null;
            cont --;

        }
         //remove o primeiro elemento
         else if(excluir.getAnterior() == null){
             this.primeiro = this.primeiro.getProxima();
             this.primeiro.setAnterior(null);
             this.cont --;


        }//remove o ultimo elemento
         else if(excluir.getProxima() == null){

          this.ultimo = this.ultimo.getAnterior();
          //vale ressaltar que essa forma de fazer o elemento aponta para o anterior , e equivalente a
             //fazer a elemento aponta para o null , ja que e o ultimo elemento
           this.ultimo.setProxima(excluir.getProxima());
             cont --;

        }
        else {
            //para remover um elemento do meio da lista
            excluir.getAnterior().setProxima(excluir.getProxima());
            excluir.getProxima().setAnterior(excluir.getAnterior());
            excluir = excluir.getProxima();
             cont --;

        }
    

}
}
