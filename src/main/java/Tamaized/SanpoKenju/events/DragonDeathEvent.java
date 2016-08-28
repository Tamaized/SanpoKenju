package Tamaized.SanpoKenju.events;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import Tamaized.SanpoKenju.SanpoKenju;


public class DragonDeathEvent {
	
	@SubscribeEvent
	public void onDeath(LivingDeathEvent e){
		EntityLivingBase entity = e.getEntityLiving();
		World world = entity.worldObj;
		if(!world.isRemote && entity instanceof EntityDragon){
			if(Math.floor(Math.random()*10) == 0){
				world.spawnEntityInWorld(new EntityItem(world, entity.posX, entity.posY, entity.posZ, new ItemStack(SanpoKenju.items.sanpoKenju)));
			}
		}
	}

}
