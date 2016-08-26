package Tamaized.SanpoKenju.registry;

import java.util.ArrayList;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import Tamaized.SanpoKenju.SanpoKenju;
import Tamaized.TamModized.registry.ITamModel;
import Tamaized.TamModized.registry.ITamRegistry;

public class SanpoKenjuCreativeTabs implements ITamRegistry {

	public static CreativeTabs tab;

	@Override
	public void preInit() {
		tab = new CreativeTabs("SanpoKenju") {
			@Override
			public Item getTabIconItem() {
				return SanpoKenju.items.sanpoKenju;
			}
		};
	}

	@Override
	public void init() {

	}

	@Override
	public void postInit() {

	}

	@Override
	public void clientPreInit() {

	}

	@Override
	public void clientInit() {

	}

	@Override
	public void clientPostInit() {

	}

	@Override
	public ArrayList<ITamModel> getModelList() {
		return new ArrayList<ITamModel>();
	}

	@Override
	public String getModID() {
		return SanpoKenju.modid;
	}

}
