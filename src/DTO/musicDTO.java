/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author Administrador
 */
public class musicDTO {

    private String nome;

    private Double duracaoMusic;

    private musicDTO anterior;

    private musicDTO proxima;

    
    public musicDTO(String nome){
        this.nome = nome;
        
    }
    
    public musicDTO (String nome, Double duracao){
        this.duracaoMusic = duracao;
        this.nome = nome;
        
    }
    
    public musicDTO getAnterior() {
        return anterior;
    }

    public void setAnterior(musicDTO anterior) {
        this.anterior = anterior;
    }

    public musicDTO getProxima() {
        return proxima;
    }

    public void setProxima(musicDTO proxima) {
        this.proxima = proxima;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getDuracaoMusic() {
        return duracaoMusic;
    }

    public void setDuracaoMusic(Double duracaoMusic) {
        this.duracaoMusic = duracaoMusic;
    }

}
