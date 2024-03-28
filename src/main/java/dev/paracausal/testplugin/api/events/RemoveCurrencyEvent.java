package dev.paracausal.testplugin.api.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class RemoveCurrencyEvent extends Event implements Cancellable {

    private final Player player;
    private long amountRemoved;
    private boolean cancelled;

    public RemoveCurrencyEvent(final Player player, long amountRemoved) {
        this.player = player;
        this.amountRemoved = amountRemoved;
        this.cancelled = false;
    }

    public Player getPlayer() { return player; }

    public long getAmount() { return amountRemoved; }
    public void setAmount(final long amount) { this.amountRemoved = amount; }

    @Override public void setCancelled(boolean cancel) { this.cancelled = cancel; }
    @Override public boolean isCancelled() { return cancelled; }

    private static final HandlerList HANDLERS = new HandlerList();
    public static HandlerList getHandlerList() { return HANDLERS; }
    @Override public HandlerList getHandlers() { return HANDLERS; }

}
