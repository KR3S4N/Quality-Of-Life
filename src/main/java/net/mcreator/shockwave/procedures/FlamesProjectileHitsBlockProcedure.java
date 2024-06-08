package net.mcreator.shockwave.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.BlockPos;

public class FlamesProjectileHitsBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.FIRE.defaultBlockState(), 3);
		world.setBlock(BlockPos.containing(Mth.nextInt(RandomSource.create(), (int) (x - 1), (int) (x + 1)), y + 1, Mth.nextInt(RandomSource.create(), (int) (z - 1), (int) (z + 1))), Blocks.FIRE.defaultBlockState(), 3);
	}
}
