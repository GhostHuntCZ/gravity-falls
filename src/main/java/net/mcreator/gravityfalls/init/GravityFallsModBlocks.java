
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gravityfalls.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.gravityfalls.block.EnergyoreBlock;
import net.mcreator.gravityfalls.block.EnergyblockBlock;
import net.mcreator.gravityfalls.GravityFallsMod;

public class GravityFallsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, GravityFallsMod.MODID);
	public static final RegistryObject<Block> ENERGYORE = REGISTRY.register("energyore", () -> new EnergyoreBlock());
	public static final RegistryObject<Block> ENERGYBLOCK = REGISTRY.register("energyblock", () -> new EnergyblockBlock());
}
