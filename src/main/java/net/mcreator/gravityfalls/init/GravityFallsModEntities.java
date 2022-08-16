
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gravityfalls.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.gravityfalls.entity.KL90Entity;
import net.mcreator.gravityfalls.entity.GirlEntity;
import net.mcreator.gravityfalls.entity.BoyEntity;
import net.mcreator.gravityfalls.entity.AlienEntity;
import net.mcreator.gravityfalls.GravityFallsMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class GravityFallsModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, GravityFallsMod.MODID);
	public static final RegistryObject<EntityType<KL90Entity>> KL_90 = register("projectile_kl_90",
			EntityType.Builder.<KL90Entity>of(KL90Entity::new, MobCategory.MISC).setCustomClientFactory(KL90Entity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<AlienEntity>> ALIEN = register("alien",
			EntityType.Builder.<AlienEntity>of(AlienEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(AlienEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GirlEntity>> GIRL = register("girl",
			EntityType.Builder.<GirlEntity>of(GirlEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(GirlEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BoyEntity>> BOY = register("boy",
			EntityType.Builder.<BoyEntity>of(BoyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(BoyEntity::new)

					.sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			AlienEntity.init();
			GirlEntity.init();
			BoyEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(ALIEN.get(), AlienEntity.createAttributes().build());
		event.put(GIRL.get(), GirlEntity.createAttributes().build());
		event.put(BOY.get(), BoyEntity.createAttributes().build());
	}
}
