package ua.i.on.light.dataGetters.resolvers;

import java.util.HashMap;
import java.util.Map;

/**
 * Created on 24.10.2017.
 *
 * @author Serhii Petrusha aka Mr_Rism
 */
public class CryptocompareUsdPrice extends AbstractPageResolver {

  Map<PageProperty, String> suportedPages = Map.of(
      PageProperty.REGEX_PAGES,
      "https://min-api.cryptocompare.com/data/price?fsym=[A-Z]{3-6}&tsyms=[A-Z]{3-6}"
  );

  @Override
  public Map<PageProperty, String> getPages() {
    return suportedPages;
  }


  @Override
  public Map<String, Map<ValuesTags, String>> getRegX(String page) {

    String matchedPrice = page.replaceAll("[^\\d.]", "");

    String matchedCurrency = matcherFindFirstAndGrabMidData(page, "\"", "\"")
        .replaceAll("\"", "");

    Map<String, Map<ValuesTags, String>> result = new HashMap<>();

    Map<ValuesTags, String> valuesTagsStringMap = new HashMap<>();

    valuesTagsStringMap.put(ValuesTags.PRICE, matchedPrice);
    valuesTagsStringMap.put(ValuesTags.CURRENCY, matchedCurrency);

    result.put("Cryptocompare", valuesTagsStringMap);

    return result;
  }
}
