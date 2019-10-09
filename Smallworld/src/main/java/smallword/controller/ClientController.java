package smallword.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import smallword.model.Client;

import java.util.Arrays;
import java.util.List;

@RestController


public class ClientController {

    @RequestMapping("/clients")
    private List<Client> getAllClients() {
        return Arrays.asList(
                new Client("Professor", "Plum", "British"),
        new Client("Colonel", "Mustard", "American"),
        new Client("Mrs", "White", "Dutch")
        );
    }
}

