/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kachanlab5;

/**
 *
 * @author admin
 */
import kachanlab2.Item2d;

/**
 * Команда Change item; шаблон Command
 *
 * @author xone
 * @version 1.0
 */
public class ChangeItemCommand implements Command {

    /**
     * Обрабатываемый объект; шаблон Command
     */
    private Item2d item;

    /**
     * Параметр команды; шаблон Command
     */
    private int offset;

    /**
     * Устанавливаент поле {@linkplain ChangeItemCommand#item}
     *
     * @param item значение для {@linkplain ChangeItemCommand#item}
     * @return новое значение {@linkplain ChangeItemCommand#item}
     */
    public Item2d setItem(Item2d item) {
        return this.item = item;
    }

    /**
     * Возвращает поле {@linkplain ChangeItemCommand#item}
     *
     * @return значение {@linkplain ChangeItemCommand#item}
     */
    public Item2d getItem() {
        return item;
    }

    /**
     * Устанавливаент поле {@linkplain ChangeItemCommand#offset}
     *
     * @param offset значение для {@linkplain ChangeItemCommand#offset}
     * @return новое значение {@linkplain ChangeItemCommand#offset}
     */
    public double setOffset(int offset) {
        return this.offset = offset;
    }

    /**
     * Возвращает поле {@linkplain ChangeItemCommand#offset}
     *
     * @return значение {@linkplain ChangeItemCommand#offset}
     */
    public double getOffset() {
        return offset;
    }

    @Override
    public void execute() {
        item.setOcta(Integer.toOctalString(Integer.parseInt(item.getOcta(), 8) * offset));
        item.setHex(Integer.toHexString(Integer.parseInt(item.getHex(), 16) * offset));
    }
}
