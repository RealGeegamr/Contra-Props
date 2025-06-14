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

// New Items
    public static final RegistryObject<Item> METHBOX = ITEMS.register("meth_box",
    () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CHEMICAL = ITEMS.register("chemicals",
    () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> UNCOOKEDTRAY = ITEMS.register("meth_tray_uncooked",
    () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> EMPTYTRAY = ITEMS.register("meth_tray_empty",
    () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> COOKEDTRAY = ITEMS.register("meth_tray_cooked",
    () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> JOINT = ITEMS.register("joint",
    () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> CAUSTICSODA = ITEMS.register("caustic_soda",
    () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> HYDROGENCHLORIDE = ITEMS.register("hydrogen_chloride",
    () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> MURIATICACID = ITEMS.register("muriaticacid",
    () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> WATER_BOTTLE = ITEMS.register("water_bottle",
    () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> STEEL = ITEMS.register("steel",
    () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ICE_PACK = ITEMS.register("ice_pack",
    () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> WEED = ITEMS.register("weed",
    () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PAPPER_BAG = ITEMS.register("paper_bag",
    () -> new Item(new Item.Properties()));

//End Of New Items
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
