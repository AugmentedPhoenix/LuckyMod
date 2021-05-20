package site.phoenixthedev.luckymod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class LuckyMod implements ModInitializer {

    public static final Block LUCKY_BLOCK = new Block(FabricBlockSettings.of(Material.WOOD).strength(4.0f));

    @Override
    public void onInitialize() {
        //Same as on enable
        Registry.register(Registry.BLOCK, new Identifier("luckymod", "lucky_block"), LUCKY_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("luckymod", "lucky_block"), new BlockItem(LUCKY_BLOCK, new FabricItemSettings().group(ItemGroup.MISC)));
    }
}
