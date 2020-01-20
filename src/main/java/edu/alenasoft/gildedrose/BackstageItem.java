package edu.alenasoft.gildedrose;

public class BackstageItem extends Item implements CanUpdateQuality {

    public BackstageItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        if (this.getSellIn() <= 0) {
            this.setQuality(0);
        } else {
            if (this.getQuality() < 50) this.setQuality(this.getQuality() + 1);
            if (this.getQuality() < 50 && this.getSellIn() <= 10) this.setQuality(this.getQuality() + 1);
            if (this.getQuality() < 50 && this.getSellIn() <= 5) this.setQuality(this.getQuality() + 1);
        }

        this.setSellIn(this.getSellIn() - 1);
    }
}
