package net.bluebarracuda.weapons;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Nonnull;

@Mod("weapons")
public class WeaponsMain
{
    public static final String MOD_ID = "weapons";
    public static final Logger LOGGER = LogManager.getLogger();

    public WeaponsMain()
    {
        DistExecutor.runForDist(
                () -> SideProxy.Client::new,
                () -> SideProxy.Server::new);
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::setupClient);
        modEventBus.addListener(this::setupCommon);

        public void setupClient(FMLClientSetupEvent event)
        {
            //DistExecutor.runWhenOn(Dist.CLIENT, () -> WeaponsMain::registerParticleFactories);
            //DistExecutor.runWhenOn(Dist.CLIENT, () -> WeaponsMain::registerEntityRenderers);
            //DistExecutor.runWhenOn(Dist.CLIENT, () -> WeaponsMain::registerTileEntityRenderers);
            //LOGGER.debug("Common setup - Renderers");
            //DistExecutor.runWhenOn(Dist.CLIENT, () -> WeaponsMain::registerFilters);
        }
    }
    }

}