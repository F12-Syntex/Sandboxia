package com.sandboxia.sandbox;

import java.awt.Graphics;

import com.sandboxia.entities.AutoJoin;
import com.sandboxia.entities.GraphicEntity;

@AutoJoin
/**
 * This class is responsible for rendering the item selector on the screen.
 * @author Saif
 * @version 1.0.0
 */
public class ItemSelector extends GraphicEntity{
	
	@Override
	public void render(Graphics g) {
		
	}

	@Override
	public void tick() {
		
	}

	@Override
	public int getPriority() {
		return 1;
	}
	
}
