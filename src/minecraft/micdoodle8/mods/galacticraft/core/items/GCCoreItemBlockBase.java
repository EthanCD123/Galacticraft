package micdoodle8.mods.galacticraft.core.items;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class GCCoreItemBlockBase extends ItemBlock
{
	public GCCoreItemBlockBase(int i)
	{
		super(i);
        this.setMaxDamage(0);
        this.setHasSubtypes(true);
	}
	
	@Override
	public int getMetadata(int meta)
    {
        return meta;
    }

	@Override
	public String getItemNameIS(ItemStack itemstack)
	{
		String name = "";
		
		switch(itemstack.getItemDamage())
		{
		case 0:
		{
			name = "copperblock";
			break;
		}
		case 1:
		{
			name = "aluminiumblock";
			break;
		}
		case 2:
		{
			name = "titaniumblock";
			break;
		}
		case 3:
		{
			name = "decoblock1";
			break;
		}
		case 4:
		{
			name = "decoblock2";
			break;
		}
		default:
			name = "null";
		}
		return this.getItemName() + "." + name;
	}
}
