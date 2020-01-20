package org.launchcode.codingevents.data;

import org.launchcode.codingevents.models.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Chris Bay
 */
@Repository //tells springboot that it should create EventRepository instances and inject them where needed
public interface EventRepository extends CrudRepository<Event, Integer> {
}
