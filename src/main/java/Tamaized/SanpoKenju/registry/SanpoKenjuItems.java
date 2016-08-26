package Tamaized.SanpoKenju.registry;

import java.util.ArrayList;

import Tamaized.SanpoKenju.SanpoKenju;
import Tamaized.SanpoKenju.items.ItemSanpoKenju;
import Tamaized.TamModized.registry.ITamModel;
import Tamaized.TamModized.registry.ITamRegistry;

public class SanpoKenjuItems implements ITamRegistry {

	private ArrayList<ITamModel> modelList;
	
	public static ItemSanpoKenju sanpoKenju;

	@Override
	public void preInit() {
		modelList = new ArrayList<ITamModel>();
		
		modelList.add(sanpoKenju = new ItemSanpoKenju(SanpoKenju.creativeTabs.tab, SanpoKenju.materials.zanpakuto, "sanpoKenju"));
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
		return modelList;
	}

	@Override
	public String getModID() {
		return SanpoKenju.modid;
	}

}
