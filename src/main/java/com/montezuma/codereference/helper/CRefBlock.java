package com.montezuma.codereference.helper;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * This class is a helper.
 * net.minecraft.block.Block has protected constructor and therefore cannot be called from this mod. 
 * We extend that class and call its constructor from our constructor as workaround.
 * 
 * @author Montezuma I
 *
 */

public class CRefBlock extends Block{
	public CRefBlock(Material materialIn) {
		super(materialIn);
	}
}
