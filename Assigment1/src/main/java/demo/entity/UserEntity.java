package demo.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "user")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private String age;

    @Column(name = "address")
    private String address;

    @Column(name = "companyid")
    private int companyid;

    @ManyToOne() //EAGER
    @JoinColumn(name = "companyid", insertable = false, updatable = false)
    private CompanyEntity company;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "company_attribute",
            joinColumns = @JoinColumn(name = "companyid"),
            inverseJoinColumns = @JoinColumn(name = "attributeid")
    )
    private List<AttributeEntity> attributes;

    public List<AttributeEntity> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<AttributeEntity> attributes) {
        this.attributes = attributes;
    }

    public UserEntity() {
    }

    public UserEntity(String name, String age, String address, int companyid) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.companyid = companyid;
    }

    public UserEntity(int id, String name, String age, String address, int companyid) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.companyid = companyid;
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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCompanyid() {
        return companyid;
    }

    public void setCompanyid(int companyid) {
        this.companyid = companyid;
    }

    public CompanyEntity getCompany() {
        return company;
    }

    public void setCompany(CompanyEntity company) {
        this.company = company;
    }
}
