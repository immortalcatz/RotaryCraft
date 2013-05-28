/*******************************************************************************
 * @author Reika
 * 
 * Copyright 2013
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
package Reika.RotaryCraft.Blocks;

import net.minecraft.block.material.Material;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import Reika.DragonAPI.Libraries.ReikaWorldHelper;
import Reika.RotaryCraft.mod_RotaryCraft;
import Reika.RotaryCraft.Auxiliary.EnumEngineType;
import Reika.RotaryCraft.Auxiliary.ItemStacks;
import Reika.RotaryCraft.Base.BlockModelledMachine;
import Reika.RotaryCraft.TileEntities.TileEntityEngine;

public class BlockEngine extends BlockModelledMachine {

	public BlockEngine (int blockID, Material mat) {
		super(blockID, mat);
		//this.blockIndexInTexture = 14;
	}

	@Override
	public void setBlockBoundsBasedOnState(IBlockAccess par1IBlockAccess, int x, int y, int z)
	{
		this.setBlockBounds(0F, 0F, 0F, 1F, 1F, 1F);
		float minx = (float)minX;
		float maxx = (float)maxX;
		float miny = (float)minY;
		float maxy = (float)maxY;
		float minz = (float)minZ;
		float maxz = (float)maxZ;

		TileEntityEngine tile = (TileEntityEngine)par1IBlockAccess.getBlockTileEntity(x, y, z);
		if (tile == null)
			return;

		if (tile.type == null)
			tile.type = EnumEngineType.DC;
		switch(tile.type) {
		case DC:
			maxy -= 0.1875F;
			break;/*
		case WIND:
			maxy = 1.5F;
			miny = -0.5F;
			switch(tile.getBlockMetadata()) {
			case 0:
				minz = -0.5F;
				maxz = 1.5F;
				maxx = 1.1875F;
			break;
			case 1:
				minz = -0.5F;
				maxz = 1.5F;
				minx = -0.1875F;
			break;
			case 2:
				maxx = 1.5F;
				minx = -0.5F;
				maxz = 1.1875F;
			break;
			case 3:
				maxx = 1.5F;
				minx = -0.5F;
				minz = -0.1875F;
			break;
			}
			break;*/
		case STEAM:
			maxy -= 0.125F;
			break;
		case GAS:
			maxy -= 0.0625F;
			break;/*
		case HYDRO:
			maxy = 1.5F;
			miny = -0.5F;
			if (tile.getBlockMetadata() < 2) {
				minz = -0.5F;
				maxz = 1.5F;
			}
			else {
				maxx = 1.5F;
				minx = -0.5F;
			}
			break;*/
		case MICRO:
			maxy -= 0.125F;
			break;
		case JET:
			maxy -= 0.125F;
			break;
		default:
			break;
		}

		this.setBlockBounds(minx, miny, minz, maxx, maxy, maxz);
	}

	@Override
	public final AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int x, int y, int z) {
		return this.getBlockAABB(x, y, z);
	}

    @Override
	public final AxisAlignedBB getSelectedBoundingBoxFromPool(World world, int x, int y, int z)
    {
		return super.getSelectedBoundingBoxFromPool(world, x, y, z);
    }

	@Override
	public boolean removeBlockByPlayer(World world, EntityPlayer player, int x, int y, int z)
	{
		if (this.canHarvest(world, player, x, y, z));
		this.harvestBlock(world, player, x, y, z, 0);
		return ReikaWorldHelper.legacySetBlockWithNotify(world, x, y, z, 0);
	}

	private boolean canHarvest(World world, EntityPlayer ep, int x, int y, int z) {
		ItemStack eitem = ep.inventory.getCurrentItem();
		if (eitem == null)
			return false;
		if (!(eitem.getItem() instanceof ItemPickaxe))
			return false;
		if (eitem.itemID == Item.pickaxeWood.itemID)
			return false;
		return true;
	}

	@Override
	public void harvestBlock(World world, EntityPlayer ep, int x, int y, int z, int meta) {
		if (!this.canHarvest(world, ep, x, y, z))
			return;
		TileEntityEngine eng = (TileEntityEngine)world.getBlockTileEntity(x, y, z);
		if (eng != null) {
			if (eng.type == null)
				eng.type = EnumEngineType.DC;
			if (eng.FOD >= 8 && eng.type == EnumEngineType.JET) {
				ItemStack todrop = new ItemStack(ItemStacks.steelgear.itemID, 1+par5Random.nextInt(5), ItemStacks.steelgear.getItemDamage());	//drop gears
				EntityItem item = new EntityItem(world, x + 0.5F, y + 0.5F, z + 0.5F, todrop);
				item.delayBeforeCanPickup = 10;
				if (!world.isRemote)
					world.spawnEntityInWorld(item);
				todrop = new ItemStack(ItemStacks.scrap.itemID, 16+par5Random.nextInt(17), ItemStacks.scrap.getItemDamage());	//drop scrap
				item = new EntityItem(world, x + 0.5F, y + 0.5F, z + 0.5F, todrop);
				item.delayBeforeCanPickup = 10;
				if (!world.isRemote && !ep.capabilities.isCreativeMode)
					world.spawnEntityInWorld(item);
			}
			else {
				int metat = eng.type.getID();
				ItemStack todrop = new ItemStack(mod_RotaryCraft.engineitems.itemID, 1, metat); //drop engine item
				EntityItem item = new EntityItem(world, x + 0.5F, y + 0.5F, z + 0.5F, todrop);
				item.delayBeforeCanPickup = 10;
				if (!world.isRemote && !ep.capabilities.isCreativeMode)
					world.spawnEntityInWorld(item);
				for (int i = 0; i < eng.fuelslot.length; i++) {
					if (eng.fuelslot[i] != null) {
						todrop = eng.fuelslot[i];
						item = new EntityItem(world, x + 0.5F, y + 0.5F, z + 0.5F, todrop);
						item.delayBeforeCanPickup = 10;
						if (!world.isRemote && !ep.capabilities.isCreativeMode)
							world.spawnEntityInWorld(item);
					}
				}
			}
		}
		super.harvestBlock(world, ep, x, y, z, meta);
	}

	/**
	 * Returns the TileEntity used by this block.
	 */
	@Override
	public TileEntity createNewTileEntity(World world)
	{
		return new TileEntityEngine();
	}

	@Override
	public void onBlockAdded(World world, int x, int y, int z) {
		TileEntityEngine te = (TileEntityEngine)world.getBlockTileEntity(x, y, z);
		if (te != null) {
			te.temperature = ReikaWorldHelper.getBiomeTemp(world, x, z);
		}
	}
}