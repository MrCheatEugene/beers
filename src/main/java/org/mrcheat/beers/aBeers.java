package org.mrcheat.beers;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import org.mrcheat.beers.AModBlocks;
import org.mrcheat.beers.recipes;

@Mod(modid = aBeers.MODID, version = aBeers.VERSION)
public class aBeers
{
    public static final String MODID = "beers";
    public static final String VERSION = "1.0";
    
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        AModBlocks.init();
        recipes.init();
    }
}
