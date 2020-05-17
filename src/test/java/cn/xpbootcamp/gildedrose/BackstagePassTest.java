package cn.xpbootcamp.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BackstagePassTest {

    @Test
    void should_set_sell_in_1_and_quality_50_given_backstage_pass_sell_in_12_and_quality_49_when_pass_1_days() {
        BackstagePass backstagePass = new BackstagePass(12, 49);
        backstagePass.update(1);
        assertEquals(11, backstagePass.getSellIn());
        assertEquals(50, backstagePass.getQuality());
    }

    @Test
    void should_set_sell_in_11_and_quality_50_given_backstage_pass_sell_in_11_and_quality_50_when_pass_1_days() {
        BackstagePass backstagePass = new BackstagePass(11, 50);
        backstagePass.update(1);
        assertEquals(10, backstagePass.getSellIn());
        assertEquals(50, backstagePass.getQuality());
    }

    @Test
    void should_set_sell_in_9_and_quality_49_given_backstage_pass_sell_in_10_and_quality_47_when_pass_1_days() {
        BackstagePass backstagePass = new BackstagePass(10, 47);
        backstagePass.update(1);
        assertEquals(9, backstagePass.getSellIn());
        assertEquals(49, backstagePass.getQuality());
    }

    @Test
    void should_set_sell_in_5_and_quality_50_given_backstage_pass_sell_in_6_and_quality_50_when_pass_1_days() {
        BackstagePass backstagePass = new BackstagePass(6, 50);
        backstagePass.update(1);
        assertEquals(5, backstagePass.getSellIn());
        assertEquals(50, backstagePass.getQuality());
    }

    @Test
    void should_set_sell_in_4_and_quality_48_given_backstage_pass_sell_in_5_and_quality_45_when_pass_1_days() {
        BackstagePass backstagePass = new BackstagePass(5, 45);
        backstagePass.update(1);
        assertEquals(4, backstagePass.getSellIn());
        assertEquals(48, backstagePass.getQuality());
    }

    @Test
    void should_set_sell_in_0_and_quality_50_given_backstage_pass_sell_in_1_and_quality_50_when_pass_1_days() {
        BackstagePass backstagePass = new BackstagePass(1, 50);
        backstagePass.update(1);
        assertEquals(0, backstagePass.getSellIn());
        assertEquals(50, backstagePass.getQuality());
    }

    @Test
    void should_set_sell_in_negative_1_and_quality_0_given_backstage_pass_sell_in_0_and_quality_50_when_pass_1_days() {
        BackstagePass backstagePass = new BackstagePass(0, 50);
        backstagePass.update(1);
        assertEquals(-1, backstagePass.getSellIn());
        assertEquals(0, backstagePass.getQuality());
    }

    @Test
    void should_set_sell_in_negative_1_and_quality_0_given_backstage_pass_sell_in_0_and_quality_30_when_pass_1_days() {
        BackstagePass backstagePass = new BackstagePass(0, 30);
        backstagePass.update(1);
        assertEquals(-1, backstagePass.getSellIn());
        assertEquals(0, backstagePass.getQuality());
    }
}
