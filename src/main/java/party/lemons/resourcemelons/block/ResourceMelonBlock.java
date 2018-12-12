package party.lemons.resourcemelons.block;

import net.minecraft.block.*;

public class ResourceMelonBlock extends GourdBlock
{
	private ResourceStemBlock stem;
	private ResourceStemAttachedBlock stem_attached;

	public ResourceMelonBlock()
	{
		super(Block.Settings.create(Material.STONE, MaterialColor.STONE).setStrength(1F, 0F));
	}

	@Override
	public StemBlock method_10679()
	{
		return stem;
	}

	@Override
	public StemAttachedBlock method_10680()
	{
		return stem_attached;
	}

	public void setStem(ResourceStemBlock stem, ResourceStemAttachedBlock stem_attached)
	{
		this.stem = stem;
		this.stem_attached = stem_attached;
	}
}