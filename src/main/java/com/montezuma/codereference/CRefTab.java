package com.montezuma.codereference;

import com.montezuma.codereference.init.CRefItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * This class implements a tab in the creative inventory for quick access to mod items.
 * 
 * @author Montezuma I
 *
 */

public class CRefTab extends CreativeTabs {

	public CRefTab(String label) {
		super(label);
		//this.setBackgroundImageName("testbg.png") 
		//to be found at resources/assets/minecraft/textures/gui/container/creative_inventory/tab_testbg.png
	}

	// only the client renders the creative inventory, server does not!
	// render the texture of an item as the identifying symbol for the mods creative tab 
	@Override
	@SideOnly(Side.CLIENT)
	public Item getTabIconItem() {
		return CRefItems.pint_o_beer;
	}

}
