package micdoodle8.mods.galacticraft.core.tile;

import micdoodle8.mods.galacticraft.core.items.GCCoreItemFuelCanister;
import micdoodle8.mods.galacticraft.core.items.GCCoreItems;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class GCCoreSlotFuel extends Slot
{
	public GCCoreSlotFuel(IInventory par1iInventory, int par2, int par3, int par4) 
	{
		super(par1iInventory, par2, par3, par4);
	}
    
    public boolean isItemValid(ItemStack par1ItemStack)
    {
    	if (par1ItemStack.getItem() instanceof GCCoreItemFuelCanister && par1ItemStack.getItemDamage() > 0)
    	{
            return true;
    	}

        return false;
    }
}
