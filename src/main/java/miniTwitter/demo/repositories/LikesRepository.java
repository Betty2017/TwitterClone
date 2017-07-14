package miniTwitter.demo.repositories;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

import miniTwitter.demo.models.Likes;
import miniTwitter.demo.models.Photo;


public interface LikesRepository extends CrudRepository<Likes, Long>{

	

}
