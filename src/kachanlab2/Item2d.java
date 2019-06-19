/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kachanlab2;

/**
 *
 * @author admin
 */
import java.io.Serializable;

/**
 * Хранит исходные данные и результат вычислений.
 *
 * @author xone
 * @version 1.0
 */
public class Item2d implements Serializable {

    /**
     * Аргумент вычисляемой функции.
     */
// transient
    private int x;

    /**
     * Результат вычисления функции.
     */
    private String Octa;
    private String Hex;

    /**
     * Автоматически сгенерированная константа
     */
    private static final long serialVersionUID = 1L;

    /**
     * Инициализирует поля
     * {@linkplain Item2d#x}, {@linkplain Item2d#Octa}, {@linkplain Item2d#Hex}
     */
    public Item2d() {
        x = 0;
        Octa = "";
        Hex = "";
    }

    /**
     * Устанавливает значения полей: аргумента и результата вычисления функции.
     *
     * @param x - значение для инициализации поля {@linkplain Item2d#x}
     * @param Octa - значение для инициализации поля {@linkplain Item2d#Octa}
     * @param Hex - значение для инициализации поля {@linkplain Item2d#Hex}
     */
    public Item2d(int x, String Octa, String Hex) {
        this.x = x;
        this.Octa = Octa;
        this.Hex = Hex;
    }

    /**
     * Установка значения поля {@linkplain Item2d#x}
     *
     * @param x - значение для {@linkplain Item2d#x}
     * @return Значение {@linkplain Item2d#x}
     */
    public int setX(int x) {
        return this.x = x;
    }

    /**
     * Получение значения поля {@linkplain Item2d#x}
     *
     * @return Значение {@linkplain Item2d#x}
     */
    public int getX() {
        return x;
    }

    /**
     * Установка значения поля {@linkplain Item2d#Octa}
     *
     * @param Octa - значение для {@linkplain Item2d#Octa}
     * @return Значение {@linkplain Item2d#Octa}
     */
    public String setOcta(String Octa) {
        return this.Octa = Octa;
    }

    /**
     * Получение значения поля {@linkplain Item2d#Octa}
     *
     * @return значение {@linkplain Item2d#Octa}
     */
    public String getOcta() {
        return Octa;
    }

    /**
     * Установка значения поля {@linkplain Item2d#Hex}
     *
     * @param Hex - значение для {@linkplain Item2d#Hex}
     * @return Значение {@linkplain Item2d#Hex}
     */
    public String setHex(String Hex) {
        return this.Hex = Hex;
    }

    /**
     * Получение значения поля {@linkplain Item2d#Hex}
     *
     * @return значение {@linkplain Item2d#Hex}
     */
    public String getHex() {
        return Hex;
    }

    /**
     * Установка значений {@linkplain Item2d#x} и {@linkplain Item2d#Octa}
     *
     * @param x - значение для {@linkplain Item2d#x}
     * @param Octa - значение для {@linkplain Item2d#Octa}
     * @param Hex - значение для {@linkplain Item2d#Hex}
     * @return this
     */
    public Item2d setXOctaHex(int x, String Octa, String Hex) {
        this.x = x;
        this.Octa = Octa;
        this.Hex = Hex;
        return this;
    }

    /**
     * Представляет результат вычислений в виде строки.<br>{@inheritDoc}
     */
    @Override
    public String toString() {
        return "x = " + x + ", Octa = " + Octa + ", Hex = " + Hex;
    }
}
