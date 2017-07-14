package miniTwitter.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Liked {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private long count;
    private long photoId;
    private long post_id;
    private String username;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getCount() {
		return count;
	}
	public void setCount(long count) {
		this.count = count;
	}
	public long getPhotoId() {
		return photoId;
	}
	public void setPhotoId(long photoId) {
		this.photoId = photoId;
	}
	public long getPost_id() {
		return post_id;
	}
	public void setPost_id(long post_id) {
		this.post_id = post_id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
    
    

}
