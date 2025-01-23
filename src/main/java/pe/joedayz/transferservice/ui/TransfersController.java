package pe.joedayz.transferservice.ui;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.joedayz.transferservice.model.TransferRestModel;
import pe.joedayz.transferservice.service.TransferService;

/**
 * @author josediaz
 **/
@RestController
@RequestMapping("/transfers")
public class TransfersController {

  private final Logger logger = LoggerFactory.getLogger(TransfersController.class);
  private TransferService transferService;

  public TransfersController(TransferService transferService) {
    this.transferService = transferService;
  }

  @PostMapping
  public boolean transfer(@RequestBody TransferRestModel transferRestModel) {
    return transferService.transfer(transferRestModel);
  }
}

