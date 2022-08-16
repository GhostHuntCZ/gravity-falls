
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gravityfalls.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.gravityfalls.item.NeprustrelnnavestaItem;
import net.mcreator.gravityfalls.item.KL90Item;
import net.mcreator.gravityfalls.item.EnergystoneItem;
import net.mcreator.gravityfalls.GravityFallsMod;

public class GravityFallsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, GravityFallsMod.MODID);
	public static final RegistryObject<Item> ENERGYSTONE = REGISTRY.register("energystone", () -> new EnergystoneItem());
	public static final RegistryObject<Item> ENERGYORE = block(GravityFallsModBlocks.ENERGYORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> KL_90 = REGISTRY.register("kl_90", () -> new KL90Item());
	public static final RegistryObject<Item> NEPRUSTRELNNAVESTA_CHESTPLATE = REGISTRY.register("neprustrelnnavesta_chestplate",
			() -> new NeprustrelnnavestaItem.Chestplate());
	public static final RegistryObject<Item> ALIEN = REGISTRY.register("alien_spawn_egg",
			() -> new ForgeSpawnEggItem(GravityFallsModEntities.ALIEN, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> GIRL = REGISTRY.register("girl_spawn_egg",
			() -> new ForgeSpawnEggItem(GravityFallsModEntities.GIRL, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> BOY = REGISTRY.register("boy_spawn_egg",
			() -> new ForgeSpawnEggItem(GravityFallsModEntities.BOY, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
