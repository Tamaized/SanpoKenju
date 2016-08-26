package Tamaized.SanpoKenju;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.FMLEventChannel;
import net.minecraftforge.fml.common.network.NetworkRegistry;

import org.apache.logging.log4j.LogManager;

import Tamaized.SanpoKenju.registry.SanpoKenjuCreativeTabs;
import Tamaized.SanpoKenju.registry.SanpoKenjuItems;
import Tamaized.SanpoKenju.registry.SanpoKenjuMaterials;
import Tamaized.TamModized.TamModBase;
import Tamaized.TamModized.TamModized;
import Tamaized.TamModized.proxy.AbstractProxy;

@Mod(modid = SanpoKenju.modid, name = "SanpoKenju", version = SanpoKenju.version, dependencies = "required-before:" + TamModized.modid + "@[" + TamModized.version + ",)")
public class SanpoKenju extends TamModBase {

	public static final String version = "0.0.1";
	public static final String modid = "sanpokenju";

	public static String getVersion() {
		return version;
	}

	@Instance(modid)
	public static SanpoKenju instance = new SanpoKenju();

	public static FMLEventChannel channel;
	public static final String networkChannelName = "SanpoKenju";

	@SidedProxy(clientSide = "Tamaized.SanpoKenju.proxy.ClientProxy", serverSide = "Tamaized.SanpoKenju.proxy.ServerProxy")
	public static AbstractProxy proxy;

	public static SanpoKenjuCreativeTabs creativeTabs;
	public static SanpoKenjuMaterials materials;
	public static SanpoKenjuItems items;

	@Override
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		logger = LogManager.getLogger("SanpoKenju");

		logger.info("Starting SanpoKenju PreInit");

		// Initialize Network
		channel = NetworkRegistry.INSTANCE.newEventDrivenChannel(networkChannelName);

		// Register the Registers
		register(creativeTabs = new SanpoKenjuCreativeTabs());
		register(materials = new SanpoKenjuMaterials());
		register(items = new SanpoKenjuItems());

		// Register Sounds Events
		// SanpoKenjuSoundEvents.register();

		// Super here to start register stuff
		super.preInit(event);

		// Proxy Stuff
		proxy.preInit();
	}

	@Override
	@EventHandler
	public void init(FMLInitializationEvent event) {
		logger.info("Starting SanpoKenju Init");

		super.init(event);

		// Proxy Stuff
		proxy.init();

	}

	@Override
	@EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		logger.info("Starting SanpoKenju PostInit");

		super.postInit(e);

		// Register Network
		// channel.register(new ServerPacketHandler());

		// Proxy Stuff
		proxy.postInit();

	}

}
