/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2013
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
// Date: 24/02/2013 3:03:48 AM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package Reika.RotaryCraft.Models.Engine;

import java.util.ArrayList;

import net.minecraft.client.model.ModelRenderer;

import org.lwjgl.opengl.GL11;

import Reika.RotaryCraft.Base.RotaryModelBase;


public class ModelPerformance extends RotaryModelBase
{
	//fields
	ModelRenderer Shape1;
	ModelRenderer Shape12;
	ModelRenderer Shape13;
	ModelRenderer Shape5;
	ModelRenderer Shape6n;
	ModelRenderer Shape7;
	ModelRenderer Shape3;
	ModelRenderer Shape8;
	ModelRenderer Shape4;
	ModelRenderer Shape2a;
	ModelRenderer Shape2b;
	ModelRenderer Shape2c;
	ModelRenderer Shape2d;
	ModelRenderer Shape2e;
	ModelRenderer Shape2;
	ModelRenderer Shape4a;
	ModelRenderer b;
	ModelRenderer Shape4c;
	ModelRenderer Shape6;
	ModelRenderer Shape9i;
	ModelRenderer Shape9h;
	ModelRenderer Shape9g;
	ModelRenderer Shape9f;
	ModelRenderer Shape9e;
	ModelRenderer Shape9d;
	ModelRenderer Shape9c;
	ModelRenderer Shape9b;
	ModelRenderer Shape9a;
	ModelRenderer Shape9;
	ModelRenderer Shape10;

