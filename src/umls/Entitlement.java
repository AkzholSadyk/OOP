package umls;
import jakarta.persistence.*;
import java.util.List;
public class Individual {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private String middleName;
    private String email;
    private String phone;

    @Column(nullable = false)
    private String locale = "English";

    @OneToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

}