package People;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import Transport.*;

import javax.annotation.PostConstruct;

public class Driver
{
    private String name;
    private Transport transport;
    String defaulta = "Default";

    public Driver(String name, Transport transport)
    {
        this.transport = transport;
        if (name.equals("") || name.equals(null))
        {
            this.name = defaulta;
        }
        else
        {
            this.name = name;
        }
    }
    @PostConstruct
    public void init(){
        System.out.println(this.transport.getType() + " готов к работе");
    }

    public void drive() {
        System.out.println(transport.getClass().getSimpleName() + " готов к работе");
    }
    public String getName()
    {
        return this.name;
    }


    public Transport getTransport() {
        return this.transport;
    }
    public void startMovement()
    {
        System.out.println("Движение начато");
    }
    public void stopMovement()
    {
        System.out.println("Движение прекращено");
    }
    public void refuelTheCar()
    {
        System.out.println("Машина заправлена");
    }
    @Override
    public String toString()
    {
        return name;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) {
            return true;
        }
        if(obj == null || getClass() != obj.getClass())
        {
            return false;
        }
        Driver driver = (Driver) obj;
        return Objects.equals(name, driver.name) && Objects.equals(transport, driver.transport);
    }
}