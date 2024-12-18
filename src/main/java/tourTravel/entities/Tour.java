package tourTravel.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Set;
import java.util.UUID;

@Entity
@Getter
@Setter
public class Tour {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String name;
    private String description;
    private BigDecimal price;
    private Date startDate;
    private Date endDate;

    @ManyToOne
    private User guide;

    @OneToMany(mappedBy = "tour")
    private Set<Booking> bookings;
    private String destination;
    private Timestamp createdDate;
    private Timestamp updatedDate;

}
