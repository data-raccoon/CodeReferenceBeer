package com.montezuma.codereference.proxy;

import com.montezuma.codereference.init.CRefBlocks;
import com.montezuma.codereference.init.CRefItems;

/**
 * This class implements all the code that should be executed on the client but not on the server.
 * 
 * @author Montezuma I
 *
 */

public class CRefClientProxy extends CRefCommonProxy{
	// rendering is client specific, the server does not have corresponding code, or necessary imports 
	@Override
	public void registerRenders()
	{
		CRefItems.registerRenders();
		CRefBlocks.registerRenders();
	}
}
