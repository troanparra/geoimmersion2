
package net.mcreator.geoimmersion.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fluids.FluidAttributes;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.geoimmersion.init.GeoimmersionModItems;
import net.mcreator.geoimmersion.init.GeoimmersionModFluids;
import net.mcreator.geoimmersion.init.GeoimmersionModBlocks;

public abstract class VolcanoashFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(GeoimmersionModFluids.VOLCANOASH,
			GeoimmersionModFluids.FLOWING_VOLCANOASH,
			FluidAttributes
					.builder(new ResourceLocation("geoimmersion:blocks/volcano_smoke"), new ResourceLocation("geoimmersion:blocks/volcano_smoke"))

					.density(1)

	).explosionResistance(100f)

			.bucket(GeoimmersionModItems.VOLCANOASH_BUCKET).block(() -> (LiquidBlock) GeoimmersionModBlocks.VOLCANOASH.get());

	private VolcanoashFluid() {
		super(PROPERTIES);
	}

	public static class Source extends VolcanoashFluid {
		public Source() {
			super();
		}

		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends VolcanoashFluid {
		public Flowing() {
			super();
		}

		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
