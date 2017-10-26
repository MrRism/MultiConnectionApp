package ua.i.on.light.engine.resolvers;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ua.i.on.light.engine.PageResolver;

/**
 * Created on 24.10.2017.
 *
 * @author Serhii Petrusha aka Mr_Rism
 */
public class BankGovUaUsdRate implements PageResolver {


  @Override
  public Map<String, Map<ValuesTags, String>> getRegX(String page) {

    Map<String, Map<ValuesTags, String>> matches = new HashMap<>();

    Matcher data = Pattern.compile("<rate>.*?</rate>")
        .matcher(page);
    data.find();
    matches
        .put("USD",
            new HashMap<ValuesTags, String>() {
              {
                put(ValuesTags.PRICE, data.group().replaceAll("[^0-9\\.]", ""));
              }
            });

//    }
    return matches;
  }
}
