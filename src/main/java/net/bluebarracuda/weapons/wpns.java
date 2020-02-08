package net.bluebarracuda.weapons;

import net.bluebarracuda.weapons.core.ModBlocks;
import net.bluebarracuda.weapons.core.ModItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("weapons")
public class wpns
{
    public static final String MOD_ID = "weapons";
    public static final Logger logger = LogManager.getLogger();

    public wpns()
    {
        DistExecutor.runForDist(
                () -> SideProxy.Client::new,
                () -> SideProxy.Server::new

        );
    }

    public static final ItemGroup wpns = new ItemGroup(MOD_ID) {
        @Override
        public ItemStack createIcon()
        {
            return new ItemStack(ModBlocks.smgturrent);
        }
    };
}
