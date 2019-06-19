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
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * Базовый класс наблюдателя, использующего аннотации для определения методов,
 * обрабатывающих некоторые события; шаблон Observer
 *
 * @author xone
 * @version 1.0
 * @see Observer
 * @see Observable
 */
public abstract class AnnotatedObserver implements Observer {

    /**
     * Ассоциативный массив обработчиков событий; содержит пары
     * событие-обработчик
     */
    private Map<Object, Method> handlers = new HashMap<Object, Method>();

    /**
     * Заполняет {@linkplain AnnotatedObserver#handlers} ссылками на методы,
     * отмеченные аннотацией {@linkplain Event}
     */
    public AnnotatedObserver() {
        for (Method m : this.getClass().getMethods()) {
            if (m.isAnnotationPresent(Event.class)) {
                handlers.put(m.getAnnotation(Event.class).value(), m);
            }
        }
    }

    @Override
    public void handleEvent(Observable observable, Object event) {
        Method m = handlers.get(event);
        try {
            if (m != null) {
                m.invoke(this, observable);
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
