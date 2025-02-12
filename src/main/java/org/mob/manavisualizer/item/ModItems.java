package org.mob.manavisualizer.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.mob.manavisualizer.Manavisualizer;
import org.mob.manavisualizer.item.custom.ManaReaderWandItem;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Manavisualizer.MOD_ID);

    public static final RegistryObject<Item> MANAREADER = ITEMS.register("manareader",
            () -> new ManaReaderWandItem(new Item.Properties().stacksTo(1)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
