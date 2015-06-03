package net.gtaun.shoebill.object;

import net.gtaun.shoebill.SampObjectManager;
import net.gtaun.shoebill.data.AngledLocation;
import net.gtaun.shoebill.data.Location;
import net.gtaun.shoebill.data.Vector3D;

import java.util.Collection;

/**
 * Created by marvin on 01.05.15 in project shoebill-api.
 * Copyright (c) 2015 Marvin Haschker. All rights reserved.
 */
public interface Actor extends Destroyable {

    int INVALID_ACTOR = 65535;

    static Actor create(int modelid, AngledLocation loc) {
        Actor actor = SampObjectManager.get().createActor(modelid, loc, loc.getAngle());
        actor.setVirtualWorld(loc.worldId);
        return actor;
    }

    static Actor create(int modelid, Vector3D position, float angle) {
        return SampObjectManager.get().createActor(modelid, position, angle);
    }

    static Actor create(int modelid, float x, float y, float z, float angle) {
        return create(modelid, new Vector3D(x, y, z), angle);
    }

    /**
     * Get a actor by it's id
     *
     * @param id Actor id
     * @return The found actor (null if not found)
     */
    static Actor get(int id) {
        return SampObjectManager.get().getActor(id);
    }

    /**
     * Get all actors available
     *
     * @return Collection of actors
     */
    static Collection<Actor> getActors() {
        return SampObjectManager.get().getActors();
    }

    /**
     * Gets the actor's pool size
     *
     * @return Actor's pool size
     */
    static int getPoolSize() {
        return SampObjectManager.get().getActorPoolSize();
    }

    /**
     * Get the internal id of the actor
     *
     * @return The id
     */
    int getId();

    /**
     * Gets the model if the actor
     *
     * @return Modelid
     */
    int getModel();

    /**
     * Gets the location of the actor
     *
     * @return The actor's location
     */
    AngledLocation getLocation();

    /**
     * Gets the virtual world of the actor
     *
     * @return The actor's virtual world
     */
    int getVirtualWorld();

    /**
     * Gets the facing angle of the actor
     *
     * @return The actor's facing angle
     */
    float getAngle();

    /**
     * Get the current health of the actor
     *
     * @return The actor's health
     */
    float getHealth();

    /**
     * Sets the actor's location
     *
     * @param loc Location
     */
    void setLocation(AngledLocation loc);

    /**
     * Sets the actor's location
     *
     * @param loc Location
     */
    void setLocation(Location loc);

    /**
     * Sets the actor's location
     *
     * @param pos Position
     */
    void setLocation(Vector3D pos);

    /**
     * Sets the actor's facing angle
     *
     * @param angle Facing angle
     */
    void setAngle(float angle);

    /**
     * Sets the actor's virtual world
     *
     * @param world WorldID
     */
    void setVirtualWorld(int world);

    /**
     * Sets the actor's health
     *
     * @param health Health
     */
    void setHealth(float health);

    /**
     * Sets the actor's invulnerable state
     *
     * @param invulnerable If he's invulnerable or not (true = yes, false = no)
     */
    void setInvulnerable(boolean invulnerable);

    /**
     * Gets the actor's invulnerable state
     *
     * @return The Actor's invulnerable state
     */
    boolean isInvulnerable();

    /**
     * Applies a animation for the actor
     *
     * @param animLib   Animation library
     * @param animName  Animation name
     * @param animSpeed Animation speed (default is 4.1)
     * @param loop      If the animation should loop
     * @param lockX     If the actor return to their old x-location (false = return to old, true = stay at new)
     * @param lockY     If the actor return to their old y-location (false = return to old, true = stay at new)
     * @param freeze    If the actor should be frozen while the animation is playing
     * @param time      How long the animation should play (0 = infinite)
     */
    void applyAnimation(String animLib, String animName, float animSpeed, boolean loop, boolean lockX, boolean lockY, boolean freeze, int time);

    /**
     * Clears all animations from the actor
     */
    void clearAnimation();

    /**
     * Checks if the actor is streamed-in for a specific player
     *
     * @param player Player to check
     * @return If he's streamed-in for the player
     */
    boolean isActorStreamedIn(Player player);
}
