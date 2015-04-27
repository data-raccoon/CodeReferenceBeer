package com.montezuma.codereference.init;

import com.montezuma.codereference.CRefReference;
import com.montezuma.codereference.CodeReferenceMod;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * This class implements all items added with this mod.
 * 
 * @author Montezuma I
 *
 */

public class CRefItems {
	
	public static Item pint_o_beer;
	public static Item malt;
	
    public static void init()
    {
    	// food items
    	// ItemFood() args: hunger int 0..20, saturation_modifier float, wolf_can_eat bool
    	// create new item and name it
    	pint_o_beer = new ItemFood(3, 0.66F, false).setUnlocalizedName("pint_o_beer");
    	// set on which tab the item should go in creative inventory
    	pint_o_beer.setCreativeTab(CodeReferenceMod.tabCRef);
    	
    	// non-food items
    	malt = new Item().setUnlocalizedName("malt");
    	malt.setCreativeTab(CodeReferenceMod.tabCRef);    	
    }
    
    public static void register()
    {
    	// register all items so the game knows about them
    	// names start with "tile.", e.g. "tile.pint_o_beer", remove first 5 characters for registering
    	GameRegistry.registerItem(pint_o_beer, pint_o_beer.getUnlocalizedName().substring(5));
    	GameRegistry.registerItem(malt, malt.getUnlocalizedName().substring(5));
    }
    
    public static void registerRenders()
    {
    	// register all renders for items so the game knows how to draw them
    	// actual code is lengthy, so it's been moved to another method
    	registerRender(pint_o_beer);
    	registerRender(malt);
    }
    
    public static void registerRender(Item item)
    {
    	// register render for item, so the game knows how to draw it
    	Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(
    			item, 0, new ModelResourceLocation(
    					CRefReference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    	// will look into 
    	//     src/main/resources/assets/MODID/models/item/ITEMNAME.json
    	//         for how to draw the item
    	//         actually copied from minecraft apple and modified
    	//     src/main/resources/assets/MODID/textures/items/ITEMNAME.png
    	//         for textures
    	//         use transparency!
    	//     src/main/src/main/resources/assets/MODID/lang/xx_XX.lang
    	//         for display names
    	//         provide for multiple languages!
    }
}
