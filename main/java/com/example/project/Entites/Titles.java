package com.example.project.Entites;




import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name = "titles")
public class Titles {
    @Id
    @Column(name = "titleid")
    private String titleId;
    @Column(name = "title")
    private String title;
    @Column(name = "type")
    private String type;
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "pubid", referencedColumnName = "pubid")
    private Publisher publisher;
    @Column(name = "price")
    private Double price;
    @Column(name = "royalty")
    private Integer royalty;
    @Column(name = "ytdsales")
    private Integer ytdSales;
    @Column(name = "notes")
    private String notes;
    @Column(name = "pubdate")
    private LocalDate pubDate;
    @Column(name = "advance")
    private Double advance;
    public Titles(String titleId, String title, String type, Publisher publisher, Double price, Integer royalty, Integer ytdSales, String notes, LocalDate pubDate, Double advance) {
        this.titleId = titleId;
        this.title = title;
        this.type = type;
        this.publisher = publisher;
        this.price = price;
        this.royalty = royalty;
        this.ytdSales = ytdSales;
        this.notes = notes;
        this.pubDate = pubDate;
        this.advance = advance;
    }
    public Titles() {
    }
    public String getTitleId() {
        return titleId;
    }
    public String getTitle() {
        return title;
    }
    public String getType() {
        return type;
    }
    public Publisher getPublisher() {
        return publisher;
    }
    public Double getPrice() {
        return price;
    }
    public Integer getRoyalty() {
        return royalty;
    }
    public Integer getYtdSales() {
        return ytdSales;
    }
    public String getNotes() {
        return notes;
    }
    public LocalDate getPubDate() {
        return pubDate;
    }
    public Double getAdvance() {
        return advance;
    }
    public void setTitleId(String titleId) {
        this.titleId = titleId;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setType(String type) {
        this.type = type;
    }
    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public void setRoyalty(Integer royalty) {
        this.royalty = royalty;
    }
    public void setYtdSales(Integer ytdSales) {
        this.ytdSales = ytdSales;
    }
    public void setNotes(String notes) {
        this.notes = notes;
    }
    public void setPubDate(LocalDate pubDate) {
        this.pubDate = pubDate;
    }
    public void setAdvance(Double advance) {
        this.advance = advance;
    }
}

