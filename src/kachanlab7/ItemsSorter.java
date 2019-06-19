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
import java.util.Collections;

/**
 * Наблюдатель; определяет методы обработки событий; использует Event; шаблон
 * Observer
 *
 * @author xone
 * @see AnnotatedObserver
 * @see Event
 */
public class ItemsSorter extends AnnotatedObserver {

    /**
     * Константа-идентификатор события, обрабатываемого наблюдателями
     */
    public static final String ITEMS_SORTED = "ITEMS_SORTED";

    /**
     * Обработчик события {@linkplain Items#ITEMS_CHANGED}; извещает
     * наблюдателей; шаблон Observer
     *
     * @param observable наблюдаемый объект класса {@linkplain Items}
     * @see Observable
     */
    @Event(Items.ITEMS_CHANGED)
    public void itemsChanged(Items observable) {
        Collections.sort(observable.getItems());
        observable.call(ITEMS_SORTED);
    }

    /**
     * Обработчик события {@linkplain Items#ITEMS_SORTED}; шаблон Observer
     *
     * @param observable наблюдаемый объект класса {@linkplain Items}
     * @see Observable
     */
    @Event(ITEMS_SORTED)
    public void itemsSorted(Items observable) {
        System.out.println(observable.getItems());
    }

    /**
     * Обработчик события {@linkplain Items#ITEMS_REMOVED}; шаблон Observer
     *
     * @param observable наблюдаемый объект класса {@linkplain Items}
     * @see Observable
     */
    @Event(Items.ITEMS_REMOVED)
    public void itemsRemoved(Items observable) {
        System.out.println(observable.getItems());
    }
}
