package org.PrototypeDesign;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Getter
@Setter
@ToString
public class BookShop implements Cloneable{
    private String shopName;
    List<Book> books = new ArrayList<>();

    public void loadData(){
        for(int i = 0; i < 10; i++){
            Book b = new Book();
            b.setBid(i);
            b.setBname("Book " + i);
            getBooks().add(b);
        }
    }

    //Shallow cloning
//    @Override
//    protected Object clone() throws CloneNotSupportedException{
//        return super.clone();
//    }
    //Deep Cloning
    @Override
    protected BookShop clone() throws CloneNotSupportedException{
        BookShop shop = new BookShop();
        for(Book i: this.getBooks()){
            shop.getBooks().add(i);
        }

        return shop;
    }
}
