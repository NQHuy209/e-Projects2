/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Core.Model;

/**
 *
 * @author Quang Huy
 */
public class RoomTypeModel {
    private int id_room_type;
    private String category;
    private float price;

    public RoomTypeModel() {
    }

    public RoomTypeModel(int id_room_type, String category, float price) {
        this.id_room_type = id_room_type;
        this.category = category;
        this.price = price;
    }

    public int getId_room_type() {
        return id_room_type;
    }

    public void setId_room_type(int id_room_type) {
        this.id_room_type = id_room_type;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    
}
