package code.elix_x.mods.iitemrenderer.test;

import code.elix_x.mods.iitemrenderer.api.IItemRenderer;
import code.elix_x.mods.iitemrenderer.api.IItemRendererAPI;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.block.model.IBakedModel;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms.TransformType;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = "IIRGLCallsTest", name = "IIRGLCallsTest",  version = "0.0")
public class IIRGLCallsTest {

	@EventHandler
	public void init(FMLInitializationEvent event){
		IItemRendererAPI.registerIItemRenderer(Items.DIAMOND, new IItemRenderer(){

			@Override
			public boolean renderPre(RenderItem renderItem, ItemStack itemstack, IBakedModel model, TransformType type){
				if(type == TransformType.GROUND){
					GlStateManager.pushMatrix();
					GlStateManager.disableDepth();
					GlStateManager.scale(10, 10, 10);
				}
				return true;
			}

			@Override
			public void renderPost(RenderItem renderItem, ItemStack itemstack, IBakedModel model, TransformType type){
				if(type == TransformType.GROUND){
					GlStateManager.enableDepth();
					GlStateManager.popMatrix();
				}
			}

			@Override
			public boolean renderItemOverlayIntoGUIPre(RenderItem renderItem, FontRenderer fontRenderer, ItemStack itemstack, int xPosition, int yPosition, String text){
				return true;
			}

			@Override
			public void renderItemOverlayIntoGUIPost(RenderItem renderItem, FontRenderer fontRenderer, ItemStack itemstack, int xPosition, int yPosition, String text){

			}

		});
	}

}
