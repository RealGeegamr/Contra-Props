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

    public static final RegistryObject<CreativeModeTab> CONTRA_TAB = CREATIVE_MODE_TABS.register("contra_items", 
    () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.METHBOX.get()))
    .title(Component.translatable("creativetab.contra_items"))
    .displayItems((pParameters, pOutput) -> {
        pOutput.accept(ModItems.METHBOX.get());
        pOutput.accept(ModItems.CHEMICAL.get());
        pOutput.accept(ModItems.EMPTYTRAY.get());
        pOutput.accept(ModItems.UNCOOKEDTRAY.get());
        pOutput.accept(ModItems.COOKEDTRAY.get());
        pOutput.accept(ModItems.JOINT.get());
        pOutput.accept(ModItems.CAUSTICSODA.get());
        pOutput.accept(ModItems.HYDROGENCHLORIDE.get());
        pOutput.accept(ModItems.MURIATICACID.get());
    })
    .build());

    public static final RegistryObject<CreativeModeTab> CONTRA_BLOCKS = CREATIVE_MODE_TABS.register("contra_blocks", 
    () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.COOKEDTRAY.get()))
    .title(Component.translatable("creativetab.contra_blocks"))
    .displayItems((pParameters, pOutput) -> {
        pOutput.accept(ModItems.COOKEDTRAY.get());
    })
    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
