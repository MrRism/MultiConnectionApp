package ua.i.on.light.engine.resolvers;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created on 24.10.2017.
 *
 * @author Serhii Petrusha aka Mr_Rism
 */
public class CryptocompareUsdPrice extends AbstractPageResolver {


  @Override
  public Map<String, Map<ValuesTags, String>> getRegX(String page) {

    String matchedPrice = page.replaceAll("[^\\d.]", "");

    String matchedCurrency = matcherFindFirstAndGrabMidData(page, "\"","\"").replaceAll("\"","");

    Map<String, Map<ValuesTags, String>> result =  new HashMap<>();

    Map<ValuesTags, String> valuesTagsStringMap = new HashMap<>();

    valuesTagsStringMap.put(ValuesTags.PRICE, matchedPrice);
    valuesTagsStringMap.put(ValuesTags.CURRENCY, matchedCurrency);

    result.put("Cryptocompare", valuesTagsStringMap);

    return result;
  }
}
