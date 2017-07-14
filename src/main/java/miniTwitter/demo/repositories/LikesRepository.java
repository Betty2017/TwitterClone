package miniTwitter.demo.repositories;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import miniTwitter.demo.models.Friendship;
import miniTwitter.demo.models.Liked;
import miniTwitter.demo.models.Photo;

public interface LikesRepository extends CrudRepository<Liked, Long> {
	   Long countByPhotoId(Long photoId);
}
