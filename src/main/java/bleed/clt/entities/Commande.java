package bleed.clt.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Commande implements Serializable{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idCommande;
    private LocalDate dateCommande;
    private Float totalPrice;
    private String name;
    private String gouvernorat;
    private String ville;
    private String phone;

    @NotFound(action= NotFoundAction.IGNORE)
    @JsonIgnore
    @ManyToOne(cascade = CascadeType.PERSIST)
    private User user;
}
