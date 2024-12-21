package by.curse.warehouselogistics.models;
import by.curse.warehouselogistics.models.enums.OrderStatuses;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Entity
@Table(name = "order_information")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderInformation {
    @Id
    private Long id;

    @OneToOne
    @MapsId
    @JoinColumn(name = "id")
    private Order order;
    private Date placementDate;
    private Date completionDate;
    private OrderStatuses status;
}
