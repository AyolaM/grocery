package com.skillstorm.grocerygrabber.models;
import jakarta.persistence.*;
import java.util.List;

@Entity  //entity class must be annotated with the Entity annotation 
public class OrderInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderId;
    private int scheduledTime;
    private String name;
    
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @OneToMany(mappedBy = "order")
    private List<GroceryItem> groceryItems;
    
//The entity class must have a no-arg constructor.
    public OrderInfo() {
    }


    public OrderInfo(int orderId, int scheduledTime, String name, Customer customer, List<GroceryItem> groceryItems) {
        this.orderId = orderId;
        this.scheduledTime = scheduledTime;
        this.name = name;
        this.customer = customer;
        this.groceryItems = groceryItems;
    }


    public int getOrderId() {
        return orderId;
    }


    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }


    public int getScheduledTime() {
        return scheduledTime;
    }


    public void setScheduledTime(int scheduledTime) {
        this.scheduledTime = scheduledTime;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public Customer getCustomer() {
        return customer;
    }


    public void setCustomer(Customer customer) {
        this.customer = customer;
    }


    public List<GroceryItem> getGroceryItems() {
        return groceryItems;
    }


    public void setGroceryItems(List<GroceryItem> groceryItems) {
        this.groceryItems = groceryItems;
    }

    
    

}
