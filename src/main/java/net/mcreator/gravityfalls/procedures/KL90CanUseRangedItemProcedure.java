package net.mcreator.gravityfalls.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class KL90CanUseRangedItemProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			Entity _ent = entity;
			if (!_ent.level.isClientSide() && _ent.getServer() != null) {
				Optional<CommandFunction> _fopt = _ent.getServer().getFunctions().get(new ResourceLocation("gravity_falls:arrow_effects"));
				if (_fopt.isPresent())
					_ent.getServer().getFunctions().execute(_fopt.get(), _ent.createCommandSourceStack());
			}
		}
	}
}
