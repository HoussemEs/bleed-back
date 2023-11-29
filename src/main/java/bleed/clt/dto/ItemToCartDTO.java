package bleed.clt.dto;

import bleed.clt.entities.Cart;
import bleed.clt.entities.Item;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.CascadeType;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ItemToCartDTO implements Serializable {
    private Long idCartItem;
    private LocalDate dateAdded;
    private Integer quantity;
    private Long idItem;
    private Long idUser;
}

