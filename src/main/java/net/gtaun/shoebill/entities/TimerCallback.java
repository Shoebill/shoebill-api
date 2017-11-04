package net.gtaun.shoebill.entities;

@FunctionalInterface
public interface TimerCallback {
    void onTick(int factualInterval);

    default void onStart() { }

    default void onStop() { }
}
