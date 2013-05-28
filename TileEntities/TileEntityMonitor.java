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

import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import Reika.RotaryCraft.MachineRegistry;
import Reika.RotaryCraft.Base.RotaryModelBase;
import Reika.RotaryCraft.Base.TileEntity1DTransmitter;
import Reika.RotaryCraft.Models.ModelMonitor;

public class TileEntityMonitor extends TileEntity1DTransmitter {

	public void readFromSplitter(TileEntitySplitter spl) { //Complex enough to deserve its own function
		int ratio = spl.getRatioFromMode();
		if (ratio == 0)
			return;
		boolean favorbent = false;
		if (ratio < 0) {
			favorbent = true;
			ratio = -ratio;
		}
		if (xCoord == spl.writeinline[0] && zCoord == spl.writeinline[1]) { //We are the inline
			omega = spl.omega; //omega always constant
			if (ratio == 1) { //Even split, favorbent irrelevant
				torque = spl.torque/2;
				return;
			}
			if (favorbent) {
				torque = spl.torque/ratio;
			}
			else {
				torque = (int)(spl.torque*((ratio-1D)/(ratio)));
			}
		}
		else if (xCoord == spl.writebend[0] && zCoord == spl.writebend[1]) { //We are the bend
			omega = spl.omega; //omega always constant
			if (ratio == 1) { //Even split, favorbent irrelevant
				torque = spl.torque/2;
				return;
			}
			if (favorbent) {
				torque = (int)(spl.torque*((ratio-1D)/(ratio)));
			}
			else {
				torque = spl.torque/ratio;
			}
		}
		else //We are not one of its write-to blocks
			return;
	}

	@Override
	public void updateEntity(World world, int x, int y, int z, int meta) {
		super.updateTileEntity();
		power = omega*torque;
		this.getIOSides(world, x, y, z, meta, false);
		this.transferPower(world, x, y, z, meta);
		//ModLoader.getMinecraftInstance().thePlayer.addChatMessage(String.format("%d", this.ratio));
	}

	public void readFromCross(TileEntityShaft cross) {
		if (xCoord == cross.writex && zCoord == cross.writez) {
			omega = cross.readomega[0];
			torque = cross.readtorque[0];
		}
		else if (xCoord == cross.writex2 && zCoord == cross.writez2) {
			omega = cross.readomega[1];
			torque = cross.readtorque[1];
		}
		else
			return; //not its output
	}

	@Override
	public void transferPower(World world, int x, int y, int z, int meta) {
		omegain = torquein = 0;
		MachineRegistry m = MachineRegistry.getMachine(world, readx, y, readz);
		TileEntity te = worldObj.getBlockTileEntity(readx, ready, readz);
		if (this.isProvider(te) && this.isIDTEMatch(world, readx, ready, readz)) {
			if (m == MachineRegistry.SHAFT) {
				TileEntityShaft devicein = (TileEntityShaft)world.getBlockTileEntity(readx, y, readz);
				if (devicein.getBlockMetadata() >= 6) {
					this.readFromCross(devicein);
					return;
				}
				if (devicein.writex == x && devicein.writey == y && devicein.writez == z) {
					torquein = devicein.torque;
					omegain = devicein.omega;
				}
			}
			if (m == MachineRegistry.ENGINE) {
				TileEntityEngine devicein = (TileEntityEngine)world.getBlockTileEntity(readx, y, readz);
				if ((devicein.writex == x && devicein.writez == z)) {
					torquein = devicein.torque;
					omegain = devicein.omega;
				}
			}
			if (m == MachineRegistry.ADVANCEDGEARS) {
				TileEntityAdvancedGear devicein = (TileEntityAdvancedGear)world.getBlockTileEntity(readx, y, readz);
				if ((devicein.writex == x && devicein.writez == z)) {
					torquein = devicein.torque;
					omegain = devicein.omega;
				}
			}
			if (m == MachineRegistry.WINDER) {
				TileEntityWinder devicein = (TileEntityWinder)world.getBlockTileEntity(readx, y, readz);
				if ((devicein.writex == x && devicein.writez == z)) {
					torquein = devicein.torque;
					omegain = devicein.omega;
				}
			}
			if (m == MachineRegistry.SPLITTER) {
				TileEntitySplitter devicein = (TileEntitySplitter)world.getBlockTileEntity(readx, y, readz);
				if (devicein.getBlockMetadata() >= 8) {
					this.readFromSplitter(devicein);
					return;
				}
				else if (devicein.writex == x && devicein.writez == z) {
					torquein = devicein.torque;
					omegain = devicein.omega;
				}
			}
			if (m == MachineRegistry.CLUTCH) {
				TileEntityClutch devicein = (TileEntityClutch)world.getBlockTileEntity(readx, y, readz);
				if (devicein.writex == x && devicein.writez == z) {
					torquein = devicein.torque;
					omegain = devicein.omega;
				}
			}
			if (m == MachineRegistry.FLYWHEEL) {
				TileEntityFlywheel devicein = (TileEntityFlywheel)world.getBlockTileEntity(readx, y, readz);
				if (devicein.writex == x && devicein.writez == z) {
					torquein = devicein.torque;
					omegain = devicein.omega;
				}
			}
			if (m == MachineRegistry.DYNAMOMETER) {
				TileEntityMonitor devicein = (TileEntityMonitor)world.getBlockTileEntity(readx, y, readz);
				if (devicein.writex == x && devicein.writez == z) {
					torquein = devicein.torque;
					omegain = devicein.omega;
				}
			}
			if (m == MachineRegistry.GEARBOX) {
				TileEntityGearbox devicein = (TileEntityGearbox)world.getBlockTileEntity(readx, y, readz);
				if (devicein.writex == x && devicein.writez == z) {
					torquein = devicein.torque;
					omegain = devicein.omega;
				}
			}
			if (m == MachineRegistry.BEVELGEARS) {
				TileEntityGearBevel devicein = (TileEntityGearBevel)world.getBlockTileEntity(readx, y, readz);
				if (devicein.writex == x && devicein.writey == y && devicein.writez == z) {
					torquein = devicein.torque;
					omegain = devicein.omega;
				}
			}
			omega = omegain;
			torque = torquein;
		}
		else {
			omega = torque = 0;
		}
	}

	@Override
	public boolean hasModelTransparency() {
		return false;
	}

	@Override
	public RotaryModelBase getTEModel(World world, int x, int y, int z) {
		return new ModelMonitor();
	}

	@Override
	public void animateWithTick(World world, int x, int y, int z) {

	}

	@Override
	public int getMachineIndex() {
		return MachineRegistry.DYNAMOMETER.ordinal();
	}
}