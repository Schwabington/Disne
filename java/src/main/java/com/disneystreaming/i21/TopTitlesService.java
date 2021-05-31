package com.disneystreaming.i21;

import java.util.Collections;
import java.util.List;

/**
 * This is the core of the test, implement the method {@link #getTopTitles(String, String, String)}.
 *
 * Consider using the utility methods in {@link JsonConverters}.
 */
final class TopTitlesService {

    private TopTitlesService() {}

    /**
     * Implements the top titles selection algorithm, see <code>README.md</code> for details. See
     * <code>test/java/.../TopTitlesServiceTest</code> to verify your implementation.
     *
     * The JSON parsing and conversion is available in {@link JsonConverters#convertContentData(String)} and
     * {@link JsonConverters#convertPreferences(String)}.
     *
     * @param contentDataJson the JSON data of an array of {@link Content}, i.e. <code>"[{...}, {...}, ...]"</code>
     * @param brandPreferencesJson the JSON data of a dictionary, where the keys and values represent the user's <em>brand preferences</em>
     * @param contentTypePreferencesJson the JSON data of a dictionary, where the keys and values represent the user's <em>content type preferences</em>
     * @return the top titles
     */
    static List<String> getTopTitles(String contentDataJson, String brandPreferencesJson, String contentTypePreferencesJson) {
        List<String> score = new List<String>();

        //Calculate the overall score using the `popularityScore` on the user's preferences
        for(int i=0; i < contentDataJson.length(); i++){
            contentDataJson.getJSONObject(i);
            brandPreferencesJson.getString(contentDataJson.getString("Brand"));

            if(brandPreferencesJson.getString(contentDataJson.getString("Brand")) == "dislike"){
                popularityScore = popularityScore - 20;
            }elseif(brandPreferencesJson.getString(contentDataJson.getString("Brand")) == "indifferent" || ""){
                popularityScore = popularityScore + 0;
            }elseif(brandPreferencesJson.getString(contentDataJson.getString("Brand")) == "like"{
                popularityScore = popularityScore + 10;
            }elseif(brandPreferencesJson.getString(contentDataJson.getString("Brand")) == "adore"{
                popularityScore = popularityScore + 30;
            }elseif(brandPreferencesJson.getString(contentDataJson.getString("Brand")) == "love"{
                popularityScore = popularityScore + 50;
            }else{
                return;
            }

            contentTypePreferencesJson.getString(contentDataJson.getString("contentType"));

            if(contentTypePreferencesJson.getString(contentDataJson.getString("contentType")) == "dislike"){
                popularityScore = popularityScore - 20;
            }elseif(contentTypePreferencesJson.getString(contentDataJson.getString("contentType")) == "indifferent" || ""){
                popularityScore = popularityScore + 0;
            }elseif(contentTypePreferencesJson.getString(contentDataJson.getString("contentType")) == "like"{
                popularityScore = popularityScore + 10;
            }elseif(contentTypePreferencesJson.getString(contentDataJson.getString("contentType")) == "adore"{
                popularityScore = popularityScore + 30;
            }elseif(contentTypePreferencesJson.getString(contentDataJson.getString("contentType")) == "love"{
                popularityScore = popularityScore + 50;
            }else{
                return;
            }
            
        }
        //The content must be available in the US and available on or before 01/01/2020 to receive a score
        for(int i=0; i < contentDataJson.length(); i++){
            JSONObject contentDataJson = contentDataJson.getAvailability.getAvailableDate;

            if("availability" == "US" ++ "availableDate" <= "2020-01-01T00:00:00.000Z"){

                list.add(score.getTitle.getPopularityScore);
            
            else{
                return;
                }
            }
        }

        //Return a `List<String>` of the content titles that have the top 5 scores
        Collections.sort(score);
        List<String> top = score.sublist(0,5);
        System.out.println(top.getTitle);
    }

}