	public ModelPerformance()
	{
		textureWidth = 128;
		textureHeight = 128;

		Shape1 = new ModelRenderer(this, 64, 0);
		Shape1.addBox(0F, 0F, 0F, 14, 1, 15);
		Shape1.setRotationPoint(-8F, 22F, -7.5F);
		Shape1.setTextureSize(128, 128);
		Shape1.mirror = true;
		this.setRotation(Shape1, 0F, 0F, 0F);
		Shape12 = new ModelRenderer(this, 0, 80);
		Shape12.addBox(0F, 0F, 0F, 11, 2, 2);
		Shape12.setRotationPoint(-8.5F, 15F, -1F);
		Shape12.setTextureSize(128, 128);
		Shape12.mirror = true;
		this.setRotation(Shape12, 0F, 0F, 0F);
		Shape13 = new ModelRenderer(this, 0, 80);
		Shape13.addBox(0F, 0F, 0F, 11, 2, 2);
		Shape13.setRotationPoint(-8.5F, 16F, -1.4F);
		Shape13.setTextureSize(128, 128);
		Shape13.mirror = true;
		this.setRotation(Shape13, 0.7853982F, 0F, 0F);
		Shape5 = new ModelRenderer(this, 0, 33);
		Shape5.addBox(0F, 0F, 0F, 12, 11, 6);
		Shape5.setRotationPoint(-7F, 11F, 3F);
		Shape5.setTextureSize(128, 128);
		Shape5.mirror = true;
		this.setRotation(Shape5, -0.5235988F, 0F, 0F);
		Shape6n = new ModelRenderer(this, 56, 55);
		Shape6n.addBox(0F, 0F, 0F, 11, 5, 14);
		Shape6n.setRotationPoint(-6.5F, 16F, -7F);
		Shape6n.setTextureSize(128, 128);
		Shape6n.mirror = true;
		this.setRotation(Shape6n, 0F, 0F, 0F);
		Shape7 = new ModelRenderer(this, 0, 33);
		Shape7.addBox(0F, 0F, 0F, 12, 11, 6);
		Shape7.setRotationPoint(-7F, 14F, -8F);
		Shape7.setTextureSize(128, 128);
		Shape7.mirror = true;
		this.setRotation(Shape7, 0.5235988F, 0F, 0F);
		Shape3 = new ModelRenderer(this, 0, 17);
		Shape3.addBox(0F, 0F, 0F, 13, 2, 14);
		Shape3.setRotationPoint(-7.7F, 21F, -7F);
		Shape3.setTextureSize(128, 128);
		Shape3.mirror = true;
		this.setRotation(Shape3, 0F, 0F, 0F);
		Shape8 = new ModelRenderer(this, 0, 0);
		Shape8.addBox(0F, 0F, 0F, 16, 1, 16);
		Shape8.setRotationPoint(-8F, 23F, -8F);
		Shape8.setTextureSize(128, 128);
		Shape8.mirror = true;
		this.setRotation(Shape8, 0F, 0F, 0F);
		Shape4 = new ModelRenderer(this, 0, 66);
		Shape4.addBox(0F, 0F, 0F, 2, 4, 2);
		Shape4.setRotationPoint(-1.9F, 8F, -1F);
		Shape4.setTextureSize(128, 128);
		Shape4.mirror = true;
		this.setRotation(Shape4, 0F, 0F, 0F);
		Shape2a = new ModelRenderer(this, 0, 60);
		Shape2a.addBox(0F, 0F, 0F, 2, 4, 2);
		Shape2a.setRotationPoint(-2F, 9.1F, 6.4F);
		Shape2a.setTextureSize(128, 128);
		Shape2a.mirror = true;
		this.setRotation(Shape2a, -0.5235988F, 0F, 0F);
		Shape2b = new ModelRenderer(this, 0, 60);
		Shape2b.addBox(0F, 0F, 0F, 2, 4, 2);
		Shape2b.setRotationPoint(1F, 10F, -8F);
		Shape2b.setTextureSize(128, 128);
		Shape2b.mirror = true;
		this.setRotation(Shape2b, 0.5235988F, 0F, 0F);
		Shape2c = new ModelRenderer(this, 0, 60);
		Shape2c.addBox(0F, 0F, 0F, 2, 4, 2);
		Shape2c.setRotationPoint(-2F, 10F, -8F);
		Shape2c.setTextureSize(128, 128);
		Shape2c.mirror = true;
		this.setRotation(Shape2c, 0.5235988F, 0F, 0F);
		Shape2d = new ModelRenderer(this, 0, 60);
		Shape2d.addBox(0F, 0F, 0F, 2, 4, 2);
		Shape2d.setRotationPoint(-5F, 10F, -8F);
		Shape2d.setTextureSize(128, 128);
		Shape2d.mirror = true;
		this.setRotation(Shape2d, 0.5235988F, 0F, 0F);
		Shape2e = new ModelRenderer(this, 0, 60);
		Shape2e.addBox(0F, 0F, 0F, 2, 4, 2);
		Shape2e.setRotationPoint(1F, 9.1F, 6.4F);
		Shape2e.setTextureSize(128, 128);
		Shape2e.mirror = true;
		this.setRotation(Shape2e, -0.5235988F, 0F, 0F);
		Shape2 = new ModelRenderer(this, 0, 60);
		Shape2.addBox(0F, 0F, 0F, 2, 4, 2);
		Shape2.setRotationPoint(-5F, 9.1F, 6.4F);
		Shape2.setTextureSize(128, 128);
		Shape2.mirror = true;
		this.setRotation(Shape2, -0.5235988F, 0F, 0F);
		Shape4a = new ModelRenderer(this, 0, 53);
		Shape4a.addBox(0F, 0F, 0F, 12, 1, 4);
		Shape4a.setRotationPoint(-6.9F, 10F, -2F);
		Shape4a.setTextureSize(128, 128);
		Shape4a.mirror = true;
		this.setRotation(Shape4a, 0F, 0F, 0F);
		b = new ModelRenderer(this, 0, 66);
		b.addBox(0F, 0F, 0F, 2, 4, 2);
		b.setRotationPoint(2.1F, 8F, -1F);
		b.setTextureSize(128, 128);
		b.mirror = true;
		this.setRotation(b, 0F, 0F, 0F);
		Shape4c = new ModelRenderer(this, 0, 66);
		Shape4c.addBox(0F, 0F, 0F, 2, 4, 2);
		Shape4c.setRotationPoint(-5.9F, 8F, -1F);
		Shape4c.setTextureSize(128, 128);
		Shape4c.mirror = true;
		this.setRotation(Shape4c, 0F, 0F, 0F);
		Shape6 = new ModelRenderer(this, 56, 17);
		Shape6.addBox(0F, 0F, 0F, 13, 12, 6);
		Shape6.setRotationPoint(-7.5F, 11F, -3F);
		Shape6.setTextureSize(128, 128);
		Shape6.mirror = true;
		this.setRotation(Shape6, 0F, 0F, 0F);
		Shape9i = new ModelRenderer(this, 0, 90);
		Shape9i.addBox(0F, 0F, 0F, 4, 1, 1);
		Shape9i.setRotationPoint(4F, 14F, 2F);
		Shape9i.setTextureSize(128, 128);
		Shape9i.mirror = true;
		this.setRotation(Shape9i, 0F, 0.5235988F, 0F);
		Shape9h = new ModelRenderer(this, 0, 90);
		Shape9h.addBox(0F, 0F, 0F, 4, 1, 1);
		Shape9h.setRotationPoint(4F, 20F, 2F);
		Shape9h.setTextureSize(128, 128);
		Shape9h.mirror = true;
		this.setRotation(Shape9h, 0F, 0.5235988F, 0F);
		Shape9g = new ModelRenderer(this, 0, 90);
		Shape9g.addBox(0F, 0F, 0F, 4, 1, 1);
		Shape9g.setRotationPoint(4F, 12.1F, 2F);
		Shape9g.setTextureSize(128, 128);
		Shape9g.mirror = true;
		this.setRotation(Shape9g, 0F, 0.5235988F, 0F);
		Shape9f = new ModelRenderer(this, 0, 90);
		Shape9f.addBox(0F, 0F, 0F, 4, 1, 1);
		Shape9f.setRotationPoint(4F, 16F, 2F);
		Shape9f.setTextureSize(128, 128);
		Shape9f.mirror = true;
		this.setRotation(Shape9f, 0F, 0.5235988F, 0F);
		Shape9e = new ModelRenderer(this, 0, 90);
		Shape9e.addBox(0F, 0F, 0F, 4, 1, 1);
		Shape9e.setRotationPoint(4.5F, 20F, -3F);
		Shape9e.setTextureSize(128, 128);
		Shape9e.mirror = true;
		this.setRotation(Shape9e, 0F, -0.5235988F, 0F);
		Shape9d = new ModelRenderer(this, 0, 90);
		Shape9d.addBox(0F, 0F, 0F, 4, 1, 1);
		Shape9d.setRotationPoint(4F, 18F, 2F);
		Shape9d.setTextureSize(128, 128);
		Shape9d.mirror = true;
		this.setRotation(Shape9d, 0F, 0.5235988F, 0F);
		Shape9c = new ModelRenderer(this, 0, 90);
		Shape9c.addBox(0F, 0F, 0F, 4, 1, 1);
		Shape9c.setRotationPoint(4.5F, 14F, -3F);
		Shape9c.setTextureSize(128, 128);
		Shape9c.mirror = true;
		this.setRotation(Shape9c, 0F, -0.5235988F, 0F);
		Shape9b = new ModelRenderer(this, 0, 90);
		Shape9b.addBox(0F, 0F, 0F, 4, 1, 1);
		Shape9b.setRotationPoint(4.5F, 18F, -3F);
		Shape9b.setTextureSize(128, 128);
		Shape9b.mirror = true;
		this.setRotation(Shape9b, 0F, -0.5235988F, 0F);
		Shape9a = new ModelRenderer(this, 0, 90);
		Shape9a.addBox(0F, 0F, 0F, 4, 1, 1);
		Shape9a.setRotationPoint(4.5F, 16F, -3F);
		Shape9a.setTextureSize(128, 128);
		Shape9a.mirror = true;
		this.setRotation(Shape9a, 0F, -0.5235988F, 0F);
		Shape9 = new ModelRenderer(this, 0, 90);
		Shape9.addBox(0F, 0F, 0F, 4, 1, 1);
		Shape9.setRotationPoint(4.5F, 12.1F, -3F);
		Shape9.setTextureSize(128, 128);
		Shape9.mirror = true;
		this.setRotation(Shape9, 0F, -0.5235988F, 0F);
		Shape10 = new ModelRenderer(this, 105, 17);
		Shape10.addBox(0F, 0F, 0F, 1, 11, 2);
		Shape10.setRotationPoint(7F, 12F, -1F);
		Shape10.setTextureSize(128, 128);
		Shape10.mirror = true;
		this.setRotation(Shape10, 0F, 0F, 0F);
	}

