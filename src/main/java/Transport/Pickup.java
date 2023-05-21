package Transport;

public class Pickup extends Transport
{
    public Pickup(String brand, String model, int year, String country, String color, int speed)
    {
        super(brand, model, year, country, color, speed, Type.PICKUP);
    }
    @Override
    public Type getType(){return this.getType();}
    public void bestTimeCircle()
    {
        System.out.println("Лучшее время круга");
    }

    public void maxSpeed()
    {
        System.out.println("Иаксимальная скорость");
    }

    public void pitStop()
    {
        System.out.println("Остановка на пит стоп");
    }

    @Override
    public String printType()
    {
        if (this.getType().equals(null))
        {
            return "Данных по транспортному средству недостаточно";
        }
        else
        {
            return this.getType().toString();
        }
    }
}
