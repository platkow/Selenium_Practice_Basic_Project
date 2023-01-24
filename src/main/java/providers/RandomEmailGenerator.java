package providers;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomEmailGenerator {

    public String generateRandomEmail(int length){
        return RandomStringUtils.randomAlphabetic(length) + "@domain.com";
    }
}
