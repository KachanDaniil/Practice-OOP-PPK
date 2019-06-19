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
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;
import kachanlab2.Item2d;

/**
 * ConcreteProduct (Шаблон проектирования Factory Method)<br>
 * Вычисление функции, сохранение и отображение результатов
 *
 * @author xone
 * @version 1.0
 * @see View
 */
public class ViewResult implements View {
    Scanner reader = new Scanner(System.in);

    /**
     * Имя файла, используемое при сериализации
     */
    private static final String FNAME = "items.bin";
    /**
     * Определяет количество значений для вычисления по умолчанию
     */
    private static final int DEFAULT_NUM = 10;
    /**
     * Коллекция аргументов и результатов вычислений
     */
    private ArrayList<Item2d> items = new ArrayList<Item2d>();

    /**
     * Вызывает {@linkplain ViewResult#ViewResult(int n) ViewResult(int n)} с
     * параметром {@linkplain ViewResult#DEFAULT_NUM DEFAULT_NUM}
     */
    public ViewResult() {
        this(DEFAULT_NUM);
    }

    /**
     * Инициализирует коллекцию {@linkplain ViewResult#items}
     *
     * @param n начальное количество элементов
     */
    public ViewResult(int n) {
        for (int ctr = 0; ctr < n; ctr++) {
            items.add(new Item2d());
        }
    }

    /**
     * Получить значение {@linkplain ViewResult#items}
     *
     * @return текущее значение ссылки на объект {@linkplain ArrayList}
     */
    public ArrayList<Item2d> getItems() {
        return items;
    }

    /**
     * Вычисляет значение функции 11
     *
     * @param x аргумент вычисляемой функции
     * @return результат вычисления функции
     */
    private void calc(int x, Item2d item) {
        String Octal = Integer.toOctalString(x);
        String Hex = Integer.toHexString(x);
        item.setHex(Hex);
        item.setOcta(Octal);
    }

    /**
     * Вычисляет значение функции и сохраняет результат в коллекции
     * {@linkplain ViewResult#items}
     *
     * @param stepX шаг приращения аргумента
     */
    public void init(double stepX) {
        int x = 0;
        for (Item2d item : items) {
            item.setX(x);
            calc(x, item);
            x += stepX;
        }
    }

    /**
     * Вызывает <b>init(double stepX)</b> со случайным значением аргумента<br>
     * {@inheritDoc}
     */
    @Override
    public void viewInit() {
        init(reader.nextInt());
    }

    /**
     * Реализация метода {@linkplain View#viewSave()}<br> {@inheritDoc}
     */
    @Override
    public void viewSave() throws IOException {
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(FNAME));
        os.writeObject(items);
        os.flush();
        os.close();
    }

    /**
     * Реализация метода {@linkplain View#viewRestore()}<br> {@inheritDoc}
     */
    @SuppressWarnings("unchecked")
    @Override
    public void viewRestore() throws Exception {
        ObjectInputStream is = new ObjectInputStream(new FileInputStream(FNAME));
        items = (ArrayList<Item2d>) is.readObject();
        is.close();
    }

    /**
     * Реализация метода {@linkplain View#viewHeader()}<br> {@inheritDoc}
     */
    @Override
    public void viewHeader() {
        System.out.println("Results:");
    }

    /**
     * Реализация метода {@linkplain View#viewBody()}<br> {@inheritDoc}
     */
    @Override
    public void viewBody() {
        for (Item2d item : items) {
            System.out.printf("(%d; %s; %s) ", item.getX(), item.getOcta(), item.getHex());
        }
        System.out.println();
    }

    /**
     * Реализация метода {@linkplain View#viewFooter()}<br> {@inheritDoc}
     */
    @Override
    public void viewFooter() {
        System.out.println("End.");
    }

    /**
     * Реализация метода {@linkplain View#viewShow()}<br> {@inheritDoc}
     */
    @Override
    public void viewShow() {
        viewHeader();
        viewBody();
        viewFooter();
    }
}
