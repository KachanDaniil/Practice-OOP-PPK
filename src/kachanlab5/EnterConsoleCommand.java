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
import kachanlab3.View;

/**
 * Консольная команда Generate; шаблон Command
 *
 * @author xone
 * @version 1.0
 */
public class EnterConsoleCommand implements ConsoleCommand {

    /**
     * Объект, реализующий интерфейс {@linkplain View}; обслуживает коллекцию
     * объектов {@linkplain ex01.Item2d}
     */
    private View view;

    /**
     * Инициализирует поле {@linkplain GenerateConsoleCommand#view}
     *
     * @param view объект, реализующий интерфейс {@linkplain View}
     */
    public EnterConsoleCommand(View view) {
        this.view = view;
    }

    @Override
    public char getKey() {
        return 'e';
    }

    @Override
    public String toString() {
        return "'e'nter";
    }

    @Override
    public void execute() {
        System.out.println("Enter the length of the side in binary notation: ");
        view.viewInit();
        view.viewShow();
    }
}
