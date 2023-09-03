package com.psa.location_web_app.entities.repositories;



import org.springframework.data.repository.CrudRepository;

import com.psa.location_web_app.entities.Location;

public interface LocationRepository extends CrudRepository<Location, Long> {

}
