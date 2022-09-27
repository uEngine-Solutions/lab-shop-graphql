package labshopgraphql.domain;

import labshopgraphql.domain.*;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="deliveries", path="deliveries")
public interface DeliveryRepository extends PagingAndSortingRepository<Delivery, Long>{

    List<Delivery> findByOrderId(Long orderId);   // select * from delivery where orderId=?

}
