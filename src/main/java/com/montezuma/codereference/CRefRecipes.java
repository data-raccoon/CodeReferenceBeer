package com.montezuma.codereference;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.montezuma.codereference.init.CRefItems;

/**
 * This class contains all crafting recipes in the mod.
 * 
 * @author Montezuma I
 *
 */


public class CRefRecipes {
	public static void registerRecipes(){
		// 2nd argument optional: number of items returned
		GameRegistry.addRecipe(new ItemStack(CRefItems.malt, 3), new Object[]{
			"WWW",
			" B ",
			"   ",
			'W', Items.wheat, 'B', Items.water_bucket
			});
	}
}
