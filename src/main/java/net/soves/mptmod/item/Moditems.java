package net.soves.mptmod.item;


import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryBuilder;
import net.minecraftforge.registries.RegistryObject;
import net.soves.mptmod.MptMod;

import javax.tools.Tool;

public class Moditems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MptMod.MOD_ID);

    public static final RegistryObject<Item> HEXTEC = ITEMS.register("hextec",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.MPT_TAB)));

    public static final RegistryObject<Item> RAW_HEXTEC = ITEMS.register("raw_hextec",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.MPT_TAB)));

    public static final RegistryObject<PickaxeItem> HEXTEC_PICKAXE = ITEMS.register("hextec_pickaxe",
            ()-> new PickaxeItem(Tiers.IRON,1, -3, new Item.Properties().tab(ModCreativeModeTab.MPT_TAB)));

    public static final RegistryObject<AxeItem> HEXTEC_AXE = ITEMS.register("hextec_axe",
            ()-> new AxeItem(Tiers.IRON,6, -3, new Item.Properties().tab(ModCreativeModeTab.MPT_TAB)));

    public static final RegistryObject<ShovelItem> HEXTEC_SHOVEL = ITEMS.register("hextec_shovel",
            ()-> new ShovelItem(Tiers.IRON,1, -3, new Item.Properties().tab(ModCreativeModeTab.MPT_TAB)));

    public static final RegistryObject<HoeItem> HEXTEC_HOE = ITEMS.register("hextec_hoe",
            ()-> new HoeItem(Tiers.IRON,-1, -1, new Item.Properties().tab(ModCreativeModeTab.MPT_TAB)));

    public static final RegistryObject<SwordItem> HEXTEC_SWORD = ITEMS.register("hextec_sword",
            ()-> new SwordItem(Tiers.IRON,3, -3f, new Item.Properties().tab(ModCreativeModeTab.MPT_TAB)));

    public static final RegistryObject<ArmorItem> HEXTEC_HELMET = ITEMS.register("hextec_helmet",
            ()-> new ArmorItem(ArmorMaterials.GOLD,EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeModeTab.MPT_TAB)));

    public static final RegistryObject<ArmorItem> HEXTEC_CHESTPLATE = ITEMS.register("hextec_chestplate",
            ()-> new ArmorItem(ArmorMaterials.GOLD,EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeModeTab.MPT_TAB)));

    public static final RegistryObject<ArmorItem> HEXTEC_LEGGINGS = ITEMS.register("hextec_leggings",
            ()-> new ArmorItem(ArmorMaterials.GOLD,EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeModeTab.MPT_TAB)));

    public static final RegistryObject<ArmorItem> HEXTEC_BOOTS = ITEMS.register("hextec_boots",
            ()-> new ArmorItem(ArmorMaterials.GOLD,EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeModeTab.MPT_TAB)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
