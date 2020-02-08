package net.bluebarracuda.weapons;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLDedicatedServerSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

public class SideProxy
{
    public SideProxy() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(SideProxy::commonSetup);

        //FMLJavaModLoadingContext.get().getModEventBus().addListener(ModBlocks::registerAll);
        //FMLJavaModLoadingContext.get().getModEventBus().addListener(ModItems::registerAll);

        //FMLJavaModLoadingContext.get().getModEventBus().addListener(ModTileEntities::registerAll);

        MinecraftForge.EVENT_BUS.addListener(SideProxy::serverStarting);
    }

    private static void commonSetup(FMLCommonSetupEvent event) {

    }

    private static void serverStarting(FMLServerStartingEvent event) {}

    public static class Client extends SideProxy {

        Client() {
            FMLJavaModLoadingContext.get().getModEventBus().addListener(Client::clientSetup);
        }

        private static void clientSetup(FMLClientSetupEvent event) {


        }
    }

    public static class Server extends SideProxy {

        Server() { FMLJavaModLoadingContext.get().getModEventBus().addListener(Server::serverSetup); }

        private static void serverSetup(FMLDedicatedServerSetupEvent event) {}
    }
}
