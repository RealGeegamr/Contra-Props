package net.geegamr.contraprops.item;

import net.geegamr.contraprops.contraprops;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
        DeferredRegister.create(ForgeRegistries.ITEMS, contraprops.MODID);

    public static final RegistryObject<Item> METHBOX = ITEMS.register("meth_box",
    () -> new Item(new Item.Properties())
);


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
