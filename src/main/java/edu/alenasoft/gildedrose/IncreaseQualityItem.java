package edu.alenasoft.gildedrose;

public class IncreaseQualityItem extends Item implements CanUpdateQuality {

    public IncreaseQualityItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        if (this.getQuality() < 50) this.setQuality(this.getQuality() + 1);
        this.setSellIn(this.getSellIn() - 1);
    }
}
