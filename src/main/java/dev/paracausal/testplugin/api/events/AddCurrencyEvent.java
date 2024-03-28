package dev.paracausal.testplugin.api.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class AddCurrencyEvent extends Event implements Cancellable {

    private final Player player;
    private long amountAdded;
    private boolean cancelled;

    public AddCurrencyEvent(final Player player, long amountAdded) {
        this.player = player;
        this.amountAdded = amountAdded;
        this.cancelled = false;
    }

    public Player getPlayer() { return player; }
    public long getAmount() { return amountAdded; }
    public void setAmount(final long amount) { this.amountAdded = amount; }

    @Override public void setCancelled(boolean cancel) { this.cancelled = cancel; }
    @Override public boolean isCancelled() { return cancelled; }

    private static final HandlerList HANDLERS = new HandlerList();
    public static HandlerList getHandlerList() { return HANDLERS; }
    @Override public HandlerList getHandlers() { return HANDLERS; }

}
