package ua.i.on.light.engine;

import java.util.Map;

/**
 * Created on 24.10.2017.
 *
 * @author Serhii Petrusha aka Mr_Rism
 */
public interface PageResolver {

  Map<String,String> getRegX(String page);

}
