package restaurant;

public class MenuItem {
    //Class variables
    private String name;
    private String description;
    private Double price;
    private String category;
    private Boolean isNew;

    //Constructors
    public MenuItem(String name, String description, Double price) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = "Not Catagorised ";
        this.isNew = false;
    }

    public MenuItem(String name, String description, Double price, String category, Boolean isNew) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = isNew;
    }

    //Methods
    //Getters and Setters
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return this.price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Boolean getNew() {
        return this.isNew;
    }

    public void setNew(Boolean aNew) {
        this.isNew = aNew;
    }
}


