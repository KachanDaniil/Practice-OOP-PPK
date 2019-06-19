/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kachanlab3;

/**
 *
 * @author admin
 */
/**
 * Creator (шаблон проектирования Factory Method)<br>
 * Объявляет метод, "фабрикующий" объекты
 *
 * @author xone
 * @version 1.0
 * @see Viewable#getView()
 */
public interface Viewable {

    /**
     * Создаёт объект, реализующий {@linkplain View}
     */
    public View getView();

}
