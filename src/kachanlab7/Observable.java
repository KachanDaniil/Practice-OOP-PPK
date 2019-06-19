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
import java.util.HashSet;
import java.util.Set;

/**
 * Определяет средства взаимодействия наблюдателей и наблюдаемых; шаблон
 * Observer
 *
 * @author xone
 * @version 1.0
 * @see Observer
 */
public abstract class Observable {

    /**
     * Множество наблюдателей; шаблон Observer
     *
     * @see Observer
     */
    private Set<Observer> observers = new HashSet<Observer>();

    /**
     * Добавляет наблюдателя; шаблон Observer
     *
     * @param observer объект-наблюдатель
     */
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * Удаляет наблюдателя; шаблон Observer
     *
     * @param observer объект-наблюдатель
     */
    public void delObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * Оповещает наблюдателей о событии; шаблон Observer
     *
     * @param event информация о событии
     */
    public void call(Object event) {
        for (Observer observer : observers) {
            observer.handleEvent(this, event);
        }
    }
}
