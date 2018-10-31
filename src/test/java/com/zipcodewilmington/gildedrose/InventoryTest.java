package com.zipcodewilmington.gildedrose;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class InventoryTest {
    @Test
    public void updateQuantityTest(){
        Assert.assertEquals(1, 1);
    }

    Item item;
    Item item1;
    Item agedBrie;
    Item backStage;
    Item backStage2;
    Item sulfuras;
    Inventory inventory;
    Item[] testItem;

    @Before
    public void initialize(){
        //given
        item = new Item("Ticket", 2,2);
        item1 = new Item("Not Brie", -1, 2);
        agedBrie = new Item("Aged Brie", -1, 4);
        backStage = new Item ("Backstage passes to a TAFKAL80ETC concert", 4, 3);
        backStage2 = new Item ("Backstage passes to a TAFKAL80ETC concert", -1, 3);
        sulfuras = new Item ("Sulfuras, Hand of Ragnaros", 4, 3);
        testItem = new Item[]{agedBrie, backStage, sulfuras, item, item1, backStage2};
        inventory = new Inventory(testItem);
    }

    @Test
    public void getQualityTest(){
        //when
        int expected = 2;
        int actual = item.getQuality();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNameTest(){
        //when
        String expected = "Ticket";
        String actual = item.getName();

        //then
          Assert.assertEquals(expected, actual);
    }

    @Test
    public void getSellIn(){
        //when
        int expected = 2;
        int actual = item.getSellIn();

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setQualityTest(){
        item.setQuality(1);
        int actual = item.getQuality();
        int expected = 1;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setNameTest(){
        item.setName("Ticket");
        String actual = item.getName();
        String expected = "Ticket";

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setSellIn(){
        item.setSellIn(3);
        int actual = item.getSellIn();
        int expected = 3;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void agedBrieTest(){
        int actual = agedBrie.getQuality() - 1;
        int expected = 3;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sulfurasTest(){
        int actual = sulfuras.getQuality() -1;
        int expected = 2;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void backStageTest(){
        int actual = backStage.getQuality()-1;
        int expected = 2;

        Assert.assertEquals(expected, actual);
    }


    @Test
    public void notNames(){
        int before = item1.getQuality();
        int expected = 0;
        inventory.updateQuality();
        int actual = item1.getQuality();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void lastTest(){
        int actual = 6;
        inventory.updateQuality();
        int expected = agedBrie.getQuality();

        Assert.assertEquals(actual, expected);
    }
}

