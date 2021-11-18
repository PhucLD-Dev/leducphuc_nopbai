package demo.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "company")
public class CompanyEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "company", cascade = CascadeType.PERSIST)
    private List<UserEntity> users;

    public List<UserEntity> getUsers() {
        return users;
    }

    public void setUsers(List<UserEntity> users) {
        this.users = users;
    }

    public CompanyEntity(int id,String name) {
        this.id = id;
        this.name = name;
    }

    public CompanyEntity(String name) {
        this.name = name;
    }

    public CompanyEntity() {
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