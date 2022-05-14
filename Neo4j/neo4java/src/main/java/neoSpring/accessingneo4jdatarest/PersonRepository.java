package neoSpring.accessingneo4jdatarest;

<<<<<<< HEAD
<<<<<<< HEAD
/*   !! Not needed right now
=======
>>>>>>> parent of b166fd1 (Working neo4j example with java and movie database)
=======
>>>>>>> parent of b166fd1 (Working neo4j example with java and movie database)
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "people", path = "people")
public interface PersonRepository extends PagingAndSortingRepository<Person, Long> {

    List<Person> findByLastName(@Param("name") String name);
}
<<<<<<< HEAD
<<<<<<< HEAD
*/
=======
>>>>>>> parent of b166fd1 (Working neo4j example with java and movie database)
=======
>>>>>>> parent of b166fd1 (Working neo4j example with java and movie database)
