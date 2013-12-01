/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2013
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
// Date: 29/09/2013 10:07:18 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package Reika.RotaryCraft.ModInterface;

import java.util.ArrayList;

import net.minecraft.client.model.ModelRenderer;

import org.lwjgl.opengl.GL11;

import Reika.RotaryCraft.Base.RotaryModelBase;

public class ModelSteamTurbine extends RotaryModelBase
{
	//fields
	ModelRenderer Shape1;
	ModelRenderer Shape1a;
	ModelRenderer blade;
	ModelRenderer Shape3;
	ModelRenderer Shape3a;
	ModelRenderer Shape4;
	ModelRenderer Shape4a;
	ModelRenderer Shape4b;
	ModelRenderer Shape4c;
	ModelRenderer Shape5;
	ModelRenderer Shape5a;
	ModelRenderer Shape6;
	ModelRenderer Shape6a;
	ModelRenderer Shape6b;
	ModelRenderer Shape6c;
	ModelRenderer Shape7;
	ModelRenderer Shape7a;
	ModelRenderer Shape7b;
	ModelRenderer Shape7c;

	public ModelSteamTurbine()
	{
		textureWidth = 128;
		textureHeight = 128;

		Shape1 = new ModelRenderer(this, 0, 0);
		Shape1.addBox(-1F, -1F, 0F, 2, 2, 16);
		Shape1.setRotationPoint(0F, 16F, -8.5F);
		Shape1.setTextureSize(128, 128);
		Shape1.mirror = true;
		this.setRotation(Shape1, 0F, 0F, 0.7853982F);
		Shape1a = new ModelRenderer(this, 0, 0);
		Shape1a.addBox(-1F, -1F, 0F, 2, 2, 16);
		Shape1a.setRotationPoint(0F, 16F, -8.5F);
		Shape1a.setTextureSize(128, 128);
		Shape1a.mirror = true;
		this.setRotation(Shape1a, 0F, 0F, 0F);
		blade = new ModelRenderer(this, 0, 19);
		blade.addBox(-0.5F, -6F, -0.5F, 1, 6, 1);
		blade.setRotationPoint(0F, 16F, 0F);
		blade.setTextureSize(128, 128);
		blade.mirror = true;
		this.setRotation(blade, 0F, 0F, 0F);
		Shape3 = new ModelRenderer(this, 40, 19);
		Shape3.addBox(0F, 0F, 0F, 16, 1, 16);
		Shape3.setRotationPoint(-8F, 8F, -8F);
		Shape3.setTextureSize(128, 128);
		Shape3.mirror = true;
		this.setRotation(Shape3, 0F, 0F, 0F);
		Shape3a = new ModelRenderer(this, 40, 0);
		Shape3a.addBox(0F, 0F, 0F, 16, 1, 16);
		Shape3a.setRotationPoint(-8F, 23F, -8F);
		Shape3a.setTextureSize(128, 128);
		Shape3a.mirror = true;
		this.setRotation(Shape3a, 0F, 0F, 0F);
		Shape4 = new ModelRenderer(this, 12, 28);
		Shape4.addBox(0F, 0F, 0F, 1, 14, 1);
		Shape4.setRotationPoint(7F, 9F, 7F);
		Shape4.setTextureSize(128, 128);
		Shape4.mirror = true;
		this.setRotation(Shape4, 0F, 0F, 0F);
		Shape4a = new ModelRenderer(this, 18, 28);
		Shape4a.addBox(0F, 0F, 0F, 1, 14, 1);
		Shape4a.setRotationPoint(-8F, 9F, 7F);
		Shape4a.setTextureSize(128, 128);
		Shape4a.mirror = true;
		this.setRotation(Shape4a, 0F, 0F, 0F);
		Shape4b = new ModelRenderer(this, 6, 28);
		Shape4b.addBox(0F, 0F, 0F, 1, 14, 1);
		Shape4b.setRotationPoint(7F, 9F, -8F);
		Shape4b.setTextureSize(128, 128);
		Shape4b.mirror = true;
		this.setRotation(Shape4b, 0F, 0F, 0F);
		Shape4c = new ModelRenderer(this, 0, 28);
		Shape4c.addBox(0F, 0F, 0F, 1, 14, 1);
		Shape4c.setRotationPoint(-8F, 9F, -8F);
		Shape4c.setTextureSize(128, 128);
		Shape4c.mirror = true;
		this.setRotation(Shape4c, 0F, 0F, 0F);
		Shape5 = new ModelRenderer(this, 0, 45);
		Shape5.addBox(0F, 0F, 0F, 1, 14, 14);
		Shape5.setRotationPoint(-8F, 9F, -7F);
		Shape5.setTextureSize(128, 128);
		Shape5.mirror = true;
		this.setRotation(Shape5, 0F, 0F, 0F);
		Shape5a = new ModelRenderer(this, 0, 45);
		Shape5a.addBox(0F, 0F, 0F, 1, 14, 14);
		Shape5a.setRotationPoint(7F, 9F, -7F);
		Shape5a.setTextureSize(128, 128);
		Shape5a.mirror = true;
		this.setRotation(Shape5a, 0F, 0F, 0F);
		Shape6 = new ModelRenderer(this, 0, 102);
		Shape6.addBox(0F, 0F, 0F, 14, 5, 1);
		Shape6.setRotationPoint(-7F, 18F, 7F);
		Shape6.setTextureSize(128, 128);
		Shape6.mirror = true;
		this.setRotation(Shape6, 0F, 0F, 0F);
		Shape6a = new ModelRenderer(this, 0, 109);
		Shape6a.addBox(0F, 0F, 0F, 14, 5, 1);
		Shape6a.setRotationPoint(-7F, 9F, 7F);
		Shape6a.setTextureSize(128, 128);
		Shape6a.mirror = true;
		this.setRotation(Shape6a, 0F, 0F, 0F);
		Shape6b = new ModelRenderer(this, 0, 116);
		Shape6b.addBox(0F, 0F, 0F, 14, 5, 1);
		Shape6b.setRotationPoint(-7F, 9F, -8F);
		Shape6b.setTextureSize(128, 128);
		Shape6b.mirror = true;
		this.setRotation(Shape6b, 0F, 0F, 0F);
		Shape6c = new ModelRenderer(this, 0, 75);
		Shape6c.addBox(0F, 0F, 0F, 14, 5, 1);
		Shape6c.setRotationPoint(-7F, 18F, -8F);
		Shape6c.setTextureSize(128, 128);
		Shape6c.mirror = true;
		this.setRotation(Shape6c, 0F, 0F, 0F);
		Shape7 = new ModelRenderer(this, 14, 96);
		Shape7.addBox(0F, 0F, 0F, 5, 4, 1);
		Shape7.setRotationPoint(2F, 14F, 7F);
		Shape7.setTextureSize(128, 128);
		Shape7.mirror = true;
		this.setRotation(Shape7, 0F, 0F, 0F);
		Shape7a = new ModelRenderer(this, 0, 96);
		Shape7a.addBox(0F, 0F, 0F, 5, 4, 1);
		Shape7a.setRotationPoint(-7F, 14F, 7F);
		Shape7a.setTextureSize(128, 128);
		Shape7a.mirror = true;
		this.setRotation(Shape7a, 0F, 0F, 0F);
		Shape7b = new ModelRenderer(this, 14, 90);
		Shape7b.addBox(0F, 0F, 0F, 5, 4, 1);
		Shape7b.setRotationPoint(2F, 14F, -8F);
		Shape7b.setTextureSize(128, 128);
		Shape7b.mirror = true;
		this.setRotation(Shape7b, 0F, 0F, 0F);
		Shape7c = new ModelRenderer(this, 0, 90);
		Shape7c.addBox(0F, 0F, 0F, 5, 4, 1);
		Shape7c.setRotationPoint(-7F, 14F, -8F);
		Shape7c.setTextureSize(128, 128);
		Shape7c.mirror = true;
		this.setRotation(Shape7c, 0F, 0F, 0F);
	}

