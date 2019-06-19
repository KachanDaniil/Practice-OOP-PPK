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
 * ConcreteCreator (шаблон проектирования Factory Method)<br>
 * Объявляет метод, "фабрикующий" объекты
 *
 * @author xone
 * @version 1.0
 * @see Viewable
 * @see ViewableResult#getView()
 */
public class ViewableResult implements Viewable {

    /**
     * Создаёт отображаемый объект {@linkplain ViewResult}
     */
    @Override
    public View getView() {
        return new ViewResult();
    }

}
