package org.mrcheat.beers;
import org.mrcheat.beers.Baltika9;
import org.mrcheat.beers.Baltika9Top;
import org.mrcheat.beers.Ohota;
import org.mrcheat.beers.OhotaTop;
import org.mrcheat.beers.Everyday;
import org.mrcheat.beers.EverydayTop;
import org.mrcheat.beers.Buket;
import org.mrcheat.beers.BuketTop;

import net.minecraft.block.Block;

public class AModBlocks
{
    public static Block Baltika9;
    public static Block Baltika9Top;
    public static Block Ohota;
    public static Block OhotaTop;
    public static Block Everyday;
    public static Block EverydayTop;
    public static Block Buket;
    public static Block BuketTop;
 
    public static void init()
    {
        Baltika9Top = new Baltika9Top(1);
        Baltika9 = new Baltika9();
        OhotaTop = new OhotaTop(1);
        Ohota = new Ohota();
        EverydayTop = new EverydayTop(1);
        Everyday = new Everyday();
        BuketTop = new BuketTop(1);
        Buket = new Buket();
    }
}