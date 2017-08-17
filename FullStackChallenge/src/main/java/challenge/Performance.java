package challenge;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Size;

/**
 * @author ankit on 8/16/17.
 * @project FullStackChallenge
 */
@Data
@Table(name = "performance")
@Entity
public class Performance {

    private @Id
    @GeneratedValue
    Long id;
    @Column(name = "givenby")
    private int givenBy;
    @Column(name = "givento")
    private int givenTo;
    @Column(name = "feedback")
    @Size(max = 1000)
    private String feedback;

    private Performance() {}

    public Performance(int givenBy, int givenTo, String feedback) {
        this.givenBy = givenBy;
        this.givenTo = givenTo;
        this.feedback = feedback;
    }
}
