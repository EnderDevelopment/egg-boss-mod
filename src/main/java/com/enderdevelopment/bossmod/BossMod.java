package com.enderdevelopment.bossmod;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@Mod("bossmod")
public class BossMod {
    public static final String MODID = "bossmod";
    
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, MODID);
    
    public static final RegistryObject<EntityType<CustomBoss>> CUSTOM_BOSS = ENTITY_TYPES.register("custom_boss",
            () -> EntityType.Builder.of(CustomBoss::new, MobCategory.MONSTER)
                    .sized(1.0f, 2.0f)
                    .build("custom_boss"));
    
    public BossMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ENTITY_TYPES.register(modEventBus);
    }
}