package Tamaized.SanpoKenju.registry;

import java.util.ArrayList;

import Tamaized.SanpoKenju.SanpoKenju;
import Tamaized.TamModized.registry.ITamModel;
import Tamaized.TamModized.registry.ITamRegistry;

public class SanpoKenjuItems implements ITamRegistry {

	private ArrayList<ITamModel> modelList;

	@Override
	public void preInit() {
		
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
