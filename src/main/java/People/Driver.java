package People;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import Transport.*;

import javax.annotation.PostConstruct;

public abstract class Driver
{
    private String name;
    private Transport transport;
    private int experience;
    String defaulta = "Default";

    public Driver(String name, Transport transport, int experience)
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
        if (experience >= 0)
        {
            this.experience = experience;
        }
        else
        {
            this.experience = 0;
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

    public int getExperience() {
        return this.experience;
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
        return experience == driver.experience && Objects.equals(name, driver.name) && Objects.equals(transport, driver.transport);
    }
}