	@Override
	public void renderAll(ArrayList li, float phi, float theta)
	{
		double dd = 1;

		GL11.glTranslated(0, dd, 0);
		GL11.glRotatef(phi, 0, 0, 1);
		GL11.glTranslated(0, -dd, 0);
		Shape1.render(f5);
		Shape1a.render(f5);
		GL11.glTranslated(0, dd, 0);
		GL11.glRotatef(-phi, 0, 0, 1);
		GL11.glTranslated(0, -dd, 0);

		Shape3.render(f5);
		Shape3a.render(f5);
		Shape4.render(f5);
		Shape4a.render(f5);
		Shape4b.render(f5);
		Shape4c.render(f5);
		Shape5.render(f5);
		Shape5a.render(f5);
		Shape6.render(f5);
		Shape6a.render(f5);
		Shape6b.render(f5);
		Shape6c.render(f5);
		Shape7.render(f5);
		Shape7a.render(f5);
		Shape7b.render(f5);
		Shape7c.render(f5);

		int j = 0;
		for (double k = -0.375; k <= 0.375; k += 0.09375) {
			GL11.glTranslated(0, 0, k);
			GL11.glTranslated(0, dd, 0);
			GL11.glRotatef(j, 0, 0, 1);
			GL11.glTranslated(0, -dd, 0);
			for (int i = 0; i < 360; i += 22.5) {
				GL11.glTranslated(0, dd, 0);
				GL11.glRotatef(i+phi, 0, 0, 1);
				GL11.glTranslated(0, -dd, 0);
				blade.render(f5);
				GL11.glTranslated(0, dd, 0);
				GL11.glRotatef(-i-phi, 0, 0, 1);
				GL11.glTranslated(0, -dd, 0);
			}
			GL11.glTranslated(0, dd, 0);
			GL11.glRotatef(-j, 0, 0, 1);
			GL11.glTranslated(0, -dd, 0);
			GL11.glTranslated(0, 0, -k);
			j += 15;
		}
	}
}
