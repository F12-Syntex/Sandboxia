package com.sandboxia.spritesheet;

import java.awt.image.BufferedImage;

import javax.annotation.Nonnull;

/**
 * SpriteSheet enum class. Provides all sprite sheets with their properties.
 * 
 * @author Saif.
 * @version 1.0.4
 * @since 1.0.0
 */
public enum SpriteSheet {
	
	SPRITESHEETS_SPRITES_32_RPG("spritesheets\\sprites-32\\rpg.png", new SpriteSheetProperties(true, 32)),
	SPRITESHEETS_SPRITES_16_TEXTURES_16("spritesheets\\sprites-16\\Textures-16.png", new SpriteSheetProperties(true, 16)),
	SPRITESHEETS_SPRITES_16_ARMOURS("spritesheets\\sprites-16\\armours.png", new SpriteSheetProperties(true, 16)),
	SPRITESHEETS_SPRITES_16_BOOKS("spritesheets\\sprites-16\\books.png", new SpriteSheetProperties(true, 16)),
	SPRITESHEETS_SPRITES_16_CHESTS("spritesheets\\sprites-16\\chests.png", new SpriteSheetProperties(true, 16)),
	SPRITESHEETS_SPRITES_16_CONSUMABLES("spritesheets\\sprites-16\\consumables.png", new SpriteSheetProperties(true, 16)),
	SPRITESHEETS_SPRITES_16_CONTROLS("spritesheets\\sprites-16\\controls.png", new SpriteSheetProperties(true, 16)),
	SPRITESHEETS_SPRITES_16_FOOD("spritesheets\\sprites-16\\Food.png", new SpriteSheetProperties(true, 16)),
	SPRITESHEETS_SPRITES_16_PIXEL_ICONS_BY_OCEANSDREAM("spritesheets\\sprites-16\\pixel_icons_by_oceansdream.png", new SpriteSheetProperties(true, 16)),
	SPRITESHEETS_SPRITES_16_POTIONS("spritesheets\\sprites-16\\potions.png", new SpriteSheetProperties(true, 16)),
	SPRITESHEETS_SPRITES_16_ROGUELIKEITEMS("spritesheets\\sprites-16\\roguelikeitems.png", new SpriteSheetProperties(true, 16)),
	SPRITESHEETS_SPRITES_16_WEAPONS("spritesheets\\sprites-16\\weapons.png", new SpriteSheetProperties(true, 16)),
	SPRITESHEETS_SPRITES_24_RESOURCES_OUTLINED("spritesheets\\sprites-24\\resources_outlined.png", new SpriteSheetProperties(true, 24)),
	SPRITESHEETS_SPRITES_32_MEGA("spritesheets\\sprites-32\\mega.png", new SpriteSheetProperties(true, 32));

    private final String dir;
    private BufferedImage image;
    private final SpriteSheetProperties sprite_sheet;
    
    private SpriteSheet(@Nonnull final String dir, @Nonnull final SpriteSheetProperties sprite_sheet) {
        this.dir = dir;
        this.sprite_sheet = sprite_sheet;
    }

	/*
	 * this method sets the image of the sprite sheet
	 * @param image the image to set
	 * @since 1.0.0
	 * @version 1.0.0
	 * @author Saif.
	 * @see BufferedImage
	 * @see SpriteSheet
	 * @see SpriteSheetProperties
	 */
    public void setImage(BufferedImage image) {
		this.image = image;
	}

	/*
	 * this method sets the directory of the sprite sheet
	 * @param dir the directory to set
	 * @since 1.0.0
	 * @version 1.0.0
	 * @author Saif.
	 * @see BufferedImage
	 * @see SpriteSheet
	 * @see SpriteSheetProperties
	 */
	public String getDir() {
        return dir;
    }

	/*
	 * @returns the image of the sprite sheet
	 * @param dir the directory to set
	 * @since 1.0.0
	 * @version 1.0.0
	 * @author Saif.
	 * @see BufferedImage
	 * @see SpriteSheet
	 * @see SpriteSheetProperties
	 */
	public BufferedImage getImage() {
		return image;
	}

	/*
	 * @returns the properties of the sprite sheet
	 * @param dir the directory to set
	 * @since 1.0.0
	 * @version 1.0.0
	 * @author Saif.
	 * @see BufferedImage
	 * @see SpriteSheet
	 * @see SpriteSheetProperties
	 */
	public SpriteSheetProperties getProperties() {
		synchronized(this.sprite_sheet) {
			return sprite_sheet;
		}
	}
	
}