/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package custom_objects;

/**
 *
 * @author nitesh.banskota
 */
public class LatestUpdateData {
    private String image;
    private String title;
    private String description;
    private String date;
    private String link;

    public LatestUpdateData() {
    }

    public LatestUpdateData(String image , String title , String description , String date , String link) {
        this.image = image;
        this.title = title;
        this.description = description;
        this.date = date;
        this.link = link;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setLink(String link) {
        this.link = link;
    }
    

    public String getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getDate() {
        return date;
    }

    public String getLink() {
        return link;
    }
}