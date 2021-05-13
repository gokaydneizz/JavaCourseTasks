package kodlama.io.hrms.entities.concretes;

import javax.persistence.*;


@Entity
@Table(name = "job_titles")
public class Job {
	
	@Id
	@GeneratedValue
	
	@Column(name = "id")
	private int id;
	@Column(name = "title")
	private String title;
	
	
	public Job(int id, String title) {
		this.id = id;
		this.title = title;
	}
	
	
	public Job() {
			
		}

	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	
	
	

}
