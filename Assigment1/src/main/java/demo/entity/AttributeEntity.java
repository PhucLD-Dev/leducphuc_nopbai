package demo.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "attribute")
public class AttributeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    //LAZY: toMany
    //EAGER: toOne
    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "attributes")
    private List<UserEntity> users;


    public AttributeEntity() {
    }

    public List<UserEntity> getUsers() {
        return users;
    }

    public void setUsers(List<UserEntity> users) {
        this.users = users;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}