package spg.finalchallenge.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spg.finalchallenge.entity.Client;

@Repository
public interface ClientRepository  extends JpaRepository<Client, Long> {

    Client findById(long id);

    Client save(Client client);

    long count();
}
