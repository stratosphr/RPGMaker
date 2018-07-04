package lib.geometry;

/**
 * Created by stratosphr on 04/07/2018.
 */
public final class Vector{

    private final Integer first;
    private final Integer second;

    public Vector(Integer first, Integer second) {
        this.first = first;
        this.second = second;
    }

    @SuppressWarnings("WeakerAccess")
    public Integer getFirst() {
        return first;
    }

    public Integer getX() {
        return getFirst();
    }

    public Integer getWidth() {
        return getFirst();
    }

    @SuppressWarnings("WeakerAccess")
    public Integer getSecond() {
        return second;
    }

    public Integer getY() {
        return getSecond();
    }

    public Integer getHeight() {
        return getSecond();
    }

    @Override
    public String toString() {
        return "(" + getFirst() + ", " + getSecond() + ")";
    }

}
