package com.montezuma.codereference;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import com.montezuma.codereference.init.CRefBlocks;
import com.montezuma.codereference.init.CRefItems;
import com.montezuma.codereference.proxy.CRefCommonProxy;

/**
 * This mod implements a variety of mechanics for future reference.
 * Written for minecraft forge, Minecraft version 1.8.
 * 
 * This class implements the main structure of the mod only, 
 * all actual code goes into other classes.
 * 
 * References
 *   MrCrayfish tutorial videos
 *     https://www.youtube.com/user/MrCrayfishMinecraft
 *   Java-Tutorial.org (german)
 * 
 * @author Montezuma I
 * 
 */
 

//@Mod tells forge that this class wants to add a new mod
@Mod(modid = CRefReference.MOD_ID, 
	 name = CRefReference.MOD_NAME, 
	 version = CRefReference.VERSION)
public class CodeReferenceMod {

	// some code should only be executed on the server or on the client only (e.g. rendering on client) 
	@SidedProxy(clientSide = CRefReference.CLIENT_PROXY_CLASS, serverSide = CRefReference.SERVER_PROXY_CLASS)
	public static CRefCommonProxy proxy;
	
	// create a tab in creative inventory for quick access to mod items
	public static final CRefTab tabCRef = new CRefTab("tabCRef");
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		// create and register custom blocks and items
		CRefBlocks.init();
		CRefBlocks.register();
		CRefItems.init();
		CRefItems.register();
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		// when on client, register renders that control 
		// how our blocks and items look
		proxy.registerRenders();
		
		CRefRecipes.registerRecipes();
		
		// TODO should go into a seperate class
		// SMELTING RECIPES
		//GameRegistry.addSmelting()
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		// some clean up work
	}

}
