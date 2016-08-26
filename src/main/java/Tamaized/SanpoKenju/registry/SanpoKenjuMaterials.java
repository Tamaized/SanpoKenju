package Tamaized.SanpoKenju.registry;

import java.util.ArrayList;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import Tamaized.SanpoKenju.SanpoKenju;
import Tamaized.TamModized.registry.ITamModel;
import Tamaized.TamModized.registry.ITamRegistry;

public class SanpoKenjuMaterials implements ITamRegistry {

	public static ToolMaterial zanpakuto;

	@Override
	public void preInit() {
		zanpakuto = EnumHelper.addToolMaterial("Zanpakuto", 8, 12000, 50.0F, 13.0F, 30);
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
