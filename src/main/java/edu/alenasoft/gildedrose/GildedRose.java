package edu.alenasoft.gildedrose;

import java.util.ArrayList;
import java.util.List;

public class GildedRose {

  public static List<Item> items = new ArrayList<>();

  public static void main(String[] args) {

    System.out.println("OMGHAI!");

    items.add(new DecreaseQualityItem("+5 Dexterity Vest", 10, 20));
    items.add(new IncreaseQualityItem("Aged Brie", 2, 0));
    items.add(new DecreaseQualityItem("Elixir of the Mongoose", 5, 7));
    items.add(new SulfurasItem("Sulfuras, Hand of Ragnaros", 0, 80));
    items.add(new BackstageItem("Backstage passes to a TAFKAL80ETC concert", 15, 20));
    //items.add(new DecreaseQualityItem("Conjured Mana Cake", 3, 6));

    updateQuality();

    System.out.println(items);
  }

  public static void updateQuality() {
    items.forEach(item -> {
      if (item instanceof CanUpdateQuality) ((CanUpdateQuality) item).updateQuality();
    });
  }
}
