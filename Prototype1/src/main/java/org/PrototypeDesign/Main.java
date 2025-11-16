package org.PrototypeDesign;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        BookShop bs = new BookShop();
        bs.setShopName("Novelty");
        bs.loadData();

        BookShop bs1 = bs.clone();
        bs.getBooks().remove(2);
        bs1.setShopName("A1");

        System.out.println(bs);
        System.out.println(bs1);
    }
}