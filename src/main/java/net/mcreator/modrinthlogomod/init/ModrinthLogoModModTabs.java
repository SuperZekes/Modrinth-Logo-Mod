
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.modrinthlogomod.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.modrinthlogomod.ModrinthLogoModMod;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;

public class ModrinthLogoModModTabs {
	public static ResourceKey<CreativeModeTab> TAB_MODRINTH_LOGO_MOD = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(ModrinthLogoModMod.MODID, "modrinth_logo_mod"));

	public static void load() {
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, TAB_MODRINTH_LOGO_MOD,
				FabricItemGroup.builder().title(Component.translatable("item_group." + ModrinthLogoModMod.MODID + ".modrinth_logo_mod")).icon(() -> new ItemStack(ModrinthLogoModModItems.MODRINTH_LOGO)).build());
	}
}
