
package net.mcreator.geoimmersion.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fluids.FluidAttributes;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.ParticleOptions;

import net.mcreator.geoimmersion.init.GeoimmersionModItems;
import net.mcreator.geoimmersion.init.GeoimmersionModFluids;
import net.mcreator.geoimmersion.init.GeoimmersionModBlocks;

public abstract class BasalticLavaFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(GeoimmersionModFluids.BASALTIC_LAVA,
			GeoimmersionModFluids.FLOWING_BASALTIC_LAVA,
			FluidAttributes
					.builder(new ResourceLocation("geoimmersion:blocks/lavabasaltica_still"),
							new ResourceLocation("geoimmersion:blocks/lavabasaltica_flow"))
					.luminosity(10)

					.viscosity(20000).temperature(1000)

	).explosionResistance(100f)

			.tickRate(30).levelDecreasePerBlock(2).slopeFindDistance(3).bucket(GeoimmersionModItems.BASALTIC_LAVA_BUCKET)
			.block(() -> (LiquidBlock) GeoimmersionModBlocks.BASALTIC_LAVA.get());

	private BasalticLavaFluid() {
		super(PROPERTIES);
	}

	@Override
	public ParticleOptions getDripParticle() {
		return ParticleTypes.DRIPPING_LAVA;
	}

	public static class Source extends BasalticLavaFluid {
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

	public static class Flowing extends BasalticLavaFluid {
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
