package net.javadiscord.human;

/**
 * Creates a human.
 */
public record Human(String name, boolean abandonedByParents, boolean isGettingMilk) {
    public Human(String name, boolean abandonedByParents) {
        super(name, abandonedByParents, false);
    }
}