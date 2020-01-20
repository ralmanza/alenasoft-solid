package edu.alenasoft.gildedrose;

public class ConjuredItem extends Item implements CanUpdateQuality {

    public ConjuredItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        if (this.getQuality() > 1 && this.getSellIn() > 0) this.setQuality(this.getQuality() - 2);
        else this.setQuality(0);
        //if (this.getSellIn() <= 0 && this.getQuality() > 0) this.setQuality(this.getQuality() - 1);
        this.setSellIn(this.getSellIn() - 1);
    }
}