	@Override
	public void renderAll(ArrayList li, float phi, float theta)
	{
		double ang0 = 0.03125*Math.sin(Math.toRadians(phi)*4);
		double ang1 = 0.03125*Math.sin(Math.toRadians(phi+120)*4);
		double ang2 = 0.03125*Math.sin(Math.toRadians(phi+240)*4);

		if (phi == Float.MIN_NORMAL)
			ang0 = ang1 = ang2 = 0;

		Shape1.render(f5);

		GL11.glTranslated(0, 1, 0);
		GL11.glRotatef(phi, 1, 0, 0);
		GL11.glTranslated(0, -1, 0);
		Shape12.render(f5);
		Shape13.render(f5);
		GL11.glTranslated(0, 1, 0);
		GL11.glRotatef(-phi, 1, 0, 0);
		GL11.glTranslated(0, -1, 0);

		Shape5.render(f5);
		Shape6n.render(f5);
		Shape7.render(f5);
		Shape3.render(f5);
		Shape8.render(f5);

		//Verticals
		GL11.glTranslated(0, ang0, 0);
		Shape4.render(f5);
		GL11.glTranslated(0, -ang0, 0);

		GL11.glTranslated(0, ang1, 0);
		b.render(f5);
		GL11.glTranslated(0, -ang1, 0);

		GL11.glTranslated(0, ang2, 0);
		Shape4c.render(f5);
		GL11.glTranslated(0, -ang2, 0);

		double ang = ang0*Math.cos(Math.toRadians(30));
		double angp = ang0*Math.sin(Math.toRadians(30));
		GL11.glTranslated(0, ang, -angp);
		Shape2a.render(f5);
		GL11.glTranslated(0, -ang, angp);

		ang = ang1*Math.cos(Math.toRadians(30));
		angp = ang1*Math.sin(Math.toRadians(30));
		GL11.glTranslated(0, ang, -angp);
		Shape2e.render(f5);
		GL11.glTranslated(0, -ang, angp);

		ang = ang2*Math.cos(Math.toRadians(30));
		angp = ang2*Math.sin(Math.toRadians(30));
		GL11.glTranslated(0, ang, -angp);
		Shape2.render(f5);
		GL11.glTranslated(0, -ang, angp);

		ang = ang1*Math.cos(Math.toRadians(-30));
		angp = ang1*Math.sin(Math.toRadians(-30));
		GL11.glTranslated(0, ang, -angp);
		Shape2b.render(f5);
		GL11.glTranslated(0, -ang, angp);

		ang = ang0*Math.cos(Math.toRadians(-30));
		angp = ang0*Math.sin(Math.toRadians(-30));
		GL11.glTranslated(0, ang, -angp);
		Shape2c.render(f5);
		GL11.glTranslated(0, -ang, angp);

		ang = ang2*Math.cos(Math.toRadians(-30));
		angp = ang2*Math.sin(Math.toRadians(-30));
		GL11.glTranslated(0, ang, -angp);
		Shape2d.render(f5);
		GL11.glTranslated(0, -ang, angp);


		Shape4a.render(f5);
		Shape6.render(f5);
		Shape9i.render(f5);
		Shape9h.render(f5);
		Shape9g.render(f5);
		Shape9f.render(f5);
		Shape9e.render(f5);
		Shape9d.render(f5);
		Shape9c.render(f5);
		Shape9b.render(f5);
		Shape9a.render(f5);
		Shape9.render(f5);
		Shape10.render(f5);
	}
}
