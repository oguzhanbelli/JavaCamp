package kodlamaio.hrmsdemo.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table (name = "positions")
@AllArgsConstructor
@NoArgsConstructor
public class Job {
	@Id
	@GeneratedValue
    @Column (name = "position_id")
	private Long id;
	
	@Column (name ="position_name")
	private String jobName;
	
	 
}
