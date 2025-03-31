package org.example.eventmanagementspring.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "conferences")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Conference extends Event {
    @Column(nullable = false)
    private String speaker;

    @Column(nullable = false)
    private int capacity;
}