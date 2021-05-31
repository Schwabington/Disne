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
        return Collections.emptyList();
    }

}
