package pe.joedayz.transferservice.error;

/**
 * @author josediaz
 **/
public class TransferServiceException extends RuntimeException {
  public TransferServiceException(Throwable cause) {
    super(cause);
  }

  public TransferServiceException(String message) {
    super(message);
  }
}
