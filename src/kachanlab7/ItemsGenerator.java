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
 * Наблюдатель; определяет методы обработки событий; использует Event; шаблон
 * Observer
 *
 * @author xone
 * @see AnnotatedObserver
 * @see Event
 */
public class ItemsGenerator extends AnnotatedObserver {

    /**
     * Обработчик события {@linkplain Items#ITEMS_EMPTY}; извещает наблюдателей;
     * шаблон Observer
     *
     * @param observable наблюдаемый объект класса {@linkplain Items}
     * @see Observable
     */
    @Event(Items.ITEMS_EMPTY)
    public void itemsEmpty(Items observable) {
        for (Item item : observable) {
            if (item.getData().isEmpty()) {
                int len = (int) (Math.random() * 10) + 1;
                String data = "";
                for (int n = 1; n <= len; n++) {
                    data += (char) ((int) (Math.random() * 26) + 'A');
                }
                item.setData(data);
            }
        }
        observable.call(Items.ITEMS_CHANGED);
    }
}
