package net.penrose.realmofpenrose.item;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.penrose.realmofpenrose.RealmofPenrose;

public class ModItems {

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(RealmofPenrose.MOD_ID, name), item);
    }

    public static void registerModItems() {
        RealmofPenrose.LOGGER.info("Registering Mod Items for " + RealmofPenrose.MOD_ID);
    }
}
