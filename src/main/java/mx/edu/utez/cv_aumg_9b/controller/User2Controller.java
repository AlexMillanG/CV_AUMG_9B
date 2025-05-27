package mx.edu.utez.cv_aumg_9b.controller;

@RestController
@RequestMapping("/api/user2")
@CrossOrigin("*")

public class User2Controller {

    @GetMapping("")
    public String getMessage(){
        return "hola desde controller 2";
    }


}
