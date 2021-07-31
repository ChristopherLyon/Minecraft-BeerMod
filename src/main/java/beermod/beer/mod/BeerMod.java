package beermod.beer.mod;


import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class BeerMod implements ModInitializer {
     
	// an instance of our new item
	public static final Item BEER = new Item(new FabricItemSettings().group(ItemGroup.FOOD));
	public static final Item HOPS = new Item(new FabricItemSettings().group(ItemGroup.MATERIALS));
	public static final Item BEERGLASS = new Item(new FabricItemSettings().group(ItemGroup.MATERIALS));

 
	@Override
	public void onInitialize() {
		Registry.register(Registry.ITEM, new Identifier("beermod", "beer"), BEER); // LOWER CASE NAME
		Registry.register(Registry.ITEM, new Identifier("beermod", "hops"), HOPS); // LOWER CASE NAME
		Registry.register(Registry.ITEM, new Identifier("beermod", "beerglass"), BEERGLASS); // LOWER CASE NAME

	} 
}

