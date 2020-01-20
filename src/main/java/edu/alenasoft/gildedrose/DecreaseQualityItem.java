package edu.alenasoft.gildedrose;

public class DecreaseQualityItem extends Item implements CanUpdateQuality {

    public DecreaseQualityItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        if (this.getQuality() > 0) this.setQuality(this.getQuality() - 1);
        if (this.getSellIn() <= 0 && this.getQuality() > 0) this.setQuality(this.getQuality() - 1);
        this.setSellIn(this.getSellIn() - 1);
    }
}
