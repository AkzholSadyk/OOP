package umls;

@Entity
public class Customer {
    @Id
    private Integer CRM_ID;

    @Enumerated(EnumType.STRING)
    private CustomerType type;

    private String description;

    // Getters and setters...
}
