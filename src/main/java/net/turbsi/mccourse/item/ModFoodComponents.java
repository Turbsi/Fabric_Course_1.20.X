package net.turbsi.mccourse.item;

import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent CORN = new FoodComponent.Builder().hunger(2).saturationModifier(0.2f).build();
    public static final FoodComponent COOKED_CORN = new FoodComponent.Builder().hunger(4).saturationModifier(0.2f).build();
}
