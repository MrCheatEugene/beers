package org.mrcheat.beers; 
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import org.mrcheat.beers.AModBlocks;
import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.client.renderer.texture.IIconRegister;

public class OhotaBeerTop extends BlockContainer {
    private static String name = "beer_top";
    private static String basename = "beer";

    public IIcon[] icons = new IIcon[6];

    public OhotaBeerTop(String name, int doRegister) {
        super(Material.glass);
        System.out.println("new beertop: "+name);
        this.name = name+"_top";
        this.basename = name;
        setBlockName(this.name);
        setBlockTextureName(aBeers.MODID + ":" + this.name);
        setHardness(0.3f);
        setResistance(0.3f);
        setLightLevel(0.1f);
        if(doRegister == 1){
            GameRegistry.registerBlock(this, this.name);
        }        
    }

    @Override
    public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_){
        return new TileEntity();
    }

    @Override
    public void onBlockDestroyedByPlayer(World world , int x, int y, int z, int meta){
        world.func_147480_a(x, y, z, true);
        world.func_147480_a(x, y-1, z, true);
    }

    @Override 
    public Item getItemDropped(int p_149650_1_, java.util.Random p_149650_2_, int p_149650_3_){
        return null;
    }

    public void registerBlockIcons(IIconRegister reg){
        for (int i = 0; i < 6; i ++) {
            String txt = aBeers.MODID+":"+basename+"_can";
            if(i==1){
                txt = aBeers.MODID+":"+basename+"_top";
            }
            this.icons[i] = reg.registerIcon(txt);
        }
    }

    public IIcon getIcon(int side, int meta) {
        return this.icons[side];
    }
}