package com.example.obrestdatajpa;

import jakarta.annotation.Generated;
import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String author;
    private Integer Pages;
    private Double price;
    private LocalDate releaseDate;
    private Boolean isOnline;

    public Book() {
    }

    public Book(Long id, String title, String author, Integer pages, Double price, LocalDate releaseDate, Boolean isOnline) {
        this.id = id;
        this.title = title;
        this.author = author;
        Pages = pages;
        this.price = price;
        this.releaseDate = releaseDate;
        this.isOnline = isOnline;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getPages() {
        return Pages;
    }

    public void setPages(Integer pages) {
        Pages = pages;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Boolean getOnline() {
        return isOnline;
    }

    public void setOnline(Boolean online) {
        isOnline = online;
    }

}
