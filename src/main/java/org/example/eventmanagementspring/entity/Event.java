package org.example.eventmanagementspring.entity;

import jakarta.persistence.*;
import lombok.*;
import org.example.eventmanagementspring.enumeration.EventType;

@Entity
@Table(name = "events")
@Inheritance(strategy = InheritanceType.JOINED)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public abstract class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String location;

    @Column(nullable = false)
    private String date;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private EventType eventType;
}