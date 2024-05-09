package com.skillstorm.grocerygrabber.models;

import jakarta.persistence.*;

@Entity
public class GroceryItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int groceryId;
    private String description;
    private int quantity;
    @ManyToOne
    @JoinColumn(name = "order_id")
    private OrderInfo order;

    public GroceryItem(){}
    
    public GroceryItem(int groceryId, String description, int quantity, OrderInfo order) {
        this.groceryId = groceryId;
        this.description = description;
        this.quantity = quantity;
        this.order = order;
    }

    public int getGroceryId() {
        return groceryId;
    }

    public void setGroceryId(int groceryId) {
        this.groceryId = groceryId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public OrderInfo getOrder() {
        return order;
    }

    public void setOrder(OrderInfo order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "GroceryItem [groceryId=" + groceryId + ", description=" + description + ", quantity=" + quantity
                + ", order=" + order + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + groceryId;
        result = prime * result + ((description == null) ? 0 : description.hashCode());
        result = prime * result + quantity;
        result = prime * result + ((order == null) ? 0 : order.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        GroceryItem other = (GroceryItem) obj;
        if (groceryId != other.groceryId)
            return false;
        if (description == null) {
            if (other.description != null)
                return false;
        } else if (!description.equals(other.description))
            return false;
        if (quantity != other.quantity)
            return false;
        if (order == null) {
            if (other.order != null)
                return false;
        } else if (!order.equals(other.order))
            return false;
        return true;
    }

}
