package com.enderdevelopment.bossmod;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class CustomBossEgg {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BossMod.MODID);
    
    public static final RegistryObject<Item> CUSTOM_BOSS_EGG = ITEMS.register("custom_boss_egg",
            () -> new SpawnEggItem(BossMod.CUSTOM_BOSS, 0xFF0000, 0x00FF00, new Item.Properties()));
    
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}