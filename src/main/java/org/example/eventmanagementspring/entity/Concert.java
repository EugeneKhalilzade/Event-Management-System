package org.example.eventmanagementspring.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "concerts")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Concert extends Event {
    @Column(nullable = false)
    private String artist;

    @Column(nullable = false)
    private int duration;
}
