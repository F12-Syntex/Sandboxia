package com.sandboxia.spritesheet;

import java.awt.image.BufferedImage;
import java.util.LinkedHashMap;
import java.util.Map;

import com.sandboxia.datatypes.Node;

public class SpriteSheetProperties {

	private final boolean spriteSheet;
	private final int size;
	
	public Map<Node, BufferedImage> map;

	/**
	 * Create a new sprite sheet properties.
	 */
	public SpriteSheetProperties() {
		super();
		this.map = new LinkedHashMap<>();
		this.spriteSheet = false;
		this.size = 0;
	}
	
	/**
	 * Create a new sprite sheet properties.
	 * @param spriteSheet true if it is a sprite sheet.
	 * @param size the size of the sprite sheet.
	 */
	public SpriteSheetProperties(boolean spriteSheet, int size) {
		super();
		this.map = new LinkedHashMap<>();
		this.spriteSheet = spriteSheet;
		this.size = size;
	}
	
	/**
	 * Check if the sprite sheet is a sprite sheet.
	 * @return true if it is a sprite sheet.
	 */
	public boolean isSpriteSheet() {
		return spriteSheet;
	}
	
	/**
	 * Get the dimentions of the sprite sheet.
	 * @return the size.
	 */
	public int getSize() {
		return size;
	}
	
	/**
	 * Render the sprite location.
	 * @param node the node.
	 * @param image the image.
	 */
	public void renderSpriteLocation(Node node, BufferedImage image) {
		synchronized(this.map) {
			this.map.put(node, image);	
		}
	}
	
	/**
	 * Get the image from the location.
	 * @param x the x coordinate.
	 * @param y the y coordinate.
	 * @return the image.
	 */
	public BufferedImage getImageFromLocation(int x, int y) {
		return map.get(Node.of(x, y));
	}
	
	/**
	 * Get the image from the location.
	 * @param node the node.
	 * @return the image.
	 */
	public BufferedImage getImageFromLocation(Node node) {
		return map.get(node);
	}
	
}
