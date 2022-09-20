package guru.springframework.sfgdi.services;

public class I18nEnglishGreeting implements  GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World - EN";
    }
}
