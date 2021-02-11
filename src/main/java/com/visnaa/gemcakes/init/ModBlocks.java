package com.visnaa.gemcakes.init;

import com.visnaa.gemcakes.Main;
import net.minecraft.block.Block;
import net.minecraft.block.CakeBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks
{
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Main.MOD_ID);

    //Cakes
    public static final RegistryObject<CakeBlock> RUBY_CAKE = BLOCKS.register("ruby_cake", () -> new CakeBlock(Block.Properties.create(Material.CAKE).hardnessAndResistance(0.5f, 0.5f).sound(SoundType.CLOTH)));
    public static final RegistryObject<CakeBlock> SAPPHIRE_CAKE = BLOCKS.register("sapphire_cake", () -> new CakeBlock(Block.Properties.create(Material.CAKE).hardnessAndResistance(0.5f, 0.5f).sound(SoundType.CLOTH)));
    public static final RegistryObject<CakeBlock> AQUAMARINE_CAKE = BLOCKS.register("aquamarine_cake", () -> new CakeBlock(Block.Properties.create(Material.CAKE).hardnessAndResistance(0.5f, 0.5f).sound(SoundType.CLOTH)));
    public static final RegistryObject<CakeBlock> JADE_CAKE = BLOCKS.register("jade_cake", () -> new CakeBlock(Block.Properties.create(Material.CAKE).hardnessAndResistance(0.5f, 0.5f).sound(SoundType.CLOTH)));
    public static final RegistryObject<CakeBlock> OPAL_CAKE = BLOCKS.register("opal_cake", () -> new CakeBlock(Block.Properties.create(Material.CAKE).hardnessAndResistance(0.5f, 0.5f).sound(SoundType.CLOTH)));
    public static final RegistryObject<CakeBlock> YELLOW_DIAMOND_CAKE = BLOCKS.register("yellow_diamond_cake", () -> new CakeBlock(Block.Properties.create(Material.CAKE).hardnessAndResistance(0.5f, 0.5f).sound(SoundType.CLOTH)));
    public static final RegistryObject<CakeBlock> AMBER_CAKE = BLOCKS.register("amber_cake", () -> new CakeBlock(Block.Properties.create(Material.CAKE).hardnessAndResistance(0.5f, 0.5f).sound(SoundType.CLOTH)));
    public static final RegistryObject<CakeBlock> AMETHYST_CAKE = BLOCKS.register("amethyst_cake", () -> new CakeBlock(Block.Properties.create(Material.CAKE).hardnessAndResistance(0.5f, 0.5f).sound(SoundType.CLOTH)));
    public static final RegistryObject<CakeBlock> TOPAZ_CAKE = BLOCKS.register("topaz_cake", () -> new CakeBlock(Block.Properties.create(Material.CAKE).hardnessAndResistance(0.5f, 0.5f).sound(SoundType.CLOTH)));
    public static final RegistryObject<CakeBlock> PLATINUM_CAKE = BLOCKS.register("platinum_cake", () -> new CakeBlock(Block.Properties.create(Material.CAKE).hardnessAndResistance(0.5f, 0.5f).sound(SoundType.CLOTH)));
    public static final RegistryObject<CakeBlock> BERYLLIUM_CAKE = BLOCKS.register("beryllium_cake", () -> new CakeBlock(Block.Properties.create(Material.CAKE).hardnessAndResistance(0.5f, 0.5f).sound(SoundType.CLOTH)));
    public static final RegistryObject<CakeBlock> BIXBIT_CAKE = BLOCKS.register("bixbit_cake", () -> new CakeBlock(Block.Properties.create(Material.CAKE).hardnessAndResistance(0.5f, 0.5f).sound(SoundType.CLOTH)));
    public static final RegistryObject<CakeBlock> MALACHITE_CAKE = BLOCKS.register("malachite_cake", () -> new CakeBlock(Block.Properties.create(Material.CAKE).hardnessAndResistance(0.5f, 0.5f).sound(SoundType.CLOTH)));
}
