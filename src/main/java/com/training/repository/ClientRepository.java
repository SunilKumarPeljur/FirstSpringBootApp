/**
 * 
 */
package com.training.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * @author admin
 *
 */

@RepositoryRestResource(path="/client")
public interface ClientRepository extends MongoRepository<Client, Integer> {
	

}
