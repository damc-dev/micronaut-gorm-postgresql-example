package micronaut.gorm.postgresql.example

import grails.gorm.services.Service

@Service(Greeting)
interface GreetingService {
    Greeting save(Greeting greeting)
    List<Greeting> findAll()
}