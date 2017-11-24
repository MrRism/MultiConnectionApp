package ua.i.on.light.dataGetters.resolvers;

import java.util.HashMap;
import java.util.Map;

/**
 * Created on 24.10.2017.
 *
 * @author Serhii Petrusha aka Mr_Rism
 */
public class BankGovUaUsdRate extends AbstractPageResolver {

  Map<PageProperty, String> suportedPages = Map.of(
      PageProperty.SINGLE_PAGE,
      "https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange?valcode=USD"
  );

  @Override
  public Map<PageProperty, String> getPages() {
    return suportedPages;
  }

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
