package providers;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomStringGenerator {

    public String generateRandomString(int length){
        return RandomStringUtils.randomAlphabetic(length);
    }
}
