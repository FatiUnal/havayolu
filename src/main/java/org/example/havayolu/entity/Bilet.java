package org.example.havayolu.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Bilet {
    @Id
    @GeneratedValue
    private int id;
    private int biletNo;

    @ManyToOne
    @JoinColumn(name = "users")
    private Users user;
    private int koltukNo;
    @ManyToOne
    @JoinColumn(name = "ucus")
    private Ucus ucus;

    public Bilet(int id, int biletNo, Users user, int koltukNo, Ucus ucus) {
        this.id = id;
        this.biletNo = biletNo;
        this.user = user;
        this.koltukNo = koltukNo;
        this.ucus = ucus;
    }

    public Bilet(int biletNo, Users user, int koltukNo, Ucus ucus) {
        this.biletNo = biletNo;
        this.user = user;
        this.koltukNo = koltukNo;
        this.ucus = ucus;
    }

    public Bilet() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBiletNo() {
        return biletNo;
    }

    public void setBiletNo(int biletNo) {
        this.biletNo = biletNo;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public int getKoltukNo() {
        return koltukNo;
    }

    public void setKoltukNo(int koltukNo) {
        this.koltukNo = koltukNo;
    }

    public Ucus getUcus() {
        return ucus;
    }

    public void setUcus(Ucus ucus) {
        this.ucus = ucus;
    }
}
