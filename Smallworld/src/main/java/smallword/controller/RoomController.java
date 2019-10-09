package smallword.controller;

/*
STEP 2.3: Create controller:

1) Annotation @Controller
2) Annotation @requestMapping  - shows the name of the relevant .html page to be controlled.
3) Fill with some dummy data, for now to avoid database
4) Annotation @ Get mapping. Still applies to same html, so no need to indicate it.
5) Model model comes from the spring framework.
*/

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import smallword.model.Room;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping ("/rooms")

    public class RoomController {
//Create static list of fake data


    private static List<Room> rooms = new ArrayList<>();

    static  {
          rooms.add(new Room(1, "Conservarory", "101", "Scary"));
          rooms.add(new Room(2, "Billiard room", "201", "Play"));
          rooms.add(new Room(3, "Library", "102", "Silent"));
          rooms.add(new Room(4, "Ballroom", "300", "Weird"));
          rooms.add(new Room(5, "Dining room", "304", "Scary"));
      }



    @GetMapping
    public String getAllRooms(Model model){
        model.addAttribute("rooms", rooms); //fist 'rooms' is the attrubute we add to the model object - the name you use to call it in the html. Second one is the arraylist
    return "rooms"; // Return the name of your view (html page)
    }
}

