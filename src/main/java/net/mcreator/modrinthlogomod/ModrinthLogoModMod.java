/*
 *	MCreator note:
 *
 *	If you lock base mod element files, you can edit this file and the proxy files
 *	and they won't get overwritten. If you change your mod package or modid, you
 *	need to apply these changes to this file MANUALLY.
 *
 *
 *	If you do not lock base mod element files in Workspace settings, this file
 *	will be REGENERATED on each build.
 *
 */
package net.mcreator.modrinthlogomod;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.mcreator.modrinthlogomod.init.ModrinthLogoModModTabs;
import net.mcreator.modrinthlogomod.init.ModrinthLogoModModItems;

import net.fabricmc.api.ModInitializer;

public class ModrinthLogoModMod implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MODID = "modrinth_logo_mod";

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing ModrinthLogoModMod");

		ModrinthLogoModModTabs.load();

		ModrinthLogoModModItems.load();

	}
}
