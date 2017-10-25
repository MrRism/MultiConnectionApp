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

  //https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange?valcode=USD&date=20171026


  @Override
  public Map<String, String> getRegX(String page) {

//    Pattern pattern = Pattern.compile(
//        "<a href=\"https://www\\.bestchange\\.ru/privat24-uah-to(.{10,200})\\(\\D{3,7}\\)");
//    Matcher matcher = pattern.matcher(page);
    Map<String, String> matches = new HashMap<>();
//    while (matcher.find()) {
//      String found = matcher.group();


      Matcher data = Pattern.compile("<rate>.*?</rate>")
          .matcher(page);
      data.find();
      matches
          .put("USD",
              data.group().replaceAll("[^0-9\\.]", ""));

//    }
    return matches;
  }
}
