package net.geegamr.contraprops.block;

import java.util.function.Supplier;

import net.geegamr.contraprops.contraprops;
import net.geegamr.contraprops.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, contraprops.MODID);

//Creating the blocks
    public static final RegistryObject<Block> METH_FRIDGE = registerBlock("meth_fridge",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    public static final RegistryObject<Block> WEED_PLANT = registerBlock("weed_plant",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> COOKEDTRAY = registerBlock("meth_tray_cooked",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

//End of creating blocks
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}
