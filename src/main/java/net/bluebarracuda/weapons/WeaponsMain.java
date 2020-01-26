package net.bluebarracuda.weapons;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Nonnull;

@Mod("Weapons")
public class WeaponsMain
{
    public static final String MOD_ID = "Weapons";
    public static final Logger LOGGER = LogManager.getLogger();

    public WeaponsMain()
    {
        DistExecutor.runForDist(() -> SideProxy.Client::new, () -> SideProxy.Server::new);
    }

}