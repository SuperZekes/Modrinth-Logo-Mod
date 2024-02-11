/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.modrinthlogomod.init;

import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.modrinthlogomod.item.ModrinthLogoItem;
import net.mcreator.modrinthlogomod.ModrinthLogoModMod;

public class ModrinthLogoModModItems {
	public static Item MODRINTH_LOGO;

	public static void load() {
		MODRINTH_LOGO = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(ModrinthLogoModMod.MODID, "modrinth_logo"), new ModrinthLogoItem());
	}

	public static void clientLoad() {
	}
}
