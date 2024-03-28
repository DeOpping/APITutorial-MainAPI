package dev.paracausal.testplugin.api.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class SetCurrencyEvent extends Event implements Cancellable {

    private final Player player;
    private long amountSet;
    private boolean cancelled;

    public SetCurrencyEvent(final Player player, long amountSet) {
        this.player = player;
        this.amountSet = amountSet;
        this.cancelled = false;
    }

    public Player getPlayer() { return player; }
    public long getAmount() { return amountSet; }
    public void setAmount(final long amount) { this.amountSet = amount; }

    @Override public void setCancelled(boolean cancel) { this.cancelled = cancel; }
    @Override public boolean isCancelled() { return cancelled; }

    private static final HandlerList HANDLERS = new HandlerList();
    public static HandlerList getHandlerList() { return HANDLERS; }
    @Override public HandlerList getHandlers() { return HANDLERS; }

}
