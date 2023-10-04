package org.mrcheat.beers;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.block.Block;
import net.minecraft.block.BlockAir;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.registry.GameRegistry;
import org.mrcheat.beers.AModBlocks;

public class EverydayBeer extends BlockContainer {
    private static String name = "beer";
    private static Block top;

    public EverydayBeer(String name, String textureName, Block top, int doRegister) {
        super(Material.glass);
        this.name = name;
        this.top = top;
        if(textureName == null){
            textureName = name;
        }
        setBlockName(name);
        setBlockTextureName(aBeers.MODID + ":" + textureName);
        setCreativeTab(CreativeTabs.tabBlock);
        setHardness(0.3f);
        setResistance(0.3f);
        setLightLevel(0.1f);
        if(doRegister == 1){
            GameRegistry.registerBlock(this, name);
        }
    }

    public EverydayBeer(String name, String textureName, int doRegister) {
        super(Material.glass);
        this.name = name;
        this.top = top;
        if(textureName == null){
            textureName = name;
        }
        setBlockName(name);
        setBlockTextureName(aBeers.MODID + ":" + textureName);
        setCreativeTab(CreativeTabs.tabBlock);
        setHardness(0.3f);
        setResistance(0.3f);
        setLightLevel(0.1f);
        if(doRegister == 1){
            GameRegistry.registerBlock(this, name);
        }
    }

    public EverydayBeer(String name) {
        super(Material.glass);
        this.name = name;
        setBlockName(name);
        setBlockTextureName(aBeers.MODID + ":" + name);
        setCreativeTab(CreativeTabs.tabBlock);
        setHardness(0.3f);
        setResistance(0.3f);
        setLightLevel(0.1f);
        GameRegistry.registerBlock(this, name);
    }
    @Override
    public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_){
        return new TileEntity();
    }

    @Override
    public void onBlockDestroyedByPlayer(World world , int x, int y, int z, int meta){
        world.func_147480_a(x, y, z, true);
        world.func_147480_a(x, y+1, z, true);
    }

    @Override
    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entityLivingBase, ItemStack itemStack) {
        super.onBlockPlacedBy(world, x, y, z, entityLivingBase, itemStack);
        world.setBlock(x, y+1, z, this.top);
    }
}