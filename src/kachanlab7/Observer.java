/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kachanlab7;

/**
 *
 * @author admin
 */
/**
 * Представляет метод для взаимодействия наблюдаемого объекта и наблюдателя;
 * шаблон Observer
 *
 * @author xone
 * @version 1.0
 * @see Observable
 */
public interface Observer {

    /**
     * Вызывается наблюдаемым объектом для каждого наблюдателя; шаблон Observer
     *
     * @param observable ссылка на наблюдаемый объект
     * @param event информация о событии
     */
    public void handleEvent(Observable observable, Object event);
}
