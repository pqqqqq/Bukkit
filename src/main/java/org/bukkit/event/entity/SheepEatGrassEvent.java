package org.bukkit.event.entity;

import org.bukkit.entity.Entity;
import org.bukkit.event.Cancellable;
import org.bukkit.block.Block;

/**
 * Called when a Sheep eats grass and regains wool
 */
@SuppressWarnings("serial")
public class SheepEatGrassEvent extends EntityEvent implements Cancellable {
    private boolean cancel;
    private Block grass;

    public SheepEatGrassEvent(Entity what, Block grass) {
        super(Type.SHEEP_EAT, what);
        this.cancel = false;
        this.grass = grass;
    }

    public boolean isCancelled() {
        return cancel;
    }

    public void setCancelled(boolean cancel) {
        this.cancel = cancel;
    }

    /**
     * Gets the Block of grass the Sheep will eat
     */
	
    public Block getGrass() {
        return grass;
    }
	
    /**
     * Sets the Block of grass the Sheep will eat
     */
	
    public void setGrass(Block grass) {
        this.grass = grass;
    }
}