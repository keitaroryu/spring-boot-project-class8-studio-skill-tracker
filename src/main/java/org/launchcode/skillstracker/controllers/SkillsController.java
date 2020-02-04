package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillsController {

    @GetMapping
    public String defaultPage() {
        return "<h1>Skills Tracker<h1>" +
                "<h2>We have a few skills we would like to learn. Here's the list!</h2>" +
                "<ol>" +
                    "<li>Java</li>" +
                    "<li>JavaScript</li>" +
                    "<li>Python</li>" +
                "</ol>";
    }

    @RequestMapping(method = RequestMethod.GET, value="favorite")
    public String formSubmission(@RequestParam String coder, @RequestParam String skill1, @RequestParam String skill2, @RequestParam String skill3){
        return "<h1>" + coder + "</h1>" +
                "<table>" +
                    "<tr>" +
                        "<th>Favorite Skills</th>" +
                    "</tr>" +
                    "<tr>" +
                        "<th>" + skill1 + "</th>" +
                    "</tr>" +
                    "<tr>" +
                        "<th>" + skill2 + "</th>" +
                    "</tr>" +
                    "<tr>" +
                        "<th>" + skill3 + "</th>" +
                    "</tr>" +
                "</table>";
    }

    @GetMapping("form")
    public String form() {
        return "<html>" +
                "<body>" +
                "<form method='get' action='favorite'" +
                "<p>Name:</p>" +
                "<p><input type = 'text' name = 'coder'></p>" +
                "<p><select name='skill1' id='skill-select'" +
                    "<option value=''>--Please choose an option--</option>" +
                    "<option value='Java'>Java</option>" +
                    "<option value='Javascript'>JavaScript</option>" +
                    "<option value='Python'>Python</option>" +
                "</select></p>" +
                "<p><select name='skill2' id='skill-select'" +
                    "<option value=''>--Please choose an option--</option>" +
                    "<option value='Java'>Java</option>" +
                    "<option value='Javascript'>JavaScript</option>" +
                    "<option value='Python'>Python</option>" +
                "</select></p>" +
                "<p><select name='skill3' id='skill-select'" +
                    "<option value=''>--Please choose an option--</option>" +
                    "<option value='Java'>Java</option>" +
                    "<option value='Javascript'>JavaScript</option>" +
                    "<option value='Python'>Python</option>" +
                "</select></p>" +
                "<p><input type='submit' value='Submit'></p>" +
                "</form>" +
                "</body>" +
                "</html>";
    }
}
