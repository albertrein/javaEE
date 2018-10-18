package teste.br.awesome.endpoint;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import teste.br.awesome.model.Student;

import java.util.List;

import static java.util.Arrays.asList;

@RestController
@RequestMapping("student")
public class StudentEndpoint  {
    @RequestMapping(method = RequestMethod.GET, path = "/teste")
    public List<Student> listAll(){
        return asList(new Student("Guilherme"),new Student("Alberto"));
    }
}
