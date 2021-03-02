package com.example.minesweeper;

import com.example.minesweeper.data.Game;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("")
    public String getIndexPage(Model model) {
        var game = new Game(5);

        model.addAttribute("game", getGameHtml(game));

        return "index";
    }

    private String getGameHtml(Game game) {
        var html = new StringBuilder();

        for (int i = 0; i < game.getSize(); i++) {
            html.append("<div class=\"row\">");
            for (int j = 0; j < game.getSize(); j++) {
                html.append("<div class=\"field\">" + game.getFieldValue(i, j) +"</div>");
            }
            html.append("</div>");
        }

        return html.toString();
    }
}
