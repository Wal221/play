/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teste;

import Controller.MusicaController;

/**
 *
 * @author Administrador
 */
public class tes {
    public static void main(String[] args) {
        MusicaController music = new MusicaController();
        
        music.add("Bolsa nova", 2.45);
        music.add("alto", 2.20);
        System.out.println(music.busca("alto").toString());
        
        System.out.println(music.busca("Bolsa nova"));
        
      music.excluir("Bolsa nova",2.45);
        System.out.println(music);
    }
}
