/*******************************************************************************
 * @author Reika
 * 
 * Copyright 2013
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
package Reika.RotaryCraft.Items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.src.ModLoader;
import net.minecraft.world.World;
import Reika.RotaryCraft.Base.ItemRotaryTool;
import Reika.RotaryCraft.GUIs.GuiCalculator;

public class ItemCalculator extends ItemRotaryTool {

	public ItemCalculator(int itemID) {
		super(itemID, 240);
	}

	@Override
	public ItemStack onItemRightClick(ItemStack is, World world, EntityPlayer ep)
	{
		ModLoader.openGUI(ep, new GuiCalculator(ep, world));
		return is;
	}
}