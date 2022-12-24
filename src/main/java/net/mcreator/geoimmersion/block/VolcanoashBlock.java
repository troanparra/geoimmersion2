
package net.mcreator.geoimmersion.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.geoimmersion.init.GeoimmersionModFluids;

public class VolcanoashBlock extends LiquidBlock {
	public VolcanoashBlock() {
		super(() -> (FlowingFluid) GeoimmersionModFluids.VOLCANOASH.get(), BlockBehaviour.Properties.of(Material.WATER).strength(100f)

		);
	}
}
