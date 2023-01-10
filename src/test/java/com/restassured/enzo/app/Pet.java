package com.restassured.enzo.app;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;


public class Pet {
    private int id;
    private JSONObject category = new JSONObject();
    private String name;
    private JSONArray photoUrls = new JSONArray();
    private JSONArray tags = new JSONArray();
    private String status;

    public static Pet createPet(int id, String name, String raza){
        Pet mascota = new Pet();
        mascota.setId(id);

        JSONObject dicc = new JSONObject();
        dicc.put("id", 0);
        dicc.put("name", raza);

        mascota.setCategory(dicc);
        mascota.setName(name);
        mascota.getPhotoUrls().add("string");
        mascota.getTags().add(dicc);
        mascota.setStatus("available");

        return mascota;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public JSONObject getCategory() {
        return category;
    }
    public void setCategory(JSONObject category) {
        this.category = category;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public JSONArray getPhotoUrls() {
        return photoUrls;
    }
    public void setPhotoUrls(JSONArray photoUrls) {
        this.photoUrls = photoUrls;
    }
    public JSONArray getTags() {
        return tags;
    }
    public void setTags(JSONArray tags) {
        this.tags = tags;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    
} 
