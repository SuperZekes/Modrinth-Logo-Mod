
package net.mcreator.modrinthlogomod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.modrinthlogomod.init.ModrinthLogoModModTabs;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

public class ModrinthLogoItem extends Item {
	public ModrinthLogoItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.EPIC));
		ItemGroupEvents.modifyEntriesEvent(ModrinthLogoModModTabs.TAB_MODRINTH_LOGO_MOD).register(content -> content.accept(this));
	}

	@Override
	public int getEnchantmentValue() {
		return 1;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
