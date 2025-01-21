package pe.joedayz.transferservice.service;

import pe.joedayz.transferservice.model.TransferRestModel;

/**
 * @author josediaz
 **/
public interface TransferService {
  public boolean transfer(TransferRestModel productPaymentRestModel);
}
