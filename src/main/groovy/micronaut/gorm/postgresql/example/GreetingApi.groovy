package micronaut.gorm.postgresql.example

import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Post

interface GreetingApi {
    @Post("/") void save(Greeting greeting)
    @Get("/") List<Greeting> list()
}
