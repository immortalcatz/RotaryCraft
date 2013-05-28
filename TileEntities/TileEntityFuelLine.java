/*******************************************************************************
 * @author Reika
 * 
 * Copyright 2013
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
package Reika.RotaryCraft.TileEntities;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import Reika.DragonAPI.Libraries.ReikaMathLibrary;
import Reika.RotaryCraft.MachineRegistry;
import Reika.RotaryCraft.Base.TileEntityPiping;

public class TileEntityFuelLine extends TileEntityPiping {

	public int fuel = 0;
	public int oldfuel = 0;

	@Override
	public void updateEntity(World world, int x, int y, int z, int meta) {
		this.draw(world, x, y, z);
		this.transfer(world, x, y, z);
		if (fuel < 0)
			fuel = 0;
	}

	public void draw(World world, int x, int y, int z) {
		if (MachineRegistry.getMachine(world, x+1, y, z) == MachineRegistry.FRACTIONATOR) {
			TileEntityFractionator tile = (TileEntityFractionator)world.getBlockTileEntity(x+1, y, z);
			if (tile != null) {
				if (tile.fuel > fuel) {
					oldfuel = tile.fuel;
					tile.fuel = ReikaMathLibrary.extrema(tile.fuel-tile.fuel, 0, "max");
					fuel = ReikaMathLibrary.extrema(fuel+oldfuel, 0, "max");
				}
			}
		}
		if (MachineRegistry.getMachine(world, x-1, y, z) == MachineRegistry.FRACTIONATOR) {
			TileEntityFractionator tile = (TileEntityFractionator)world.getBlockTileEntity(x-1, y, z);
			if (tile != null) {
				if (tile.fuel > fuel) {
					oldfuel = tile.fuel;
					tile.fuel = ReikaMathLibrary.extrema(tile.fuel-tile.fuel, 0, "max");
					fuel = ReikaMathLibrary.extrema(fuel+oldfuel, 0, "max");
				}
			}
		}
		if (MachineRegistry.getMachine(world, x, y+1, z) == MachineRegistry.FRACTIONATOR) {
			TileEntityFractionator tile = (TileEntityFractionator)world.getBlockTileEntity(x, y+1, z);
			if (tile != null) {
				if (tile.fuel > fuel) {
					oldfuel = tile.fuel;
					tile.fuel = ReikaMathLibrary.extrema(tile.fuel-tile.fuel, 0, "max");
					fuel = ReikaMathLibrary.extrema(fuel+oldfuel, 0, "max");
				}
			}
		}
		if (MachineRegistry.getMachine(world, x, y-1, z) == MachineRegistry.FRACTIONATOR) {
			TileEntityFractionator tile = (TileEntityFractionator)world.getBlockTileEntity(x, y-1, z);
			if (tile != null) {
				if (tile.fuel > fuel) {
					oldfuel = tile.fuel;
					tile.fuel = ReikaMathLibrary.extrema(tile.fuel-tile.fuel, 0, "max");
					fuel = ReikaMathLibrary.extrema(fuel+oldfuel, 0, "max");
				}
			}
		}
		if (MachineRegistry.getMachine(world, x, y, z+1) == MachineRegistry.FRACTIONATOR) {
			TileEntityFractionator tile = (TileEntityFractionator)world.getBlockTileEntity(x, y, z+1);
			if (tile != null) {
				if (tile.fuel > fuel) {
					oldfuel = tile.fuel;
					tile.fuel = ReikaMathLibrary.extrema(tile.fuel-tile.fuel, 0, "max");
					fuel = ReikaMathLibrary.extrema(fuel+oldfuel, 0, "max");
				}
			}
		}
		if (MachineRegistry.getMachine(world, x, y, z-1) == MachineRegistry.FRACTIONATOR) {
			TileEntityFractionator tile = (TileEntityFractionator)world.getBlockTileEntity(x, y, z-1);
			if (tile != null) {
				if (tile.fuel > fuel) {
					oldfuel = tile.fuel;
					tile.fuel = ReikaMathLibrary.extrema(tile.fuel-tile.fuel, 0, "max");
					fuel = ReikaMathLibrary.extrema(fuel+oldfuel, 0, "max");
				}
			}
		}
	}

	public void transfer(World world, int x, int y, int z) {
		if (MachineRegistry.getMachine(world, x+1, y, z) == MachineRegistry.FUELLINE) {
			TileEntityFuelLine tile = (TileEntityFuelLine)world.getBlockTileEntity(x+1, y, z);
			if (tile != null) {
				if (tile.fuel > fuel) {
					oldfuel = tile.fuel;
					tile.fuel = ReikaMathLibrary.extrema(tile.fuel-(tile.fuel-fuel), 0, "max");
					fuel = ReikaMathLibrary.extrema(fuel+(oldfuel-fuel), 0, "max");
				}
			}
		}
		if (MachineRegistry.getMachine(world, x-1, y, z) == MachineRegistry.FUELLINE) {
			TileEntityFuelLine tile = (TileEntityFuelLine)world.getBlockTileEntity(x-1, y, z);
			if (tile != null) {
				if (tile.fuel > fuel) {
					oldfuel = tile.fuel;
					tile.fuel = ReikaMathLibrary.extrema(tile.fuel-(tile.fuel-fuel)/4, 0, "max");
					fuel = ReikaMathLibrary.extrema(fuel+(oldfuel-fuel)/4, 0, "max");
				}
			}
		}
		if (MachineRegistry.getMachine(world, x, y+1, z) == MachineRegistry.FUELLINE) {
			TileEntityFuelLine tile = (TileEntityFuelLine)world.getBlockTileEntity(x, y+1, z);
			if (tile != null) {
				if (tile.fuel > fuel) {
					oldfuel = tile.fuel;
					tile.fuel = ReikaMathLibrary.extrema(tile.fuel-(tile.fuel-fuel)/4, 0, "max");
					fuel = ReikaMathLibrary.extrema(fuel+(oldfuel-fuel)/4, 0, "max");
				}
			}
		}
		if (MachineRegistry.getMachine(world, x, y-1, z) == MachineRegistry.FUELLINE) {
			TileEntityFuelLine tile = (TileEntityFuelLine)world.getBlockTileEntity(x, y-1, z);
			if (tile != null) {
				if (tile.fuel > fuel) {
					oldfuel = tile.fuel;
					tile.fuel = ReikaMathLibrary.extrema(tile.fuel-(tile.fuel-fuel)/4, 0, "max");
					fuel = ReikaMathLibrary.extrema(fuel+(oldfuel-fuel)/4, 0, "max");
				}
			}
		}
		if (MachineRegistry.getMachine(world, x, y, z+1) == MachineRegistry.FUELLINE) {
			TileEntityFuelLine tile = (TileEntityFuelLine)world.getBlockTileEntity(x, y, z+1);
			if (tile != null) {
				if (tile.fuel > fuel) {
					oldfuel = tile.fuel;
					tile.fuel = ReikaMathLibrary.extrema(tile.fuel-(tile.fuel-fuel)/4, 0, "max");
					fuel = ReikaMathLibrary.extrema(fuel+(oldfuel-fuel)/4, 0, "max");
				}
			}
		}
		if (MachineRegistry.getMachine(world, x, y, z-1) == MachineRegistry.FUELLINE) {
			TileEntityFuelLine tile = (TileEntityFuelLine)world.getBlockTileEntity(x, y, z-1);
			if (tile != null) {
				if (tile.fuel > fuel) {
					oldfuel = tile.fuel;
					tile.fuel = ReikaMathLibrary.extrema(tile.fuel-(tile.fuel-fuel)/4, 0, "max");
					fuel = ReikaMathLibrary.extrema(fuel+(oldfuel-fuel)/4, 0, "max");
				}
			}
		}
	}

	/**
	 * Writes a tile entity to NBT.
	 */
	@Override
	public void writeToNBT(NBTTagCompound NBT)
	{
		super.writeToNBT(NBT);
		NBT.setInteger("fuel", fuel);
	}

	/**
	 * Reads a tile entity from NBT.
	 */
	@Override
	public void readFromNBT(NBTTagCompound NBT)
	{
		super.readFromNBT(NBT);
		fuel = NBT.getInteger("fuel");

		if (fuel < 0)
		{
			fuel = 0;
		}
	}

	@Override
	public int getMachineIndex() {
		return MachineRegistry.FUELLINE.ordinal();
	}
}