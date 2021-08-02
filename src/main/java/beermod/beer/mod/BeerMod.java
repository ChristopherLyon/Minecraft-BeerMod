package beermod.beer.mod;


import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.item.BlockItem;
import net.minecraft.item.FoodComponent;


public class BeerMod implements ModInitializer {
     
	// an instance of our new item)
	public static final Beer BEER = new Beer(new FabricItemSettings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.6f).alwaysEdible().build()));
	public static final Item HOPS = new Item(new FabricItemSettings().group(ItemGroup.MATERIALS).maxCount(16));
	public static final Item BEER_GLASS = new Item(new FabricItemSettings().group(ItemGroup.MATERIALS).maxCount(1));
	public static final Block GRAIN_MILL = new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f));
	public static final Item MALT = new Item(new FabricItemSettings().group(ItemGroup.MATERIALS).maxCount(16));
	public static final Item RICE = new Item(new FabricItemSettings().group(ItemGroup.MATERIALS).maxCount(16));


	@Override
	public void onInitialize() {
		Registry.register(Registry.ITEM, new Identifier("beermod", "beer"), BEER);
		Registry.register(Registry.ITEM, new Identifier("beermod", "hops"), HOPS);
		Registry.register(Registry.ITEM, new Identifier("beermod", "beer_glass"), BEER_GLASS);
		Registry.register(Registry.BLOCK, new Identifier("beermod", "grain_mill"), GRAIN_MILL);
		Registry.register(Registry.ITEM, new Identifier("beermod", "grain_mill"), new BlockItem(GRAIN_MILL, new FabricItemSettings().group(ItemGroup.MISC).maxCount(1)));
		Registry.register(Registry.ITEM, new Identifier("beermod", "malt"), MALT);
		Registry.register(Registry.ITEM, new Identifier("beermod", "rice"), RICE);

	} 
}
