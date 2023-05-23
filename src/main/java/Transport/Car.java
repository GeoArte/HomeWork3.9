package Transport;

public class Car extends Transport
{

    public Car(String brand, String model, int year, String country, String color, int speed)
    {
        super(brand, model, year, country, color, speed, Type.CAR);
    }
    @Override
    public Type getType () {
        return this.type;
    }
    public void bestTimeCircle ()
    {
        System.out.println("Лучшее время круга");
    }

    public void maxSpeed ()
    {
        System.out.println("Иаксимальная скорость");
    }

    public void pitStop ()
    {
        System.out.println("Остановка на пит стоп");
    }

    public String printType ()
    {
        if (this.getType().equals(null)) {
            return "Данных по транспортному средству недостаточно";
        } else {
            return this.getType().toString();
        }
    }
}
