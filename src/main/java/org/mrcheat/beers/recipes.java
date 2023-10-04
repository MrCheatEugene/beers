package org.mrcheat.beers;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.ShapelessRecipes;
import org.mrcheat.beers.AModBlocks;
import net.minecraft.block.Block;
import java.util.Arrays;
import java.util.List;


public class recipes{
    public static void init(){        
        ItemStack Baltika9 = new ItemStack(AModBlocks.Baltika9);
        ItemStack Ohota = new ItemStack(AModBlocks.Ohota);
        ItemStack Everyday = new ItemStack(AModBlocks.Everyday);
        ItemStack Buket = new ItemStack(AModBlocks.Buket);
        ItemStack eye = new ItemStack(Item.getItemById(376), 1, 0);
        ItemStack dirt = new ItemStack(Item.getItemById(3), 1, 0);
        ItemStack hurtI = new ItemStack(Item.getItemById(373), 1, 8268);
        ItemStack poison = new ItemStack(Item.getItemById(373), 1, 16452);
        ItemStack slow = new ItemStack(Item.getItemById(373), 1, 8234);
        ItemStack health = new ItemStack(Item.getItemById(373), 1, 8193);
        ItemStack bread = new ItemStack(Item.getItemById(297), 1, 0);
        ItemStack sugar = new ItemStack(Item.getItemById(353), 1, 0);
        ItemStack water = new ItemStack(Item.getItemById(326), 1, 0);
        ItemStack bottle = new ItemStack(Item.getItemById(374), 1, 0);
        ItemStack buketpotion = new ItemStack(Item.getItemById(373), 1, 16393).setStackDisplayName("§6Квас §rБукет Чувашии");
        ItemStack Everydaypotion = new ItemStack(Item.getItemById(373), 1, 16452).setStackDisplayName("§eПиво §rЖигулевское");
        ItemStack Ohotapotion = new ItemStack(Item.getItemById(373), 1, 16456).setStackDisplayName("§4Пиво §rОхота Крепкое");
        ItemStack Baltikapotion = new ItemStack(Item.getItemById(373), 1, 16428).setStackDisplayName("§4Пиво §rБлатика 9");
        
        List OhotaRecipeNeed = Arrays.asList(poison, slow);
        List BaltikaRecipeNeed = Arrays.asList(hurtI, dirt);
        List EverydayRecipeNeed = Arrays.asList(hurtI, poison, slow);
        List BuketRecipeNeed = Arrays.asList(health, sugar, bread, water);

        List BuketPotRecipeNeed = Arrays.asList(health, sugar, bread, water, bottle);
        List OhotaPotRecipeNeed = Arrays.asList(poison, slow, bottle);
        List BaltikaPotRecipeNeed = Arrays.asList(hurtI, dirt, bottle);
        List EverydayPotRecipeNeed = Arrays.asList(hurtI, poison, slow, bottle);

        ShapelessRecipes Baltika9Recipe = new ShapelessRecipes(Baltika9, BaltikaRecipeNeed);
        ShapelessRecipes OhotaRecipe = new ShapelessRecipes(Ohota, OhotaRecipeNeed);
        ShapelessRecipes EverydayRecipe = new ShapelessRecipes(Everyday, EverydayRecipeNeed);
        ShapelessRecipes BuketRecipe = new ShapelessRecipes(Buket, BuketRecipeNeed);
        ShapelessRecipes BuketPRecipe = new ShapelessRecipes(buketpotion, BuketPotRecipeNeed);
        ShapelessRecipes OhotaPRecipe = new ShapelessRecipes(Ohotapotion, OhotaPotRecipeNeed);
        ShapelessRecipes BaltikaPRecipe = new ShapelessRecipes(Baltikapotion, BaltikaPotRecipeNeed);
        ShapelessRecipes EverydayPRecipe = new ShapelessRecipes(Everydaypotion, EverydayPotRecipeNeed);
        GameRegistry.addRecipe(Baltika9Recipe);
        GameRegistry.addRecipe(OhotaRecipe);
        GameRegistry.addRecipe(BuketRecipe);
        GameRegistry.addRecipe(EverydayRecipe);
        GameRegistry.addRecipe(BuketPRecipe);
        GameRegistry.addRecipe(OhotaPRecipe);
        GameRegistry.addRecipe(BaltikaPRecipe);
        GameRegistry.addRecipe(EverydayPRecipe);

    }
}