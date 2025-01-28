package pe.joedayz.transferservice.io;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author josediaz
 **/
public interface TransferRepository extends JpaRepository<TransferEntity, Long> {

}
