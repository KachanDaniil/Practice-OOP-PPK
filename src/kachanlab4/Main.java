/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kachanlab4;

/**
 *
 * @author admin
 */
import kachanlab3.View;

/**
 * Вычисление и отображение результатов<br>
 * Содержит реализацию статического метода main()
 *
 * @author xone
 * @version 3.0
 * @see Main#main
 */
public class Main extends kachanlab3.Main {

    /**
     * Инициализирует поле {@linkplain ex02.Main#view view}
     */
    public Main(View view) {
        super(view);
    }

    /**
     * Выполняется при запуске программы; вызывает метод
     * {@linkplain ex02.Main#menu menu()}
     *
     * @param args - параметры запуска программы
     */
    public static void main(String[] args) {
        Main main = new Main(new ViewableTable().getView());
        main.menu();
    }
}
