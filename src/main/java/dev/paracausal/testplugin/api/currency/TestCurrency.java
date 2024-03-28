package dev.paracausal.testplugin.api.currency;

import java.util.UUID;

public interface TestCurrency {

    long get(UUID uuid);
    void set(UUID uuid, long amount);
    void add(UUID uuid, long amount);
    void remove(UUID uuid, long amount);

}
