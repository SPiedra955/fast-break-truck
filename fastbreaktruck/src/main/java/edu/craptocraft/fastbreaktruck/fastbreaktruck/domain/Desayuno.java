package edu.craptocraft.fastbreaktruck.fastbreaktruck.domain;

import java.util.ArrayList;
import java.util.List;

import edu.craptocraft.fastbreaktruck.fastbreaktruck.behaviour.Item;

public class Desayuno {
    
    private Float total = 0f;
    private List<Item> items = new ArrayList<Item>();

    public Desayuno(){};

    public List<Item> getItems(){
        return this.items;
    }

    public void addItem(Item item){
        items.add(item);
    }

    public void mostrarItems(){
        getItems().forEach(item -> System.out.println(item));
    }

    public Float getCoste(){
        getItems().forEach(item -> total += item.pvp());
        return this.total;

    }
}
