package me.deejayarroba.craftheads;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class MainMenu {

	private String menuTitle = "CraftHeads Menu";
	private Inventory menu;
	private MenuItemManager menuItemManager = new MenuItemManager();

	public MainMenu() {
		menuItemManager.createMenuItem("Get your own head!", null, Material.SKULL_ITEM, (short) 3);
		menuItemManager.createMenuItem("Extra heads", null, Material.CAKE, (short) 0);
		menuItemManager.createMenuItem("Get someone else's head", null, Material.GOLDEN_APPLE, (short) 0);

		menu = Bukkit.createInventory(null, 9, menuTitle);
		for(MenuItem menuItem : menuItemManager.getMenuItems()) {
			ItemStack itemStack = menuItem.getItemStack();
			menu.addItem(itemStack);
		}
	}

	public Inventory getMenu() {
		return menu;
	}

	public String getMenuTitle() {
		return menuTitle;
	}

	public MenuItemManager getManager() {
		return menuItemManager;
	}

}
