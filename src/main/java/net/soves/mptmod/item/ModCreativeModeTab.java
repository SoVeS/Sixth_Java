package net.soves.mptmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab MPT_TAB = new CreativeModeTab("mpttab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Moditems.HEXTEC.get());
        }
    } ;
}
