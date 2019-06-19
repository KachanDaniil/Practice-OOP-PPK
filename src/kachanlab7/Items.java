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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Контейнер объектов; наблюдаемый объект; шаблон Observer
 *
 * @author xone
 * @see Observable
 * @see Observer
 * @see Item
 */
public class Items extends Observable implements Iterable<Item> {

    /**
     * Константа-идентификатор события, обрабатываемого наблюдателями
     */
    public static final String ITEMS_CHANGED = "ITEMS_CHANGED";
    /**
     * Константа-идентификатор события, обрабатываемого наблюдателями
     */
    public static final String ITEMS_EMPTY = "ITEMS_EMPTY";
    /**
     * Константа-идентификатор события, обрабатываемого наблюдателями
     */
    public static final String ITEMS_REMOVED = "ITEMS_REMOVED";
    /**
     * Коллекция объектов класса {@linkplain Item}
     */
    private List<Item> items = new ArrayList<Item>();

    /**
     * Добавляет объект в коллекцию и извещает наблюдателей
     *
     * @param item объект класса {@linkplain Item}
     */
    public void add(Item item) {
        items.add(item);
        if (item.getData().isEmpty()) {
            call(ITEMS_EMPTY);
        } else {
            call(ITEMS_CHANGED);
        }
    }

    /**
     * Добавляет объект в коллекцию 11
     *
     * @param s передается конструктору {@linkplain Item#Item(String)}
     */
    public void add(String s) {
        add(new Item(s));
    }

    /**
     * Добавляет несколько объектов в коллекцию и извещает наблюдателей
     *
     * @param n количество добавляемых объектов класса {@linkplain Item}
     */
    public void add(int n) {
        if (n > 0) {
            while (n-- > 0) {
                items.add(new Item(""));
            }
            call(ITEMS_EMPTY);
        }
    }

    /**
     * Удаляет объект из коллекции и извещает наблюдателей
     *
     * @param item удаляемый объект
     */
    public void del(Item item) {
        if (item != null) {
            items.remove(item);
            call(ITEMS_REMOVED);
        }
    }

    /**
     * Удаляет объект из коллекции и извещает наблюдателей
     *
     * @param index индекс удаляемого объекта
     */
    public void del(int index) {
        if ((index >= 0) && (index < items.size())) {
            items.remove(index);
            call(ITEMS_REMOVED);
        }
    }

    /**
     * Возвращает ссылку на коллекцию
     *
     * @return ссылка на коллекцию объектов класса {@linkplain Item}
     */
    public List<Item> getItems() {
        return items;
    }

    @Override
    public Iterator<Item> iterator() {
        return items.iterator();
    }
}
