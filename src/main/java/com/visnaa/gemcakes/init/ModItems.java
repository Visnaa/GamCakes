package com.visnaa.gemcakes.init;

import com.visnaa.gemcakes.Main;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Main.MOD_ID);

    //Items
    public static final RegistryObject<Item> BLUE_FROSTING = ITEMS.register("blue_frosting", () -> new Item(new Item.Properties().group(Main.ITEM_GROUP)));
    public static final RegistryObject<Item> RED_FROSTING = ITEMS.register("red_frosting", () -> new Item(new Item.Properties().group(Main.ITEM_GROUP)));
    public static final RegistryObject<Item> AQUA_FROSTING = ITEMS.register("light_blue_frosting", () -> new Item(new Item.Properties().group(Main.ITEM_GROUP)));
    public static final RegistryObject<Item> GREEN_FROSTING = ITEMS.register("green_frosting", () -> new Item(new Item.Properties().group(Main.ITEM_GROUP)));
    public static final RegistryObject<Item> LIME_FROSTING = ITEMS.register("lime_frosting", () -> new Item(new Item.Properties().group(Main.ITEM_GROUP)));
    public static final RegistryObject<Item> YELLOW_FROSTING = ITEMS.register("yellow_frosting", () -> new Item(new Item.Properties().group(Main.ITEM_GROUP)));
    public static final RegistryObject<Item> BLACK_FROSTING = ITEMS.register("black_frosting", () -> new Item(new Item.Properties().group(Main.ITEM_GROUP)));
    public static final RegistryObject<Item> WHITE_FROSTING = ITEMS.register("white_frosting", () -> new Item(new Item.Properties().group(Main.ITEM_GROUP)));
    public static final RegistryObject<Item> ORANGE_FROSTING = ITEMS.register("orange_frosting", () -> new Item(new Item.Properties().group(Main.ITEM_GROUP)));
    public static final RegistryObject<Item> PURPLE_FROSTING = ITEMS.register("purple_frosting", () -> new Item(new Item.Properties().group(Main.ITEM_GROUP)));
    public static final RegistryObject<Item> PINK_FROSTING = ITEMS.register("pink_frosting", () -> new Item(new Item.Properties().group(Main.ITEM_GROUP)));
    public static final RegistryObject<Item> SUGAR_POWDER = ITEMS.register("sugar_powder", () -> new Item(new Item.Properties().group(Main.ITEM_GROUP)));

    //Block Items
    public static final RegistryObject<BlockItem> RUBY_CAKE = ITEMS.register("ruby_cake", () -> new BlockItem(ModBlocks.RUBY_CAKE.get(), new Item.Properties().group(Main.ITEM_GROUP)));
    public static final RegistryObject<BlockItem> SAPPHIRE_CAKE = ITEMS.register("sapphire_cake", () -> new BlockItem(ModBlocks.SAPPHIRE_CAKE.get(), new Item.Properties().group(Main.ITEM_GROUP)));
    public static final RegistryObject<BlockItem> AQUAMARINE_CAKE = ITEMS.register("aquamarine_cake", () -> new BlockItem(ModBlocks.AQUAMARINE_CAKE.get(), new Item.Properties().group(Main.ITEM_GROUP)));
    public static final RegistryObject<BlockItem> JADE_CAKE = ITEMS.register("jade_cake", () -> new BlockItem(ModBlocks.JADE_CAKE.get(), new Item.Properties().group(Main.ITEM_GROUP)));
    public static final RegistryObject<BlockItem> OPAL_CAKE = ITEMS.register("opal_cake", () -> new BlockItem(ModBlocks.OPAL_CAKE.get(), new Item.Properties().group(Main.ITEM_GROUP)));
    public static final RegistryObject<BlockItem> YELLOW_DIAMOND_CAKE = ITEMS.register("yellow_diamond_cake", () -> new BlockItem(ModBlocks.YELLOW_DIAMOND_CAKE.get(), new Item.Properties().group(Main.ITEM_GROUP)));
    public static final RegistryObject<BlockItem> AMBER_CAKE = ITEMS.register("amber_cake", () -> new BlockItem(ModBlocks.AMBER_CAKE.get(), new Item.Properties().group(Main.ITEM_GROUP)));
    public static final RegistryObject<BlockItem> AMETHYST_CAKE = ITEMS.register("amethyst_cake", () -> new BlockItem(ModBlocks.AMETHYST_CAKE.get(), new Item.Properties().group(Main.ITEM_GROUP)));
    public static final RegistryObject<BlockItem> TOPAZ_CAKE = ITEMS.register("topaz_cake", () -> new BlockItem(ModBlocks.TOPAZ_CAKE.get(), new Item.Properties().group(Main.ITEM_GROUP)));
    public static final RegistryObject<BlockItem> PLATINUM_CAKE = ITEMS.register("platinum_cake", () -> new BlockItem(ModBlocks.PLATINUM_CAKE.get(), new Item.Properties().group(Main.ITEM_GROUP)));
    public static final RegistryObject<BlockItem> BERYLLIUM_CAKE = ITEMS.register("beryllium_cake", () -> new BlockItem(ModBlocks.BERYLLIUM_CAKE.get(), new Item.Properties().group(Main.ITEM_GROUP)));
    public static final RegistryObject<BlockItem> BIXBIT_CAKE = ITEMS.register("bixbit_cake", () -> new BlockItem(ModBlocks.BIXBIT_CAKE.get(), new Item.Properties().group(Main.ITEM_GROUP)));
    public static final RegistryObject<BlockItem> MALACHITE_CAKE = ITEMS.register("malachite_cake", () -> new BlockItem(ModBlocks.MALACHITE_CAKE.get(), new Item.Properties().group(Main.ITEM_GROUP)));
    public static final RegistryObject<BlockItem> ONYX_CAKE = ITEMS.register("onyx_cake", () -> new BlockItem(ModBlocks.ONYX_CAKE.get(), new Item.Properties().group(Main.ITEM_GROUP)));
    public static final RegistryObject<BlockItem> PERIDOT_CAKE = ITEMS.register("peridot_cake", () -> new BlockItem(ModBlocks.PERIDOT_CAKE.get(), new Item.Properties().group(Main.ITEM_GROUP)));
    public static final RegistryObject<BlockItem> MOON_STONE_CAKE = ITEMS.register("moon_stone_cake", () -> new BlockItem(ModBlocks.MOON_STONE_CAKE.get(), new Item.Properties().group(Main.ITEM_GROUP)));
    public static final RegistryObject<BlockItem> SUN_STONE_CAKE = ITEMS.register("sun_stone_cake", () -> new BlockItem(ModBlocks.SUN_STONE_CAKE.get(), new Item.Properties().group(Main.ITEM_GROUP)));
}
