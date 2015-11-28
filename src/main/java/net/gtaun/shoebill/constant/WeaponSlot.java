package net.gtaun.shoebill.constant;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

/**
 * Created by BigETI
*/
public enum WeaponSlot
{
    INVALID(-1, "Invalid"),
    HAND(0, "Hand"),
    MELEE(1, "Melee"),
    PISTOL(2, "Pistol"),
    SHOTGUN(3, "Shotgun"),
    MACHINE_PISTOL(4, "Machine pistol"),
    CARABINER(5, "Carabiner"),
    RIFLE(6, "Rifle"),
    HEAVY(7, "Heavy"),
    THROWABLE(8, "Throwable"),
    MISC1(9, "Misc 1"),
    MISC2(10, "Misc 2"),
    WEARABLE(11, "Wearable"),
    DETONATOR(12, "Detonator");

    private final int slotId;
    private final String typeName;

    private static final Map<Integer, WeaponSlot> VALUES = new HashMap<>();

    static {
        for(WeaponSlot slot : values()) {
            VALUES.put(slot.getSlotId(), slot);
        }
    }

    private WeaponSlot(int slotId, String typeName)
    {
        this.slotId = slotId;
        this.typeName = typeName;
    }

    public int getSlotId()
    {
        return this.slotId;
    }

    public String getType() {
        return typeName;
    }

    public String toString()
    {
        return this.typeName;
    }

    public static WeaponSlot getById(int id) {
        Map.Entry<Integer, WeaponSlot> slot = VALUES.entrySet().stream().filter(new Predicate<Map.Entry<Integer, WeaponSlot>>() {
            @Override
            public boolean test(Map.Entry<Integer, WeaponSlot> integerWeaponSlotEntry) {
                return integerWeaponSlotEntry.getKey() == id;
            }
        }).findFirst().orElse(null);
        return (slot != null) ? slot.getValue() : WeaponSlot.INVALID;
    }
}