/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kachanlab5;

/**
 *
 * @author admin
 */
public interface ConsoleCommand extends Command {

    /**
     * Горячая клавиша команды; шаблон Command
     *
     * @return символ горячей клавиши
     */
    public char getKey();
}
