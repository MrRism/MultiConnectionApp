package ua.i.on.light.engine.resolvers;

import java.util.HashMap;
import java.util.Map;

/**
 * Created on 24.10.2017.
 *
 * @author Serhii Petrusha aka Mr_Rism
 */
public class BankGovUaUsdRate extends AbstractPageResolver {


  @Override
  public Map<String, Map<ValuesTags, String>> getRegX(String page) {

    Map<String, Map<ValuesTags, String>> matches = new HashMap<>();

    matches
        .put("USD",
            new HashMap<ValuesTags, String>() {
              {
                put(ValuesTags.PRICE, matcherFindFirstAndGrabMidData(page, "<rate>", "</rate>")
                    .replaceAll("[^\\d\\.]", ""));
              }
            });

//    }
    return matches;
  }
}
