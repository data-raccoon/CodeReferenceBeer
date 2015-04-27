package com.montezuma.codereference.init;

import com.montezuma.codereference.CRefReference;
import com.montezuma.codereference.CodeReferenceMod;
import com.montezuma.codereference.helper.CRefBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * This class implements all blocks added with this mod.
 * 
 * @author Montezuma I
 *
 */

public class CRefBlocks {
	
	public static Block brewery;
	
	public static void init()
	{
		brewery = new CRefBlock(Material.cloth).setUnlocalizedName("brewery");
		brewery.setCreativeTab(CodeReferenceMod.tabCRef);
	}
	
	public static void register()
	{
		GameRegistry.registerBlock(brewery, brewery.getUnlocalizedName().substring(5));
	}
	
	public static void registerRenders()
	{
		registerRender(brewery);
	}
	
	public static void registerRender(Block block)
	{
		Item item = Item.getItemFromBlock(block);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(CRefReference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
