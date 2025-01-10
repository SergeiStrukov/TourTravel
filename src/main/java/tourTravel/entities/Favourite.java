package tourTravel.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.sql.Timestamp;
import java.util.UUID;

@Entity
@Getter
@Setter
@Table(
        name = "favourites",
        uniqueConstraints = @UniqueConstraint(columnNames = {"tour_id", "user_id"})
)
public class Favourite {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @ManyToOne(optional = false, cascade = CascadeType.MERGE)
    private Tour tour;

    @ManyToOne(optional = false, cascade = CascadeType.MERGE)
    @JoinColumn(name = "user_id")
    private User user;

    @Column(nullable = false, updatable = false)
    private Timestamp addedDate = new Timestamp(System.currentTimeMillis());

}
