/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2013
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
// Date: 02/06/2013 8:52:10 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package Reika.RotaryCraft.Models.Animated;

import java.util.ArrayList;

import net.minecraft.client.model.ModelRenderer;

import org.lwjgl.opengl.GL11;

import Reika.RotaryCraft.Base.RotaryModelBase;

public class ModelFriction extends RotaryModelBase
{
	//fields
	ModelRenderer Shape1;
	ModelRenderer Shape2;
	ModelRenderer Shape3;
	ModelRenderer Shape3a;
	ModelRenderer Shape4;
	ModelRenderer Shape4a;
	ModelRenderer Shape4b;
	ModelRenderer Shape4c;
	ModelRenderer Shape4d;
	ModelRenderer Shape4e;
	ModelRenderer Shape4f;
	ModelRenderer Shape4g;
	ModelRenderer Shape4h;
	ModelRenderer Shape4i;
	ModelRenderer Shape4k;
	ModelRenderer Shape4l;
	ModelRenderer Shape5;
	ModelRenderer Shape5a;
	ModelRenderer Shape6;

	public ModelFriction()
	{
		textureWidth = 128;
		textureHeight = 128;

		Shape1 = new ModelRenderer(this, 0, 45);
		Shape1.addBox(0F, 0F, 0F, 16, 1, 16);
		Shape1.setRotationPoint(-8F, 23F, -8F);
		Shape1.setTextureSize(128, 128);
		Shape1.mirror = true;
		this.setRotation(Shape1, 0F, 0F, 0F);
		Shape2 = new ModelRenderer(this, 65, 0);
		Shape2.addBox(0F, 0F, 0F, 10, 1, 10);
		Shape2.setRotationPoint(-5F, 22F, -5F);
		Shape2.setTextureSize(128, 128);
		Shape2.mirror = true;
		this.setRotation(Shape2, 0F, 0F, 0F);
		Shape3 = new ModelRenderer(this, 0, 64);
		Shape3.addBox(-1F, -1F, 0F, 2, 2, 15);
		Shape3.setRotationPoint(0F, 16F, -6.5F);
		Shape3.setTextureSize(128, 128);
		Shape3.mirror = true;
		this.setRotation(Shape3, 0F, 0F, 0.7853982F);
		Shape3a = new ModelRenderer(this, 0, 64);
		Shape3a.addBox(-1F, -1F, 0F, 2, 2, 15);
		Shape3a.setRotationPoint(0F, 16F, -6.5F);
		Shape3a.setTextureSize(128, 128);
		Shape3a.mirror = true;
		this.setRotation(Shape3a, 0F, 0F, 0F);
		Shape4 = new ModelRenderer(this, 0, 88);
		Shape4.addBox(-1F, -7F, 0F, 2, 14, 1);
		Shape4.setRotationPoint(0F, 16F, -7F);
		Shape4.setTextureSize(128, 128);
		Shape4.mirror = true;
		this.setRotation(Shape4, 0F, 0F, 1.570796F);
		Shape4a = new ModelRenderer(this, 0, 0);
		Shape4a.addBox(-0.5F, -7F, 0F, 1, 14, 1);
		Shape4a.setRotationPoint(0F, 16F, -8F);
		Shape4a.setTextureSize(128, 128);
		Shape4a.mirror = true;
		this.setRotation(Shape4a, 0F, 0F, 1.047198F);
		Shape4b = new ModelRenderer(this, 0, 88);
		Shape4b.addBox(-1F, -7F, 0F, 2, 14, 1);
		Shape4b.setRotationPoint(0F, 16F, -7F);
		Shape4b.setTextureSize(128, 128);
		Shape4b.mirror = true;
		this.setRotation(Shape4b, 0F, 0F, 0.5235988F);
		Shape4c = new ModelRenderer(this, 0, 88);
		Shape4c.addBox(-1F, -7F, 0F, 2, 14, 1);
		Shape4c.setRotationPoint(0F, 16F, -7F);
		Shape4c.setTextureSize(128, 128);
		Shape4c.mirror = true;
		this.setRotation(Shape4c, 0F, 0F, 2.617994F);
		Shape4d = new ModelRenderer(this, 0, 88);
		Shape4d.addBox(-1F, -7F, 0F, 2, 14, 1);
		Shape4d.setRotationPoint(0F, 16F, -7F);
		Shape4d.setTextureSize(128, 128);
		Shape4d.mirror = true;
		this.setRotation(Shape4d, 0F, 0F, 2.094395F);
		Shape4e = new ModelRenderer(this, 0, 88);
		Shape4e.addBox(-1F, -7F, 0F, 2, 14, 1);
		Shape4e.setRotationPoint(0F, 16F, -7F);
		Shape4e.setTextureSize(128, 128);
		Shape4e.mirror = true;
		this.setRotation(Shape4e, 0F, 0F, 1.047198F);
		Shape4f = new ModelRenderer(this, 0, 88);
		Shape4f.addBox(-1F, -7F, 0F, 2, 14, 1);
		Shape4f.setRotationPoint(0F, 16F, -7F);
		Shape4f.setTextureSize(128, 128);
		Shape4f.mirror = true;
		this.setRotation(Shape4f, 0F, 0F, 0F);
		Shape4g = new ModelRenderer(this, 0, 0);
		Shape4g.addBox(-0.5F, -7F, 0F, 1, 14, 1);
		Shape4g.setRotationPoint(0F, 16F, -8F);
		Shape4g.setTextureSize(128, 128);
		Shape4g.mirror = true;
		this.setRotation(Shape4g, 0F, 0F, 1.570796F);
		Shape4h = new ModelRenderer(this, 0, 0);
		Shape4h.addBox(-0.5F, -7F, 0F, 1, 14, 1);
		Shape4h.setRotationPoint(0F, 16F, -8F);
		Shape4h.setTextureSize(128, 128);
		Shape4h.mirror = true;
		this.setRotation(Shape4h, 0F, 0F, 0.5235988F);
		Shape4i = new ModelRenderer(this, 0, 0);
		Shape4i.addBox(-0.5F, -7F, 0F, 1, 14, 1);
		Shape4i.setRotationPoint(0F, 16F, -8F);
		Shape4i.setTextureSize(128, 128);
		Shape4i.mirror = true;
		this.setRotation(Shape4i, 0F, 0F, 2.617994F);
		Shape4k = new ModelRenderer(this, 0, 0);
		Shape4k.addBox(-0.5F, -7F, 0F, 1, 14, 1);
		Shape4k.setRotationPoint(0F, 16F, -8F);
		Shape4k.setTextureSize(128, 128);
		Shape4k.mirror = true;
		this.setRotation(Shape4k, 0F, 0F, 2.094395F);
		Shape4l = new ModelRenderer(this, 0, 0);
		Shape4l.addBox(-0.5F, -7F, 0F, 1, 14, 1);
		Shape4l.setRotationPoint(0F, 16F, -8F);
		Shape4l.setTextureSize(128, 128);
		Shape4l.mirror = true;
		this.setRotation(Shape4l, 0F, 0F, 0F);
		Shape5 = new ModelRenderer(this, 12, 33);
		Shape5.addBox(0F, 0F, 0F, 4, 9, 1);
		Shape5.setRotationPoint(-2F, 14F, 3F);
		Shape5.setTextureSize(128, 128);
		Shape5.mirror = true;
		this.setRotation(Shape5, 0F, 0F, 0F);
		Shape5a = new ModelRenderer(this, 0, 33);
		Shape5a.addBox(0F, 0F, 0F, 4, 9, 1);
		Shape5a.setRotationPoint(-2F, 14F, -4F);
		Shape5a.setTextureSize(128, 128);
		Shape5a.mirror = true;
		this.setRotation(Shape5a, 0F, 0F, 0F);
		Shape6 = new ModelRenderer(this, 0, 19);
		Shape6.addBox(0F, 0F, 0F, 16, 12, 1);
		Shape6.setRotationPoint(-8F, 11F, 7F);
		Shape6.setTextureSize(128, 128);
		Shape6.mirror = true;
		this.setRotation(Shape6, 0F, 0F, 0F);
	}

	@Override
	public void renderAll(ArrayList li, float phi, float theta)
	{
		Shape1.render(f5);
		Shape2.render(f5);

		GL11.glTranslated(0, 1, 0);
		GL11.glRotatef(phi, 0, 0, 1);
		GL11.glTranslated(0, -1, 0);
		Shape3.render(f5);
		Shape3a.render(f5);
		Shape4.render(f5);
		Shape4a.render(f5);
		Shape4b.render(f5);
		Shape4c.render(f5);
		Shape4d.render(f5);
		Shape4e.render(f5);
		Shape4f.render(f5);
		Shape4g.render(f5);
		Shape4h.render(f5);
		Shape4i.render(f5);
		Shape4k.render(f5);
		Shape4l.render(f5);
		GL11.glTranslated(0, 1, 0);
		GL11.glRotatef(-phi, 0, 0, 1);
		GL11.glTranslated(0, -1, 0);

		Shape5.render(f5);
		Shape5a.render(f5);
		Shape6.render(f5);
	}

	@Override
	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f6)
	{
		super.setRotationAngles(f, f1, f2, f3, f4, f6);
	}

}
