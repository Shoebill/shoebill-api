package net.gtaun.shoebill.constant;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Spikes on 29.2.204.
 */
public enum Weather {
    EXTRASUNNY_LA(0),
    SUNNY_LA(1),
    EXTRASUNNY_SMOG_LA(2),
    SUNNY_SMOG_LA(3),
    CLOUDY_LA(4),
    SUNNY_SF(5),
    EXTRASUNNY_SF(6),
    CLOUDY_SF(7),
    RAINY_SF(8),
    FOGGY_SF(9),
    SUNNY_VEGAS(10),
    EXTRASUNNY_VEGAS(11),
    CLOUDY_VEGAS(12),
    EXTRASUNNY_COUNTRYSIDE(13),
    SUNNY_COUNTRYSIDE(14),
    CLOUDY_COUNTRYSIDE(15),
    RAINY_COUNTRYSIDE(16),
    EXTRASUNNY_DESERT(17),
    SUNNY_DESERT(18),
    SANDSTORM_DESERT(19),
    UNDERWATER(20);

    private static final Map<Integer, Weather> enumMap = new HashMap<>();

    private int id;

    static {
        for (Weather weather : values()) {
            enumMap.put(weather.getId(), weather);
        }
    }

    private Weather(int id) {
        this.id = id;
    }

    public static Weather get(int id) {
        return enumMap.get(id);
    }

    public int getId() {
        return id;
    }
}