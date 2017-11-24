package ua.i.on.light.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ua.i.on.light.connection.Connector;
import ua.i.on.light.connection.ConnectorImpl;
import ua.i.on.light.dataGetters.resolvers.BankGovUaUsdRate;
import ua.i.on.light.dataGetters.resolvers.PageResolver;

/**
 * Created on 10/10/2017.
 *
 * @author Serhii Petrusha aka Mr_Rism
 */
@Configuration
public class JavaConfig {

  @Bean
  public Connector connector(){
    return new ConnectorImpl();
  }

  @Bean
  public PageResolver resolver(){
    return new BankGovUaUsdRate();
  }




}
