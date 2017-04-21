package guru.springframework.domain;

import java.sql.Timestamp;

import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="Gate_Transport_details")
public class GateTransportDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id" , nullable =  false)
	public Integer id;
	
	@Column(name = "trans_name")
	public String transname;
	
	@Column(name = "created")
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	@CreationTimestamp
	private Timestamp created;
	
	@Column(name = "updated")
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	@UpdateTimestamp
	private Timestamp updated;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTransname() {
		return transname;
	}

	public void setTransname(String transname) {
		this.transname = transname;
	}

	public Timestamp getCreated() {
		return created;
	}

	public void setCreated(Timestamp created) {
		this.created = created;
	}

	public Timestamp getUpdated() {
		return updated;
	}

	public void setUpdated(Timestamp updated) {
		java.time.LocalDateTime.now();
		this.updated = updated;
	}
	
	

}
