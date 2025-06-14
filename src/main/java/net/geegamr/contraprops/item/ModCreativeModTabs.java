package net.geegamr.contraprops.item;

import net.geegamr.contraprops.contraprops;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
        DeferredRegister.create(Registries.CREATIVE_MODE_TAB, contraprops.MODID);

    public static final RegistryObject<CreativeModeTab> CONTRA_TAB = CREATIVE_MODE_TABS.register("contra_tab", 
    () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.METHBOX.get()))
    .title(Component.translatable("creativetab.contra_tab"))
    .displayItems((pParameters, pOutput) -> {
        pOutput.accept(ModItems.METHBOX.get());
    })
    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
