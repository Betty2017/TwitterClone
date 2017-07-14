package miniTwitter.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Likes {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id ;
	private String username;
	private long postid;
	private long photoid;
	private int count;
	
	
	
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public long getPostid() {
		return postid;
	}
	public void setPostid(long postid) {
		this.postid = postid;
	}
	public long getPhotoid() {
		return photoid;
	}
	public void setPhotoid(long photoid) {
		this.photoid = photoid;
	}
	
	

}
