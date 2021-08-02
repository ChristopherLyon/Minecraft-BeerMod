package beermod.beer.mod;

import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.util.Hand;
import net.minecraft.sound.SoundEvents;

public class Beer extends Item {  // Generic plain beer

    public Beer(Settings settings) {
        super(settings);
    }
    

    //@Override
    //public TypedActionResult<ItemStack> use(World world, PlayerEntity playerEntity, Hand hand) {
        
        
     //   playerEntity.playSound(SoundEvents.ENTITY_GENERIC_DRINK, 1.0F, 1.0F);
      //  playerEntity.animateDamage();
        
       // return TypedActionResult.success(playerEntity.getStackInHand(hand));
   // }
}