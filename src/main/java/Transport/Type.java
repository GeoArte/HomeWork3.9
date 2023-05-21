package Transport;

public enum Type
{
    CAR("Легковой автомобиль"),
    PICKUP("Грузовой автомобиль"),
    BUS("Автобус");

    private final String type;

    Type(String type)
    {
        this.type = type;
    }

    public String toString()
    {
        return this.type;
    }
}