package com.doom.lucifer.stream;

/**
 * lucifer
 *
 * @author <a href="mailto:zhengguoqiang@58ganji.com">doom</a>
 */
public class Dish {

    public enum Type {MEAT, FISH, OTHER}

    private final String name;

    private final boolean vegetarian;

    private final int calories;

    private final Type type;

    public Dish(String name, boolean vegetarian, int calories, Type type) {
        this.name = name;
        this.vegetarian = vegetarian;
        this.calories = calories;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public int getCalories() {
        return calories;
    }

    public Type getType() {
        return type;
    }
}
