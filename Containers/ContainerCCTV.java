/*******************************************************************************
 * @author Reika
 * 
 * Copyright 2013
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
package Reika.RotaryCraft.Containers;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Slot;
import Reika.DragonAPI.Base.CoreContainer;
import Reika.RotaryCraft.TileEntities.TileEntityCCTV;

public class ContainerCCTV extends CoreContainer {

	public ContainerCCTV(EntityPlayer player, TileEntityCCTV te) {
		super(player, te);

		this.addSlotToContainer(new Slot(te, 0, 80, 17));

		this.addSlotToContainer(new Slot(te, 1, 62, 53));
		this.addSlotToContainer(new Slot(te, 2, 80, 53));
		this.addSlotToContainer(new Slot(te, 3, 98, 53));

		this.addPlayerInventory(player);
	}

}