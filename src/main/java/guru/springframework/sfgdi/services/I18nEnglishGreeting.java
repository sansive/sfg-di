package guru.springframework.sfgdi.services;

import guru.springframework.sfgdi.repositories.EnglishGreetingRepository;

public class I18nEnglishGreeting implements  GreetingService {

    private final EnglishGreetingRepository englishGreetingRepository;

    public I18nEnglishGreeting(EnglishGreetingRepository englishGreetingRepository) {
        this.englishGreetingRepository = englishGreetingRepository;
    }

    @Override
    public String sayGreeting() {
        return "Hello World - EN";
    }
}
