package com.example.project.Entites;




import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import java.util.List;
@Entity
@Table(name = "publisher")
public class Publisher{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pubid")
    private Integer id;
    @Column(name = "pubname")
    private String name;
    @Column(name = "city")
    private String city;
    @Column(name = "state")

    private String state;
    @Column(name = "country")
    private String country;
    @OneToMany(mappedBy = "publisher")
    @JsonIgnore
    private List<Titles> titles;
    // constructor, getters and setters
    public Publisher(Integer id, String name, String city, String state, String country, List<Titles> titles) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.state = state;
        this.country = country;
        this.titles = titles;
    }
    public Publisher() {
    }
    public Integer getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getCity() {
        return city;
    }
    public String getState() {
        return state;
    }
    public String getCountry() {
        return country;
    }
    public List<Titles> getTitles() {
        return titles;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setCity(String city)
    {
        this.city = city;
    }
    public void setState(String state) {
        this.state = state;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public void setTitles(List<Titles> titles) {
        this.titles = titles;
    }
}
