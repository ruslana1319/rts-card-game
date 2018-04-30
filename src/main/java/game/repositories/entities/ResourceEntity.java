package game.repositories.entities;

public class ResourceEntity {
    private Integer id;
//    private Integer number;
    private String name;
    private String description;


    public ResourceEntity() {
    }

    public ResourceEntity(Integer id,/* Integer number,*/ String name, String description) {
        this.id = id;
//        this.number = number;
        this.name = name;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

//    public Integer getNumber() {
//        return number;
//    }
//
//    public void setNumber(Integer number) {
//        this.number = number;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "ResourceEntity{" +
                "id=" + id +
//                ", number=" + number +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}