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
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Аннотация времени выполнения для назначения методам наблюдателя конкретных
 * событий
 *
 * @author xone
 * @see AnnotatedObserver
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Event {

    String value();
}
