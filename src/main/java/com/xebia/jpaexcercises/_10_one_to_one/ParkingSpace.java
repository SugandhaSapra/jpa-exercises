package com.xebia.jpaexcercises._10_one_to_one;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "parking_lot")
public class ParkingSpace {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int lotNo;

    public ParkingSpace() {
    }
    @OneToOne(mappedBy = "parkingSpace")
    private Employee employee;
    public ParkingSpace(int lotNo) {
        this.lotNo = lotNo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getLotNo() {
        return lotNo;
    }

    public void setLotNo(int lotNo) {
        this.lotNo = lotNo;
    }

    @Override
    public String toString() {
        return "ParkingSpace{" +
                "id=" + id +
                ", lotNo=" + lotNo +
                '}';
    }
}
