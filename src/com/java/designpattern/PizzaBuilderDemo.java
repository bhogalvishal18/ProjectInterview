/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.designpattern;

/**
 *
 * @author Vishal
 * This is Builder  Design Pattern
 */



class Pizza{
    private String dough="";
    private String sauce="";
    private String topping="";
    public void setDough(String dough)
    {
        this.dough=dough;
    }
    public void setSauce(String sauce)
    {
        this.sauce=sauce;
    }
    public void setTopping(String topping)
    {
        this.topping=topping;
    }
}
abstract class PizzaBuilder
{
    protected Pizza pizza;
    public Pizza getPizza(){        
    return pizza;
    }
    public void createNewPizzaProduct()
    {
        pizza = new Pizza();
    }
    public abstract void buildDough();
    public abstract void buildSauce();
    public abstract void buildTopping();
}
/* "ConcreteBuilder" */
class HawaiianPizzaBuilder extends PizzaBuilder {
    public void buildDough() {
        pizza.setDough("cross");
    }

    public void buildSauce() {
        pizza.setSauce("mild");
    }

    public void buildTopping() {
        pizza.setTopping("ham+pineapple");
    }
}
/* "ConcreteBuilder" */
class SpicyPizzaBuilder extends PizzaBuilder {
    public void buildDough() {
        pizza.setDough("pan baked");
    }

    public void buildSauce() {
        pizza.setSauce("hot");
    }

    public void buildTopping() {
        pizza.setTopping("pepperoni+salami");
    }
}
class Waiter
{
    
}
public class PizzaBuilderDemo {    
    public static void main(String[] args) {
        
    }
}
