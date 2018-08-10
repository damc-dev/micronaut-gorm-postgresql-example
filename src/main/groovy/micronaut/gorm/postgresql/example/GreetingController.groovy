package micronaut.gorm.postgresql.example

import io.micronaut.http.annotation.Controller

@Controller("/")
class GreetingController implements GreetingApi {

    GreetingService service

    GreetingController(GreetingService service) {
        this.service = service
    }

    @Override
    void save(Greeting greeting) {
        service.save(greeting)
    }

    @Override
    List<Greeting> list() {
        return service.findAll()
    }
}
